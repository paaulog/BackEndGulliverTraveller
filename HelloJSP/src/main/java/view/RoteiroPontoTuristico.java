package view;

import java.util.ArrayList;

import model.PontoTuristico;

public class RoteiroPontoTuristico {
	private ArrayList<PontoTuristico> lista;
	
	public RoteiroPontoTuristico () {
		lista = new ArrayList<PontoTuristico>();
		lista.add(new PontoTuristico(1,"Parque Ibirapuera","AV. Pedro alvares cabral, vl mariana, São Paulo","Português e Inglês","05h - 00h",null,"220v","BRL","GMT-3"));
		lista.add(new PontoTuristico(2,"MASP","AV. Paulista, 1578, Bela Vista, São Paulo","Português e Inglês","08h - 18h","RG ou CNH","220v","BRL","GMT-3"));
		lista.add(new PontoTuristico(3,"Liberdade","Liberdade, São Paulo","Português e Chinês","09h - 18h",null,"220v","BRL","GMT-3"));
	}

	public ArrayList<PontoTuristico> getLista() {
		return lista;
	}

	public void setLista(ArrayList<PontoTuristico> lista) {
		this.lista = lista;
	}
}