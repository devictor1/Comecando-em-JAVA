package aula0404;

public class Computador {
	
	float preco = 20.5f;
	String processador;
	String fonte;
	String memoriaRam;
	String armazenamento;
	String placaMae;
	String placaDeVideo;
	String placaDeRede;
	String placaDeAudio;
	String gabinete;
	String cooler;
	String rpm;
	String [] acessorios;
	String iluminacao;
	String sistemaOperacional;
	String velocidadeEscritaArmazenamento;
	String velocidadeLeituraArmazentamento;
	String clockProcessador;
	String eficienciaFonte;
	String [] modularidadeFonte;
	String slotsSata;
	String velocidadeSata;
	String slotsPCIE;
	String velocidadePCIE;
	String slotsRAM;
	String velocidadeRAM;
	String velocidadeWiFi;
	String velocidadeEthernet;
	String conexoesDisponiveis;
	
	
	public static void main(String[] args) {
		Computador pc = new Computador();
		
		System.out.println(pc.preco);
	}

}
