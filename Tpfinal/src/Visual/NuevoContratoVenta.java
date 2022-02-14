package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Color;

public class NuevoContratoVenta extends JFrame {

	private JPanel contentPane;
	private JTextField nomcomprador;
	private JTextField dnicomprador;
	private JTextField telcomprador;
	private JTextField apcomprador;
	private JTextField domcomprador;
	private JTextField correocomprador;
	private JTextField dniloc;
	private JTextField cantcuotas;
	private JTextField pripago;
	private JTextField monto;
	private JTextField nrocontrato;

	
	public NuevoContratoVenta() {
		setTitle("Nuevo Contrato Venta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 551);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(29, 11, 379, 152);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDatosComprador = new JLabel("Datos Comprador");
		lblDatosComprador.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDatosComprador.setBounds(132, 11, 114, 14);
		panel.add(lblDatosComprador);
		
		nomcomprador = new JTextField();
		nomcomprador.setColumns(10);
		nomcomprador.setBounds(67, 36, 86, 20);
		panel.add(nomcomprador);
		
		dnicomprador = new JTextField();
		dnicomprador.setColumns(10);
		dnicomprador.setBounds(67, 67, 86, 20);
		panel.add(dnicomprador);
		
		telcomprador = new JTextField();
		telcomprador.setColumns(10);
		telcomprador.setBounds(67, 98, 86, 20);
		panel.add(telcomprador);
		
		apcomprador = new JTextField();
		apcomprador.setColumns(10);
		apcomprador.setBounds(244, 36, 86, 20);
		panel.add(apcomprador);
		
		domcomprador = new JTextField();
		domcomprador.setColumns(10);
		domcomprador.setBounds(244, 66, 86, 20);
		panel.add(domcomprador);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(11, 39, 46, 14);
		panel.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(191, 39, 46, 14);
		panel.add(lblApellido);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(11, 70, 46, 14);
		panel.add(lblDni);
		
		JLabel lblDomicilio = new JLabel("Domicilio");
		lblDomicilio.setBounds(191, 70, 46, 14);
		panel.add(lblDomicilio);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(11, 101, 46, 14);
		panel.add(lblTelefono);
		
		JLabel lblCorreo = new JLabel("Estado Civil");
		lblCorreo.setBounds(173, 101, 64, 14);
		panel.add(lblCorreo);
		
		correocomprador = new JTextField();
		correocomprador.setColumns(10);
		correocomprador.setBounds(67, 121, 86, 20);
		panel.add(correocomprador);
		
		JLabel lblCorreo_1 = new JLabel("Correo");
		lblCorreo_1.setBounds(11, 126, 46, 14);
		panel.add(lblCorreo_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Soltero", "Casado", "Comprometido", "Viudo"}));
		comboBox_2.setBounds(244, 98, 86, 20);
		panel.add(comboBox_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(29, 186, 379, 145);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Casas", "Terrenos"}));
		comboBox.setBounds(74, 89, 107, 20);
		panel_1.add(comboBox);
		
		JLabel lblTipoInmuble = new JLabel("Tipo inmuble");
		lblTipoInmuble.setBounds(10, 95, 59, 14);
		panel_1.add(lblTipoInmuble);
		
		JLabel lblDatosInmuble = new JLabel("Datos Contrato");
		lblDatosInmuble.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDatosInmuble.setBounds(126, 3, 91, 14);
		panel_1.add(lblDatosInmuble);
		
		JLabel lblDni_1 = new JLabel("DNI Locador");
		lblDni_1.setBounds(10, 31, 64, 14);
		panel_1.add(lblDni_1);
		
		dniloc = new JTextField();
		dniloc.setBounds(74, 28, 107, 20);
		panel_1.add(dniloc);
		dniloc.setColumns(10);
		
		JLabel lblComision = new JLabel("Comision");
		lblComision.setBounds(20, 120, 46, 14);
		panel_1.add(lblComision);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Cuota unica", "Proporsion mensual"}));
		comboBox_1.setBounds(74, 117, 107, 20);
		panel_1.add(comboBox_1);
		
		JLabel lblNroContrato = new JLabel("Nro contrato");
		lblNroContrato.setBounds(10, 64, 74, 14);
		panel_1.add(lblNroContrato);
		
		nrocontrato = new JTextField();
		nrocontrato.setBounds(74, 59, 107, 20);
		panel_1.add(nrocontrato);
		nrocontrato.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(29, 342, 379, 124);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCronogramaDePago = new JLabel("Cronograma de pago");
		lblCronogramaDePago.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCronogramaDePago.setBounds(107, 11, 148, 21);
		panel_2.add(lblCronogramaDePago);
		
		JLabel lblCantidadDeCuotas = new JLabel("Cantidad de cuotas");
		lblCantidadDeCuotas.setBounds(10, 39, 121, 14);
		panel_2.add(lblCantidadDeCuotas);
		
		cantcuotas = new JTextField();
		cantcuotas.setBounds(117, 36, 121, 20);
		panel_2.add(cantcuotas);
		cantcuotas.setColumns(10);
		
		JLabel lblPrimerFechaPago = new JLabel("Primer Fecha pago");
		lblPrimerFechaPago.setBounds(10, 67, 102, 14);
		panel_2.add(lblPrimerFechaPago);
		
		pripago = new JTextField();
		pripago.setColumns(10);
		pripago.setBounds(117, 64, 121, 20);
		panel_2.add(pripago);
		
		JLabel lblNewLabel = new JLabel("Monto\r\n");
		lblNewLabel.setBounds(46, 92, 46, 14);
		panel_2.add(lblNewLabel);
		
		monto = new JTextField();
		monto.setColumns(10);
		monto.setBounds(117, 89, 121, 20);
		panel_2.add(monto);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(97, 477, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(255, 477, 89, 23);
		contentPane.add(btnCancelar);
	}

}
