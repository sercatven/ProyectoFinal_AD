package piezas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class SWT_Gestion extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtListado_Cod;
	private JTextField txtListado_Nombre;
	private JTextField txtListado_Precio;
	private JTextField txtListado_Descripcion;
	private JTextField txtGestion_Cod;
	private JTextField txtGestion_Nombre;
	private JTextField txtGestion_Precio;
	private JTextField txtGestion_Descripcion;

	public SWT_Gestion() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 360);
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 322);
		getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Gesti\u00F3n de piezas", null, panel, null);
		panel.setLayout(null);
		
		JLabel label_5 = new JLabel("ALTAS BAJAS Y MODIFICACIONES");
		label_5.setBounds(20, 11, 189, 14);
		panel.add(label_5);
		
		JLabel lblCdigoDePieza = new JLabel("C\u00F3digo de Pieza");
		lblCdigoDePieza.setBounds(44, 49, 131, 14);
		panel.add(lblCdigoDePieza);
		
		txtGestion_Cod = new JTextField();
		txtGestion_Cod.setColumns(10);
		txtGestion_Cod.setBounds(173, 46, 86, 20);
		panel.add(txtGestion_Cod);
		
		JLabel label_7 = new JLabel("Nombre");
		label_7.setBounds(44, 89, 46, 14);
		panel.add(label_7);
		
		txtGestion_Nombre = new JTextField();
		txtGestion_Nombre.setColumns(10);
		txtGestion_Nombre.setBounds(128, 86, 187, 20);
		panel.add(txtGestion_Nombre);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(44, 129, 86, 14);
		panel.add(lblPrecio);
		
		JLabel lblDescripcion = new JLabel("Descripci\u00F3n");
		lblDescripcion.setBounds(44, 169, 86, 14);
		panel.add(lblDescripcion);
		
		txtGestion_Precio = new JTextField();
		txtGestion_Precio.setColumns(10);
		txtGestion_Precio.setBounds(128, 126, 131, 20);
		panel.add(txtGestion_Precio);
		
		txtGestion_Descripcion = new JTextField();
		txtGestion_Descripcion.setColumns(10);
		txtGestion_Descripcion.setBounds(128, 166, 255, 20);
		panel.add(txtGestion_Descripcion);
		
		JButton button_6 = new JButton("Limpiar");
		button_6.setBounds(10, 235, 89, 23);
		panel.add(button_6);
		
		JButton button_7 = new JButton("Insertar");
		button_7.setBounds(118, 235, 89, 23);
		panel.add(button_7);
		
		JButton button_8 = new JButton("Modificar");
		button_8.setBounds(226, 235, 89, 23);
		panel.add(button_8);
		
		JButton button_9 = new JButton("Eliminar");
		button_9.setBounds(334, 235, 89, 23);
		panel.add(button_9);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Listado de Piezas", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblListaDePiezas = new JLabel("LISTA DE PIEZAS");
		lblListaDePiezas.setBounds(10, 11, 129, 14);
		panel_1.add(lblListaDePiezas);
		
		JLabel lblCdigoDePieza_1 = new JLabel("C\u00F3digo de Pieza");
		lblCdigoDePieza_1.setBounds(32, 39, 129, 14);
		panel_1.add(lblCdigoDePieza_1);
		
		txtListado_Cod = new JTextField();
		txtListado_Cod.setEditable(false);
		txtListado_Cod.setColumns(10);
		txtListado_Cod.setBounds(161, 36, 86, 20);
		panel_1.add(txtListado_Cod);
		
		JLabel label_2 = new JLabel("Nombre");
		label_2.setBounds(32, 79, 46, 14);
		panel_1.add(label_2);
		
		txtListado_Nombre = new JTextField();
		txtListado_Nombre.setEditable(false);
		txtListado_Nombre.setColumns(10);
		txtListado_Nombre.setBounds(116, 76, 187, 20);
		panel_1.add(txtListado_Nombre);
		
		JLabel lblPrecio_1 = new JLabel("Precio");
		lblPrecio_1.setBounds(32, 119, 74, 14);
		panel_1.add(lblPrecio_1);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		lblDescripcin.setBounds(32, 159, 74, 14);
		panel_1.add(lblDescripcin);
		
		txtListado_Precio = new JTextField();
		txtListado_Precio.setEditable(false);
		txtListado_Precio.setColumns(10);
		txtListado_Precio.setBounds(116, 116, 131, 20);
		panel_1.add(txtListado_Precio);
		
		txtListado_Descripcion = new JTextField();
		txtListado_Descripcion.setEditable(false);
		txtListado_Descripcion.setColumns(10);
		txtListado_Descripcion.setBounds(116, 156, 255, 20);
		panel_1.add(txtListado_Descripcion);
		
		JButton button = new JButton("Ejecutar Consulta");
		button.setBounds(32, 202, 300, 23);
		panel_1.add(button);
		
		JButton button_1 = new JButton("|<<");
		button_1.setBounds(33, 236, 61, 23);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("<<");
		button_2.setBounds(138, 236, 61, 23);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton(">>");
		button_3.setBounds(243, 236, 61, 23);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton(">>|");
		button_4.setBounds(348, 236, 61, 23);
		panel_1.add(button_4);
		
		JButton button_5 = new JButton("Baja");
		button_5.setBounds(342, 202, 68, 23);
		panel_1.add(button_5);
	}
}
