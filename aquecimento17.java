package aquecimento17;

public class aquecimento17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
	      int b [] = new int [a.length];
	      int indice = 0; 
	      int min = a[indice];
	      for (int i = 0; i < a.length; i++) {
	         if (a[i] < min) {
	        	min = a[i];
	         	indice = i;
	         	b [0] = indice;
	         }
	      }
	      System.out.println(b[0]);
	      //System.exit (0);

	}

}

/*17) b[0] deve receber o índice (posição) do menor elemento (conteúdo) de a. Em caso de empate, 
 
 * o índice indicado deve ser o menor.
Resposta: 6
(Note que a[6] = 10 é o menor elemento (conteúdo) presente no vetor a.)
Variante: modifique o programa para que, em caso de empate entre dois índices (posições), 
indique-se o maior índice (posição).
*/