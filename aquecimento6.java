package aquecimento6;

public class aquecimento6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lado1 = 5;
		int lado2 = 4;
		int lado3 = 5;
		if (lado1 == lado2 && lado1 == lado3) {
			System.out.println("Este triângulo é equilátero");
		} else if (lado1 == lado2 || lado2 == 3) {
			System.out.println("Este triângulo é isósceles");
		} else {
			System.out.println("Este triângulo é escaleno");
		}
	}

}

/* 
 * 06) Faça um programa que receba 3 valores que representarão os lados de um triângulo e verifique 
 * se os valores formam um triângulo e classifique esse triângulo como: 
	equilátero (3 lados iguais);
	isósceles (2 lados iguais);
	escaleno (3 lados diferentes).
	Lembre-se que para formar um triângulo:
	nenhum dos lados pode ser igual a zero;
	um lado não pode ser maior do que a soma dos outros dois;
*/