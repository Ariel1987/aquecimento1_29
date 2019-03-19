package aquecimento12;

public class aquecimento12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros = {21, 12, 39, 4, 75, 63, 82, 45, 94, 390};
		int temp;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < i; j++) {
				temp = numeros[i];
				numeros[i] = numeros[j];
				numeros[j] = temp;
			}
		}
		for (int i = 0; i < numeros.length; i++) {
		System.out.println(numeros[i]);
		}
	}
}

/*12) Faça um programa que receba 10 valores inteiros e os coloque em um vetor. 
 * Em seguida, exiba-os em ordem inversa à ordem de entrada.
 *    tipo [ ] identificador = new tipo [quantidade];
*/
