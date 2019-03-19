package aquecimento20;

public class aquecimento20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
	      int b [] = new int [a.length];
	      for (int i = 0; i < a.length; i++) {
	    	  if (a[i] > 50) {
	    	  b[i] = i;
	    	  }
	      }
	      for (int i = 0 ; i < b.length ; i++) {
	      System.out.println(b[i]);
	      }
	      //System.exit (0);
	}

}

/*20) b deve receber a lista dos índices (posições) de a que contém elementos maiores do que 50.
Resposta: 2 3 7 12 13 15 17 18
*/