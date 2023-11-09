package depoisDoPadrao;

public class TvSmart implements Dispositivo {

	private int tempoDeFuncionamento;

	public int getTempoDeFuncionamento() {
		return tempoDeFuncionamento;
	}

	public void setTempoDeFuncionamento(int tempoDeFuncionamento) {
		this.tempoDeFuncionamento = tempoDeFuncionamento;
	}

	@Override
	public void ligar() {
		System.out.println("a TV smart foi ligada");
	}

	@Override
	public void desligar() {
		System.out.println("a TV smart foi desligada");
	}
}
