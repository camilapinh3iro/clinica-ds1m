package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class Medico extends Pessoa {

    private LocalDate dataNascimento;
    private DateTimeFormatter formatador;
    private String dataFormatada = "";

    private static int contador = 100;
    private Integer codigo;
    private String crm;

    private Especialidade especialidade;
    private ArrayList<Especialidade> especialidades;

//    private ArrayList<Medico> medicos = new ArrayList<>();
    
    // CONSTRUTORES
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

    public Medico(Integer codigo, String crm, String nome, String telefone, String email, LocalDate dataDeNascimento, ArrayList<Especialidade> especialidades) {

        this.crm = crm;
        setNome(nome);
        setTelefone(telefone);
        setEmail(email);
        setDataNascimento(dataDeNascimento);
        this.especialidades = especialidades;

        this.codigo = codigo;
        this.contador = codigo++;

    }

// metodos de acesso
    private void atualizarCodigo() {
        contador++;
        this.codigo = contador;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataFormatada() {
        return dataFormatada;
    }

    public void setDataFormatada(String data) {
        this.dataFormatada = data;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
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

    public String getMedicoSeparadoPontoVirgula() {
        String codigoEspecialidades = "";
        for (Especialidade e : especialidades) {
            codigoEspecialidades += e.getCodigo() + ";";
        }

        return this.codigo + ";" + this.crm + ";" + this.getNome() + ";" + this.getTelefone() + ";" + this.getEmail() + ";" + this.getDataNascimento() + ";" + codigoEspecialidades;
    }

    public ArrayList<String> getListaDeEspecialidadesDoMedico() {
        ArrayList<String> dados = new ArrayList<>();
        for (Especialidade e : especialidades) {
            dados.add(e.getNome());
        }
        DefaultListModel<String> ListaModel = new DefaultListModel<>();

        ListaModel.addAll(dados);

        return dados;

    }

}
