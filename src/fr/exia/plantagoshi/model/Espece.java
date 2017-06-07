package fr.exia.plantagoshi.model;

public class Espece {

	private String nomCommun;
	private String nomscientifique;
	
	
	
	public Espece(String nomCommun, String nomscientifique) {
		super();
		this.nomCommun = nomCommun;
		this.nomscientifique = nomscientifique;
	}
	
	
	public String getNomscientifique() {
		return nomscientifique;
	}
	public void setNomscientifique(String nomscientifique) {
		this.nomscientifique = nomscientifique;
	}
	public String getNomCommun() {
		return nomCommun;
	}
	public void setNomCommun(String nomCommun) {
		this.nomCommun = nomCommun;
	}
}
