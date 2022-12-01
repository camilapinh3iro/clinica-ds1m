package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class Medico extends Pessoa {

    private static int contador = 100;
    private Integer codigo;
    private String crm;

    private Especialidade especialidade;
    private ArrayList<Especialidade> especialidades;

    public Medico() {
        atualizarCodigo();
    }

    public Medico(Integer codigo, String nome, String crm) {

        this.codigo = codigo;
        this.codigo = codigo;
        setNome(nome);
        this.contador = this.codigo;

        atualizarCodigo();
    }

    public Medico(Integer codigo, String crm, String nome, String telefone, String email, String dataNascimento, ArrayList<Especialidade> especialidades) {

        this.codigo = codigo;
        this.crm = crm;
        setNome(nome);
        setTelefone(telefone);
        setEmail(email);
        setDataNascimento(dataNascimento);
        this.especialidades = especialidades;
        this.contador = codigo;

    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public static int getContador() {
        return contador;
    }

    private void atualizarCodigo() {
        contador++;
        this.codigo = contador;
    }

    public String getMedicoSeparadoPontoVirgula() {
        return this.codigo + ";"
                + this.crm + ";"
                + this.getNome() + ";"
                + this.getTelefone() + ";"
                + this.getEmail() + ";"
                + getDataNascimento() + ";"
                + getCodigosEspecialidades();
    }

    public String getCodigosEspecialidades() {
        String codigosEspecialidades = "";
        for (Especialidade especialidade : especialidades) {
            codigosEspecialidades += especialidade.getCodigo() + ";";
        }
        return codigosEspecialidades;
    }

    public ArrayList<String> getEspecialidadesMedico() {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        ArrayList<String> dados = new ArrayList<>();

        for (Especialidade especialidade : especialidades) {
            dados.add(especialidade.getNome());
        }

        listModel.addAll(dados);

        return dados;

    }

}
