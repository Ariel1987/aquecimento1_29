package aquecimento4;

public class aquecimento4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 40;
		int y = 36;
		int z = 618;
		int a = 97;
		
		if (x < y && x < z && x < a) {
			  System.out.println("O menor número é " + x);
		} else if (y < x && y < z && y < a) {
			System.out.println("O menor número é " + y);
		} else if (z < x && z < y && z < a) {
			System.out.println("O menor número é " + z);
		} else {
			System.out.println("O menor número é " + a);
		}
	}

}

/* 04) Faça um programa que receba 4 valores e retorne o menor entre eles.*/

