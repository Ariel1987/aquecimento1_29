package aquecimento24;

public class aquecimento24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int a [] = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
	    int b [] = new int [a.length];
	    int indice = 0;
	    for (int i = 1; i < a.length; i++) {
	    	if (a[i] % 2 == 0) {
	    		System.out.println("n");
	    	} else if (a[i] % 2 != 0 && a[i] < a[indice]){
	    		b[i] = a[i]; 
	    		a[indice] = a[0];
	    		indice = i;
	    		b[0] = indice;
	    	}
	    	
	    }
	    //for (int i = 0; i < a.length; i++) {
	    System.out.println(b[0]);
	    //}
	}

}

/*24) b[0] deve receber o índice do primeiro elemento ímpar de a (se não houver números ímpares em a, 
 * a resposta deve ser n).
Resposta: 1
*/