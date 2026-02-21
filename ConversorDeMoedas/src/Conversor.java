import java.util.Map;
import java.util.Scanner;

public class Conversor {
    public void show(){
        System.out.println("***************************************\nOlá, bem-vindo(a) ao conversor de moedas!" +
                "\n***************************************\n");

        System.out.println("Escolha qual moeda você quer converter! Aqui estão algumas opções:\n");
        System.out.println("""
            CÓDIGO DA MOEDA | NOME DA MOEDA        | PAÍS
                  ARS       | Peso Argentino       | Argentina
                  PRUMO     | Boliviano            | Bolívia
                  BRL       | Real Brasileiro      | Brasil
                  CAD       | Dólar Canadense      | Canadá
                  CLP       | Peso Chileno         | Chile
                  EUR       | Euro                 | União Europeia
                  GBP       | Libra Esterlina      | Reino Unido
                  JPY       | Iene Japonês         | Japão
                  KRW       | Won Sul-Coreano      | Coréia do Sul
                  USD       | Dólar Estados Unidos | Estados Unidos
            NOTA: você também pode escolher qualquer outra que desejar, basta saber o código como acima! :)
                                                   Veja as opções disponíveis em {https://www.exchangerate-api.com/docs/supported-currencies}
            """);
    }

    public void converter(Scanner in, Conversor conversor){
        System.out.print("\nDigite o código da moeda de origem (ex: BRL, USD, EUR): ");
        String origem = in.next().trim().toUpperCase();

        System.out.print("Digite o código da moeda de destino (ex: BRL, USD, EUR): ");
        String destino = in.next().trim().toUpperCase();

        System.out.print("Digite o valor que deve ser convertido: ");
        double valor;
        try {
            valor = Double.parseDouble(in.next().replace(",", "."));
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido.");
            return;
        }

        ConversorAPI api = new ConversorAPI();

        try {
            Moedas dados = api.buscarTaxas(origem);
            Map<String, Double> rates = dados.conversion_rates();

            if (rates == null || !rates.containsKey(destino)) {
                System.out.println("\nMoeda de destino inválida ou não encontrada: " + destino);
                return;
            }

            double taxa = rates.get(destino);
            double convertido = valor * taxa;

            System.out.printf("%n%.2f %s = %.2f %s%n", valor, origem, convertido, destino);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        conversor.decisao(in, conversor);
    }

    public void decisao(Scanner in, Conversor conversor) {
        System.out.println("Gostaria de continuar? Digite 1 para SIM e 0 para NÃO.");
        int continuar = in.nextInt();
        if (continuar == 0) {
            return;
        } else if(continuar < 0 || continuar > 1) {
            System.out.print("OPÇÃO INVÁLIDA! ");
            decisao(in, conversor);
            return;
        }
        conversor.executar(in, conversor);
    }

    public void executar(Scanner in, Conversor conversor) {
        converter(in, conversor);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Conversor conversor = new Conversor();
        conversor.show();
        conversor.executar(in,conversor);

        System.out.println("\nSISTEMA ENCERRADO!\nObrigada por usar nosso sistema!");
    }
}