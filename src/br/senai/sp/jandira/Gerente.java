package br.senai.sp.jandira;

public final class Gerente extends Funcionarios{
    double bonusGerencia = 0.4;

    public Gerente(String nome, int id){
        super(nome,id);
    }

    @Override
    public double calcularSalario() {
        double salarioGerente = getSalario();
        return (salarioGerente * bonusGerencia) + salarioGerente;
    }
}
