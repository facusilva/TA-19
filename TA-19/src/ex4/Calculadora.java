package ex4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	//declaro los atributos
	private JPanel contentPane;
	private JTextField operando1;
	private JTextField operando2;
	private JTextField resultado;

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		operando1 = new JTextField();
		operando1.setBounds(10, 121, 112, 20);
		contentPane.add(operando1);
		operando1.setColumns(10);
		
		operando2 = new JTextField();
		operando2.setBounds(231, 121, 123, 20);
		contentPane.add(operando2);
		operando2.setColumns(10);
		
		resultado = new JTextField();
		resultado.setBounds(405, 121, 150, 20);
		contentPane.add(resultado);
		resultado.setColumns(10);
		
		JButton btnSuma = new JButton("Suma");
		btnSuma.setBounds(132, 65, 89, 23);
		contentPane.add(btnSuma);
		
		JButton btnResta = new JButton("Resta");
		btnResta.setBounds(132, 99, 89, 23);
		contentPane.add(btnResta);
		
		JButton btnMultiplicacion = new JButton("Multiplicación");
		btnMultiplicacion.setBounds(132, 141, 89, 23);
		contentPane.add(btnMultiplicacion);
		
		JButton btnDivision = new JButton("División");
		btnDivision.setBounds(132, 175, 89, 23);
		contentPane.add(btnDivision);
		
		JLabel tituloOperando1 = new JLabel("Operando");
		tituloOperando1.setBounds(40, 96, 64, 14);
		contentPane.add(tituloOperando1);
		
		JLabel tituloOperando2 = new JLabel("Operando");
		tituloOperando2.setBounds(271, 99, 64, 14);
		contentPane.add(tituloOperando2);
		
		JLabel tituloResultado = new JLabel("Resultado");
		tituloResultado.setBounds(454, 96, 64, 14);
		contentPane.add(tituloResultado);
		
		JLabel tituloOperador = new JLabel("Operador");
		tituloOperador.setBounds(153, 40, 46, 14);
		contentPane.add(tituloOperador);
		
		JLabel lblNewLabel_4 = new JLabel("=");
		lblNewLabel_4.setBounds(373, 124, 22, 14);
		contentPane.add(lblNewLabel_4);
		
		//capturo el evento del botón suma, hago el cálculo y lo muestro por pantalla
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					resultado.setText(""+calcular("+"));
				}catch(NumberFormatException ex) {//en caso de error, se captura la excepción y se muestra por pantalla el error
					JOptionPane.showMessageDialog(null, "Ambos operandos deben ser números!!");
				}	
			}
		});
		
		//capturo el evento del botón resta, hago el cálculo y lo muestro por pantalla
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					resultado.setText(""+calcular("-"));
				}catch(NumberFormatException ex) {//en caso de error, se captura la excepción y se muestra por pantalla el error
					JOptionPane.showMessageDialog(null, "Ambos operandos deben ser números!!");
				}
			}
		});
		
		//capturo el evento del botón multiplicación, hago el cálculo y lo muestro por pantalla
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					resultado.setText(""+calcular("*"));
				}catch(NumberFormatException ex) {//en caso de error, se captura la excepción y se muestra por pantalla el error
					JOptionPane.showMessageDialog(null, "Ambos operandos deben ser números!!");
				}
			}
		});
		
		//capturo el evento del botón división, hago el cálculo y lo muestro por pantalla
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					resultado.setText(""+calcular("/"));
				}catch(NumberFormatException ex) {//en caso de error, se captura la excepción y se muestra por pantalla el error
					JOptionPane.showMessageDialog(null, "Ambos operandos deben ser números!!");
				}catch(ArithmeticException ex) {
					JOptionPane.showMessageDialog(null, "No se puede dividir entre 0!!");
				}
			}
		});
	}
	
	//esta función recibe los dos números y el operador, realiza el cálculo correspondiente y devuelve el resultado.
	public int calcular(String operador) {
		int a = Integer.parseInt(operando1.getText());
		int b = Integer.parseInt(operando2.getText());
		int r = 0;
		switch(operador) {
		case "+":
			r=a+b;
			break;
		case "-":
			r=a-b;
			break;
		case "*":
			r=a*b;
			break;
		case "/":
			r=a/b;
			break;
		}
		return r;
	}

}
