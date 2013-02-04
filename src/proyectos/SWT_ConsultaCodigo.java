package proyectos;


import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class SWT_ConsultaCodigo extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBusqueda;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtCiudad;

	public SWT_ConsultaCodigo() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 404, 259);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscribeElCodigo = new JLabel("Escribe el codigo de Proyecto");
		lblEscribeElCodigo.setBounds(30, 15, 164, 14);
		contentPane.add(lblEscribeElCodigo);
		
		txtBusqueda = new JTextField();
		txtBusqueda.setColumns(10);
		txtBusqueda.setBounds(209, 12, 86, 20);
		contentPane.add(txtBusqueda);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(110, 51, 183, 20);
		contentPane.add(comboBox);
		
		JLabel lblCdigoDeProyecto = new JLabel("C\u00F3digo de Proyecto");
		lblCdigoDeProyecto.setBounds(38, 85, 129, 14);
		contentPane.add(lblCdigoDeProyecto);
		
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(167, 82, 86, 20);
		contentPane.add(txtCodigo);
		
		JLabel label_2 = new JLabel("Nombre");
		label_2.setBounds(38, 125, 46, 14);
		contentPane.add(label_2);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBounds(122, 122, 173, 20);
		contentPane.add(txtNombre);
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setBounds(38, 165, 74, 14);
		contentPane.add(lblCiudad);
		
		txtCiudad = new JTextField();
		txtCiudad.setEditable(false);
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(122, 162, 173, 20);
		contentPane.add(txtCiudad);
		
		JButton button = new JButton("Buscar");
		button.setBounds(305, 11, 89, 23);
		contentPane.add(button);
	}

}
