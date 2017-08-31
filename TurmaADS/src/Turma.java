import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Turma {



	// função main
	public static void main( String args[] ) {
		int tamanho = 30;
		int metod[], so2[], poo[], eds3[], pdm[], bd[];
		metod = new int[tamanho];
		so2 = new int[tamanho];
		poo = new int[tamanho];
		eds3 = new int[tamanho];
		pdm = new int[tamanho];
		bd = new int[tamanho];
		double media;
		String saidaStr = "Aluno\tMetod\tSOII\tPOO\tEDSIII\tPDM\tBD\tMedia\n"; // string alocado e inicializado
		// adiciona cada valor dos elementos do array ao String de saída
		Random gerador = new Random();
		for ( int contador = 0; contador < tamanho; contador++ ) {
			metod[contador] = gerador.nextInt(10);
			so2[contador] = gerador.nextInt(10);
			poo[contador] = gerador.nextInt(10);
			eds3[contador] = gerador.nextInt(10);
			pdm[contador] = gerador.nextInt(10);
			bd[contador] = gerador.nextInt(10);
			media = (metod[contador] + so2[contador] + poo[contador] + eds3[contador] + pdm[contador] + bd[contador])/6;
			int aux = contador+1;
			saidaStr += aux + "\t" + metod[contador] + "\t" + so2[contador] + "\t" + 
						poo[contador] + "\t" + eds3[contador] + "\t" + pdm[contador] + "\t" + bd[contador] + "\t" + 
					    media + "\n";
		}

		JTextArea saidaArea = new JTextArea();
		saidaArea.setText( saidaStr );
		JOptionPane.showMessageDialog( null, saidaArea,
				"Inicializando um Array de valores inteiros",
				JOptionPane.INFORMATION_MESSAGE );
		System.exit( 0 );
	}


}
