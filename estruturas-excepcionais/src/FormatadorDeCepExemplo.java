public class FormatadorDeCepExemplo {
    public static void main(String[] args) {
        try{
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);

        }catch (CepInvalidoException e){
            System.out.println("O CEP não é válido");
        }

    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

            //Simulando um cep formatado
        return "12.345-678";
    }

}
