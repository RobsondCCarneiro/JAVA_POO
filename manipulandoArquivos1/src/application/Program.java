package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//A besta soh soube encontrar o arquivo com o caminho inteiro do Linux, mesmo o arquivo .txt estando na mesma pasta do Workspace
		File file = new File("//home//robson//eclipse-workspace//teste.txt");
		//File file = new File("teste.txt");
		Scanner sc = null;

		//Como pode gerar um ioException, entao eh necessario colocar o try e o catch
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		//Uma boa pratica de programacao para garantir que fecha o sc
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
