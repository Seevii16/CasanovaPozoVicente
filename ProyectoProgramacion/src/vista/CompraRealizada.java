package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CompraRealizada extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public CompraRealizada() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\src\\imagenes\\icono.png"));
		setTitle("Compra realizada con exito :D");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton botonMenu = new JButton("Siguiente\r\n");
		botonMenu.setBounds(396, 274, 97, 27);
		botonMenu.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		botonMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu frame = new MainMenu();
				frame.setVisible(true);
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(botonMenu);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setBounds(0, 0, 241, 329);
		lblNewLabel.setIcon(new ImageIcon(".\\src\\imagenes\\dance.gif"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("La compra ha sido realizada\r\n ");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(264, 84, 241, 60);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("con exito :D\r\n");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(330, 156, 97, 60);
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(".\\src\\imagenes\\fondo_registro.jpg"));
		lblNewLabel_2.setBounds(245, 0, 272, 329);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setBounds(302, 26, 46, 14);
		contentPane.add(lblNewLabel_3);
	}
}
