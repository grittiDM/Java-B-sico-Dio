public class Tv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // Método para mudar de canal
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal: " + canal);
    }

    // Método para aumentar e diminuir canal
    public void aumentarCanal() {
        //canal = canal + 1
        canal++;
        System.out.println("Cn + 1 -> " + canal);
    }
    public void diminuirCanal() {
        //canal = canal - 1
        canal--;
        System.out.println("Cn - 1 -> " + canal);
    }

    // Método para aumentar e diminuir volume
    public void aumentarVolume() {
        //volume = volume + 1
        volume++;
        System.out.println("Vl + 1 -> " + volume);
    }

    public void diminuirVolume() {
        //volume = volume - 1
        volume--;
        System.out.println("Vl - 1 -> " + volume);
    }

    // Método para alternar em ligar e desligar
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
}
