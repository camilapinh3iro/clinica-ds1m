package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO { // Simular nosso banco de dados

    private PlanoDeSaude planoDeSaude;
    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();

    public PlanoDeSaudeDAO(PlanoDeSaude planoDeSaude) {
        this.planos.add(planoDeSaude);
    }

    public PlanoDeSaudeDAO() {

    }

    public static void gravar(PlanoDeSaude planoDeSaude) {
        planos.add(planoDeSaude);
    }

    public static ArrayList<PlanoDeSaude> listarTodos() {
        return planos;
    }

    public static void criarPlanosDeSaudeTeste() {
        PlanoDeSaude p1 = new PlanoDeSaude("Unimed", "Bronze");
        PlanoDeSaude p2 = new PlanoDeSaude("Unimed", "Ouro");
        PlanoDeSaude p3 = new PlanoDeSaude("Amil", "Advenced");
        PlanoDeSaude p4 = new PlanoDeSaude("Bradesco", "Exclusive");
        planos.add(p1);
        planos.add(p2);
        planos.add(p3);
        planos.add(p4);
    }

    public static DefaultTableModel getTableModel() {

        //Matrix que receberá os planos de saúde 
        // que serão utilizados na tabela
        Object[][] dados = new Object[planos.size()][3];

        //For each para extrair cada objeto plano de saúde do
        // arrraylist panos e separar cada plano na matriz de dados 
        int i = 0;
        for (PlanoDeSaude p : planos) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getTipoDoPlano();
            i++;
        }
        // Definir um vetor com os nomes das colunas da tabelas
        String[] titulos = {"Código", "operadora", "Tipo do plano"};

        //Criar um modelo que será utilizado pela JTable 
        //para exibir os dados dos planos 
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);
        return tableModel; 
        
        
    }
}
