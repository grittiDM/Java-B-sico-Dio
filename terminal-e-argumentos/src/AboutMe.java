public class AboutMe {
    public static void main(String[] args) {
        
        //os argumetnos comçam com indice 0
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]); //converte para inteiro
        double altura = Double.valueOf(args[3]);

        System.out.println("Prazer, meu nome é: " + nome + " " + sobrenome);
        System.out.println("Minha idade é: " + idade + " anos");
        System.out.println("Minha altura é: " + altura +  "cm");
    }
}
