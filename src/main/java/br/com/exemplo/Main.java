package br.com.exemplo;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        out.println("Calculadora Java 21");
        out.println("2 + 3 = " + calculadora.somar(2, 3));
        out.println("10 - 4 = " + calculadora.subtrair(10, 4));
        out.println("5 * 6 = " + calculadora.multiplicar(5, 6));
    }
}