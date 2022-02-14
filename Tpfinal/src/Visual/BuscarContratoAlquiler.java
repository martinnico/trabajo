package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class BuscarContratoAlquiler extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNroContrato;
	private JTextField nrocon;
	private JButton btnNewButton;
	private JButton btnModificar;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel label;
	private JTextField textField_1;
	private JLabel label_1;
	private JTextField textField_2;
	private JLabel label_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel label_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JComboBox comboBox;
	private JLabel label_8;
	private JTextField textField_7;
	private JTextField nomloc;
	private JLabel label_9;
	private JLabel label_10;
	private JTextField dniloc;
	private JLabel label_11;
	private JTextField telloc;
	private JLabel label_12;
	private JTextField corloc;
	private JTextField aploc;
	private JTextField domloc;
	private JTextField estadoloc;
	private JComboBox comboBox_1;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel lblNewLabel;
	private JPanel panel_3;
	private JTextField nomgarante;
	private JLabel label_17;
	private JLabel label_18;
	private JTextField dnigarante;
	private JLabel label_19;
	private JTextField telgarante;
	private JLabel label_20;
	private JTextField correogarante;
	private JTextField apgarante;
	private JTextField domgarante;
	private JTextField estadogarante;
	private JComboBox comboBox_2;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_24;
	private JLabel lblNewLabel_1;
	private JPanel panel_4;
	private JLabel label_25;
	private JTextField dnilocador;
	private JLabel label_27;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JLabel label_28;
	private JLabel label_29;
	private JComboBox comboBox_5;
	private JLabel label_30;
	private JTextField iniciocontrato;
	private JTextField textField_25;
	private JLabel label_31;
	private JLabel label_32;
	private JTextField monto;
	private JButton btnEliminar;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JLabel lblDatosContrato;


	public BuscarContratoAlquiler() {
		setTitle("Buscar alquiler");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 749);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 424, 47);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNroContrato = new JLabel("Nro contrato");
		lblNroContrato.setBounds(10, 11, 72, 14);
		panel.add(lblNroContrato);
		
		nrocon = new JTextField();
		nrocon.setBounds(92, 8, 130, 20);
		panel.add(nrocon);
		nrocon.setColumns(10);
		
		btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(440, 24, 89, 23);
		contentPane.add(btnNewButton);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(440, 82, 89, 23);
		contentPane.add(btnModificar);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, 69, 424, 157);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBounds(206, 5, 1, 1);
		panel_2.setLayout(null);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.add(panel_2);
		
		label = new JLabel("Nombre");
		label.setBounds(10, 30, 37, 14);
		panel_2.add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(57, 27, 86, 20);
		panel_2.add(textField_1);
		
		label_1 = new JLabel("Apellido");
		label_1.setBounds(198, 30, 46, 14);
		panel_2.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(284, 27, 86, 20);
		panel_2.add(textField_2);
		
		label_2 = new JLabel("DNI");
		label_2.setBounds(10, 55, 46, 14);
		panel_2.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(57, 52, 86, 20);
		panel_2.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(284, 58, 86, 20);
		panel_2.add(textField_4);
		
		label_3 = new JLabel("Domicilio");
		label_3.setBounds(198, 55, 56, 14);
		panel_2.add(label_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(57, 80, 86, 20);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(284, 83, 86, 20);
		panel_2.add(textField_6);
		
		label_4 = new JLabel("Telefono");
		label_4.setBounds(10, 83, 37, 14);
		panel_2.add(label_4);
		
		label_5 = new JLabel("Estado Civil");
		label_5.setBounds(200, 83, 69, 14);
		panel_2.add(label_5);
		
		label_6 = new JLabel("Datos locatario");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_6.setBounds(141, 5, 103, 14);
		panel_2.add(label_6);
		
		label_7 = new JLabel("Tipo de actividad");
		label_7.setBounds(157, 119, 103, 14);
		panel_2.add(label_7);
		
		comboBox = new JComboBox();
		comboBox.setBounds(258, 116, 112, 20);
		panel_2.add(comboBox);
		
		label_8 = new JLabel("Correo");
		label_8.setBounds(10, 118, 46, 14);
		panel_2.add(label_8);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(57, 116, 86, 20);
		panel_2.add(textField_7);
		
		nomloc = new JTextField();
		nomloc.setEnabled(false);
		nomloc.setColumns(10);
		nomloc.setBounds(68, 44, 86, 20);
		panel_1.add(nomloc);
		
		label_9 = new JLabel("Nombre");
		label_9.setBounds(21, 50, 37, 14);
		panel_1.add(label_9);
		
		label_10 = new JLabel("DNI");
		label_10.setBounds(21, 75, 46, 14);
		panel_1.add(label_10);
		
		dniloc = new JTextField();
		dniloc.setEnabled(false);
		dniloc.setColumns(10);
		dniloc.setBounds(68, 72, 86, 20);
		panel_1.add(dniloc);
		
		label_11 = new JLabel("Telefono");
		label_11.setBounds(10, 100, 46, 14);
		panel_1.add(label_11);
		
		telloc = new JTextField();
		telloc.setEnabled(false);
		telloc.setColumns(10);
		telloc.setBounds(68, 97, 86, 20);
		panel_1.add(telloc);
		
		label_12 = new JLabel("Correo");
		label_12.setBounds(21, 125, 46, 14);
		panel_1.add(label_12);
		
		corloc = new JTextField();
		corloc.setEnabled(false);
		corloc.setColumns(10);
		corloc.setBounds(68, 122, 86, 20);
		panel_1.add(corloc);
		
		aploc = new JTextField();
		aploc.setEnabled(false);
		aploc.setColumns(10);
		aploc.setBounds(269, 47, 86, 20);
		panel_1.add(aploc);
		
		domloc = new JTextField();
		domloc.setEnabled(false);
		domloc.setColumns(10);
		domloc.setBounds(269, 72, 86, 20);
		panel_1.add(domloc);
		
		estadoloc = new JTextField();
		estadoloc.setEnabled(false);
		estadoloc.setColumns(10);
		estadoloc.setBounds(269, 97, 86, 20);
		panel_1.add(estadoloc);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setEnabled(false);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Independiente", "R. Dependencia", "Estudiante"}));
		comboBox_1.setBounds(269, 122, 112, 20);
		panel_1.add(comboBox_1);
		
		label_13 = new JLabel("Tipo de actividad");
		label_13.setBounds(177, 122, 103, 14);
		panel_1.add(label_13);
		
		label_14 = new JLabel("Estado Civil");
		label_14.setBounds(194, 100, 69, 14);
		panel_1.add(label_14);
		
		label_15 = new JLabel("Domicilio");
		label_15.setBounds(206, 75, 56, 14);
		panel_1.add(label_15);
		
		label_16 = new JLabel("Apellido");
		label_16.setBounds(206, 47, 46, 14);
		panel_1.add(label_16);
		
		lblNewLabel = new JLabel("Datos locatario");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(151, 19, 112, 14);
		panel_1.add(lblNewLabel);
		
		panel_3 = new JPanel();
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(10, 237, 424, 190);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		nomgarante = new JTextField();
		nomgarante.setEnabled(false);
		nomgarante.setColumns(10);
		nomgarante.setBounds(74, 48, 86, 20);
		panel_3.add(nomgarante);
		
		label_17 = new JLabel("Nombre");
		label_17.setBounds(27, 51, 37, 14);
		panel_3.add(label_17);
		
		label_18 = new JLabel("DNI");
		label_18.setBounds(27, 76, 46, 14);
		panel_3.add(label_18);
		
		dnigarante = new JTextField();
		dnigarante.setEnabled(false);
		dnigarante.setColumns(10);
		dnigarante.setBounds(74, 73, 86, 20);
		panel_3.add(dnigarante);
		
		label_19 = new JLabel("Telefono");
		label_19.setBounds(27, 104, 37, 14);
		panel_3.add(label_19);
		
		telgarante = new JTextField();
		telgarante.setEnabled(false);
		telgarante.setColumns(10);
		telgarante.setBounds(74, 101, 86, 20);
		panel_3.add(telgarante);
		
		label_20 = new JLabel("Correo");
		label_20.setBounds(27, 139, 46, 14);
		panel_3.add(label_20);
		
		correogarante = new JTextField();
		correogarante.setEnabled(false);
		correogarante.setColumns(10);
		correogarante.setBounds(74, 137, 86, 20);
		panel_3.add(correogarante);
		
		apgarante = new JTextField();
		apgarante.setEnabled(false);
		apgarante.setColumns(10);
		apgarante.setBounds(301, 48, 86, 20);
		panel_3.add(apgarante);
		
		domgarante = new JTextField();
		domgarante.setEnabled(false);
		domgarante.setColumns(10);
		domgarante.setBounds(301, 79, 86, 20);
		panel_3.add(domgarante);
		
		estadogarante = new JTextField();
		estadogarante.setEnabled(false);
		estadogarante.setColumns(10);
		estadogarante.setBounds(301, 104, 86, 20);
		panel_3.add(estadogarante);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Independiente", "R. Dependencia"}));
		comboBox_2.setEnabled(false);
		comboBox_2.setBounds(275, 137, 112, 20);
		panel_3.add(comboBox_2);
		
		label_21 = new JLabel("Tipo de actividad");
		label_21.setBounds(174, 140, 103, 14);
		panel_3.add(label_21);
		
		label_22 = new JLabel("Estado Civil");
		label_22.setBounds(217, 104, 69, 14);
		panel_3.add(label_22);
		
		label_23 = new JLabel("Domicilio");
		label_23.setBounds(215, 76, 56, 14);
		panel_3.add(label_23);
		
		label_24 = new JLabel("Apellido");
		label_24.setBounds(215, 51, 46, 14);
		panel_3.add(label_24);
		
		lblNewLabel_1 = new JLabel("Datos Garante");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(168, 11, 103, 14);
		panel_3.add(lblNewLabel_1);
		
		panel_4 = new JPanel();
		panel_4.setBackground(Color.ORANGE);
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(10, 438, 424, 261);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		label_25 = new JLabel("DNI Locador");
		label_25.setBounds(15, 58, 66, 14);
		panel_4.add(label_25);
		
		dnilocador = new JTextField();
		dnilocador.setEnabled(false);
		dnilocador.setColumns(10);
		dnilocador.setBounds(106, 55, 94, 20);
		panel_4.add(dnilocador);
		
		label_27 = new JLabel("Tipo Inmueble");
		label_27.setBounds(15, 89, 84, 14);
		panel_4.add(label_27);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Departamento", "Local Comercial"}));
		comboBox_3.setEnabled(false);
		comboBox_3.setBounds(106, 86, 94, 20);
		panel_4.add(comboBox_3);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Expensas", "Servicios", "Ambos"}));
		comboBox_4.setEnabled(false);
		comboBox_4.setBounds(106, 114, 94, 20);
		panel_4.add(comboBox_4);
		
		label_28 = new JLabel("Aranceles");
		label_28.setBounds(20, 114, 61, 14);
		panel_4.add(label_28);
		
		label_29 = new JLabel("Comision");
		label_29.setBounds(30, 148, 46, 14);
		panel_4.add(label_29);
		
		comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Cuota unica", "Proporsion mensual"}));
		comboBox_5.setEnabled(false);
		comboBox_5.setBounds(106, 145, 94, 20);
		panel_4.add(comboBox_5);
		
		label_30 = new JLabel("Fecha Inicio Contrato");
		label_30.setBounds(10, 211, 112, 14);
		panel_4.add(label_30);
		
		iniciocontrato = new JTextField();
		iniciocontrato.setEnabled(false);
		iniciocontrato.setColumns(10);
		iniciocontrato.setBounds(166, 208, 165, 20);
		panel_4.add(iniciocontrato);
		
		textField_25 = new JTextField();
		textField_25.setEnabled(false);
		textField_25.setColumns(10);
		textField_25.setBounds(166, 233, 165, 20);
		panel_4.add(textField_25);
		
		label_31 = new JLabel("Fecha Finalizacion Contrato");
		label_31.setBounds(15, 236, 146, 14);
		panel_4.add(label_31);
		
		label_32 = new JLabel("Monto");
		label_32.setBounds(47, 179, 46, 14);
		panel_4.add(label_32);
		
		monto = new JTextField();
		monto.setEnabled(false);
		monto.setColumns(10);
		monto.setBounds(106, 173, 94, 20);
		panel_4.add(monto);
		
		lblDatosContrato = new JLabel("Datos Contrato");
		lblDatosContrato.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDatosContrato.setBounds(154, 11, 104, 14);
		panel_4.add(lblDatosContrato);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(440, 117, 89, 23);
		contentPane.add(btnEliminar);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(440, 151, 89, 23);
		contentPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(440, 185, 89, 23);
		contentPane.add(btnCancelar);
	}
}
