package aquecimento26;

public class aquecimento26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int a [] = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
	    int b [] = new int [a.length];
	    for (int i = 1; i < a.length; i++) {
	        for (int j = 0; j < i; j++) {
	            if (a[i] > a[j]) {
	                int temp = a[i];
	                a[i] = a[j];
	                a[j] = temp;
	            }
	        }
	    }

	    for (int i = 0; i < a.length; i++) {
	    System.out.println(a[i]);
	    }
	}

}

/*26) b deve receber a lista decrescente dos índices de a que contenham elementos menores que 50.
Resposta: 19 16 14 11 10 9 8 6 5 4 1 0
*/
