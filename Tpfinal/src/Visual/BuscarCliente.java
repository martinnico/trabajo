package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class BuscarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField dni;
	private JTextField nom;
	private JTextField ap;
	private JTextField tipodni;
	private JTextField dom;
	private JTextField tel;
	private JTextField correo;

	
	public BuscarCliente() {
		setTitle("Buscar Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 344);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.ORANGE);
		panel.setBounds(10, 28, 414, 48);
		contentPane.add(panel);
		
		JLabel label = new JLabel("D.N.I.");
		label.setFont(new Font("Arial", Font.BOLD, 12));
		label.setBounds(32, 11, 29, 15);
		panel.add(label);
		
		dni = new JTextField();
		dni.setColumns(10);
		dni.setBounds(71, 5, 216, 28);
		panel.add(dni);
		
		JButton button = new JButton("BUSCAR");
		button.setBounds(297, 5, 89, 28);
		panel.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(10, 87, 414, 167);
		contentPane.add(panel_1);
		
		JLabel label_1 = new JLabel("Nombre");
		label_1.setFont(new Font("Arial", Font.BOLD, 12));
		label_1.setBounds(5, 11, 47, 15);
		panel_1.add(label_1);
		
		nom = new JTextField();
		nom.setEnabled(false);
		nom.setColumns(10);
		nom.setBounds(67, 5, 128, 20);
		panel_1.add(nom);
		
		JLabel label_2 = new JLabel("Apellido");
		label_2.setFont(new Font("Arial", Font.BOLD, 12));
		label_2.setBounds(212, 11, 47, 15);
		panel_1.add(label_2);
		
		ap = new JTextField();
		ap.setEnabled(false);
		ap.setColumns(10);
		ap.setBounds(276, 5, 128, 20);
		panel_1.add(ap);
		
		JLabel lblTipoDni = new JLabel("Tipo DNI");
		lblTipoDni.setFont(new Font("Arial", Font.BOLD, 12));
		lblTipoDni.setBounds(5, 39, 47, 15);
		panel_1.add(lblTipoDni);
		
		tipodni = new JTextField();
		tipodni.setEnabled(false);
		tipodni.setColumns(10);
		tipodni.setBounds(67, 37, 128, 20);
		panel_1.add(tipodni);
		
		JLabel lblDomicilio = new JLabel("Domicilio");
		lblDomicilio.setFont(new Font("Arial", Font.BOLD, 12));
		lblDomicilio.setBounds(212, 39, 54, 15);
		panel_1.add(lblDomicilio);
		
		dom = new JTextField();
		dom.setEnabled(false);
		dom.setColumns(10);
		dom.setBounds(276, 36, 128, 20);
		panel_1.add(dom);
		
		JLabel label_5 = new JLabel("Tel\u00E9fono");
		label_5.setFont(new Font("Arial", Font.BOLD, 12));
		label_5.setBounds(5, 73, 57, 15);
		panel_1.add(label_5);
		
		tel = new JTextField();
		tel.setEnabled(false);
		tel.setColumns(10);
		tel.setBounds(67, 68, 128, 20);
		panel_1.add(tel);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Arial", Font.BOLD, 12));
		lblEmail.setBounds(214, 72, 57, 15);
		panel_1.add(lblEmail);
		
		correo = new JTextField();
		correo.setEnabled(false);
		correo.setColumns(10);
		correo.setBounds(276, 67, 128, 20);
		panel_1.add(correo);
		
		JLabel lblEstadoCivil = new JLabel("Estado civil");
		lblEstadoCivil.setFont(new Font("Arial", Font.BOLD, 12));
		lblEstadoCivil.setBounds(5, 104, 73, 15);
		panel_1.add(lblEstadoCivil);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Soltero", "Casado", "Comprometido"}));
		comboBox.setBounds(77, 99, 118, 20);
		panel_1.add(comboBox);
		
		JLabel lblActividad = new JLabel("Actividad");
		lblActividad.setFont(new Font("Arial", Font.BOLD, 12));
		lblActividad.setBounds(5, 141, 73, 15);
		panel_1.add(lblActividad);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(77, 136, 118, 20);
		panel_1.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Ver Comprobantes");
		btnNewButton.setBounds(212, 135, 192, 23);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(146, 265, 278, 31);
		contentPane.add(panel_2);
		
		JButton button_1 = new JButton("EDITAR");
		button_1.setBounds(10, 5, 69, 23);
		panel_2.add(button_1);
		
		JButton button_2 = new JButton("ELIMINAR");
		button_2.setBounds(94, 5, 81, 23);
		panel_2.add(button_2);
		
		JButton button_3 = new JButton("CANCELAR");
		button_3.setBounds(185, 5, 85, 23);
		panel_2.add(button_3);
	}
}
