package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.table.TableColumnModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import arreglos.ArregloProducto;
import clases.Producto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class dlgProducto extends JDialog implements ActionListener, MouseListener {

	private static final long serialVersionUID = 1L;
	private JTable tblTable;
	private DefaultTableModel modelo;
	private JLabel lblNewLabel;
	private JTextField txtCodigo;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JTextField txtPrecio;
	private JLabel lblPrecio;
	private JScrollPane scrollPane;
	private JLabel lblProductos;
	private JLabel lblS;
	private JLabel lblStockMinimo;
	private JLabel lblStockMaximo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			dlgProducto dialog = new dlgProducto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public dlgProducto() {
		setTitle("Producto Mantenimiento");
		setBounds(100, 100, 472, 584);
		getContentPane().setLayout(null);
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 188, 442, 315);
			getContentPane().add(scrollPane);
			{
				tblTable = new JTable();
				tblTable.addMouseListener(this);
				tblTable.setFillsViewportHeight(true);
				scrollPane.setViewportView(tblTable);
				
				modelo = new DefaultTableModel();
				modelo.addColumn("código");
				modelo.addColumn("nombre");
				modelo.addColumn("precio");
				modelo.addColumn("Stock actual");
				modelo.addColumn("Stock minimo");
				modelo.addColumn("Stock maximoz");
				tblTable.setModel(modelo);

			}
		}
		
		lblNewLabel = new JLabel("Codigo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 42, 73, 26);
		getContentPane().add(lblNewLabel);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(76, 44, 61, 26);
		getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(10, 78, 73, 26);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(76, 80, 151, 26);
		getContentPane().add(txtNombre);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(76, 116, 151, 26);
		getContentPane().add(txtPrecio);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrecio.setBounds(10, 116, 73, 26);
		getContentPane().add(lblPrecio);
		
		lblProductos = new JLabel("Productos");
		lblProductos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblProductos.setBounds(256, 10, 73, 26);
		getContentPane().add(lblProductos);
		
		lblS = new JLabel("Stock actual");
		lblS.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblS.setBounds(237, 42, 92, 26);
		getContentPane().add(lblS);
		
		lblStockMinimo = new JLabel("Stock minimo");
		lblStockMinimo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStockMinimo.setBounds(237, 78, 92, 26);
		getContentPane().add(lblStockMinimo);
		
		lblStockMaximo = new JLabel("Stock maximo");
		lblStockMaximo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStockMaximo.setBounds(237, 114, 92, 26);
		getContentPane().add(lblStockMaximo);
		
		txtStockAct = new JTextField();
		txtStockAct.setColumns(10);
		txtStockAct.setBounds(341, 44, 111, 26);
		getContentPane().add(txtStockAct);
		
		txtStockMin = new JTextField();
		txtStockMin.setColumns(10);
		txtStockMin.setBounds(341, 80, 111, 26);
		getContentPane().add(txtStockMin);
		
		txtStockMax = new JTextField();
		txtStockMax.setColumns(10);
		txtStockMax.setBounds(341, 116, 111, 26);
		getContentPane().add(txtStockMax);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(this);
		btnAgregar.setBounds(10, 516, 120, 21);
		getContentPane().add(btnAgregar);
		
		btnIngreso = new JButton("Ingreso");
		btnIngreso.addActionListener(this);
		btnIngreso.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnIngreso.setBounds(10, 152, 97, 26);
		getContentPane().add(btnIngreso);
		
		btnModificacion = new JButton("Modificacion");
		btnModificacion.addActionListener(this);
		btnModificacion.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnModificacion.setBounds(117, 152, 111, 26);
		getContentPane().add(btnModificacion);
		
		btnConsulta = new JButton("Consulta");
		btnConsulta.addActionListener(this);
		btnConsulta.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConsulta.setBounds(237, 152, 97, 26);
		getContentPane().add(btnConsulta);
		
		btnEliminacion = new JButton("Eliminacion");
		btnEliminacion.addActionListener(this);
		btnEliminacion.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEliminacion.setBounds(341, 152, 111, 26);
		getContentPane().add(btnEliminacion);
		
		btnCambiar = new JButton("Cambiar");
		btnCambiar.addActionListener(this);
		btnCambiar.setBounds(153, 516, 120, 21);
		getContentPane().add(btnCambiar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(294, 516, 120, 21);
		getContentPane().add(btnEliminar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(this);
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBuscar.setBounds(147, 42, 80, 26);
		getContentPane().add(btnBuscar);
		
		btnBuscar.setVisible(false);
		ocultarCRUD();
		ocultarTxt();
		listar();
	}
	
	private JTextField txtStockAct;
	private JTextField txtStockMin;
	private JTextField txtStockMax;
	private JButton btnAgregar;
	private JButton btnIngreso;
	private JButton btnModificacion;
	private JButton btnConsulta;
	private JButton btnEliminacion;
	private JButton btnCambiar;
	private JButton btnEliminar;
	private JButton btnBuscar;
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCambiar) {
			actionPerformedBtnCambiar(e);
		}
		if (e.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(e);
		}
		if (e.getSource() == btnBuscar) {
			actionPerformedBtnBuscar(e);
		}
		if (e.getSource() == btnEliminacion) {
			actionPerformedBtnEliminacion(e);
		}
		if (e.getSource() == btnConsulta) {
			actionPerformedBtnConsulta(e);
		}
		if (e.getSource() == btnModificacion) {
			actionPerformedBtnModificacion(e);
		}
		if (e.getSource() == btnIngreso) {
			actionPerformedBtnIngreso(e);
		}
		if (e.getSource() == btnAgregar) {
			actionPerformedBtnAgregar(e);
		}
	}
	
	ArregloProducto prod = new ArregloProducto();
	
	void listar() {
		Producto p;
		modelo.setRowCount(0);
		for (int i=0; i<prod.tamanio(); i++) {
			p = prod.obtener(i);
			Object[] fila = { p.getCodigoProducto(),
					          p.getNombre(),
					          p.getPrecio(),
					          p.getStockActual(),
					          p.getStockMinimo(),
					          p.getStockMaximo()
					         };
			modelo.addRow(fila);
		}
	}
	
	protected void actionPerformedBtnIngreso(ActionEvent e) {
		
		mostrarBtnMantenimiento();
		btnIngreso.setEnabled(false);
		ocultarCRUD();
		btnAgregar.setVisible(true);
		mostrarTxt();
		txtCodigo.setText(prod.codigoCorrelativo()+"");
		txtCodigo.setEditable(false);
		limpiar();
	}
	
	protected void actionPerformedBtnModificacion(ActionEvent e) {
		
		mostrarBtnMantenimiento();
		btnModificacion.setEnabled(false);
		ocultarCRUD();
		btnCambiar.setVisible(true);
		txtCodigo.setVisible(true);
		txtCodigo.setText("");
		btnBuscar.setVisible(true);
		limpiar();
		txtCodigo.setEditable(true);
		mostrarTxt();
		JOptionPane.showMessageDialog(null, "seleccione de la tabla para modificar", "Información", JOptionPane.INFORMATION_MESSAGE);
	}
	
	protected void actionPerformedBtnConsulta(ActionEvent e) {
		
		mostrarBtnMantenimiento();
		btnConsulta.setEnabled(false);
		ocultarCRUD();
		btnBuscar.setVisible(true);
		limpiar();
		txtCodigo.setEditable(true);
		txtCodigo.setText("");
	}
	
	protected void actionPerformedBtnEliminacion(ActionEvent e) {
		
		mostrarBtnMantenimiento();
		btnEliminacion.setEnabled(false);
		ocultarCRUD();
		btnEliminar.setVisible(true);
		btnBuscar.setVisible(true);
		limpiar();
		ocultarTxt();
		txtCodigo.setVisible(true);
		txtCodigo.setEditable(true);
		txtCodigo.setText("");
	}
	
	protected void actionPerformedBtnBuscar(ActionEvent e) {
		
		int codigo = Integer.parseInt(txtCodigo.getText());
		
		String datos =  "\nCodigo \t: " + prod.buscar(codigo).getCodigoProducto() +
						"\nProducto \t: " + prod.buscar(codigo).getNombre() +
						"\nPrecio \t: " + prod.buscar(codigo).getPrecio() + 
						"\nStock \t: " + prod.buscar(codigo).getStockActual() +
						"\nStock Minimo \t: " + prod.buscar(codigo).getStockMinimo() +
						"\nStock Maximo \t: " + prod.buscar(codigo).getStockMaximo();;
		
		System.out.println(prod.buscar(codigo));
		JOptionPane.showMessageDialog(null, datos, "Información", JOptionPane.INFORMATION_MESSAGE);
	}
	
	protected void actionPerformedBtnAgregar(ActionEvent e) {
		
		txtCodigo.setEditable(false);
		txtCodigo.setText(""+prod.codigoCorrelativo());
		String nombre = txtNombre.getText();
		double precio = Double.parseDouble(txtPrecio.getText());
		int stockAc = Integer.parseInt(txtStockAct.getText());
		int stockMin = Integer.parseInt(txtStockMin.getText());
		int stockMax = Integer.parseInt(txtStockMax.getText());
		
		prod.adicionar(new Producto(prod.codigoCorrelativo(), stockAc, stockMin, stockMax, nombre, precio));
		listar();
		limpiar();
	}
	
	protected void actionPerformedBtnCambiar(ActionEvent e) {
		
		txtNombre.getText();
		txtPrecio.getText();
		txtStockAct.getText();
		txtStockMin.getText();
		txtStockMax.getText();
	}
	
	protected void actionPerformedBtnEliminar(ActionEvent e) {
		
		int codigo = Integer.parseInt(txtCodigo.getText().trim());
		
		Producto p = prod.buscar(codigo);
				
		if (p != null) {
			int ok = confirmar("¿ Desea eliminar el registro ?");
			
			if (ok == 0) {
				
				prod.eliminar(p);
				listar();
			}
		}
		else
			error("El código " + codigo + " no existe", txtCodigo);
	}
	
	public void mouseClicked(MouseEvent e) {
		
		if (e.getSource() == tblTable) {
			
			mouseClickedTblTable(e);
		}
	}
	
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedTblTable(MouseEvent e) {
		mostrarTxt();
		editarFila();
	}
	
	void editarFila() {
		
		if (prod.tamanio() == 0)
			
			limpiar();
		else {
			
			Producto p = prod.obtener(tblTable.getSelectedRow());
			txtCodigo.setText("" + p.getCodigoProducto());
			txtNombre.setText(p.getNombre());
			txtPrecio.setText("" + p.getPrecio());
			txtStockAct.setText("" + p.getStockActual());
			txtStockMin.setText("" + p.getStockMinimo());
			txtStockMax.setText("" + p.getStockMaximo());
			/*txtDni.setText(x.getDni());
			txtPeso.setText("" + x.getPeso());
			txtEstatura.setText("" + x.getEstatura());
			cboEstadoCivil.setSelectedIndex(x.getEstado());*/
		}
	}
	
	void limpiar() {
		
		txtNombre.setText("");
		txtPrecio.setText("");
		txtStockAct.setText("");
		txtStockMin.setText("");
		txtStockMax.setText("");
	}
	
	void ocultarTxt() {
		
		txtCodigo.setVisible(false);
		txtNombre.setVisible(false);
		txtPrecio.setVisible(false);
		txtStockAct.setVisible(false);
		txtStockMin.setVisible(false);
		txtStockMax.setVisible(false);
	}
	
	void mostrarTxt() {
		
		txtCodigo.setVisible(true);
		txtNombre.setVisible(true);
		txtPrecio.setVisible(true);
		txtStockAct.setVisible(true);
		txtStockMin.setVisible(true);
		txtStockMax.setVisible(true);
	}
	
	void mostrarBtnMantenimiento() {
		
		btnIngreso.setEnabled(true);
		btnModificacion.setEnabled(true);
		btnConsulta.setEnabled(true);
		btnEliminacion.setEnabled(true);
	}
	
	void ocultarCRUD() {
		
		btnAgregar.setVisible(false);
		btnCambiar.setVisible(false);
		btnEliminar.setVisible(false);
	}
	
	void error(String s, JTextField txt) {
		
		mensaje(s);
		txt.setText("");
		txt.requestFocus();
	}
	
	void mensaje(String s) {
		
		JOptionPane.showMessageDialog(this, s, "Información", 0);
	}
	
	int confirmar(String s) {
		
		return JOptionPane.showConfirmDialog(this, s, "Alerta", 0, 1, null);
	}
}
