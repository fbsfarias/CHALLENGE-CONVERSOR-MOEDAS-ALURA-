import br.com.alura.modules.ConsultaConvercao;
import br.com.alura.modules.ConversorMoeda;
import br.com.alura.modules.Menu;
import br.com.alura.modules.Moeda;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        ConsultaConvercao consulta = new ConsultaConvercao();
        ConversorMoeda conversor = new ConversorMoeda();

        boolean continuar = true;

        while (continuar) {
            String moedaBase = menu.lerMoedaBase();
            String moedaDestino = menu.lerMoedaDestino();
            double valor = menu.lerValor();

            Moeda moeda = consulta.buscaConvercao(moedaBase);
            Double taxa = moeda.conversion_rates().get(moedaDestino);

            if (taxa == null) {
                System.out.println("Não foi possível obter a taxa de conversão.");
            } else {
                double convertido = conversor.converter(valor, taxa);
                menu.mostrarResultado(convertido, moedaDestino);
            }

            continuar = menu.desejaContinuar();
        }

        System.out.println("Programa encerrado.");
    }
}
