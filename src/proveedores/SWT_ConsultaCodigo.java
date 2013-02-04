package proveedores;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class SWT_ConsultaCodigo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBusqueda;
	private JTextField txtCod;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtDireccion;

	public SWT_ConsultaCodigo() {
		setTitle("Consulta de Proveedores por c\u00F3digo");
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscribeElCodigo = new JLabel("Escribe el codigo de Proveedor");
		lblEscribeElCodigo.setBounds(37, 11, 164, 14);
		contentPane.add(lblEscribeElCodigo);
		
		txtBusqueda = new JTextField();
		txtBusqueda.setBounds(216, 8, 86, 20);
		contentPane.add(txtBusqueda);
		txtBusqueda.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(312, 7, 89, 23);
		contentPane.add(btnBuscar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(117, 47, 183, 20);
		contentPane.add(comboBox);
		
		JLabel label = new JLabel("C\u00F3digo de Proveedor");
		label.setBounds(45, 81, 129, 14);
		contentPane.add(label);
		
		txtCod = new JTextField();
		txtCod.setEditable(false);
		txtCod.setColumns(10);
		txtCod.setBounds(174, 78, 86, 20);
		contentPane.add(txtCod);
		
		JLabel label_1 = new JLabel("Nombre");
		label_1.setBounds(45, 121, 46, 14);
		contentPane.add(label_1);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBounds(129, 118, 131, 20);
		contentPane.add(txtNombre);
		
		JLabel label_2 = new JLabel("Apellidos");
		label_2.setBounds(45, 161, 74, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Direccion");
		label_3.setBounds(45, 201, 74, 14);
		contentPane.add(label_3);
		
		txtApellidos = new JTextField();
		txtApellidos.setEditable(false);
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(129, 158, 182, 20);
		contentPane.add(txtApellidos);
		
		txtDireccion = new JTextField();
		txtDireccion.setEditable(false);
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(129, 198, 255, 20);
		contentPane.add(txtDireccion);
	}
}
