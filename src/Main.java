import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Inicialização dos jogadores
        Jogador jogador1 = new Jogador("Ronaldo", 34, "Atacante", 50);
        Jogador jogador2 = new Jogador("Messi", 36, "Atacante", 60);
        Jogador jogador3 = new Jogador("Neymar", 32, "Atacante", 45);
        Jogador jogador4 = new Jogador("Mbappe", 25, "Atacante", 30);
        Jogador jogador5 = new Jogador("Lewandowski", 35, "Atacante", 55);
        Jogador jogador6 = new Jogador("Benzema", 34, "Atacante", 40);
        Jogador jogador7 = new Jogador("Hazard", 31, "Meio-campo", 20);
        Jogador jogador8 = new Jogador("De Bruyne", 30, "Meio-campo", 25);
        Jogador jogador9 = new Jogador("Modric", 36, "Meio-campo", 15);
        Jogador jogador10 = new Jogador("Kante", 29, "Meio-campo", 10);
        Jogador jogador11 = new Jogador("Salah", 28, "Atacante", 35);
        Jogador jogador12 = new Jogador("Mane", 29, "Atacante", 32);

        // Criação das listas de jogadores para os times
        List<Jogador> jogadoresTimeA = Arrays.asList(jogador1, jogador3, jogador5, jogador7, jogador9, jogador11);
        List<Jogador> jogadoresTimeB = Arrays.asList(jogador2, jogador4, jogador6, jogador8, jogador10, jogador12);

        // Inicialização dos times
        Time time1 = new Time("Time A", "São Paulo", jogadoresTimeA);
        Time time2 = new Time("Time B", "Rio de Janeiro", jogadoresTimeB);

        // Exibição do menu de interação
        MenuInteracao.exibirMenu(Arrays.asList(time1, time2));
    }
}
