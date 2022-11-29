package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {

    private Medico medico;
    private static ArrayList<Medico> medicos = new ArrayList<>();
    private Especialidade especialidade;
    private ArrayList<Especialidade> especialidades;

    private static final String ARQUIVO = "C:\\Users\\22282078\\projeto-java\\medico.txt";
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282078\\projeto-java\\medico-temp.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    public MedicoDAO() {

    }

    public MedicoDAO(Medico medico) {
        this.medicos.add(medico);
    }

    public static void gravar(Medico medico) {
        medicos.add(medico);

        // gravar a especialiade no arquivo txt
        try {
            // gravar planos de saude em arquivo txt
            BufferedWriter bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            bw.write(medico.getMedicoSeparadoPontoVirgula());
            bw.newLine();
            bw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao gravar. \n\nEntre em contato com o suporte.",
                    "Erro ao gravar",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    public static boolean excluir(Integer codigo) {
        for (Medico p : medicos) {
            if (p.getCodigo().equals(codigo)) {
                medicos.remove(p);
                break;
            }
        }
        atualizarArquivo();
        return false;
    }

    private static void atualizarArquivo() {
        
        File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO_TEMP);

        try {
            //Criar arquivo temporário
            arquivoTemp.createNewFile();

            // Abrir o arquivo temporário para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            //Iterar na lista para adicionar os planos no arquivo temporário
            for (Medico p : medicos) {
                bwTemp.write(p.getMedicoSeparadoPontoVirgula());
                bwTemp.newLine();
            }

            //Fechar o arquivo temporario
            bwTemp.close();
            arquivoAtual.delete();

            // Renomear arquivo temporário 
            arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gerar o arquivo!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static Medico getMedico(Integer codigo) {

        for (Medico p : medicos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }

        return null;
    }

    public static void alterar(Medico medico) {

        for (Medico p : medicos) {
            if (p.getCodigo().equals(medico.getCodigo())) {
                medicos.set(medicos.indexOf(p), medico);
                break;
            }

        }

        atualizarArquivo();
    }

    public static ArrayList<Medico> listarTodos() {
        return medicos;
    }

    public static void getListaMedicos() {

         try {     
            BufferedReader br = Files.newBufferedReader(PATH);
            String linha = "";
            linha = br.readLine();
            while(linha != null && !linha.isEmpty()){
                String[] linhavetor = linha.split(";");
                
                int i = 0;
                ArrayList<Especialidade> especialidades = new ArrayList<>();
                while(linhavetor.length > i + 6){
                   especialidades.add(EspecialidadeDAO.getEspecialidade(Integer.valueOf(linhavetor[6 + i])));
                   i++;
                }
                
//                String[] data = linhavetor[5].split("/");
//                int ano = Integer.parseInt(data[2]);
//                int mes = Integer.parseInt(data[1]);
//                int dia = Integer.parseInt(data[0]);
//                LocalDate dataDeNascimento = LocalDate.of(ano,mes, dia);
                
                Medico m = new Medico
                (Integer.valueOf(linhavetor[0]), linhavetor[1], linhavetor[2], linhavetor[3], linhavetor[4], LocalDate.now(), especialidades);
                medicos.add(m);
                linha = br.readLine();  
            }
            br.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Algo deu errado!");
        }

    }

    public static DefaultTableModel getTableModel() {
        
        Object[][] dados = new Object[medicos.size()][3];

        //For each para extrair cada objeto plano de saúde do
        // arrraylist especialidades  e separar cada plano na matriz de dados 
        int i = 0;
        for (Medico p : medicos) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getCrm();
            dados[i][2] = p.getNome();

            i++;
        }
       
        String[] titulos = {"Código", "CRM", "Nome do médico"};

        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);
        return tableModel;

    }

//    public static DefaultTableModel getTableModelEspecialidades() {
//
//        //Matrix que receberá os planos de saúde 
//        // que serão utilizados na tabela
//        Object[][] dados = new Object[medicos.size()][2];
//
//        //For each para extrair cada objeto plano de saúde do
//        // arrraylist especialidades  e separar cada plano na matriz de dados 
//        int i = 0;
//        for (Medico p : medicos) {
//            dados[i][0] = p.getCodigo();
//            dados[i][1] = p.getNome();
//
//            i++;
//        }
//        // Definir um vetor com os nomes das colunas da tabelas
//        String[] titulos = {"Código", "Especialidade"};
//
//        //Criar um modelo que será utilizado pela JTable 
//        //para exibir os dados dos planos 
//        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);
//        return tableModel;
//
//    }

}
