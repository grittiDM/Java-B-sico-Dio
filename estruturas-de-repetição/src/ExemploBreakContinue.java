public class ExemploBreakContinue {
    public static void main(String[] args) {
        
        //utilização da função break dentro do for
        for(int numero = 1; numero <= 10; numero++){
            if(numero == 5){
                break; //quebra o laço
            }
            System.out.println(numero);
        }

        //utilização da função continue dentro do for
        for(int numero = 1; numero <= 10; numero++){
            if(numero == 5){
                continue; //pula a execução do laço
            }
            System.out.println(numero);
        }
    }
}
