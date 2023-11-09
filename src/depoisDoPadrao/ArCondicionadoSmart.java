package depoisDoPadrao;

public class ArCondicionadoSmart implements Dispositivo {

	private int tempoDeFuncionamento;

	@Override
	public int getTempoDeFuncionamento() {
		return tempoDeFuncionamento;
	}

	@Override
	public void setTempoDeFuncionamento(int tempoDeFuncionamento) {
		this.tempoDeFuncionamento = tempoDeFuncionamento;
	}

	@Override
	public void ligar() {
		System.out.println("o AR CONDICIONADO smart foi ligado");
	}

	@Override
	public void desligar() {
		System.out.println("o AR CONDICIONADO smart  foi desligado");
	}
}
