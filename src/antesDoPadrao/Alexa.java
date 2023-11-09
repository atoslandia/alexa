package antesDoPadrao;

import java.util.HashMap;
import java.util.Map;

public class Alexa {

	private Map<String, Object> dispositivos;

	public Alexa() {
		this.dispositivos = new HashMap<>();
		dispositivos.put("ligar luz", new LuzSmart());
		dispositivos.put("desligar luz", new LuzSmart());
		dispositivos.put("ligar ar", new ArCondicionadoSmart());
		dispositivos.put("desligar ar", new ArCondicionadoSmart());
	}

	public void executarComando(String gesto) {
		gesto = gesto.toUpperCase();

		Object dispositivo = dispositivos.get(gesto);
		if (dispositivo instanceof LuzSmart) {
			LuzSmart luz = (LuzSmart) dispositivo;
			if (gesto.equals("LIGAR LUZ")) {
				luz.ligar();
			} else if (gesto.equals("DESLIGAR LUZ")) {
				luz.desligar();
			}
		} else if (dispositivo instanceof ArCondicionadoSmart) {
			ArCondicionadoSmart ar = (ArCondicionadoSmart) dispositivo;
			if (gesto.equals("LIGAR AR CONDICIONADO")) {
				ar.ligar();
			} else if (gesto.equals("DESLIGAR AR CONDICIONADO")) {
				ar.desligar();
			}
		}
	}
}
