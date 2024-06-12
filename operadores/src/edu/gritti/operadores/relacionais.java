package edu.gritti.operadores;

public class relacionais {
    public static void main(String[] args) {
        
        //Relacionais com variáveis de texto
        String nome1 = "João";
        String nome2 = "Maria";

        boolean resultadoNome = nome1 == nome2;
        System.out.println("O nomes são iguais? " + resultadoNome);

        String nome3 = new String("João");
        
        boolean resultadoNome2 = nome1.equals(nome3);
        System.out.println("O nomes são iguais? " + resultadoNome2);

        //Relacionais com variáveis numéricas
        int numero1 = 4;
        int numero2 = 5;

        if(numero1 < numero2){
            System.out.println("Número um é menor que o número dois");
        }

        boolean resultado = numero1 == numero2;
        System.out.println("Número um é igual o número dois? " + resultado);

        resultado = numero1 != numero2;
        System.out.println("Número um é diferente do número dois? " + resultado);

        resultado = numero1 > numero2;
        System.out.println("Número um é maior que o número dois? " + resultado);

        resultado = numero1 < numero2;
        System.out.println("Número um é menor que o número dois? " + resultado);
    }
}
