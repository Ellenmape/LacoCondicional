package lacoscondicionais;

import java.util.Scanner;

public class LacoCondicionalEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int saldo = 1000;
		float operacao, saque, deposito;
		float novoSaldo;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Selecione uma operacao: ");
        System.out.println("Operação 1: Saldo");
        System.out.println("Operação 2: Saque");
        System.out.println("Operação 3: Depósito");
        	
		
		operacao = scanner.nextFloat();

        switch ((int) operacao) {
            case 1:
                System.out.println("O valor de saldo é: " + saldo);
                break;
            case 2:
                System.out.println("Digite o valor de saque: ");
                saque = scanner.nextFloat();
                if (saque > saldo) {
                    System.out.println("Saldo Insuficientes ");
                } else {
                    System.out.println("Saque aprovado: ");
                    novoSaldo = saldo - saque;
                    System.out.println("Novo saldo: " + novoSaldo);
                }
                break;
            case 3:
                System.out.println("Digite o valor de depósito: ");
                deposito = scanner.nextFloat();
                novoSaldo = saldo + deposito;
                System.out.println("Depósito realizado. Novo saldo: " + novoSaldo);
                break;
            default:
                System.out.println("Operação inválida");
        }
    }
}