import java.util.Objects;

public class Jogador {
    private String nome;
    private int idade;
    private String posicao;
    private int numeroGols;

    public Jogador(String nome, int idade, String posicao, int numeroGols) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.numeroGols = numeroGols;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getNumeroGols() {
        return numeroGols;
    }

    @Override
    public String toString() {
        return "Jogador [Nome=" + nome + ", Idade=" + idade + ", Posição=" + posicao + ", Número de Gols=" + numeroGols + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jogador jogador = (Jogador) o;
        return idade == jogador.idade &&
                numeroGols == jogador.numeroGols &&
                Objects.equals(nome, jogador.nome) &&
                Objects.equals(posicao, jogador.posicao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, posicao, numeroGols);
    }
}
