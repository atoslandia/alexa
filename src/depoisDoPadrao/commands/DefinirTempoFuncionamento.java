package depoisDoPadrao.commands;

import depoisDoPadrao.Dispositivo;

public class DefinirTempoFuncionamento implements Command {

	private Dispositivo dispositivo;
	private int tempo;

	public DefinirTempoFuncionamento(Dispositivo dispositivo, int tempo) {
		this.dispositivo = dispositivo;
		this.tempo = tempo;
	}

	@Override
	public void execute() {
		this.dispositivo.setTempoDeFuncionamento(tempo);
	}
}
