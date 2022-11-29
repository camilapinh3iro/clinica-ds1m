package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListModel;

public class MedicoDialog extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private Medico medico;
    private EspecialidadeDAO especialidadeDao;

    private DefaultListModel<String> listaDasEspecialidades = new DefaultListModel<>();
    private ArrayList<String> especialidades = new ArrayList<>();
    private ArrayList<Especialidade> especialidadesNSelecionadas = EspecialidadeDAO.listarTodos();

    private DefaultListModel<String> listaDasEspecialidadesDoMedico = new DefaultListModel<>();
    private ArrayList<String> selecionadas = new ArrayList<>();
    private ArrayList<Especialidade> especialidadesSelecionadas = new ArrayList<>();

    int linha;

    public MedicoDialog() {
        initComponents();

    }

    public MedicoDialog(
            java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            Medico medico
    ) {
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.medico = medico;

        // Preencher os campos, caso o tipo de operação for ALTERAR
        if (tipoOperacao == tipoOperacao.ALTERAR) {
            preencherFormulario();

        }
    }

    private void preencherFormulario() {
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit.png")));
        labelTitulo.setText("Médicos - " + tipoOperacao);
        textCodigo.setText(medico.getCodigo().toString());
        textCrm.setText(medico.getCrm());
        textNomeDoMedico.setText(medico.getNome());
        textTelefone.setText(medico.getTelefone());
        textEmail.setText(medico.getEmail());
        textDataNascimento.setText(textDataNascimento.getText());
//      listaTodasEspecialidadesModel();
//      criarTabelaEspecialidades();
//      criarTabelaEspecialidadesDoMedico();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelDetalhesMedico = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelEmail = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        textTelefone = new javax.swing.JTextField();
        textNomeDoMedico = new javax.swing.JTextField();
        labelEspecialidadesMedico = new javax.swing.JLabel();
        labelCrm = new javax.swing.JLabel();
        textCrm = new javax.swing.JTextField();
        labelDataNascimento = new javax.swing.JLabel();
        textDataNascimento = new javax.swing.JTextField();
        labelNomeDoMedico = new javax.swing.JLabel();
        labelListaEspecialidades = new javax.swing.JLabel();
        buttonRetirar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListEspecialidadesMedico = new javax.swing.JList<String>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListEspecialidades = new javax.swing.JList<String>();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelTitulo1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Médicos - ADICIONAR");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(60, 17, 300, 26);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 40, 40);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(760, 615));
        getContentPane().setLayout(null);

        labelDetalhesMedico.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        labelDetalhesMedico.setForeground(new java.awt.Color(153, 153, 153));
        labelDetalhesMedico.setText("Detalhes do(a) médico(a):");
        getContentPane().add(labelDetalhesMedico);
        labelDetalhesMedico.setBounds(20, 70, 195, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        labelEmail.setText("E-mail: ");
        jPanel2.add(labelEmail);
        labelEmail.setBounds(230, 90, 90, 20);

        labelCodigo.setForeground(new java.awt.Color(102, 102, 102));
        labelCodigo.setText("Código:");
        jPanel2.add(labelCodigo);
        labelCodigo.setBounds(30, 20, 50, 20);

        labelTelefone.setText("Telefone:");
        jPanel2.add(labelTelefone);
        labelTelefone.setBounds(30, 90, 120, 20);

        textCodigo.setEditable(false);
        jPanel2.add(textCodigo);
        textCodigo.setBounds(30, 40, 90, 30);

        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });
        jPanel2.add(textEmail);
        textEmail.setBounds(230, 110, 280, 30);

        textTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(textTelefone);
        textTelefone.setBounds(30, 110, 160, 30);

        textNomeDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeDoMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(textNomeDoMedico);
        textNomeDoMedico.setBounds(380, 40, 290, 30);

        labelEspecialidadesMedico.setText("Especialidades do médico:");
        jPanel2.add(labelEspecialidadesMedico);
        labelEspecialidadesMedico.setBounds(280, 180, 150, 20);

        labelCrm.setText("CRM:");
        jPanel2.add(labelCrm);
        labelCrm.setBounds(160, 20, 120, 20);

        textCrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCrmActionPerformed(evt);
            }
        });
        jPanel2.add(textCrm);
        textCrm.setBounds(160, 40, 180, 30);

        labelDataNascimento.setText("Data de nascimento:");
        jPanel2.add(labelDataNascimento);
        labelDataNascimento.setBounds(540, 90, 120, 20);

        textDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDataNascimentoActionPerformed(evt);
            }
        });
        jPanel2.add(textDataNascimento);
        textDataNascimento.setBounds(540, 110, 130, 30);

        labelNomeDoMedico.setText("Nome do(a) médico(a):");
        jPanel2.add(labelNomeDoMedico);
        labelNomeDoMedico.setBounds(380, 20, 130, 20);

        labelListaEspecialidades.setText("Lista de especialidades:");
        jPanel2.add(labelListaEspecialidades);
        labelListaEspecialidades.setBounds(30, 180, 160, 20);

        buttonRetirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/seta-esquerda32.png"))); // NOI18N
        buttonRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetirarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonRetirar);
        buttonRetirar.setBounds(190, 290, 60, 50);

        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/seta-direita32 (2).png"))); // NOI18N
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonAdicionar);
        buttonAdicionar.setBounds(190, 230, 60, 50);

        jListEspecialidadesMedico.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jListEspecialidadesMedico);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(290, 210, 120, 146);

        jScrollPane4.setViewportView(jListEspecialidades);

        jPanel2.add(jScrollPane4);
        jScrollPane4.setBounds(30, 210, 120, 150);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 110, 710, 370);

        buttonCancelar.setBackground(new java.awt.Color(246, 246, 246));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir32.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCancelar);
        buttonCancelar.setBounds(580, 490, 70, 60);

        buttonSalvar.setBackground(new java.awt.Color(246, 246, 246));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salvar-arquivo32.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSalvar);
        buttonSalvar.setBounds(660, 490, 70, 60);

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setLayout(null);

        labelTitulo1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        labelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo1.setText("Médicos - ADICIONAR");
        jPanel3.add(labelTitulo1);
        labelTitulo1.setBounds(60, 17, 300, 26);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add.png"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 10, 40, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 750, 60);

        setBounds(0, 0, 765, 611);
    }// </editor-fold>//GEN-END:initComponents

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void textTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefoneActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if (tipoOperacao == TipoOperacao.ADICIONAR) {
            gravar();
        } else {
            atualizar();
        }

    }//GEN-LAST:event_buttonSalvarActionPerformed
    private void atualizar() {

        textCrm.setText(medico.getCrm());
        textNomeDoMedico.setText(medico.getNome());
        textTelefone.setText(medico.getTelefone());
        textEmail.setText(medico.getEmail());
        medico.setDataFormatada(textDataNascimento.getText());

        if (validarCadastro()) {
            MedicoDAO.alterar(medico);

            JOptionPane.showMessageDialog(
                    null,
                    "Médicos atualizado com sucesso!",
                    "Médicos",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
    }

    private void gravar() {

        Medico medico = new Medico();
        medico.setCrm(textCrm.getText());
        medico.setNome(textNomeDoMedico.getText());
        medico.setTelefone(textTelefone.getText());
        medico.setEmail(textEmail.getText());
        medico.setDataNascimento(LocalDate.parse(textDataNascimento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        if (validarCadastro()) {
            MedicoDAO.gravar(medico);

            JOptionPane.showMessageDialog(
                    this,
                    "Novo médico gravado com sucesso!",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    private boolean validarCadastro() {
        if (textCrm.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o campo com o seu CRM!",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);

            textCrm.requestFocus();

            return false;
        }

        if (textNomeDoMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o campo do nome do médico!",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);

            textNomeDoMedico.requestFocus();

            return false;
        }

        if (textTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o campo do número de telefone!",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);

            textTelefone.requestFocus();

            return false;

        }

        if (textEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o campo do E-mail!",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);

            textEmail.requestFocus();

            return false;

        }

        if (textDataNascimento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o campo da data de nascimento!",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);

            textDataNascimento.requestFocus();

            return false;

        }

        return true;
    }
    private void textNomeDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeDoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeDoMedicoActionPerformed

    private void textCrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCrmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCrmActionPerformed

    private void textDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDataNascimentoActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        List<String> especialidadesDoMedico = jListEspecialidades.getSelectedValuesList();

        for (String e : especialidadesDoMedico) {
            selecionadas.add(e);
        }
        for (Especialidade e : especialidadesNSelecionadas) {
            if (especialidadesDoMedico.contains(e.getNome())) {
                especialidadesSelecionadas.add(e);
            }
        }

        listaDasEspecialidadesDoMedico.clear();
        listaDasEspecialidadesDoMedico.addAll(selecionadas);
        jListEspecialidadesMedico.setModel(listaDasEspecialidadesDoMedico);

        int[] excluir = jListEspecialidades.getSelectedIndices();
        for (int e : excluir) {
            listaDasEspecialidades.remove(e);
            especialidades.remove(e);

        }
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRetirarActionPerformed
        List<String> removerEspecialidades = jListEspecialidadesMedico.getSelectedValuesList();

        for (String e : removerEspecialidades) {
            especialidades.add(e);
        }
        for (Especialidade e : especialidadesNSelecionadas) {
            if (removerEspecialidades.contains(e.getNome())) {
                especialidadesSelecionadas.remove(e);
            }
        }

        listaDasEspecialidades.clear();
        listaDasEspecialidades.addAll(especialidades);
        jListEspecialidades.setModel(listaDasEspecialidades);

        int[] excluir = jListEspecialidadesMedico.getSelectedIndices();
        for (int e : excluir) {
            listaDasEspecialidadesDoMedico.remove(e);
            selecionadas.remove(e);
        }


    }//GEN-LAST:event_buttonRetirarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonRetirar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jListEspecialidades;
    private javax.swing.JList<String> jListEspecialidadesMedico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCrm;
    private javax.swing.JLabel labelDataNascimento;
    private javax.swing.JLabel labelDetalhesMedico;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEspecialidadesMedico;
    private javax.swing.JLabel labelListaEspecialidades;
    private javax.swing.JLabel labelNomeDoMedico;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTitulo1;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textCrm;
    private javax.swing.JTextField textDataNascimento;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNomeDoMedico;
    private javax.swing.JTextField textTelefone;
    // End of variables declaration//GEN-END:variables

    private void atualizarListasEspecialidades() {
        especialidades = EspecialidadeDAO.getListaDeNomes();
        listaDasEspecialidades.addAll(especialidades);
        jListEspecialidades.setModel(listaDasEspecialidades);
        if (tipoOperacao == TipoOperacao.ADICIONAR) {

        } else {
            especialidadesSelecionadas = medico.getEspecialidades();
            selecionadas = medico.getListaDeEspecialidadesDoMedico();
            listaDasEspecialidadesDoMedico.clear();
            listaDasEspecialidadesDoMedico.addAll(selecionadas);
            jListEspecialidadesMedico.setModel(listaDasEspecialidadesDoMedico);

            int i = 0;
            for (String e : selecionadas) {
                if (especialidades.contains(e)) {
                    especialidades.remove(e);
                }
            }
            listaDasEspecialidades.clear();
            listaDasEspecialidades.addAll(especialidades);

        }

    }
}
