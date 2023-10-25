package br.senai.sp.jandira;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João", 1);
        Programador programador = new Programador("Maria", 2, 6);

        System.out.println("O salário do gerente é: " + gerente.calcularSalario());
        System.out.println("O salário do programador é: " + programador.calcularSalario());
    }
}
