package model;

public class PontoTuristico {
	private int id;
	private String nome;
	private String endereco;
	private String idioma;
	private String funcionamento;
	private String documentos;
	private String voltagem;
	private String moeda;
	private String fusoHorario;
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getIdioma() {
		return idioma;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public String getFuncionamento() {
		return funcionamento;
	}
	
	public void setFuncionamento(String funcionamento) {
		this.funcionamento = funcionamento;
	}
	
	public String getDocumentos() {
		return documentos;
	}
	
	public void setDocumentos(String documentos) {
		this.documentos = documentos;
	}
	
	public String getVoltagem() {
		return voltagem;
	}
	
	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}
	
	public String getMoeda() {
		return moeda;
	}
	
	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}
	
	public String getFusoHorario() {
		return fusoHorario;
	}
	
	public void setFusoHorario(String fusoHorario) {
		this.fusoHorario = fusoHorario;
	}
	
	public PontoTuristico(int id, String nome, String endereco, String idioma, String funcionamento, String documentos,
			String voltagem, String moeda, String fusoHorario) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.idioma = idioma;
		this.funcionamento = funcionamento;
		this.documentos = documentos;
		this.voltagem = voltagem;
		this.moeda = moeda;
		this.fusoHorario = fusoHorario;
	}
	public PontoTuristico() {
		super();
	}	
}

