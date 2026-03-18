package Calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculadora{

    static  Calculadora calc;

        public static void setUpBuferClass() throws Exception{
           calc = new Calculadora();
        }

        @Test
        void testSumar() {
            assertEquals(10, calc.sumar(7, 3), "7 + 3 debería ser 10");
        }

        @Test
         void testRestar(){
            assertEquals(4, calc.restar(7, 3), "7 - 3 debería ser 4");
        }


        @Test
        void testMultiplicar(){
        assertEquals(4, calc.multiplicar(2, 2), "2 * 2 debería ser 4");

       }


     @Test
     void testDividir(){
       assertEquals(2, calc.dividir(10, 5), "10 / 2 debería ser 2");

     }

    @Test
    void testPotencia(){
        assertEquals(25, calc.potencia(5, 2), " debería ser 25");

    }

    @Test
    void testRaiz(){
        assertEquals(7, calc.raiz(49), " debería ser 7");

    }
}
