package br.senai.sp.jandira;

public final class Programador extends Funcionarios{

    int numeroDeHorasExtras;
    public Programador(String nome, int id, int numeroDeHorasExtras){
        super(nome,id);

        this.numeroDeHorasExtras = numeroDeHorasExtras;
    }
    @Override
    public double calcularSalario(){
        double salarioProgramador = getSalario();
        double valorHora = getValorHora();
        return (valorHora * numeroDeHorasExtras) + salarioProgramador;
    };
}
