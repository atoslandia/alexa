package depoisDoPadrao.commands;

import depoisDoPadrao.Dispositivo;

public class LigarCommand implements Command {

	private Dispositivo dispositivo;

	public LigarCommand(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	@Override
	public void execute() {
		this.dispositivo.ligar();
	}
}
