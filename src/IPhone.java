
public class IPhone implements ReprodutorMusical, NavegadorDeInternet, AparelhoTelefonico  {

	@Override
	public void tocar() {
		System.out.println("Tocando musica");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando musica");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba.");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página");
		
	}

	@Override
	public void ligar() {
		System.out.println("Ligando");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo");
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciando correio de voz");
		
	} 
}
