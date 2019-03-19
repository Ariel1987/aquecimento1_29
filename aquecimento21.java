package aquecimento21;

public class aquecimento21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
        int b [] = new int [a.length];
        int media = 0;
        for (int value : a) {
    	  media += value;
        }
  	    int total = media/a.length;
  	    b[0] = total;
        System.out.println(b[0]);
        }
	      //System.exit (0);
	}



/*21) b[0] deve receber a média aritmética dos elementos de a (arredondada para baixo).
Resposta: 44
*/