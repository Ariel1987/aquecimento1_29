package aquecimento28;

public class aquecimento28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
	    int b [] = new int [a.length];
	    for (int i = 0; i < a.length; i++) {
	    	if (a[i] == (a[i-1] + a[i+1]) / 2) {
	    		b[i] = i;
	    		
	    	}
	    }
	    for (int i = 0; i < a.length; i++) {
	    	System.out.println(b[i]);
	    }
	}

}

/*28) b deve receber a lista dos índices de a em que aparecem elementos que são a média aritmética 
 * dos seus vizinhos à esquerda e à direita. O primeiro e o último índice não devem ser considerados.
Resposta: 10 18
*/
