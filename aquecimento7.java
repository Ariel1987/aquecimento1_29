package aquecimento7;

public class aquecimento7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		
		switch (i) {
		case 1: 
			System.out.println("Parafuso");
			break;
		case 2:
			System.out.println("Porca");
			break;
		case 3: 
			System.out.println("Prego");
			break;
		}
		if (i != 1 && i != 2 && i != 3) {
			System.out.println("Diversos");
		}
	}

}

/*
07) Utilize a estrutura switch para fazer um programa que retorne o nome de um produto a partir do 
    código do mesmo. Considere os seguintes códigos:
      1 – Parafuso;
      2 – Porca;
      3 – Prego;
      Para qualquer outro código indicar “Diversos”.

*/