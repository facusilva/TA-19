package ex2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListaPeliculas extends JFrame {

	//declaro los atributos
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public ListaPeliculas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(23, 82, 160, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel pelicula = new JLabel("Escribe el título de una película");
		pelicula.setBounds(23, 37, 186, 14);
		contentPane.add(pelicula);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.setBounds(57, 122, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel combobox = new JLabel("Peliculas");
		combobox.setBounds(301, 37, 58, 14);
		contentPane.add(combobox);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(247, 81, 160, 22);
		contentPane.add(comboBox);
		
		//al pulsar el botón de añadir capturo el evento para añadir el contenido del campo de texto al JComboBox
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.addItem(textField.getText());
			}
		});
	}
}
