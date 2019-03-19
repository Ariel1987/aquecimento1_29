package aquecimento16;

public class aquecimento16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
        int b [] = new int [a.length];
        int i;
	    int max = a[0];
	      for (i = 1; i < a.length; i++) {
	         if (a[i] > max) 
	        	max = a[i];
	         	b[0] = max;
	      }
	      System.out.println(b[0]);
	      //System.exit (0);
	}

}

/*16) b[0] deve receber o valor do maior elemento (conteúdo) de a.
Resposta: 96
*/