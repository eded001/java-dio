package aulas.metodo;

public class DeclaracaoMetodo {
    public static void main(String args[]) {
        // <tipo do retorno> <nome> = <método>(<argumento(s) (se necessário)>)
        String nomeCompleto = nomeCompleto("Edgar Augusto", "Mendes de Souza");

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome + " " + segundoNome;
    }
}