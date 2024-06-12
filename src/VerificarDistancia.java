import java.util.HashMap;
import java.util.Map;

public class VerificarDistancia {
    private static final Map<String, Double> distanciaEntreCidades = new HashMap<>();

    static {
        // Dados fictícios de distâncias entre cidades
        distanciaEntreCidades.put("São Paulo-Rio de Janeiro", 429.0);
        distanciaEntreCidades.put("São Paulo-Belo Horizonte", 586.0);
        distanciaEntreCidades.put("Rio de Janeiro-Belo Horizonte", 434.0);
    }

    public static double calcularDistancia(String cidade1, String cidade2) {
        String chave = cidade1 + "-" + cidade2;
        String chaveReversa = cidade2 + "-" + cidade1;

        return distanciaEntreCidades.getOrDefault(chave, distanciaEntreCidades.getOrDefault(chaveReversa, -1.0));
    }
}
