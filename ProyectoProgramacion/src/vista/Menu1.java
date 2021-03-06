package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Menu1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Menu1() {

		setResizable(false);
		setTitle("Menu");
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\src\\imagenes\\icono.png"));
		setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 308, 329);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnRegistro = new JButton("Registro\r\n");
		btnRegistro.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnRegistro.setBounds(318, 185, 149, 35);
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Registro frame = new Registro();
				frame.setVisible(true);
			}
		});
		contentPane.add(btnRegistro);
		
		JButton btnNewButton = new JButton("Inicio de Sesion\r\n");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnNewButton.setBounds(318, 106, 149, 35);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				InicioSesion frame = new InicioSesion();
				frame.setVisible(true);
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon(".\\src\\imagenes\\rengoku.gif"));
		lblNewLabel.setBounds(0, 0, 308, 329);
		panel.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setIcon(new ImageIcon(".\\src\\imagenes\\fondo_menu1.jpg"));
		lblNewLabel_1.setBounds(310, 0, 167, 329);
		contentPane.add(lblNewLabel_1);
	
	
		
	}
}
