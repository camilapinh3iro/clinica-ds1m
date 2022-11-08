package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class Medico extends Pessoa {

    private static int contador = 100;
    private static int quantidade;
    private Integer codigo;
    private String crm;
    private ArrayList<Especialidade> especialidades = new ArrayList<>();

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public int getContador() {
        return contador;
    }

    public String getMedicoSeparadoPorPontoEVingula() {
        return this.codigo + ";" + this.crm + ";" + this.getNome() + ";"
                + this.getTelefone() + ";" + this.getEmail() + ";" + this.getDataNascimento();
    }
}
