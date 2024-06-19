public class SwitchCase {
    public static void main(String[] args) {
        
        //utilizando o conceito de condicionais encadeadas
        String sigla = "m";

        if(sigla == "m"){
            System.out.println("Metro");
            
        }else if(sigla == "cm"){
            System.out.println("Centímetro");

        }else if(sigla == "mm"){
            System.out.println("Milímetro");

        }else{
            System.out.println("Sistema de Medida Desconhecido");
        }

        //Usando o conceito de switch case

        String medida = "l";
        switch (medida) {
            case "l":{
                System.out.println("Litro");
                break;
            }
            case "cl":{
                System.out.println("Centilitro");
                break;
            }
            case "ml":{
                System.out.println("Mililitro");
                break;
            }

            default:{
                System.out.println("Medida Desconhecida");
            }
        }
    }
}
