package aquecimento22;

public class aquecimento22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
        int b [] = new int [a.length];
        for (int i = 0; i < a.length; i++) {
        	if (a[i] % 2 !=0) {
        		b[0] += a[i];
        	}
        }
        System.out.println(b[0]);
	}

}

/*22) b[0] deve receber o total dos elementos ímpares de a.
Resposta: 497
*/