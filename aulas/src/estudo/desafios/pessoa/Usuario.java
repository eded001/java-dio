package desafios.pessoa;

public class Usuario {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.definirIdade((byte) 19);
        pessoa.definirNome("Edgar");

        String nome = pessoa.pegarNome();
        byte idade = pessoa.pegarIdade();

        System.out.println("o usuário " + nome + " tem " + idade + " anos");
    }
}