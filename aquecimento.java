package aquecimento;
import java.io.*;
import java.util.Scanner;

public class aquecimento {
	public static void main ( String args [] ) {
      // cria mecanismo para fazer a leitura dos dados pelo console
      Scanner entrada = new Scanner(System.in);
      /* Declare aqui as variáveis necessárias */
      int valor, preco, troco;
      /* Inclua aqui as variáveis de controle de laços se necessárias. */
      int i = 0;
      /* Coloque aqui as instruções para leitura dos dados */
      try{
         System.out.print("Entre com dois valores inteiros:\n");
         valor = 25; // entrada.nextFloat() para reais
         preco = 21; // entrada.nextLine() para strings
         /* Coloque aqui o código para resolver o problema.
         * Novas variáveis podem ser criadas, se necessário. */
         troco = valor-preco;
         /* Coloque aqui o código para mostrar os resultados */
         String saida = "Resposta:\n";
         saida = saida + valor + " - " + preco + " = " + troco;
         saida = saida + "\nFim.";
         System.out.print(saida);
      } catch (Exception e) {
         System.out.println("Ocorreu um erro durante a leitura!");
      }
   }
}

/* 01) Faça um programa que receba um valor que é o valor pago, um segundo valor que 
 * é o preço do produto e retorne o troco a ser dado. */
