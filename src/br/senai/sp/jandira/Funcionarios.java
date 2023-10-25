package br.senai.sp.jandira;

abstract class Funcionarios {
    String nome;
    int id;
    private double salario =  2751.00;

    private double valorHora = (salario/ 220) + 0.5;
    public Funcionarios(String nome, int id){
        this.nome = nome;
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public abstract double calcularSalario();
}
