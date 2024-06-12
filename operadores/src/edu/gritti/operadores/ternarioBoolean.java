package edu.gritti.operadores;

public class ternarioBoolean {
    public static void main(String[] args) {
        
        //sem ternário (versão extensa)
        int a, b;

        a = 5;
        b = 6;

        String resultado = "";
        if(a==b)
            resultado = "Sao iguais";
        else
            resultado = "Nao sao iguais";

        System.out.println(resultado);

        //com ternário (simplificado)
        int c, d;

        c = 7;
        d = 7;

        String resultado2 = (c==d) ? "Sao iguais" : "Nao sao iguais";
        System.out.println(resultado2);

        //com ternário e int ao invés de String
        int e, f;

        e = 7;
        f = 5;

        int resultado3 = (e==f) ? 1 : 0;
        System.out.println(resultado3);
    }

}
