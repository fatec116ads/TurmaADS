import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Turma {

	
	
	// fun��o main
	public static void main( String args[] ) {
		int array[]; // declara a refer�ncia a um array
		array = new int[ 10 ]; // aloca dinamicamente o espa�o para o array
		String saidaStr = "Subscrito\tValor\n"; // string alocado e inicializado
		// adiciona cada valor dos elementos do array ao String de sa�da
		for ( int contador = 0; contador < array.length; contador++ )
			saidaStr += contador + "\t" + array[ contador ] + "\n";
		JTextArea saidaArea = new JTextArea();
		saidaArea.setText( saidaStr );
		JOptionPane.showMessageDialog( null, saidaArea,
				"Inicializando um Array de valores inteiros",
				JOptionPane.INFORMATION_MESSAGE );
		System.exit( 0 );
	}


}
