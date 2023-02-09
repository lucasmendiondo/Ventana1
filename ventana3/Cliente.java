package ventana3;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Cliente extends JPanel {

	/**
	 * Create the panel.
	 */
	public Cliente() {
		
setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INFORME DE CLIENTES");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(28, 20, 284, 25);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Selecciona el cliente a visualizar:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(10, 84, 160, 32);
		add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cristiano Penaldo", "Iker Cosquillas", "Makelele", "Frenando Alonso"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBounds(170, 84, 142, 29);
		add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 166, 366, 124);
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
		btnNewButton.setBounds(272, 42, 178, 32);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ver Detalle del Cliente");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(262, 124, 178, 32);
		add(btnNewButton_1);

	}

}