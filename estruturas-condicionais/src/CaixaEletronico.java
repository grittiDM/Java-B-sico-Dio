public class CaixaEletronico {
    public static void main(String[] args) {
        
        //Simulando um caixa eletronico aplicando meus conhecimentos de controle de Fluxo.
        double saldo = 248.98;
        double valorSolicitado = 280.00;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Regate feito com sucesso! Seu saldo atual é de: R$" + saldo);
        }else{
            System.out.println("Que pena... Saldo insuficiente.");
        }
    }
}
