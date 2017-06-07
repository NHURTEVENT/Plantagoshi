package fr.exia.plantagoshi.cad;

import fr.exia.plantagoshi.model.Plante;
import fr.exia.plantagoshi.model.Serre;

public class FakeGenerator implements CAD{

	private Serre model;

	@Override
	public void setModel(Serre serre) {
		this.model = serre;
	}

	@Override
	public float getHumiditeSol(int idPlante) {
		return (float) (Math.random() * 100);
	}

	@Override
	public float getHumiditeAir(int idPlante) {
		return (float) (Math.random() * 100);
	}

	@Override
	public float getTemperature(int idPlante) {
		return (float) (Math.random() * 100);
	}

	@Override
	public float getTauxLuminosite(int idPlante) {
		return (float) (Math.random() * 100);
	}

	@Override
	public void run() {

		while (true) {
			
			// pause de 1 sec
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}

			//alimente le model avec nos random
			int i = 1;
			for (Plante plante : model.getPlantes()) {
				//on lis le CAD
				
				plante.setHumiditeAir(getHumiditeAir(i));
				plante.setHumiditeSol(getHumiditeSol(i));
				plante.setTemperatureAir(getTemperature(i));
				
				//plante.setTauxLuminosite(getTauxLuminosite(i));
				
				// on informe les observers
				plante.hasBeenChanged();
				plante.notifyObservers(i);
				i++;

			}
		}
	}

}
