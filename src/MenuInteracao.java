import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class MenuInteracao {

    public static void exibirMenu(List<Time> times) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Menu:");
                System.out.println("1. Verificar jogador com mais gols");
                System.out.println("2. Listar jogadores de um time");
                System.out.println("3. Encontrar jogador mais velho");
                System.out.println("4. Sair");

                int opcao = scanner.nextInt();
                scanner.nextLine();  // Consumir a nova linha

                switch (opcao) {
                    case 1:
                        verificarJogadorComMaisGols(times);
                        break;
                    case 2:
                        listarJogadoresDeUmTime(times, scanner);
                        break;
                    case 3:
                        encontrarJogadorMaisVelho(times);
                        break;
                    case 4:
                        System.out.println("Saindo...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Erro de entrada. Por favor, tente novamente.");
                scanner.nextLine();  // Consumir a nova linha para evitar loop infinito
            }
        }
    }

    private static void verificarJogadorComMaisGols(List<Time> times) {
        List<Jogador> todosJogadores = times.stream()
                                             .flatMap(time -> time.getJogadores().stream())
                                             .toList();

        Optional<Jogador> melhorJogador = CompararJogadores.jogadorComMaisGols(todosJogadores);
        melhorJogador.ifPresent(jogador -> System.out.println("Jogador com mais gols: " + jogador));
    }

    private static void listarJogadoresDeUmTime(List<Time> times, Scanner scanner) {
        System.out.println("Digite o nome do time (Digite, Time A ou Time B):");
        String nomeTime = scanner.nextLine();

        times.stream()
             .filter(time -> time.getNome().equalsIgnoreCase(nomeTime))
             .findFirst()
             .ifPresentOrElse(time -> {
                 System.out.println("Jogadores do " + time.getNome() + ":");
                 time.getJogadores().forEach(System.out::println);
             }, () -> System.out.println("Time não encontrado."));
    }

    private static void encontrarJogadorMaisVelho(List<Time> times) {
        List<Jogador> todosJogadores = times.stream()
                                             .flatMap(time -> time.getJogadores().stream())
                                             .toList();

        Optional<Jogador> jogadorMaisVelho = todosJogadores.stream()
                                                           .max((j1, j2) -> Integer.compare(j1.getIdade(), j2.getIdade()));
        jogadorMaisVelho.ifPresent(jogador -> System.out.println("Jogador mais velho: " + jogador));
    }
}
