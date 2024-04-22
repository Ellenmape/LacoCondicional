package lacoscondicionais;

public class LacosCondicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int numero1, numero2;
//
//		numero1 = 3;
//		numero2 = 5;
//
//		if(numero1 > numero2) {
//			System.out.println("O número 1 é maior que o número 2");
//		}
//		if(numero1 < numero2) {
//			System.out.println("O número 2 é maior que o numero 1");
//		}
//
//	}
int media = 5;
//
//		if (media > 5) {
//		    System.out.println("Passou diretão");
//		} else if (media == 5) {
//		    System.out.println("Tá de recuperação");
//		} else {
//		    System.out.println("Reprovado");
//		}
//	}

switch(media){
	case 5:
	System.out.println("Passou direto");
    break;
    case 4:
	System.out.println("Tá de recuperação");
	break;
	case 3:
	System.out.println("Reprovado");
	break;
	default:
	System.out.print("A média tem que ser entre 1 e 5");
	break;
}
}
}