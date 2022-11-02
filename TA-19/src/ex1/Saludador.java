package ex1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Saludador extends JFrame {

	//declaro los atributos
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public Saludador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Escribe un nombre para saludar");
		titulo.setBounds(134,28, 151,14);
		contentPane.add(titulo);
		
		textField = new JTextField();
		textField.setBounds(82, 75, 250,20);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("¡Saludar!");
		//capturo el evento del botón saludar y muestro por pantalla el nombre introducido en el JTextField
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola "+textField.getText());
			}
		});
		btnNewButton.setBounds(159, 125, 89, 23);
		contentPane.add(btnNewButton);
		//textField.setColumns(10);
	}
}
