package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JOptionPane;

public class PlanosDeSaudeDialog extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private PlanoDeSaude planoDeSaude;

    public PlanosDeSaudeDialog(
            java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            PlanoDeSaude planoDeSaude) {

        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.planoDeSaude = planoDeSaude;

        //Preencher os campos caso o tipo de operaçaõ for alterar 
        if (tipoOperacao == TipoOperacao.ALTERAR) {
            preencherFormulario();
        }
    }

    private void preencherFormulario() {
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit.png")));
        labelTitulo.setText("Plano De Saúde - " + tipoOperacao);
        textCodigo.setText(planoDeSaude.getCodigo().toString());
        textNomeDaOperadora.setText(planoDeSaude.getOperadora());
        textTipoDoPlano.setText(planoDeSaude.getTipoDoPlano());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelTipoDoPlano = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        labelNomeDaOperadora = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        textTipoDoPlano = new javax.swing.JTextField();
        textNomeDaOperadora = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        labelDetalhesPlano = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Arial Black", 0, 17)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Planos De Saúde - Adicionar");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(60, 17, 300, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 40, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 640, 60);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        labelTipoDoPlano.setText("Tipo do Plano:");
        jPanel2.add(labelTipoDoPlano);
        labelTipoDoPlano.setBounds(30, 140, 90, 20);

        labelCodigo.setForeground(new java.awt.Color(102, 102, 102));
        labelCodigo.setText("Código:");
        jPanel2.add(labelCodigo);
        labelCodigo.setBounds(30, 20, 50, 20);

        labelNomeDaOperadora.setText("Nome da Operadora:");
        jPanel2.add(labelNomeDaOperadora);
        labelNomeDaOperadora.setBounds(30, 80, 120, 20);

        textCodigo.setEditable(false);
        jPanel2.add(textCodigo);
        textCodigo.setBounds(30, 40, 90, 30);

        textTipoDoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTipoDoPlanoActionPerformed(evt);
            }
        });
        jPanel2.add(textTipoDoPlano);
        textTipoDoPlano.setBounds(30, 160, 240, 30);

        textNomeDaOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeDaOperadoraActionPerformed(evt);
            }
        });
        jPanel2.add(textNomeDaOperadora);
        textNomeDaOperadora.setBounds(30, 100, 240, 30);

        buttonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        buttonCancelar.setText("Cancelar");
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(390, 230, 90, 40);

        buttonSalvar.setBackground(new java.awt.Color(0, 204, 0));
        buttonSalvar.setText("Salvar");
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(490, 230, 80, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 110, 600, 290);

        labelDetalhesPlano.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        labelDetalhesPlano.setForeground(new java.awt.Color(255, 153, 0));
        labelDetalhesPlano.setText("Detalhes do Plano De Saúde:");
        getContentPane().add(labelDetalhesPlano);
        labelDetalhesPlano.setBounds(20, 70, 230, 30);

        setBounds(0, 0, 654, 461);
    }// </editor-fold>//GEN-END:initComponents

    private void textTipoDoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTipoDoPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTipoDoPlanoActionPerformed

    private void textNomeDaOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeDaOperadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeDaOperadoraActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if (tipoOperacao == TipoOperacao.ADICIONAR) {
            gravar();
        } else {
            atualizar();
        }
        
    private void atualizar() {
        planoDeSaude.getOperadora(textNomeDaOperadora.getText());
        planoDeSaude.setTipoDoPlano(textTipoDoPlanoActionPerformed(getText));
        PlanoDeSaudeDAO.alterar(planoDeSaude);
        JOptionPane.showMessageDialog(
                null, 
                "Plano de saúde atualizado com sucesso!", 
                "Plano de saúde", 
                JOptionPane.INFORMATION_MESSAGE);
    }

    private void gravar() {
        //Criar um objeto plano de saúde 
        PlanoDeSaude planoDeSaude = new PlanoDeSaude();
        planoDeSaude.setOperadora(textNomeDaOperadora.getText());
        planoDeSaude.setTipoDoPlano(textTipoDoPlano.getText());

        if (validarCadastro()) {
            PlanoDeSaudeDAO.gravar(planoDeSaude);
            JOptionPane.showMessageDialog(
                    this,
                    "Plano de saúde gravado com sucesso!",
                    "Plano De Saúde",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }
}

//Criar um objeto plano de saúde 
PlanoDeSaude planoDeSaude = new PlanoDeSaude();
        planoDeSaude.setOperadora(textNomeDaOperadora.getText());
        planoDeSaude.setTipoDoPlano(textTipoDoPlano.getText());

        if (validarCadastro()) {
            PlanoDeSaudeDAO.gravar(planoDeSaude);
            JOptionPane.showMessageDialog(
                    this,
                    "Plano de saúde gravado com sucesso!",
                    "Plano De Saúde",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private boolean validarCadastro() {
        if (textNomeDaOperadora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o nome da operadora!",
                    "Plano de saúde",
                    JOptionPane.ERROR_MESSAGE);

            textNomeDaOperadora.requestFocus();

            return false;
        }
        if (textTipoDoPlano.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o tipo do plano!",
                    "Plano de saúde",
                    JOptionPane.ERROR_MESSAGE);

            textTipoDoPlano.requestFocus();
            return false;
        }
        return true;
    }

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed

    }//GEN-LAST:event_buttonCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDetalhesPlano;
    private javax.swing.JLabel labelNomeDaOperadora;
    private javax.swing.JLabel labelTipoDoPlano;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textNomeDaOperadora;
    private javax.swing.JTextField textTipoDoPlano;
    // End of variables declaration//GEN-END:variables
}
