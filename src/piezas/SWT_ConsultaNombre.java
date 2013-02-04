package piezas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class SWT_ConsultaNombre extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBusqueda;
	private JTextField txtCod;
	private JTextField txtNombre;
	private JTextField txtPrecio;
	private JTextField txtDescripcion;

	public SWT_ConsultaNombre() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscribeElNombre = new JLabel("Escribe el nombre de Pieza");
		lblEscribeElNombre.setBounds(36, 15, 164, 14);
		contentPane.add(lblEscribeElNombre);
		
		txtBusqueda = new JTextField();
		txtBusqueda.setColumns(10);
		txtBusqueda.setBounds(215, 12, 86, 20);
		contentPane.add(txtBusqueda);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(116, 51, 183, 20);
		contentPane.add(comboBox);
		
		JLabel label_1 = new JLabel("C\u00F3digo de Pieza");
		label_1.setBounds(44, 85, 129, 14);
		contentPane.add(label_1);
		
		txtCod = new JTextField();
		txtCod.setEditable(false);
		txtCod.setColumns(10);
		txtCod.setBounds(173, 82, 86, 20);
		contentPane.add(txtCod);
		
		JLabel label_2 = new JLabel("Nombre");
		label_2.setBounds(44, 125, 46, 14);
		contentPane.add(label_2);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBounds(128, 122, 173, 20);
		contentPane.add(txtNombre);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(44, 165, 74, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		lblDescripcin.setBounds(44, 205, 74, 14);
		contentPane.add(lblDescripcin);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(128, 162, 131, 20);
		contentPane.add(txtPrecio);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setEditable(false);
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(128, 202, 255, 20);
		contentPane.add(txtDescripcion);
		
		JButton button = new JButton("Buscar");
		button.setBounds(311, 11, 89, 23);
		contentPane.add(button);
	}
}
