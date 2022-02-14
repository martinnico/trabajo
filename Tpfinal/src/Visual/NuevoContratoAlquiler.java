package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Font;

public class NuevoContratoAlquiler extends JFrame {

	private JPanel contentPane;
	private JTextField nombrelocatario;
	private JTextField apellidolocatario;
	private JTextField dnilocatario;
	private JTextField domiciliolocatario;
	private JLabel lblDomicilio;
	private JTextField telefonolocatario;
	private JLabel lblTelefono;
	private JLabel lblEstadoCivil;
	private JTextField nomgarante;
	private JTextField apgarante;
	private JTextField dnigarante;
	private JTextField domgarante;
	private JPanel panel_3;
	private JLabel lblDatosInmueble;
	private JComboBox comboBox_2;
	private JLabel lblTipoInmueble;
	private JComboBox comboBox_3;
	private JLabel lblNewLabel_6;
	private JLabel lblNro;
	private JTextField dniloc;
	private JLabel lblFechaContrato;
	private JTextField iniciocontrato;
	private JLabel lblFechaFinalizacionContrato;
	private JTextField fincontrato;
	private JLabel lblComision;
	private JComboBox comboBox_4;
	private JLabel label_5;
	private JTextField correolocatario;
	private JLabel label;
	private JComboBox comboBox_1;
	private JLabel label_4;
	private JTextField cogarante;
	private JTextField telgarante;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel lblNroContrato;
	private JTextField nrocontrato;
	private JLabel lblMonto;
	private JTextField montocontrato;

