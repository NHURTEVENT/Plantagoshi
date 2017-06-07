package fr.exia.plantagoshi.model;

public class Plante {

	private int idPlante;

	private float temperatureAir;
	private float humiditeAir;
	private float humiditeSol;
	private float tauxLuminosite;

	private Espece espece;

	public Plante(int idPlante, float temperatureAir, float humiditeAir, float humiditeSol, float tauxLuminosite,
			Espece espece) {
		this.idPlante = idPlante;
		this.temperatureAir = temperatureAir;
		this.humiditeAir = humiditeAir;
		this.humiditeSol = humiditeSol;
		this.tauxLuminosite = tauxLuminosite;
		this.espece = espece;
	}

	public int getIdPlante() {
		return idPlante;
	}

	public void setIdPlante(int idPlante) {
		this.idPlante = idPlante;
	}

	public float getTemperatureAir() {
		return temperatureAir;
	}

	public void setTemperatureAir(float temperatureAir) {
		this.temperatureAir = temperatureAir;
	}

	public float getHumiditeAir() {
		return humiditeAir;
	}

	public void setHumiditeAir(float humiditeAir) {
		this.humiditeAir = humiditeAir;
	}

	public float getHumiditeSol() {
		return humiditeSol;
	}

	public void setHumiditeSol(float humiditeSol) {
		this.humiditeSol = humiditeSol;
	}

	public float getTauxLuminosite() {
		return tauxLuminosite;
	}

	public void setTauxLuminosite(float tauxLuminosite) {
		this.tauxLuminosite = tauxLuminosite;
	}

	public Espece getEspece() {
		return espece;
	}

	public void setEspece(Espece espece) {
		this.espece = espece;
	}

}
