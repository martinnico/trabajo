package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class BuscarInmueble extends JFrame {

	private JPanel contentPane;
	private JTextField nropro;
	private JTextField loc;
	private JTextField altura;
	private JTextField dom;
	private JTextField nomlocador;
	private JTextField dnilocador;
	private JTextField aplocador;
	private JTextField nomlocatario;
	private JTextField dnilocatario;
	private JTextField aplocatario;

	
	public BuscarInmueble() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 556);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(36, 24, 357, 66);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nro propiedad");
		lblNewLabel.setBounds(10, 11, 86, 14);
		panel.add(lblNewLabel);
		
		nropro = new JTextField();
		nropro.setBounds(92, 8, 123, 20);
		panel.add(nropro);
		nropro.setColumns(10);
		
		JLabel lblLocalidad = new JLabel("Localidad");
		lblLocalidad.setBounds(10, 36, 46, 14);
		panel.add(lblLocalidad);
		
		loc = new JTextField();
		loc.setBounds(92, 36, 123, 20);
		panel.add(loc);
		loc.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(35, 101, 358, 114);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("Tipo Inmuble");
		label.setBounds(23, 14, 82, 14);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("Domicilio");
		label_1.setBounds(23, 39, 46, 14);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("Altura");
		label_2.setBounds(23, 64, 46, 14);
		panel_1.add(label_2);
		
		altura = new JTextField();
		altura.setEnabled(false);
		altura.setColumns(10);
		altura.setBounds(115, 61, 97, 20);
		panel_1.add(altura);
		
		dom = new JTextField();
		dom.setEnabled(false);
		dom.setColumns(10);
		dom.setBounds(115, 36, 97, 20);
		panel_1.add(dom);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Casas", "Departamentos", "Terrenos", "Locales Comerciales"}));
		comboBox.setEnabled(false);
		comboBox.setBounds(115, 11, 97, 20);
		panel_1.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(36, 226, 357, 94);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblDatosLocador = new JLabel("Datos Locador");
		lblDatosLocador.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDatosLocador.setBounds(126, 11, 106, 14);
		panel_2.add(lblDatosLocador);
		
		nomlocador = new JTextField();
		nomlocador.setEnabled(false);
		nomlocador.setColumns(10);
		nomlocador.setBounds(88, 38, 86, 20);
		panel_2.add(nomlocador);
		
		dnilocador = new JTextField();
		dnilocador.setEnabled(false);
		dnilocador.setColumns(10);
		dnilocador.setBounds(88, 63, 86, 20);
		panel_2.add(dnilocador);
		
		JLabel label_3 = new JLabel("Nombre");
		label_3.setBounds(10, 41, 37, 14);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("DNI");
		label_4.setBounds(10, 66, 46, 14);
		panel_2.add(label_4);
		
		aplocador = new JTextField();
		aplocador.setEnabled(false);
		aplocador.setColumns(10);
		aplocador.setBounds(264, 38, 86, 20);
		panel_2.add(aplocador);
		
		JLabel label_5 = new JLabel("Apellido");
		label_5.setBounds(198, 41, 46, 14);
		panel_2.add(label_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(36, 331, 360, 106);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		nomlocatario = new JTextField();
		nomlocatario.setEnabled(false);
		nomlocatario.setColumns(10);
		nomlocatario.setBounds(88, 39, 86, 20);
		panel_3.add(nomlocatario);
		
		dnilocatario = new JTextField();
		dnilocatario.setEnabled(false);
		dnilocatario.setColumns(10);
		dnilocatario.setBounds(88, 64, 86, 20);
		panel_3.add(dnilocatario);
		
		JLabel label_6 = new JLabel("Nombre");
		label_6.setBounds(10, 42, 37, 14);
		panel_3.add(label_6);
		
		JLabel label_7 = new JLabel("DNI");
		label_7.setBounds(10, 67, 46, 14);
		panel_3.add(label_7);
		
		aplocatario = new JTextField();
		aplocatario.setEnabled(false);
		aplocatario.setColumns(10);
		aplocatario.setBounds(264, 39, 86, 20);
		panel_3.add(aplocatario);
		
		JLabel label_8 = new JLabel("Apellido");
		label_8.setBounds(198, 42, 46, 14);
		panel_3.add(label_8);
		
		JLabel lblDatosLocatario = new JLabel("Datos Locatario");
		lblDatosLocatario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDatosLocatario.setBounds(120, 11, 106, 14);
		panel_3.add(lblDatosLocatario);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(114, 483, 78, 23);
		contentPane.add(btnBuscar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(255, 483, 89, 23);
		contentPane.add(btnCancelar);
	}
}
