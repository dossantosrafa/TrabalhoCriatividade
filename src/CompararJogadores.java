import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CompararJogadores {

    public static Optional<Jogador> jogadorComMaisGols(List<Jogador> jogadores) {
        return jogadores.stream().max(Comparator.comparingInt(Jogador::getNumeroGols));
    }
}
   
