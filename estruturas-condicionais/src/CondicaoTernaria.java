public class CondicaoTernaria {
    public static void main(String[] args) {
        
        double nota = 6;

        String resultado = nota >= 6 ? "Aprovado" : nota >= 3 && nota <6 ? "Recuperação" : nota > 0 && nota <3 ? "Conselho Final" : "Reprovado";

        System.out.println(resultado);
    }
}
