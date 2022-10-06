package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import javax.swing.JTable;

public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        System.out.println("Criando a tela home...");
        initComponents();
        PlanoDeSaudeDAO.criarPlanosDeSaudeTeste();
        criarTabelaPlanosDeSaude();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonPlanosDeSaude = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        panelPlanosDeSaude = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        scrollTablePlanosDeSaude = new javax.swing.JScrollPane();
        tablePlanosDeSaude = new javax.swing.JTable();
        buttonExcluirPlanoDeSaude = new javax.swing.JButton();
        buttonAlterarPlanoDeSaude = new javax.swing.JButton();
        buttonAdicionarPlanoDeSaude = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 102, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Sistema para Agendamento de Consultas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 20, 740, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 70, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 970, 80);

        buttonSair.setForeground(new java.awt.Color(51, 0, 255));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/exit32.png"))); // NOI18N
        buttonSair.setToolTipText("Sair do sistema");
        getContentPane().add(buttonSair);
        buttonSair.setBounds(875, 100, 80, 60);

        buttonAgenda.setForeground(new java.awt.Color(51, 0, 255));
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda32.png"))); // NOI18N
        buttonAgenda.setToolTipText("Agenda");
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(10, 100, 80, 60);

        buttonPlanosDeSaude.setBackground(new java.awt.Color(204, 102, 255));
        buttonPlanosDeSaude.setForeground(new java.awt.Color(51, 0, 255));
        buttonPlanosDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/health-card.png"))); // NOI18N
        buttonPlanosDeSaude.setToolTipText("Planos de saúde");
        getContentPane().add(buttonPlanosDeSaude);
        buttonPlanosDeSaude.setBounds(370, 100, 80, 60);

        buttonEspecialidades.setForeground(new java.awt.Color(51, 0, 255));
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/especialidades32.png"))); // NOI18N
        buttonEspecialidades.setToolTipText("Especialidades");
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(280, 100, 80, 60);

        buttonPacientes.setForeground(new java.awt.Color(51, 0, 255));
        buttonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/sick32.png"))); // NOI18N
        buttonPacientes.setToolTipText("Pacientes");
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(100, 100, 80, 60);

        buttonMedicos.setForeground(new java.awt.Color(51, 0, 255));
        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/doctor32.png"))); // NOI18N
        buttonMedicos.setToolTipText("Médicos");
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(190, 100, 80, 60);

        panelPlanosDeSaude.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelPlanosDeSaude.setLayout(null);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Planos de saúde");
        panelPlanosDeSaude.add(jLabel3);
        jLabel3.setBounds(20, 10, 180, 20);

        tablePlanosDeSaude.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollTablePlanosDeSaude.setViewportView(tablePlanosDeSaude);

        panelPlanosDeSaude.add(scrollTablePlanosDeSaude);
        scrollTablePlanosDeSaude.setBounds(20, 40, 905, 240);

        buttonExcluirPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete32-2.png"))); // NOI18N
        buttonExcluirPlanoDeSaude.setToolTipText("Excluir plano de saúde selecionado");
        panelPlanosDeSaude.add(buttonExcluirPlanoDeSaude);
        buttonExcluirPlanoDeSaude.setBounds(700, 294, 70, 60);

        buttonAlterarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png"))); // NOI18N
        buttonAlterarPlanoDeSaude.setToolTipText("Editar plano de saúde selecionado");
        panelPlanosDeSaude.add(buttonAlterarPlanoDeSaude);
        buttonAlterarPlanoDeSaude.setBounds(780, 294, 70, 60);

        buttonAdicionarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add32.png"))); // NOI18N
        buttonAdicionarPlanoDeSaude.setToolTipText("Adicionar plano de saúde");
        panelPlanosDeSaude.add(buttonAdicionarPlanoDeSaude);
        buttonAdicionarPlanoDeSaude.setBounds(860, 294, 70, 60);

        getContentPane().add(panelPlanosDeSaude);
        panelPlanosDeSaude.setBounds(10, 180, 945, 370);

        setBounds(0, 0, 983, 601);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarPlanoDeSaude;
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonAlterarPlanoDeSaude;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonExcluirPlanoDeSaude;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanosDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelPlanosDeSaude;
    private javax.swing.JScrollPane scrollTablePlanosDeSaude;
    private javax.swing.JTable tablePlanosDeSaude;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaPlanosDeSaude() {
        tablePlanosDeSaude.setModel(PlanoDeSaudeDAO.getTableModel());

        //Desativar o redimencionamento da Jtable
        tablePlanosDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Definir a largura de cada coluna
        tablePlanosDeSaude.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablePlanosDeSaude.getColumnModel().getColumn(1).setPreferredWidth(300);
        tablePlanosDeSaude.getColumnModel().getColumn(2).setPreferredWidth(300);

        //Impedir/bloquear a movimentação das colunas 
        tablePlanosDeSaude.getTableHeader().setReorderingAllowed(false);

        //Bloquear edição das células
        tablePlanosDeSaude.setDefaultEditor(Object.class, null);

    }
}
