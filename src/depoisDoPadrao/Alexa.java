package depoisDoPadrao;

import depoisDoPadrao.commands.Command;
import java.util.HashMap;
import java.util.Map;

public class Alexa {

	private Map<String, Command> dispositivos;

	public Alexa() {
		this.dispositivos = new HashMap<>();
	}

	public void addComando(String gesto, Command comando) {
		gesto = gesto.toUpperCase();
		dispositivos.put(gesto, comando);
	}

	public void executarComando(String gesto) {
		gesto = gesto.toUpperCase();
		Command comando = dispositivos.get(gesto);

		if (comando != null) {
			comando.execute();
		}
	}
}
