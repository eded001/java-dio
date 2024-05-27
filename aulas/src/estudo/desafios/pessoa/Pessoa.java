package desafios.pessoa;

/**
 * <h1>Pessoa</h1>
 *
 * <p>A classe Pessoa possibilita criar um objeto pessoa que possibilita a definição de 
 * <b>nome</b>, <b>sexo</b> e <b>idade</b></p>
 *
 * @author Edgar Souza
 * @version 1.0
 * @since 17/05/2024
*/

public class Pessoa {
    private char sexo;
    private String nome;
    private byte idade;

    // setters
    /**
     * Este método é utilizado para definir o nome do usuário
     * @param novoNome é o nome do usuário
    */
    public void definirNome(String novoNome) {
        this.nome = novoNome;
    }

    /**
     * Este método é utilizado para definir a idade do usuário
     * @param novaIdade é a idade do usuário
    */
    public void definirIdade(byte novaIdade) {
        this.idade = novaIdade;
    }

    /**
     * Este método é utilizado para definir o sexo do usuário
     * @param novoSexo é o sexo do usuário
    */
    public void definirSexo(char novoSexo) {
        this.sexo = novoSexo;
    }

    // getters
    /**
     * Este método é utilizado para retornar o nome do usuário
    */
    public String pegarNome() {
        return this.nome;
    }

    /**
     * Este método é utilizado para retornar a idade do usuário
    */
    public byte pegarIdade() {
        return this.idade;
    }

    /**
     * Este método é utilizado para retornar o sexo do usuário
    */
    public char pegarSexo() {
        return this.sexo;
    }
}

// usar javadoc -encoding UTF-8 -docencoding UTF-8 -charset UTF-8 -d doc Pessoa.java para gerar documentações