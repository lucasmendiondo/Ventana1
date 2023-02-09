package ventana3;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menuArticulos extends JPanel {
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public menuArticulos() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GESTION DE ARTICULOS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(284, 10, 268, 31);
		add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(28, 57, 849, 284);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo de articulo:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(24, 20, 139, 25);
		panel.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(448, 10, 2, 2);
		panel.add(scrollPane);
		
		JLabel lblNewLabel_2 = new JLabel("Denominacion de articulo:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(24, 55, 164, 25);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Precio:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(24, 90, 56, 25);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Stock:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(298, 90, 56, 25);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Nombre de zona:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(24, 125, 126, 25);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Selecciona el proveedor:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(24, 160, 164, 25);
		panel.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(173, 25, 111, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(198, 60, 262, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(92, 95, 139, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(354, 95, 126, 19);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(149, 130, 201, 19);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cristiano Penaldo", "Iker Cosquillas", "Makelele", "Frenando Alonso"}));
		comboBox.setBounds(198, 164, 201, 21);
		panel.add(comboBox);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(28, 351, 850, 165);
		add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Comprobar si existe");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Se ha pultado el boton COMPROBAR SI EXISTE ");
				textArea.append("\n================================= ");
				textArea.append("\nCodigo tecleado: "+textField.getText());
				textArea.append("\nDenominacion de articulo tecleado: "+textField_1.getText());
				textArea.append("\nPrecio tecleado: "+textField_2.getText());
				textArea.append("\nStock tecleado: "+textField_3.getText());
				textArea.append("\nNombre de zona tecleado: "+textField_4.getText());
				textArea.append("\nProveedor tecleado: "+comboBox.getSelectedItem());
				textArea.append("\n================================= ");
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(406, 20, 164, 25);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Insertar Articulo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Se ha pultado el boton INSERTAR ARTICULO ");
				textArea.append("\n================================= ");
				textArea.append("\nCodigo tecleado: "+textField.getText());
				textArea.append("\nDenominacion de articulo tecleado: "+textField_1.getText());
				textArea.append("\nPrecio tecleado: "+textField_2.getText());
				textArea.append("\nStock tecleado: "+textField_3.getText());
				textArea.append("\nNombre de zona tecleado: "+textField_4.getText());
				textArea.append("\nProveedor tecleado: "+comboBox.getSelectedItem());
				textArea.append("\n================================= ");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(9, 217, 154, 30);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Borrar Articulo");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Se ha pultado el boton BORRAR ARTICULO ");
				textArea.append("\n================================= ");
				textArea.append("\nCodigo tecleado: "+textField.getText());
				textArea.append("\nDenominacion de articulo tecleado: "+textField_1.getText());
				textArea.append("\nPrecio tecleado: "+textField_2.getText());
				textArea.append("\nStock tecleado: "+textField_3.getText());
				textArea.append("\nNombre de zona tecleado: "+textField_4.getText());
				textArea.append("\nProveedor tecleado: "+comboBox.getSelectedItem());
				textArea.append("\n================================= ");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(192, 217, 162, 30);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Modificar Articulo");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Se ha pultado el boton MODIFICAR ARTICULO");
				textArea.append("\n================================= ");
				textArea.append("\nCodigo tecleado: "+textField.getText());
				textArea.append("\nDenominacion de articulo tecleado: "+textField_1.getText());
				textArea.append("\nPrecio tecleado: "+textField_2.getText());
				textArea.append("\nStock tecleado: "+textField_3.getText());
				textArea.append("\nNombre de zona tecleado: "+textField_4.getText());
				textArea.append("\nProveedor tecleado: "+comboBox.getSelectedItem());
				textArea.append("\n================================= ");
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(370, 217, 154, 30);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Visualizar Articulo");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Se ha pultado el boton VISUALIZAR ARTICULO ");
				textArea.append("\n================================= ");
				textArea.append("\nCodigo tecleado: "+textField.getText());
				textArea.append("\nDenominacion de articulo tecleado: "+textField_1.getText());
				textArea.append("\nPrecio tecleado: "+textField_2.getText());
				textArea.append("\nStock tecleado: "+textField_3.getText());
				textArea.append("\nNombre de zona tecleado: "+textField_4.getText());
				textArea.append("\nProveedor tecleado: "+comboBox.getSelectedItem());
				textArea.append("\n================================= ");
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_4.setBounds(546, 217, 175, 30);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Limpiar Pantalla");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Se ha pultado el boton LIMPIAR PANTALLA");
				textArea.append("\n================================= ");
				textArea.append("\nCodigo tecleado: "+textField.getText());
				textArea.append("\nDenominacion de articulo tecleado: "+textField_1.getText());
				textArea.append("\nPrecio tecleado: "+textField_2.getText());
				textArea.append("\nStock tecleado: "+textField_3.getText());
				textArea.append("\nNombre de zona tecleado: "+textField_4.getText());
				textArea.append("\nProveedor tecleado: "+comboBox.getSelectedItem());
				textArea.append("\n================================= ");
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_5.setBounds(476, 164, 154, 25);
		panel.add(btnNewButton_5);

	}
}