	public NuevoContratoAlquiler() {
		setTitle("Nuevo Contrato Alquiler");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 763);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(20, 11, 404, 153);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 30, 37, 14);
		panel.add(lblNewLabel);
		
		nombrelocatario = new JTextField();
		nombrelocatario.setBounds(57, 27, 86, 20);
		panel.add(nombrelocatario);
		nombrelocatario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setBounds(198, 30, 46, 14);
		panel.add(lblNewLabel_1);
		
		apellidolocatario = new JTextField();
		apellidolocatario.setBounds(284, 27, 86, 20);
		panel.add(apellidolocatario);
		apellidolocatario.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DNI");
		lblNewLabel_2.setBounds(10, 55, 46, 14);
		panel.add(lblNewLabel_2);
		
		dnilocatario = new JTextField();
		dnilocatario.setBounds(57, 52, 86, 20);
		panel.add(dnilocatario);
		dnilocatario.setColumns(10);
		
		domiciliolocatario = new JTextField();
		domiciliolocatario.setBounds(284, 58, 86, 20);
		panel.add(domiciliolocatario);
		domiciliolocatario.setColumns(10);
		
		lblDomicilio = new JLabel("Domicilio");
		lblDomicilio.setBounds(198, 55, 56, 14);
		panel.add(lblDomicilio);
		
		telefonolocatario = new JTextField();
		telefonolocatario.setBounds(57, 80, 86, 20);
		panel.add(telefonolocatario);
		telefonolocatario.setColumns(10);
		
		lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(10, 83, 37, 14);
		panel.add(lblTelefono);
		
		lblEstadoCivil = new JLabel("Estado Civil");
		lblEstadoCivil.setBounds(191, 92, 69, 14);
		panel.add(lblEstadoCivil);
		
		JLabel lblNewLabel_3 = new JLabel("Datos locatario");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(141, 5, 103, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblTipoDeActividad = new JLabel("Tipo de actividad");
		lblTipoDeActividad.setBounds(157, 119, 103, 14);
		panel.add(lblTipoDeActividad);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Independiente", "R. Dependencia", "Estudiante"}));
		comboBox.setBounds(258, 116, 112, 20);
		panel.add(comboBox);
		
		label_5 = new JLabel("Correo");
		label_5.setBounds(10, 118, 46, 14);
		panel.add(label_5);
		
		correolocatario = new JTextField();
		correolocatario.setColumns(10);
		correolocatario.setBounds(57, 116, 86, 20);
		panel.add(correolocatario);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Soltero", "Casado", "Comprometido", "Viudo"}));
		comboBox_5.setBounds(284, 89, 86, 20);
		panel.add(comboBox_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(20, 186, 404, 168);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblDatosGarante = new JLabel("Datos garante");
		lblDatosGarante.setBounds(150, 5, 97, 20);
		lblDatosGarante.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_2.add(lblDatosGarante);
		
		JLabel label_1 = new JLabel("Nombre");
		label_1.setBounds(10, 36, 46, 14);
		panel_2.add(label_1);
		
		nomgarante = new JTextField();
		nomgarante.setBounds(53, 33, 86, 20);
		nomgarante.setColumns(10);
		panel_2.add(nomgarante);
		
		JLabel label_2 = new JLabel("Apellido");
		label_2.setBounds(214, 36, 46, 14);
		panel_2.add(label_2);
		
		apgarante = new JTextField();
		apgarante.setBounds(284, 33, 86, 20);
		apgarante.setColumns(10);
		panel_2.add(apgarante);
		
		dnigarante = new JTextField();
		dnigarante.setBounds(53, 61, 86, 20);
		dnigarante.setColumns(10);
		panel_2.add(dnigarante);
		
		JLabel label_3 = new JLabel("DNI");
		label_3.setBounds(10, 64, 46, 14);
		panel_2.add(label_3);
		
		domgarante = new JTextField();
		domgarante.setBounds(284, 64, 86, 20);
		domgarante.setColumns(10);
		panel_2.add(domgarante);
		
		JLabel lblDomicilio_1 = new JLabel("Domicilio");
		lblDomicilio_1.setBounds(214, 64, 46, 14);
		panel_2.add(lblDomicilio_1);
		
		label = new JLabel("Estado Civil");
		label.setBounds(205, 89, 69, 20);
		panel_2.add(label);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(258, 128, 112, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Independiente", "R. Dependencia"}));
		panel_2.add(comboBox_1);
		
		label_4 = new JLabel("Tipo de actividad");
		label_4.setBounds(157, 131, 103, 14);
		panel_2.add(label_4);
		
		cogarante = new JTextField();
		cogarante.setBounds(57, 128, 86, 20);
		cogarante.setColumns(10);
		panel_2.add(cogarante);
		
		telgarante = new JTextField();
		telgarante.setBounds(57, 92, 86, 20);
		telgarante.setColumns(10);
		panel_2.add(telgarante);
		
		label_6 = new JLabel("Telefono");
		label_6.setBounds(10, 95, 37, 14);
		panel_2.add(label_6);
		
		label_7 = new JLabel("Correo");
		label_7.setBounds(10, 130, 46, 14);
		panel_2.add(label_7);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(284, 95, 86, 20);
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Soltero", "Casado", "Comprometido", "Viudo"}));
		panel_2.add(comboBox_6);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(112, 677, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(244, 677, 89, 23);
		contentPane.add(btnCancelar);
		
		panel_3 = new JPanel();
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(20, 385, 404, 281);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		lblDatosInmueble = new JLabel("Datos Contrato");
		lblDatosInmueble.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDatosInmueble.setBounds(142, 11, 118, 14);
		panel_3.add(lblDatosInmueble);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Departamento", "Local Comercial"}));
		comboBox_2.setBounds(89, 99, 94, 20);
		panel_3.add(comboBox_2);
		
		lblTipoInmueble = new JLabel("Tipo Inmueble");
		lblTipoInmueble.setBounds(18, 102, 94, 14);
		panel_3.add(lblTipoInmueble);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Expensas", "Servicios", "Ambos"}));
		comboBox_3.setBounds(89, 127, 94, 20);
		panel_3.add(comboBox_3);
		
		lblNewLabel_6 = new JLabel("Aranceles");
		lblNewLabel_6.setBounds(18, 130, 61, 14);
		panel_3.add(lblNewLabel_6);
		
		lblNro = new JLabel("DNI Locador");
		lblNro.setBounds(13, 39, 66, 14);
		panel_3.add(lblNro);
		
		dniloc = new JTextField();
		dniloc.setColumns(10);
		dniloc.setBounds(89, 36, 94, 20);
		panel_3.add(dniloc);
		
		lblFechaContrato = new JLabel("Fecha Inicio Contrato");
		lblFechaContrato.setBounds(10, 222, 112, 14);
		panel_3.add(lblFechaContrato);
		
		iniciocontrato = new JTextField();
		iniciocontrato.setBounds(166, 219, 165, 20);
		panel_3.add(iniciocontrato);
		iniciocontrato.setColumns(10);
		
		lblFechaFinalizacionContrato = new JLabel("Fecha Finalizacion Contrato");
		lblFechaFinalizacionContrato.setBounds(13, 256, 146, 14);
		panel_3.add(lblFechaFinalizacionContrato);
		
		fincontrato = new JTextField();
		fincontrato.setColumns(10);
		fincontrato.setBounds(166, 253, 165, 20);
		panel_3.add(fincontrato);
		
		lblComision = new JLabel("Comision");
		lblComision.setBounds(20, 158, 46, 14);
		panel_3.add(lblComision);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Cuota unica", "Proporsion mensual"}));
		comboBox_4.setBounds(89, 155, 94, 20);
		panel_3.add(comboBox_4);
		
		lblNroContrato = new JLabel("Nro contrato");
		lblNroContrato.setBounds(18, 64, 61, 14);
		panel_3.add(lblNroContrato);
		
		nrocontrato = new JTextField();
		nrocontrato.setBounds(89, 61, 94, 20);
		panel_3.add(nrocontrato);
		nrocontrato.setColumns(10);
		
		lblMonto = new JLabel("Monto");
		lblMonto.setBounds(30, 197, 46, 14);
		panel_3.add(lblMonto);
		
		montocontrato = new JTextField();
		montocontrato.setBounds(97, 191, 86, 20);
		panel_3.add(montocontrato);
		montocontrato.setColumns(10);
	}
}
