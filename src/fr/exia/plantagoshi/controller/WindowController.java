package fr.exia.plantagoshi.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import fr.exia.plantagoshi.model.Plante;
import fr.exia.plantagoshi.model.Serre;
import fr.exia.plantagoshi.view.Fenetre;

public class WindowController implements Runnable, Observer, ActionListener {

	private Serre serre;
	private Fenetre view;

	public WindowController(Serre serre) {
		setSerre(serre);

		// on s'abonne aux plantes
		for (Plante plante : serre.getPlantes()) {
			plante.addObserver(this);
		}
	}

	public Serre getModel() {
		return this.serre;
	}

	public void setSerre(Serre serre) {
		this.serre = serre;
	}

	@Override
	public void run() {
		if (!SwingUtilities.isEventDispatchThread()) {
			System.err.println("Erreur, le lancement du controller" + this + "");
		}
		this.view = new Fenetre();
		this.view.getButtonSunMoon().addActionListener(this);
		this.view.setVisible(true);
	}

	@Override
	public void update(Observable o, Object arg) {
		//si l'objet est une plante
		if (o instanceof Plante) {
			//on le cast en plante
			Plante plante = (Plante) o;
			
			//TODO pour le moment on ne va gérer qu'un plante
			if(plante.getIdPlante() != 1){
				System.out.println("La plante " + arg + " a été mis à jour");
				
				//maj de la view
				String humAir = String.format("%.2f %%", plante.getHumiditeAir());
				String humSol = String.format("%.2f %%", plante.getHumiditeSol());
				String temp = String.format("%.2f °C", plante.getTemperatureAir());
				
				view.getLabelHumiditeAir().setText(humAir);
				view.getLabelHumiditeSol().setText(humSol);
				view.getLabelTemperature().setText(temp);
				//view.getLabelSunMoon().setText(""+plante.getTauxLuminosite());
				
				if(plante.getTauxLuminosite()<20){
					view.getButtonSunMoon().setText("Eteindre");
				}
				else{
					view.getButtonSunMoon().setText("Allumer");
				}
			}
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		
		if( button.getText().equals("Eteindre")){
			this.serre.getPlante(1).setTauxLuminosite(0);
		}
		else{
			this.serre.getPlante(1).setTauxLuminosite(80);
		}
		System.out.println(this.serre.getPlante(1).getTauxLuminosite());
		this.serre.getPlante(1).hasBeenChanged();
		this.serre.getPlante(1).notifyObservers(1);
	}
}
