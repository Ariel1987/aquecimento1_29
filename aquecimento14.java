package aquecimento14;

public class aquecimento14 {

	public static void main(String[] args) {
	  int a [] = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
      int b [] = new int [a.length];
      int i;
      
      String saida = "Resposta:\n";
      
      for (i = 0 ; i < a.length ; i++) {
          b[i] = a[i];
      }
      for (i = 0; i < a.length; i++) {
         saida = saida + b[i] + " ";
      } 
      saida = saida + "\nFim.";
      System.out.println(saida);
      //System.exit (0);
	}
}	

/*	14) O vetor b deve se tornar uma cópia do vetor a.
	Resposta: 32 45 89 66 12 35 10 96 38 15 13 11 65 81 35 64 16 89 54 19
	*/

	
