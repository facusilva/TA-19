package ex3;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Encuesta extends JFrame {

	//delcaro los atributos
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Encuesta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tituloSO = new JLabel("Sistema operativo:");
		tituloSO.setBounds(24, 22, 147, 14);
		contentPane.add(tituloSO);
		
		JRadioButton windows = new JRadioButton("Windows", true);
		windows.setActionCommand("Windows");
		windows.setBounds(24, 43, 109, 23);
		contentPane.add(windows);
		
		JRadioButton linux = new JRadioButton("Linux");
		linux.setActionCommand("Linux");
		linux.setBounds(24, 69, 109, 23);
		contentPane.add(linux);
		
		JRadioButton mac = new JRadioButton("Mac");
		mac.setActionCommand("Mac");
		mac.setBounds(24, 95, 109, 23);
		contentPane.add(mac);
		
		ButtonGroup sistemaOperativo = new ButtonGroup();
		sistemaOperativo.add(windows);
		sistemaOperativo.add(linux);
		sistemaOperativo.add(mac);
		

		JLabel tituloEspecialidad = new JLabel("Especialidad");
		tituloEspecialidad.setBounds(268, 22, 97, 14);
		contentPane.add(tituloEspecialidad);
		
		JRadioButton programacion = new JRadioButton("Programación", true);
		programacion.setActionCommand("Programación");
		programacion.setBounds(268, 43, 109, 23);
		contentPane.add(programacion);
		
		JRadioButton diseñoGrafico = new JRadioButton("Diseño gráfico");
		diseñoGrafico.setActionCommand("Diseño gráfico");
		diseñoGrafico.setBounds(268, 69, 109, 23);
		contentPane.add(diseñoGrafico);
		
		JRadioButton administracion = new JRadioButton("Administración");
		administracion.setActionCommand("Administración");
		administracion.setBounds(268, 95, 109, 23);
		contentPane.add(administracion);
		
		ButtonGroup especialidad = new ButtonGroup();
		especialidad.add(programacion);
		especialidad.add(diseñoGrafico);
		especialidad.add(administracion);
		
		JSlider horas = new JSlider(0,10,3);
		horas.setPaintTrack(true);
		horas.setPaintTicks(true);
		horas.setPaintLabels(true);
		horas.setMinorTickSpacing(1);
		horas.setBounds(139, 170, 109, 23);
		contentPane.add(horas);
		
		JLabel tituloSlider = new JLabel("Horas en el ordenador");
		tituloSlider.setBounds(139, 135, 138, 14);
		contentPane.add(tituloSlider);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(147, 214, 89, 23);
		contentPane.add(btnEnviar);
		
		JLabel horasMin = new JLabel("0");
		horasMin.setBounds(119, 179, 14, 14);
		contentPane.add(horasMin);
		
		JLabel horasMax = new JLabel("10");
		horasMax.setBounds(256, 179, 46, 14);
		contentPane.add(horasMax);
		
		//capturo el evento del botón enviar y muestro los datos introducidos por el usuario en un JOptionPane
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Horas: "+horas.getValue()+", Sistema Operativo: "+sistemaOperativo.getSelection().getActionCommand()+", Especialidad: "+especialidad.getSelection().getActionCommand());
			}
		});
		
		setVisible(true); //llamarlo desde el main
	}
}
