package depoisDoPadrao.commands;

import depoisDoPadrao.Dispositivo;

public class DesligarCommand implements Command {

	private Dispositivo dispositivo;

	public DesligarCommand(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	@Override
	public void execute() {
		this.dispositivo.desligar();
	}
}
