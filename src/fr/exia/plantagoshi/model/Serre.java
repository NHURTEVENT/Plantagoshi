package fr.exia.plantagoshi.model;

import java.util.ArrayList;
import java.util.List;

public class Serre {
	
	private List<Plante> plantes;

	public List<Plante> getPlantes() {
		return plantes;
	}

	public void addPlante(Plante plantes) {
		getPlantes().add(plantes);
	}
	
	public void remove(Plante plantes){
		getPlantes().remove(plantes);
	}
	
	public List<Plante> getPlanteByEspece(Espece espece){
		
		List<Plante> plantebuffer = new ArrayList<>(); 
		
		for (Plante plante : plantes) {
			if (plante.getEspece() == espece)
				plantebuffer.add(plante);
		}
		return plantebuffer;
	}
	
	public Plante getPlante(int idPlante){
		for (Plante plante : plantes) {
			if( plante.getIdPlante() == idPlante){
				return plante;}
		}
		return null;
	}
	
	public Serre(){
		this.plantes = new ArrayList<Plante>();
			}

}
