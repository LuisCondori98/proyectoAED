package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class dlgCliente extends JDialog {

	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JTable tblTable;
	private DefaultTableModel modelo;
	private JLabel lblNewLabel;
	private JLabel lblCodigo;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			dlgCliente dialog = new dlgCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public dlgCliente() {
		setTitle("Cliente Mantenimiento");
		setBounds(100, 100, 614, 536);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 182, 580, 307);
		getContentPane().add(scrollPane);
		
		tblTable = new JTable();
		tblTable.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblTable);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("código");
		modelo.addColumn("nombre");
		modelo.addColumn("apellido");
		modelo.addColumn("direccion");
		modelo.addColumn("telefono");
		modelo.addColumn("dni");
		tblTable.setModel(modelo);
		
		lblNewLabel = new JLabel("Cliente");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(268, 10, 50, 24);
		getContentPane().add(lblNewLabel);
		
		lblCodigo = new JLabel("Codigo");
		lblCodigo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCodigo.setBounds(10, 45, 64, 24);
		getContentPane().add(lblCodigo);
		
		textField = new JTextField();
		textField.setBounds(84, 47, 64, 24);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(84, 81, 127, 24);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(84, 117, 127, 24);
		getContentPane().add(textField_2);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(10, 81, 64, 24);
		getContentPane().add(lblNombre);
		
		lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblApellidos.setBounds(10, 115, 64, 24);
		getContentPane().add(lblApellidos);
		
		btnNewButton = new JButton("Buscar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setBounds(158, 48, 78, 21);
		getContentPane().add(btnNewButton);
	}
}
