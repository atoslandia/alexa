package depoisDoPadrao;

public class LuzSmart implements Dispositivo {

	private int tempoDeFuncionamento;

	public int getTempoDeFuncionamento() {
		return tempoDeFuncionamento;
	}

	public void setTempoDeFuncionamento(int tempoDeFuncionamento) {
		this.tempoDeFuncionamento = tempoDeFuncionamento;
	}

	@Override
	public void ligar() {
		System.out.println("a LUZ smart foi ligada");
	}

	@Override
	public void desligar() {
		System.out.println("a LUZ smart foi desligada");
	}
}
