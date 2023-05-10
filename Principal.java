import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.setNome("Maria");
        conta1.setTipoConta("Corrente");

        System.out.println("*****************************************");
        System.out.println("\nDados do cliente: ");
        System.out.println("Nome:           " + conta1.getNome());
        System.out.println("Tipo conta:     " + conta1.getTipoConta());
        System.out.println("Saldo inicial:  R$ " + conta1.getSaldo());
        System.out.println("\n*****************************************");

        Scanner entrada = new Scanner(System.in);

        int opcao = 0;
        String menu = """
                    OPÇÕES:
                    
                    1 - CONSULTAR SALDO
                    2 - DEPOSITAR
                    3 - TRANSFERIR
                    4 - SAIR
                    
                    -------------------------
                    """;

        while (opcao != 4) {
            System.out.println();
            System.out.println(menu);

            double valorDeposito = 0;
            double valorTransferencia = 0;
            opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Saldo: R$ " + conta1.getSaldo());
                    break;

                case 2:
                    System.out.println("Informe o valor que deseja depositar: ");
                    valorDeposito = entrada.nextDouble();
                    conta1.deposita(valorDeposito);
                    break;

                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");
                    valorTransferencia = entrada.nextDouble();
                    conta1.transfere(valorTransferencia);
                    break;

                case 4:
                    System.out.println("OPERAÇÃO FINALIZADA");
                    break;

                default:
                    System.out.println("NÚMERO INVÁLIDO, REVEJA AS OPÇOES!");
                    break;
            }
        }
    }
}
