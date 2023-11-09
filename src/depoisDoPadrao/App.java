package depoisDoPadrao;

import depoisDoPadrao.commands.Command;
import depoisDoPadrao.commands.DefinirTempoFuncionamento;
import depoisDoPadrao.commands.DesligarCommand;
import depoisDoPadrao.commands.LigarCommand;

public class App {

	public static void configurarAlexa(Alexa alexa) {
		Dispositivo luzSmart = new LuzSmart();
		Dispositivo arCondicionadoSmart = new ArCondicionadoSmart();
		Dispositivo tvSmart = new TvSmart();

		// Commands da luz
		Command ligarLuz = new LigarCommand(luzSmart);
		Command desligarLuz = new DesligarCommand(luzSmart);
		Command tempoFuncionamentoLuz = new DefinirTempoFuncionamento(luzSmart, 10);
		// Commands do ar condicionado
		Command ligarAr = new LigarCommand(arCondicionadoSmart);
		Command desligarAr = new DesligarCommand(arCondicionadoSmart);
		Command tempoFuncionamentoAr = new DefinirTempoFuncionamento(arCondicionadoSmart, 12);
		// Commands da TV
		Command ligarTv = new LigarCommand(tvSmart);
		Command desligarTv = new DesligarCommand(tvSmart);
		Command tempoFuncionamentoTv = new DefinirTempoFuncionamento(tvSmart, 4);

		// Gestos luz
		alexa.addComando("ligar luz", ligarLuz);
		alexa.addComando("desligar luz", desligarLuz);
		alexa.addComando(
			"programado para funcionar durante " + luzSmart.getTempoDeFuncionamento(),
			tempoFuncionamentoLuz
		);
		// Gestos ar condicionado
		alexa.addComando("ligar ar condicionado", ligarAr);
		alexa.addComando("desligar ar condicionado", desligarAr);
		alexa.addComando(
			"programado para funcionar durante " + arCondicionadoSmart.getTempoDeFuncionamento(),
			tempoFuncionamentoAr
		);
		// Gestos TV
		alexa.addComando("ligar TV", ligarTv);
		alexa.addComando("desligar TV", desligarTv);
		alexa.addComando(
			"programado para funcionar durante " + tvSmart.getTempoDeFuncionamento(),
			tempoFuncionamentoTv
		);
	}

	public static void main(String[] args) {
		Alexa alexa = new Alexa();

		configurarAlexa(alexa);

		alexa.executarComando("ligar luz");
		alexa.executarComando("ligar ar condicionado");
		alexa.executarComando("ligar TV");
	}
}
