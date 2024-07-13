package uml_iPhone;

import java.util.Scanner;

public class ClasseMain {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		IPhone meu_iPhone = new IPhone();

		meu_iPhone.atender();
		meu_iPhone.iniciarCorreioVoz();
		meu_iPhone.ligar(scann.nextLine());	
		
		meu_iPhone.selecionarMusica(scann.nextLine());
		meu_iPhone.tocar();
		meu_iPhone.pausar();
		
		meu_iPhone.exibirPagina("https://web.dio.me/home");
		meu_iPhone.adicionarNovaAba();
		meu_iPhone.atualizarPagina();
		
		
		
		
		
	}

}
