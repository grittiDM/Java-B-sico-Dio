package edu.gritti.operadores;

public class logico {
    public static void main(String[] args) {
        
        boolean condicao1 = true;
        boolean condicao2 = true;    

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Pelo menos uma das condições é verdadeira");
        }

        System.out.println("fim");
    }

}
