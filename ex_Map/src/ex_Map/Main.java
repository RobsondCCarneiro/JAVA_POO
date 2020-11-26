package ex_Map;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		//LinkedHashMap - velocidade intermediária e elementos na ordem em que são adicionados
		Map<String, Integer> votos = new LinkedHashMap<>();
		
		System.out.println("digite o caminho completo do arquivo: ");
		String caminho = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			String linha = br.readLine();
			while(linha != null) {
				//O fields ira armazenar tudo que for separado por virgulas, porque foi o metodo split que a dividiu
				String[] campo = linha.split(",");
				String nome = campo[0];
				int contador = Integer.parseInt(campo[1]);
				
				if(votos.containsKey(nome)) {
					int votosTotais = votos.get(nome);
					votos.put(nome, contador + votosTotais);
				}
				else {
					votos.put(nome, contador);
				}
				//a cada vez que readLine() eh chamado, ele anda em outra linha do arquivo ate ser nulo, percorre com o while
				linha = br.readLine();
			}
			
			//Vai percorrer todo o Map pelo for each, funcionando de forma parecida ao ArrayList
			//vai imprimir o nome e a quantidade de votos de cada candidato
			for (String key : votos.keySet()) {
				System.out.println(key + ": " + votos.get(key));
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
