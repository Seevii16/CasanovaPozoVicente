package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JPasswordField contraseniaInput;
	private JTextField usuarioInput;
	private JTextField emailInput;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				
					Registro frame = new Registro();
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
	public Registro() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Documents\\GitHub\\CasanovaPozoVicente\\ProyectoProgramacion\\src\\imagenes\\icono.png"));
		setTitle("Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		contraseniaInput = new JPasswordField();
		contraseniaInput.setBounds(315, 125, 190, 20);
		panel.add(contraseniaInput);
		contraseniaInput.setColumns(10);
		
		usuarioInput = new JTextField();
		usuarioInput.setBounds(315, 63, 190, 20);
		usuarioInput.setColumns(10);
		panel.add(usuarioInput);
		
		JLabel usuarioLabel = new JLabel("Usuario");
		usuarioLabel.setForeground(Color.WHITE);
		usuarioLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		usuarioLabel.setBounds(315, 46, 76, 14);
		panel.add(usuarioLabel);
		
		JLabel contraseniaLabel = new JLabel("Contrase\u00F1a");
		contraseniaLabel.setForeground(Color.WHITE);
		contraseniaLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		contraseniaLabel.setBounds(315, 100, 76, 14);
		panel.add(contraseniaLabel);
		
		JButton insertButton = new JButton("Siguiente");
		insertButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		insertButton.setBounds(446, 266, 100, 23);
		panel.add(insertButton);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setForeground(Color.WHITE);
		emailLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		emailLabel.setBounds(315, 167, 76, 14);
		panel.add(emailLabel);
		
		emailInput = new JTextField();
		emailInput.setBounds(315, 194, 190, 20);
		emailInput.setColumns(10);
		panel.add(emailInput);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setBounds(0, 0, 305, 407);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\CasanovaPozoVicente\\ProyectoProgramacion\\src\\imagenes\\rengokugif.gif"));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\CasanovaPozoVicente\\ProyectoProgramacion\\src\\imagenes\\fondo_registro.jpg"));
		lblNewLabel_1.setBounds(306, 0, 275, 407);
		panel.add(lblNewLabel_1);
		
		// Acciones
		
	
		
		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = usuarioInput.getText();
				String password = contraseniaInput.getText();
				String email = emailInput.getText();
				new controlador.Login().insertarUsuario(user, password,email);
				
				RegistroCompletado frame = new RegistroCompletado();
				frame.setVisible(true);
				dispose();
				
			}
		});
		
		
	}
}