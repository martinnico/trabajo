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
import javax.swing.border.BevelBorder;

public class AgregarInmueble extends JFrame {

	private JPanel contentPane;
	private JTextField nomlocador;
	private JTextField aplocador;
	private JTextField tellocador;
	private JTextField dnilocador;
	private JTextField dominmueble;
	private JTextField altura;
	private JTextField nropro;
	private JTextField corlocador;

	
	public AgregarInmueble() {
		setTitle("Agregar Inmueble");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 409);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(29, 11, 383, 133);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Nombre");
		label.setBounds(10, 25, 37, 14);
		panel.add(label);
		
		nomlocador = new JTextField();
		nomlocador.setColumns(10);
		nomlocador.setBounds(88, 22, 86, 20);
		panel.add(nomlocador);
		
		aplocador = new JTextField();
		aplocador.setColumns(10);
		aplocador.setBounds(264, 22, 86, 20);
		panel.add(aplocador);
		
		JTextField domlocador = new JTextField();
		domlocador.setColumns(10);
		domlocador.setBounds(264, 47, 86, 20);
		panel.add(domlocador);
		
		tellocador = new JTextField();
		tellocador.setColumns(10);
		tellocador.setBounds(264, 75, 86, 20);
		panel.add(tellocador);
		
		JLabel label_1 = new JLabel("Domicilio");
		label_1.setBounds(198, 50, 56, 14);
		panel.add(label_1);
		
		dnilocador = new JTextField();
		dnilocador.setColumns(10);
		dnilocador.setBounds(88, 47, 86, 20);
		panel.add(dnilocador);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(198, 25, 46, 14);
		panel.add(lblApellido);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(10, 50, 46, 14);
		panel.add(lblDni);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil");
		lblEstadoCivil.setBounds(10, 78, 68, 14);
		panel.add(lblEstadoCivil);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(198, 78, 46, 14);
		panel.add(lblTelefono);
		
		JLabel lblDatosLocador = new JLabel("Datos Locador");
		lblDatosLocador.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDatosLocador.setBounds(128, 0, 104, 14);
		panel.add(lblDatosLocador);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(10, 103, 46, 14);
		panel.add(lblCorreo);
		
		corlocador = new JTextField();
		corlocador.setBounds(88, 106, 86, 20);
		panel.add(corlocador);
		corlocador.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Soltero", "Casado", "En Compromiso"}));
		comboBox_1.setBounds(88, 75, 86, 20);
		panel.add(comboBox_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(29, 155, 383, 144);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Casas", "Departamentos", "Terrenos", "Locales Comerciales"}));
		comboBox.setBounds(108, 28, 97, 20);
		panel_1.add(comboBox);
		
		JLabel lblTipoInmuble = new JLabel("Tipo Inmuble");
		lblTipoInmuble.setBounds(26, 31, 82, 14);
		panel_1.add(lblTipoInmuble);
		
		JLabel lblDomicilio = new JLabel("Domicilio");
		lblDomicilio.setBounds(26, 56, 46, 14);
		panel_1.add(lblDomicilio);
		
		dominmueble = new JTextField();
		dominmueble.setBounds(108, 53, 97, 20);
		panel_1.add(dominmueble);
		dominmueble.setColumns(10);
		
		JLabel lblAltira = new JLabel("Altura");
		lblAltira.setBounds(26, 81, 46, 14);
		panel_1.add(lblAltira);
		
		altura = new JTextField();
		altura.setColumns(10);
		altura.setBounds(108, 78, 97, 20);
		panel_1.add(altura);
		
		JLabel lblNewLabel = new JLabel("Nro propiedad");
		lblNewLabel.setBounds(26, 106, 72, 14);
		panel_1.add(lblNewLabel);
		
		nropro = new JTextField();
		nropro.setColumns(10);
		nropro.setBounds(108, 103, 97, 20);
		panel_1.add(nropro);
		
		JLabel lblDatosInmueble = new JLabel("Datos Inmueble");
		lblDatosInmueble.setBounds(129, 3, 104, 14);
		panel_1.add(lblDatosInmueble);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(93, 320, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(236, 320, 89, 23);
		contentPane.add(btnCancelar);
	}
}
