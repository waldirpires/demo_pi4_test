package br.newton.pi4;

public class Calculadora {

    public int subtract(int a, int b) {
        return a - b;

    public int sum(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        
        var calc = new Calculator();

        System.out.println("Resultado 2: " + calc.sum(3, 4)); // 7
    }
}