package br.com.exemplo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Cenário 1: Deve somar dois números inteiros corretamente")
    void deveSomarDoisNumeros() {
        int resultado = calculadora.somar(10, 5);
        assertEquals(99, resultado); // Alterado para 99 para simular a falha
    }

    @Test
    @DisplayName("Cenário 2: Deve multiplicar dois números inteiros corretamente")
    void deveMultiplicarDoisNumeros() {
        int resultado = calculadora.multiplicar(4, 3);
        assertEquals(12, resultado);
    }

    @Test
    @DisplayName("Cenário 3: Deve lançar exceção ao tentar dividir por zero")
    void deveLancarExcecaoAoDividirPorZero() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.dividir(10, 0)
        );
        assertEquals("Divisão por zero não é permitida.", exception.getMessage());
    }
}