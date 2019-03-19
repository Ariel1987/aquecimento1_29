package aquecimento25;

public class aquecimento25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int a [] = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
	    int b [] = new int [a.length];
	    int indice = 0;
	    for (int i = 0; i < a.length; i++) {
	    	if (a[i] % 2 != 0) {
	    		System.out.println(-1);
	    	} else {
	    		a[indice] = a[a.length-1];
	    		indice = i;
	    		b[0] = indice;
	    	}
	    }
	    System.out.println(b[0]);
	}

}

/*25) b[0] deve receber o índice do último elemento par de a (se não houver números pares em a, 
 * a resposta deve ser -1).
 * Resposta: 18
*/
