//Este também abre os arquivos, porém é mais rápido, porque é Buffer

package buffered_and_file_Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) {
		//Esse caminho eh no Linux, atencao, no Windows eh como se fosse "C:\\caminhoQualquer\\arquivo.txt"
		String path = "//home//robson//eclipse-workspace//teste.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		

	}

}
