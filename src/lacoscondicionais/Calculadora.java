package lacoscondicionais;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numero1, numero2, opcao, resultado;

		System.out.println("Digite um número: ");
		numero1 = scanner.nextInt();

		System.out.println("Digite outro número");
		numero2 = scanner.nextInt();

		System.out.println("Selecione uma opção:");
		System.out.println("*** 1 - Somar os numeros ***");
		System.out.println("*** 2 - Subtrair os numeros ***");
		System.out.println("*** 3 - Multiplicar os numeros ***");
		System.out.println("*** 4 - Dividir o primeiro pelo segundo ***");

		opcao = scanner.nextInt();

		switch (opcao) {
		case 1:
			resultado = numero1 + numero2;
			System.out.println("O resultado da soma é: " + resultado);
			break;
		case 2:
			if(numero1 > numero2) {
				resultado = numero1 - numero2;
				System.out.println("O resultado da subtração é: " + resultado);
			}
			break;
		case 3:
			resultado = numero1 * numero2;
			if(resultado % 2 == 0) {
				System.out.println("O resultado da multiplicação é: " + resultado + ","
						+ " e é um número par");
			}else {
				System.out.println("O resultado da multiplicação é: " + resultado + ", e é um número impar");
			}
			break;
		case 4:
			if(numero1 >= numero2) {
				resultado = numero1 / numero2;
				System.out.println("O resultado da divisão é: " + resultado);
			break;
			}
		 default:
             System.out.println("Opção inválida");
		}
	}
}

