package depoisDoPadrao;

public interface Dispositivo {
	public void ligar();

	public void desligar();

	public void setTempoDeFuncionamento(int horas);

	public int getTempoDeFuncionamento();
}
