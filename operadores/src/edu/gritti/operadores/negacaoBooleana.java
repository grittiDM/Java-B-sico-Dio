package edu.gritti.operadores;

public class negacaoBooleana {
    public static void main(String[] args){
        
        //maneira "clássica"
        boolean variavelDio = false;

        variavelDio = !variavelDio;
        System.out.println(variavelDio);
        
        //maneira "simplificada"
        boolean variavel = true;
        System.out.println(!variavel);

        System.out.println(!(!variavel));
    }

}
