package aquecimento2;


import java.util.Scanner;
public class aquecimento2 {
   public static void main ( String args [] )
   {
      /* cria mecanismo para fazer a leitura dos dados pelo console*/
      Scanner entrada = new Scanner(System.in);
      /* Declare aqui as variáveis necessárias */
      float valorQuilo,quantConsum,valorPago;
      /* Inclua aqui as variáveis de controle de laços se necessárias. */
      int i = 0;
      /* Coloque aqui as instruções para leitura dos dados */
      try{
         System.out.print("Entre com dois valores inteiros:\n");
         valorQuilo = (float) 23.99; // entrada.nextFloat() para reais
         quantConsum = (float) 0.5; // entrada.nextLine() para strings
         /* Coloque aqui o código para resolver o problema.
         * Novas variáveis podem ser criadas, se necessário. */
         valorPago = valorQuilo * quantConsum;
         /* Coloque aqui o código para mostrar os resultados */
         String saida = "Resposta:\n";
         saida = saida + valorQuilo + " * " + quantConsum + " = " + valorPago;
         saida = saida + "\nFim.";
         System.out.print(saida);
      } catch (Exception e) {
         System.out.println("Ocorreu um erro durante a leitura!");
      }
   }
}

/* 02) Faça um programa que receba o valor do quilo de um produto e a quantidade de quilos do produto 
 * consumida calculando o valor final a ser pago.
 * Aqui você pode usar o valor da quantidade do produto como um float. A leitura fica assim:
 * valor = entrada.nextFloat();
*/
