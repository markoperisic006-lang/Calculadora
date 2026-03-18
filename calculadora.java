import java.util.Scanner;

class Calculadora {

    public int sumar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    public int restar(int a, int b) {
        int resultado = a - b;
        return resultado;
    }

    public int multiplicar(int a, int b) {
        int resultado = a * b;
        return resultado;
    }

    public double dividir(int a, int b) {
        double resultado = (double) a / b;
        return resultado;
    }

    public int potencia(int a, int b) {
        int resultado = (int) Math.pow(a, b);
        return resultado;
    }

    public double raiz(int a) {
        double resultado = Math.sqrt(a);
        return resultado;
    }
}

