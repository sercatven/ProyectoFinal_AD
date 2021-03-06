package proveedores;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class SWT_ConsultaNombre extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBusqueda;
	private JTextField txtCod;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtDireccion;
	
	public SWT_ConsultaNombre() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscribeElNombre = new JLabel("Escribe el nombre de Proveedor");
		lblEscribeElNombre.setBounds(33, 15, 164, 14);
		contentPane.add(lblEscribeElNombre);
		
		txtBusqueda = new JTextField();
		txtBusqueda.setColumns(10);
		txtBusqueda.setBounds(212, 12, 86, 20);
		contentPane.add(txtBusqueda);
		
		JButton button = new JButton("Buscar");
		button.setBounds(308, 11, 89, 23);
		contentPane.add(button);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(113, 51, 183, 20);
		contentPane.add(comboBox);
		
		JLabel label_1 = new JLabel("C\u00F3digo de Proveedor");
		label_1.setBounds(41, 85, 129, 14);
		contentPane.add(label_1);
		
		txtCod = new JTextField();
		txtCod.setEditable(false);
		txtCod.setColumns(10);
		txtCod.setBounds(170, 82, 86, 20);
		contentPane.add(txtCod);
		
		JLabel label_2 = new JLabel("Nombre");
		label_2.setBounds(41, 125, 46, 14);
		contentPane.add(label_2);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBounds(125, 122, 131, 20);
		contentPane.add(txtNombre);
		
		JLabel label_3 = new JLabel("Apellidos");
		label_3.setBounds(41, 165, 74, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Direccion");
		label_4.setBounds(41, 205, 74, 14);
		contentPane.add(label_4);
		
		txtApellidos = new JTextField();
		txtApellidos.setEditable(false);
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(125, 162, 182, 20);
		contentPane.add(txtApellidos);
		
		txtDireccion = new JTextField();
		txtDireccion.setEditable(false);
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(125, 202, 255, 20);
		contentPane.add(txtDireccion);
	}
}
