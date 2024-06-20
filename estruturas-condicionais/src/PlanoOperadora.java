public class PlanoOperadora {
    public static void main(String[] args) {

        //Utilizando if/ else if/ else:
        String plano = "M";

        if(plano == "B") {
            System.out.println("Seu plano atual é o BASIC. Seus benefícios são ->");
            System.out.println("100min de Ligação");

        }else if (plano == "M") {
            System.out.println("Seu plano atual é o MIDIA. Seus benefícios são ->");
            System.out.println("100min de Ligação + WhatsApp e Instagram grátis");

        }else if (plano == "T") {
            System.out.println("Seu plano atual é o TURBO. Seus benefícios são ->");
            System.out.println("100min de Ligação + WhatsApp e Instagram grátis + 5gb de YouTube");
        }

        //Utilizando o Switch/Case.
        String planoInternet = "P";

        switch (planoInternet) {
            case "S":{
                System.out.println("Game Pass + Netflix");
            }
            case "A":{
                System.out.println("Amazon Prime + MAX");
            }
            case "P":{
                System.out.println("400Gb de internet");
            }
        }
    }
}
