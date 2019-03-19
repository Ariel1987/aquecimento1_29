package aquecimento13;

public class aquecimento13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
		int i = 0;
		int soma = 0;
		do {
			soma += a[i];
			i++;
		} while (i < a.length);
		float media = soma / a.length;
		for (i = 0; i < a.length; i++) {
			if (a[i] < media) {
			System.out.println(a[i]);
			}
		}
	}

}

/*13) Faça um programa que utilize uma estrutura de repetição para ler 50 números armazenando-os em um vetor 
 * e calcule e exiba a média aritmética deles. Em seguida o programa deve apresentar todos os valores armazenados 
 * no vetor que sejam menores que a média.
*/
