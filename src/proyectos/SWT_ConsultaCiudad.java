package proyectos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class SWT_ConsultaCiudad extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBusqueda;
	private JTextField txtCod;
	private JTextField txtNombre;
	private JTextField txtCiudad;

	public SWT_ConsultaCiudad() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 404, 259);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscribeLaCiudad = new JLabel("Escribe la ciudad de Proyecto");
		lblEscribeLaCiudad.setBounds(10, 15, 164, 14);
		contentPane.add(lblEscribeLaCiudad);
		
		txtBusqueda = new JTextField();
		txtBusqueda.setColumns(10);
		txtBusqueda.setBounds(189, 12, 86, 20);
		contentPane.add(txtBusqueda);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(90, 51, 183, 20);
		contentPane.add(comboBox);
		
		JLabel label_1 = new JLabel("C\u00F3digo de Proyecto");
		label_1.setBounds(18, 85, 129, 14);
		contentPane.add(label_1);
		
		txtCod = new JTextField();
		txtCod.setEditable(false);
		txtCod.setColumns(10);
		txtCod.setBounds(147, 82, 86, 20);
		contentPane.add(txtCod);
		
		JLabel label_2 = new JLabel("Nombre");
		label_2.setBounds(18, 125, 46, 14);
		contentPane.add(label_2);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBounds(102, 122, 173, 20);
		contentPane.add(txtNombre);
		
		JLabel label_3 = new JLabel("Ciudad");
		label_3.setBounds(18, 165, 74, 14);
		contentPane.add(label_3);
		
		txtCiudad = new JTextField();
		txtCiudad.setEditable(false);
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(102, 162, 173, 20);
		contentPane.add(txtCiudad);
		
		JButton button = new JButton("Buscar");
		button.setBounds(285, 11, 89, 23);
		contentPane.add(button);
	}

}
