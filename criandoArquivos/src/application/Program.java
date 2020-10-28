package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		//Aqui estah declarando uma lista do tipo string e instaciando com o nome de lines (variavei)
		String[] lines = new String[] {"Goog morning", "Good afternoon", "Good night"};
		
		//Soh uma boa pratica no caminho do arquivo, porque quando houver muitas funcoes que o invoca, ter a possibilidade de nao mudar tudo
		String path = "//home//robson//eclipse-workspace//criado.txt";
		
		//try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
		//quando coloco FileWrite(path,true) ele não 
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
			//varrendo toda a lista
			for (String line : lines) {
				//Aqui vai escrever que cada elemento da minha lista ser uma linha do arquivo
				bw.write(line);
				//Aqui soh serah uma quebra de linha
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
