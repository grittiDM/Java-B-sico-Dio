public class Usuario {

    public static void main(String[] args) {
        
        Tv tv = new Tv();

        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.aumentarVolume();

        System.out.println("Canal: " + tv.canal);

        tv.mudarCanal(7);

        System.out.println("Tv ligada? " + tv.ligada);

        tv.aumentarCanal();
        tv.aumentarCanal();
        tv.aumentarCanal();
        tv.diminuirCanal();

        System.out.println("Canal: " + tv.canal);

        tv.ligar();
        System.out.println("Tv ligada? " + tv.ligada);

        tv.desligar();
        System.out.println("Tv ligada? " + tv.ligada);
    }
}
