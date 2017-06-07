package fr.exia.plantagoshi.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fenetre extends JFrame {

	private JPanel contentPane;
	private JLabel labelHumiditeSol;
	private JLabel labelPlante;
	private JLabel labelTemperature;
	private JLabel labelHumiditeAir;
	private JButton buttonSunMoon;
	private JLabel labelSunMoon;

	/**
	 * Launch the application.
	 */
	

	public JLabel getLabelSunMoon() {
		return labelSunMoon;
	}

	/**
	 * Create the frame.
	*/
	
	
	
	public Fenetre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 366);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		buttonSunMoon = new JButton("Allumer");
		buttonSunMoon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonSunMoon.setBounds(10, 293, 89, 23);
		contentPane.add(buttonSunMoon);
		
		labelSunMoon = new JLabel("");
		labelSunMoon.setIcon(new ImageIcon("C:\\Users\\Nico\\git\\Plantagoshi3\\img\\sun.png"));
		labelSunMoon.setBounds(14, 22, 85, 55);
		contentPane.add(labelSunMoon);
		
		labelHumiditeSol = new JLabel("0 %");
		labelHumiditeSol.setForeground(Color.BLUE);
		labelHumiditeSol.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelHumiditeSol.setBounds(284, 270, 75, 24);
		contentPane.add(labelHumiditeSol);
		
		labelPlante = new JLabel("");
		labelPlante.setIcon(new ImageIcon("C:\\Users\\Nico\\git\\Plantagoshi3\\img\\plant.png"));
		labelPlante.setBounds(70, 22, 281, 285);
		contentPane.add(labelPlante);
		
		labelTemperature = new JLabel("0 C\u00B0");
		labelTemperature.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelTemperature.setForeground(Color.RED);
		labelTemperature.setBounds(342, 53, 75, 24);
		contentPane.add(labelTemperature);
		
		labelHumiditeAir = new JLabel("0 %");
		labelHumiditeAir.setForeground(Color.BLUE);
		labelHumiditeAir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelHumiditeAir.setBounds(342, 88, 75, 14);
		contentPane.add(labelHumiditeAir);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JLabel getLabelHumiditeSol() {
		return labelHumiditeSol;
	}

	public JLabel getLabelPlante() {
		return labelPlante;
	}

	public JLabel getLabelTemperature() {
		return labelTemperature;
	}

	public JLabel getLabelHumiditeAir() {
		return labelHumiditeAir;
	}

	public JButton getButtonSunMoon() {
		return buttonSunMoon;
	}
}
