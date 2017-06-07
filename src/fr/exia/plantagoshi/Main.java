package fr.exia.plantagoshi;

import javax.swing.SwingUtilities;

import fr.exia.plantagoshi.cad.CAD;
import fr.exia.plantagoshi.cad.FakeGenerator;
import fr.exia.plantagoshi.controller.WindowController;
import fr.exia.plantagoshi.model.Espece;
import fr.exia.plantagoshi.model.Plante;
import fr.exia.plantagoshi.model.Serre;

public class Main {

	public static void main(String[] args) {
		//création de la serre
		Serre serre = new Serre();
		
		//alimentation du modèle
		Espece espece1 = new Espece("Tomate","Solanum lycopersicum");
		Espece espece2 = new Espece("Persil","Petrsilium machin");
		
		Plante plante1 = new Plante(1, espece1);
		Plante plante2 = new Plante(2, espece2);
		
		serre.addPlante(plante1);
		serre.addPlante(plante2);
		
		//création du controller
		WindowController ctrl = new WindowController(serre);
		
		// on lance le controller
		SwingUtilities.invokeLater(ctrl);
		
		CAD cad =new FakeGenerator();
		cad.setModel(serre);
		Thread t1 = new Thread(cad);
		t1.start();
	}
	
}
