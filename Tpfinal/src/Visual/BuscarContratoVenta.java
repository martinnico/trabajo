package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class BuscarContratoVenta extends JFrame {

	private JPanel contentPane;
	private JTextField nrocontrato;
	private JTextField nomcomprador;
	private JTextField dnicomprador;
	private JTextField correocomprador;
	private JTextField telcomprador;
	private JTextField apcomprador;
	private JTextField domcomprador;
	private JTextField dniloc;
	private JTextField cantcuotas;
	private JTextField pripago;
	private JTextField monto;

	public BuscarContratoVenta() {
		setTitle("Buscar Venta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 665);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 393, 45);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Nro contrato");
		label.setBounds(23, 14, 72, 14);
		panel.add(label);
		
		nrocontrato = new JTextField();
		nrocontrato.setColumns(10);
		nrocontrato.setBounds(105, 11, 130, 20);
		panel.add(nrocontrato);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, 67, 393, 171);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblDatosComprador = new JLabel("Datos Comprador");
		lblDatosComprador.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDatosComprador.setBounds(133, 11, 118, 14);
		panel_1.add(lblDatosComprador);
		
		nomcomprador = new JTextField();
		nomcomprador.setEnabled(false);
		nomcomprador.setColumns(10);
		nomcomprador.setBounds(93, 38, 86, 20);
		panel_1.add(nomcomprador);
		
		JLabel label_1 = new JLabel("Nombre");
		label_1.setBounds(37, 41, 46, 14);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("DNI");
		label_2.setBounds(37, 72, 46, 14);
		panel_1.add(label_2);
		
		dnicomprador = new JTextField();
		dnicomprador.setEnabled(false);
		dnicomprador.setColumns(10);
		dnicomprador.setBounds(93, 69, 86, 20);
		panel_1.add(dnicomprador);
		
		JLabel label_3 = new JLabel("Telefono");
		label_3.setBounds(37, 103, 46, 14);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Correo");
		label_4.setBounds(37, 128, 46, 14);
		panel_1.add(label_4);
		
		correocomprador = new JTextField();
		correocomprador.setEnabled(false);
		correocomprador.setColumns(10);
		correocomprador.setBounds(93, 123, 86, 20);
		panel_1.add(correocomprador);
		
		telcomprador = new JTextField();
		telcomprador.setEnabled(false);
		telcomprador.setColumns(10);
		telcomprador.setBounds(93, 100, 86, 20);
		panel_1.add(telcomprador);
		
		apcomprador = new JTextField();
		apcomprador.setEnabled(false);
		apcomprador.setColumns(10);
		apcomprador.setBounds(270, 38, 86, 20);
		panel_1.add(apcomprador);
		
		domcomprador = new JTextField();
		domcomprador.setEnabled(false);
		domcomprador.setColumns(10);
		domcomprador.setBounds(270, 68, 86, 20);
		panel_1.add(domcomprador);
		
		JLabel label_5 = new JLabel("Estado Civil");
		label_5.setBounds(199, 103, 64, 14);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("Domicilio");
		label_6.setBounds(217, 72, 46, 14);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("Apellido");
		label_7.setBounds(217, 41, 46, 14);
		panel_1.add(label_7);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Soltero", "Casado", "Comprometido", "Viudo"}));
		comboBox_2.setBounds(270, 100, 86, 20);
		panel_1.add(comboBox_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 249, 393, 154);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblDatosContrato = new JLabel("Datos Contrato");
		lblDatosContrato.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDatosContrato.setBounds(144, 11, 106, 14);
		panel_2.add(lblDatosContrato);
		
		JLabel label_8 = new JLabel("DNI Locador");
		label_8.setBounds(23, 37, 64, 14);
		panel_2.add(label_8);
		
		dniloc = new JTextField();
		dniloc.setEnabled(false);
		dniloc.setColumns(10);
		dniloc.setBounds(87, 34, 107, 20);
		panel_2.add(dniloc);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Casas", "Terrenos"}));
		comboBox.setEnabled(false);
		comboBox.setBounds(87, 78, 107, 20);
		panel_2.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Cuota unica", "Proporsion mensual"}));
		comboBox_1.setEnabled(false);
		comboBox_1.setBounds(87, 123, 107, 20);
		panel_2.add(comboBox_1);
		
		JLabel label_9 = new JLabel("Comision");
		label_9.setBounds(33, 126, 46, 14);
		panel_2.add(label_9);
		
		JLabel label_10 = new JLabel("Tipo inmuble");
		label_10.setBounds(23, 81, 59, 14);
		panel_2.add(label_10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(10, 414, 393, 129);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label_12 = new JLabel("Cronograma de pago");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_12.setBounds(92, 11, 148, 21);
		panel_3.add(label_12);
		
		JLabel label_13 = new JLabel("Cantidad de cuotas");
		label_13.setBounds(23, 37, 121, 14);
		panel_3.add(label_13);
		
		cantcuotas = new JTextField();
		cantcuotas.setEnabled(false);
		cantcuotas.setColumns(10);
		cantcuotas.setBounds(130, 34, 121, 20);
		panel_3.add(cantcuotas);
		
		pripago = new JTextField();
		pripago.setEnabled(false);
		pripago.setColumns(10);
		pripago.setBounds(130, 62, 121, 20);
		panel_3.add(pripago);
		
		JLabel label_14 = new JLabel("Primer Fecha pago");
		label_14.setBounds(23, 65, 102, 14);
		panel_3.add(label_14);
		
		JLabel label_15 = new JLabel("Monto\r\n");
		label_15.setBounds(59, 90, 46, 14);
		panel_3.add(label_15);
		
		monto = new JTextField();
		monto.setEnabled(false);
		monto.setColumns(10);
		monto.setBounds(130, 87, 121, 20);
		panel_3.add(monto);
		
		JButton button = new JButton("Buscar");
		button.setBounds(423, 54, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Modificar");
		button_1.setBounds(423, 112, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Eliminar");
		button_2.setBounds(423, 147, 89, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Aceptar");
		button_3.setBounds(423, 181, 89, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Cancelar");
		button_4.setBounds(423, 215, 89, 23);
		contentPane.add(button_4);
	}

}
