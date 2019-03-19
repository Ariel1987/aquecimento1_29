package aquecimento10;

public class aquecimento10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros = {21, 12, 39, 4, 75, 63, 82, 45, 94, 390};
		float soma = 0;
		for (int value : numeros) {
			soma += value;
		}
		float mediaAritmetica = soma / numeros.length;
		System.out.println(mediaAritmetica); 
	} 
}



/*10) Faça um programa que utilize a estrutura for para ler 10 números e calcule e exiba a média aritmética deles.
*/