package lacoscondicionais;

import java.util.Scanner;

public class LacoCondicionalEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o número A: ");
		num1 = scanner.nextInt();

		System.out.println("Digite o número B: ");
		num2 = scanner.nextInt();

		System.out.println("Digite o número C: ");
		num3 = scanner.nextInt();

		if (num1 + num2 > num3) {
			System.out.println("A soma de A e B é maior que C");
		} else if (num1 + num2 < num3) {
			System.out.println("A soma de A e B é menor que C");
		} else if (num1 + num2 == num3)
			System.out.println("A soma de A e B é igual a C");
	}

}

