package ventana3;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menuCliente extends JPanel {

	/**
	 * Create the panel.
	 */
	public menuCliente() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INFORME DE CLIENTES");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(113, 20, 284, 25);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Selecciona el cliente a visualizar:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 84, 203, 32);
		add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cristiano Penaldo", "Iker Cosquillas", "Makelele", "Frenando Alonso"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBounds(208, 86, 178, 29);
		add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 166, 447, 177);
		add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Ver Informe Global");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Has pulsado el botón VER INFORME GLOBAL");
				textArea.append("\nCliente seleccionado: "+comboBox.getSelectedItem());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(407, 18, 178, 32);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ver Detalle del Cliente");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Has pulsado el botón VER DETALE DEL CLIENTE");
				textArea.append("\nCliente seleccionado: "+comboBox.getSelectedItem());
			}
		});
		btnNewButton_1.setBounds(407, 124, 178, 32);
		add(btnNewButton_1);

	}

}
