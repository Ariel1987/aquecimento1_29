package aquecimento18;

public class aquecimento18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
	      int b [] = new int [a.length];
	      int newCouhnter = 0;			
	      for (int i = 0; i < a.length; i++) {
	    	  if (i % 2 == 0) {
                b[newCouhnter] = a[i];
                newCouhnter++;
               }
	      }
	      for (int i = 0 ; i < b.length ; i++) {
	      System.out.println(b[i]);
	      }
	      //System.exit (0);

	}	
}



/*
18) b deve receber a lista dos números que estão nos índices (posições) pares de a.
Resposta: 32 89 12 10 38 13 65 35 16 54
*/
