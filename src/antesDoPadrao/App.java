package antesDoPadrao;

public class App {

	public static void main(String[] args) throws Exception {
		Alexa alexa = new Alexa();

		alexa.executarComando("desligar ar condicionado");
		alexa.executarComando("ligar ar condicionado");
		alexa.executarComando("desligar luz");
	}
}
