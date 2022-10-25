package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    private Especialidade especialidade;
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public EspecialidadeDAO() {

    }

    public EspecialidadeDAO(Especialidade especialidade) {
        this.especialidades.add(especialidade);
    }

    public static void gravar(Especialidade especialidade) {
        especialidades.add(especialidade);
    }

    public static boolean excluir(Integer codigo) {
        for (Especialidade p : especialidades) {
            if (p.getCodigo().equals(codigo)) {
                especialidades.remove(p);
                return true;
            }
        }
        return false;

    }

    public static Especialidade getEspecialidade(Integer codigo) {

        for (Especialidade p : especialidades) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }

        return null;
    }

    public static void alterar(Especialidade especialidade) {

        for (Especialidade p : especialidades) {
            if (p.getCodigo().equals(especialidade.getCodigo())) {
                especialidades.set(especialidades.indexOf(p), especialidade);
                break;
            }

        }
    }

    public static ArrayList<Especialidade> listarTodos() {
        return especialidades;
    }

    public static void criarEspecialidadesTeste() {
        Especialidade p1 = new Especialidade("Cardiologia", "Cuida do coração");
        Especialidade p2 = new Especialidade("Fisioterapia", "Cuida dos ossos e músculos");
        Especialidade p3 = new Especialidade("Otorrino", "Cuida do ouvido");
        especialidades.add(p1);
        especialidades.add(p2);
        especialidades.add(p3);

    }

    public static DefaultTableModel getTableModel() {

        //Matrix que receberá os planos de saúde 
        // que serão utilizados na tabela
        Object[][] dados = new Object[especialidades.size()][3];

        //For each para extrair cada objeto plano de saúde do
        // arrraylist panos e separar cada plano na matriz de dados 
        int i = 0;
        for (Especialidade p : especialidades) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getNome();
            dados[i][2] = p.getDescricao();
            i++;
        }
        // Definir um vetor com os nomes das colunas da tabelas
        String[] titulos = {"Código", "Nome", "Descrição"};

        //Criar um modelo que será utilizado pela JTable 
        //para exibir os dados dos planos 
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);
        return tableModel;

    }

}
