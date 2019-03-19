package aquecimento11;

public class aquecimento11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros = {21, 12, 39, 4, 75, 63, 82, 45, 94, 390};
		int i = 0;
		int soma = 0;
		do {
			soma += numeros[i];
			i++;
		} while (i < numeros.length);
		float media = soma / numeros.length;
		System.out.println(media);
	}

}
/*11) Faça um programa que utilize a estrutura do while para ler 10 números e calcule e exiba a média aritmética deles.
*/