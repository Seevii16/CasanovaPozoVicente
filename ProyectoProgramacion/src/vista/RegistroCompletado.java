package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class RegistroCompletado extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroCompletado frame = new RegistroCompletado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistroCompletado() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\src\\imagenes\\icono.png"));
		setTitle("Registro completado :D");
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
		
		JLabel lblNewLabel_1 = new JLabel("Te has registrado con \r\n ");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(264, 84, 223, 60);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("exito :D\r\n");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(330, 156, 97, 60);
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(".\\src\\imagenes\\fondo_registro.jpg"));
		lblNewLabel_2.setBounds(245, 0, 272, 329);
		contentPane.add(lblNewLabel_2);
	}
}
