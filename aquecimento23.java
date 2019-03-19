package aquecimento23;

public class aquecimento23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
	    int b [] = new int [a.length];
	    int max = a[0];
	    for (int i = 0; i <a.length; i++) {
	    	if (a[i] > max && a[i] < 50) {
	    		max = a[i];
	    		b[0] = max;
	    	}
	    }
	    System.out.println(b[0]);
	}

}

/*23) b[0] deve receber o maior elemento de A que seja inferior a 50 (se não houver números inferiores a 50, 
 * a resposta deve ser 0). Considere que nunca haverá elementos negativos em a.
Resposta: 45
*/