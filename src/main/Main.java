package main;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import piezas.SWT_ConsultaCodigo;
import piezas.SWT_ConsultaNombre;
import piezas.SWT_Gestion;
import proveedores.SWT_ConsultaDireccion;
import bbdd.GestionBBDD;

public class Main extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Main().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		contentPane.add(menuBar);
		
		JMenu mnBaseDatos = new JMenu("Base de Datos");
		menuBar.add(mnBaseDatos);
		
		JMenuItem mnItemBaseDatosCrear = new JMenuItem("Crear Base de Datos");
		mnItemBaseDatosCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestionBBDD.Crear();
			}
		});
		mnBaseDatos.add(mnItemBaseDatosCrear);
		
		JMenuItem mnItemBaseDatosBorrar = new JMenuItem("Borrar Base de Datos");
		mnItemBaseDatosBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GestionBBDD.Borrar();
			}
		});
		mnBaseDatos.add(mnItemBaseDatosBorrar);
		
		JMenuItem mnItemBaseDatosSalir = new JMenuItem("Salir");
		mnItemBaseDatosSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mnBaseDatos.add(mnItemBaseDatosSalir);
		
		JMenu mnProveedores = new JMenu("Proveedores");
		menuBar.add(mnProveedores);
		
		JMenuItem mnItemProveedoresGestion = new JMenuItem("Gestion de Proveedores");
		mnItemProveedoresGestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new SWT_Gestion();
			}
		});
		mnProveedores.add(mnItemProveedoresGestion);
		
		JMenu mnItemProveedoresConsulta = new JMenu("Consulta de Proveedores");
		mnProveedores.add(mnItemProveedoresConsulta);
		
		JMenuItem mnItemProveedoresConsultaCodigo = new JMenuItem("Por C\u00F3digo");
		mnItemProveedoresConsultaCodigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new SWT_ConsultaCodigo();
			}
		});
		mnItemProveedoresConsulta.add(mnItemProveedoresConsultaCodigo);
		
		JMenuItem mnItemProveedoresConsultaNombre = new JMenuItem("Por Nombre");
		mnItemProveedoresConsultaNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SWT_ConsultaNombre();
			}
		});
		mnItemProveedoresConsulta.add(mnItemProveedoresConsultaNombre);
		
		JMenuItem mnItemProveedoresConsultaDireccion = new JMenuItem("Por Direcci\u00F3n");
		mnItemProveedoresConsultaDireccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SWT_ConsultaDireccion();
			}
		});
		mnItemProveedoresConsulta.add(mnItemProveedoresConsultaDireccion);
		
		JMenu mnPiezas = new JMenu("Piezas");
		menuBar.add(mnPiezas);
		
		JMenuItem mnItemPiezasGestion = new JMenuItem("Gesti\u00F3n de Piezas");
		mnItemPiezasGestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SWT_Gestion();
			}
		});
		mnPiezas.add(mnItemPiezasGestion);
		
		JMenu mnItemPiezasConsulta = new JMenu("Consulta de Piezas");
		mnPiezas.add(mnItemPiezasConsulta);
		
		JMenuItem mnItemPiezasConsultaCodigo = new JMenuItem("Por C\u00F3digo");
		mnItemPiezasConsultaCodigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SWT_ConsultaCodigo();
			}
		});
		mnItemPiezasConsulta.add(mnItemPiezasConsultaCodigo);
		
		JMenuItem mnItemPiezasConsultaNombre = new JMenuItem("Por Nombre");
		mnItemPiezasConsultaNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SWT_ConsultaNombre();
			}
		});
		mnItemPiezasConsulta.add(mnItemPiezasConsultaNombre);
		
		JMenu mnProyectos = new JMenu("Proyectos");
		menuBar.add(mnProyectos);
		
		JMenuItem mnItemProyectosGestion = new JMenuItem("Gestion de Proyectos");
		mnProyectos.add(mnItemProyectosGestion);
		
		JMenu mnItemProyectosConsulta = new JMenu("Consulta de Proyectos");
		mnProyectos.add(mnItemProyectosConsulta);
		
		JMenuItem mnItemProyectosConsultaCodigo = new JMenuItem("Por C\u00F3digo");
		mnItemProyectosConsulta.add(mnItemProyectosConsultaCodigo);
		
		JMenuItem mnItemProyectosConsultaNombre = new JMenuItem("Por Nombre");
		mnItemProyectosConsulta.add(mnItemProyectosConsultaNombre);
		
		JMenuItem mnItemProyectosConsultaCiudad = new JMenuItem("Por Ciudad");
		mnItemProyectosConsulta.add(mnItemProyectosConsultaCiudad);
		
		JMenu mnGestionGlobal = new JMenu("Gesti\u00F3n Global");
		menuBar.add(mnGestionGlobal);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mnItemAyudaAcerca = new JMenuItem("Acerca de...");
		mnAyuda.add(mnItemAyudaAcerca);
	}
}