package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.Color;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 424, 21);
		contentPane.add(menuBar);
		
		JMenu mnClientes = new JMenu("Clientes");
		menuBar.add(mnClientes);
		
		JMenuItem mntmBuscarCliente = new JMenuItem("Buscar Cliente");
		mnClientes.add(mntmBuscarCliente);
		
		JMenu mnInmuebles = new JMenu("Inmuebles");
		menuBar.add(mnInmuebles);
		
		JMenuItem mntmAgregarInmueble = new JMenuItem("Agregar Inmueble");
		mnInmuebles.add(mntmAgregarInmueble);
		
		JMenuItem mntmBuscarInmueble = new JMenuItem("Buscar Inmueble");
		mnInmuebles.add(mntmBuscarInmueble);
		
		JMenu mnContratos = new JMenu("Contratos");
		menuBar.add(mnContratos);
		
		JMenu mnContratoDeVenta = new JMenu("Contrato de Venta");
		mnContratos.add(mnContratoDeVenta);
		
		JMenuItem mntmNuevoContrato = new JMenuItem("Nuevo Contrato");
		mnContratoDeVenta.add(mntmNuevoContrato);
		
		JMenuItem mntmBuscarContrato = new JMenuItem("Buscar Contrato");
		mnContratoDeVenta.add(mntmBuscarContrato);
		
		JMenu mnContratoDeAlquiler = new JMenu("Contrato de Alquiler");
		mnContratos.add(mnContratoDeAlquiler);
		
		JMenuItem mntmNuevoContrato_1 = new JMenuItem("Nuevo Contrato");
		mnContratoDeAlquiler.add(mntmNuevoContrato_1);
		
		JMenuItem mntmBuscarContrato_1 = new JMenuItem("Buscar Contrato");
		mnContratoDeAlquiler.add(mntmBuscarContrato_1);
	}
}
