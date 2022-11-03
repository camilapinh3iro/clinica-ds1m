package br.senai.sp.jandira.model;

public class Especialidade {

    private static int contador = 100;
    private String nome;
    private String descricao;
    private static int quantidade;
    private Integer codigo;

    // criando construtores 
    public Especialidade() {
        atualizarCodigo();
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        atualizarCodigo();
    }
    
    public Especialidade(Integer codigo, String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
        this.codigo = codigo;
        contador++;
    }

    public Especialidade(String nome) {
        this.nome = nome;
        atualizarCodigo();
    }


    // metodos 
    private void atualizarCodigo() {
        contador++;
        this.codigo = contador;
    }

    // Métodos de acesso getters and setters
    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
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

    public String getEspecialidadeSeparadoPorPontoEVingula(){
            return this.codigo + ";" + this.nome + ";" + this.descricao;  
        }
}
