package proveedores;

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
	private JTextField txtGestion_Cod;
	private JTextField txtGestion_Nombre;
	private JTextField txtGestion_Apellidos;
	private JTextField txtGestion_Direccion;
	private JTextField txtListado_Cod;
	private JTextField txtListado_Nombre;
	private JTextField txtListado_Apellidos;
	private JTextField txtListado_Direccion;


	/**
	 * Create the frame.
	 */
	public SWT_Gestion() {
		setBounds(100, 100, 450, 360);
		setAlwaysOnTop(true);
		setResizable(false);
		setVisible(true);
		setTitle("Gestion de empleados");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 229, 414, -213);
		
		
		JPanel panel1 = new JPanel();
		tabbedPane.add("Gesti\u00F3n de Proveedores",panel1);
		panel1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ALTAS BAJAS Y MODIFICACIONES");
		lblNewLabel.setBounds(33, 25, 189, 14);
		panel1.add(lblNewLabel);
		
		JLabel lblCdigoDeProveedor = new JLabel("C\u00F3digo de Proveedor");
		lblCdigoDeProveedor.setBounds(57, 63, 131, 14);
		panel1.add(lblCdigoDeProveedor);
		
		txtGestion_Cod = new JTextField();
		txtGestion_Cod.setBounds(186, 60, 86, 20);
		panel1.add(txtGestion_Cod);
		txtGestion_Cod.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(57, 103, 46, 14);
		panel1.add(lblNombre);
		
		txtGestion_Nombre = new JTextField();
		txtGestion_Nombre.setBounds(141, 100, 131, 20);
		panel1.add(txtGestion_Nombre);
		txtGestion_Nombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(57, 143, 86, 14);
		panel1.add(lblApellidos);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(57, 183, 86, 14);
		panel1.add(lblDireccion);
		
		txtGestion_Apellidos = new JTextField();
		txtGestion_Apellidos.setBounds(141, 140, 182, 20);
		panel1.add(txtGestion_Apellidos);
		txtGestion_Apellidos.setColumns(10);
		
		txtGestion_Direccion = new JTextField();
		txtGestion_Direccion.setBounds(141, 180, 255, 20);
		panel1.add(txtGestion_Direccion);
		txtGestion_Direccion.setColumns(10);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(23, 249, 89, 23);
		panel1.add(btnLimpiar);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.setBounds(131, 249, 89, 23);
		panel1.add(btnInsertar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(239, 249, 89, 23);
		panel1.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(347, 249, 89, 23);
		panel1.add(btnEliminar);
		JPanel panel2 = new JPanel();
		tabbedPane.add("Listado de Proveedores",panel2);
		panel2.setLayout(null);
		
		JLabel lblListaDeProveedores = new JLabel("LISTA DE PROVEEDORES");
		lblListaDeProveedores.setBounds(21, 23, 129, 14);
		panel2.add(lblListaDeProveedores);
		
		JLabel label = new JLabel("C\u00F3digo de Proveedor");
		label.setBounds(43, 51, 129, 14);
		panel2.add(label);
		
		txtListado_Cod = new JTextField();
		txtListado_Cod.setEditable(false);
		txtListado_Cod.setColumns(10);
		txtListado_Cod.setBounds(172, 48, 86, 20);
		panel2.add(txtListado_Cod);
		
		JLabel label_1 = new JLabel("Nombre");
		label_1.setBounds(43, 91, 46, 14);
		panel2.add(label_1);
		
		txtListado_Nombre = new JTextField();
		txtListado_Nombre.setEditable(false);
		txtListado_Nombre.setColumns(10);
		txtListado_Nombre.setBounds(127, 88, 131, 20);
		panel2.add(txtListado_Nombre);
		
		JLabel label_2 = new JLabel("Apellidos");
		label_2.setBounds(43, 131, 74, 14);
		panel2.add(label_2);
		
		JLabel label_3 = new JLabel("Direccion");
		label_3.setBounds(43, 171, 74, 14);
		panel2.add(label_3);
		
		txtListado_Apellidos = new JTextField();
		txtListado_Apellidos.setEditable(false);
		txtListado_Apellidos.setColumns(10);
		txtListado_Apellidos.setBounds(127, 128, 182, 20);
		panel2.add(txtListado_Apellidos);
		
		txtListado_Direccion = new JTextField();
		txtListado_Direccion.setEditable(false);
		txtListado_Direccion.setColumns(10);
		txtListado_Direccion.setBounds(127, 168, 255, 20);
		panel2.add(txtListado_Direccion);
		
		JButton btnNewButton = new JButton("Ejecutar Consulta");
		btnNewButton.setBounds(43, 214, 300, 23);
		panel2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("|<<");
		btnNewButton_1.setBounds(44, 248, 61, 23);
		panel2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("<<");
		btnNewButton_2.setBounds(149, 248, 61, 23);
		panel2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton(">>");
		btnNewButton_3.setBounds(254, 248, 61, 23);
		panel2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton(">>|");
		btnNewButton_4.setBounds(359, 248, 61, 23);
		panel2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Baja");
		btnNewButton_5.setBounds(353, 214, 68, 23);
		panel2.add(btnNewButton_5);
		
		getContentPane().add(tabbedPane);
	}
}
