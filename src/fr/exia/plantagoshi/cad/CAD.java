package fr.exia.plantagoshi.cad;

import fr.exia.plantagoshi.model.Serre;

public interface CAD extends Runnable {
	
	public float getHumiditeSol(int idPlante);
	public float getHumiditeAir(int idPlante);
	public float getTemperature(int idPlante);
	public float getTauxLuminosite(int idPlante);
	
	public void setModel(Serre serre);
}
