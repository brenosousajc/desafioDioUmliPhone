package uml_iPhone;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
	

	//aqui a implementação dos métodos da interface ReprodutorMusical
	@Override
	public void tocar() {
		System.out.println("Reproduzindo música...");	
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada.");	
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Música selecionada: " + musica);	
	}
	
	
	//aqui a implementação dos métodos da interface NavegadorInternet 
	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página: " + url);	
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba selecionada.");	
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada!");	
	}
	
	
	//aqui a implementação dos métodos da interface AparelhoTelefonico
	@Override
	public void ligar(String numero) {
		System.out.println("Discando para o número: " + numero);	
	}

	@Override
	public void atender() {
		System.out.println("Atendendo Chamada...");	
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");	
	}

	
	
}
