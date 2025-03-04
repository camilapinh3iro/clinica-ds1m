package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class MedicoPanel extends javax.swing.JPanel {

    int linha;

    public MedicoPanel() {
        initComponents();
        criarTabelaMedicos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        scrollTableMedicos = new javax.swing.JScrollPane();
        tableMedicos = new javax.swing.JTable();
        buttonExcluirMedico = new javax.swing.JButton();
        buttonAlterarMedico = new javax.swing.JButton();
        buttonAdicionarMedico = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(945, 370));
        setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Médicos");
        add(jLabel3);
        jLabel3.setBounds(20, 10, 180, 20);

        tableMedicos.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollTableMedicos.setViewportView(tableMedicos);

        add(scrollTableMedicos);
        scrollTableMedicos.setBounds(20, 40, 905, 240);

        buttonExcluirMedico.setBackground(new java.awt.Color(246, 246, 246));
        buttonExcluirMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete.png"))); // NOI18N
        buttonExcluirMedico.setToolTipText("Excluir médico selecionado");
        buttonExcluirMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirMedicoActionPerformed(evt);
            }
        });
        add(buttonExcluirMedico);
        buttonExcluirMedico.setBounds(700, 294, 70, 60);

        buttonAlterarMedico.setBackground(new java.awt.Color(246, 246, 246));
        buttonAlterarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit.png"))); // NOI18N
        buttonAlterarMedico.setToolTipText("Editar médico selecionado");
        buttonAlterarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarMedicoActionPerformed(evt);
            }
        });
        add(buttonAlterarMedico);
        buttonAlterarMedico.setBounds(780, 294, 70, 60);

        buttonAdicionarMedico.setBackground(new java.awt.Color(246, 246, 246));
        buttonAdicionarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add.png"))); // NOI18N
        buttonAdicionarMedico.setToolTipText("Adicionar médico");
        buttonAdicionarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarMedicoActionPerformed(evt);
            }
        });
        add(buttonAdicionarMedico);
        buttonAdicionarMedico.setBounds(860, 294, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirMedicoActionPerformed
        linha = tableMedicos.getSelectedRow();

        // verificamos se a linha é diferente de -1
        // -1 significa que o usuário não selecionou nada
        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione o médico que você deseja excluir!", "Médico", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirMedicoActionPerformed

    private void buttonAlterarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarMedicoActionPerformed
        linha = tableMedicos.getSelectedRow();
        if (linha != -1) {
            editar();
        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione o médico que você deseja alterar!",
                    "Médico",
                    JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_buttonAlterarMedicoActionPerformed

    private void buttonAdicionarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarMedicoActionPerformed

        MedicoDialog medicoDialog = new MedicoDialog(
                null,
                true,
                TipoOperacao.ADICIONAR,
                null);
        medicoDialog.setVisible(true);

        criarTabelaMedicos();
    }//GEN-LAST:event_buttonAdicionarMedicoActionPerformed
    private void editar() {

        Medico medico = MedicoDAO.getMedico(getCodigo());

        MedicoDialog medicoDialog = new MedicoDialog(
                null,
                true,
                TipoOperacao.ALTERAR,
                medico);

        medicoDialog.setVisible(true);
        criarTabelaMedicos();

    }

    private void excluir() {
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão do médico selecionado?",
                "Médico",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

//        System.out.println("resposta");
        if (resposta == 0) {

            MedicoDAO.excluir(getCodigo());
            criarTabelaMedicos();
        }

    }

    private Integer getCodigo() {
        String codigoStr = tableMedicos.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarMedico;
    private javax.swing.JButton buttonAlterarMedico;
    private javax.swing.JButton buttonExcluirMedico;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane scrollTableMedicos;
    private javax.swing.JTable tableMedicos;
    // End of variables declaration//GEN-END:variables
    private void criarTabelaMedicos() {
        tableMedicos.setModel(MedicoDAO.getTableModel());

        //Desativar o redimencionamento da Jtable
        tableMedicos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Definir a largura de cada coluna
        tableMedicos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableMedicos.getColumnModel().getColumn(1).setPreferredWidth(300);
        tableMedicos.getColumnModel().getColumn(2).setPreferredWidth(300);

        //Impedir/bloquear a movimentação das colunas 
        tableMedicos.getTableHeader().setReorderingAllowed(false);

        //Bloquear edição das células
        tableMedicos.setDefaultEditor(Object.class, null);

    }

}
