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

public class FalloInicioSesion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FalloInicioSesion frame = new FalloInicioSesion();
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
	public FalloInicioSesion() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\src\\imagenes\\icono.png"));
		setTitle("No se encontro el usuario :c");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton botonMenu = new JButton("Volver a intentar");
		botonMenu.setBounds(374, 274, 135, 27);
		botonMenu.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		botonMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InicioSesion frame = new InicioSesion();
				frame.setVisible(true);
				dispose();
			}
		});
		JButton botonMenu_1 = new JButton("Registrarse");
		botonMenu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Registro frame = new Registro();
				frame.setVisible(true);
				dispose();
			}
		});
		botonMenu_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		botonMenu_1.setBounds(251, 274, 113, 27);
		contentPane.add(botonMenu_1);
		
		contentPane.setLayout(null);
		contentPane.add(botonMenu);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setBounds(0, 0, 245, 328);
		lblNewLabel.setIcon(new ImageIcon(".\\src\\imagenes\\cry.gif"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre o contrase\u00F1a"); /* Nombre o contraseña */
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(274, 11, 223, 60);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("incorrectos :C");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(311, 63, 137, 60);
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(".\\src\\imagenes\\fondo_registro.jpg"));
		lblNewLabel_2.setBounds(245, 0, 272, 329);
		contentPane.add(lblNewLabel_2);
		
	}
}
