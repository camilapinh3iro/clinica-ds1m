package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class Medico extends Pessoa {

    private static int contador = 100;
    private static int quantidade;
    private Integer codigo;
    private String crm;
    private ArrayList<Medico> medicos = new ArrayList<>();
    
    Pessoa pessoa = new Pessoa();
    
    // construtores
     public Medico() {
        atualizarCodigo();
    }

//    public Medico(Integer codigo, String nome, String crm, String email, String telefone, String  ) {
//        
//        
//    }
    
    public Medico(Integer codigo, String nome, String crm) {
        
        this.codigo = codigo;
        this.codigo = codigo;
        contador++;
    }

//    public Medico(String nome) {
//        
//        atualizarCodigo();
//    }
    
    
// metodos de acesso
    private void atualizarCodigo() {
        contador++;
        this.codigo = contador;
    }
    
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public ArrayList<Medico> getMedico() {
        return medicos;
    }

    public void setMedicos(ArrayList<Medico> medicos) {
        this.medicos = medicos;
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
