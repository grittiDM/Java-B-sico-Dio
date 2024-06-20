public class CondicionalEncadeada {
    public static void main(String[] args) {
        
        //Código de resultado escolar
        double nota = 3.5;

        if(nota >= 6){
            System.out.println("Aprovado");

        }else if(nota >= 3 && nota < 6){
            System.out.println("Recuperação");

        }else if(nota > 0 && nota < 3){
            System.out.println("Conselho Final");

        }else{
            System.out.println("Reprovado");
        }
    }
}
