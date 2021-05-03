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

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField contraseniaInput;
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
		
		contraseniaInput = new JTextField();
		contraseniaInput.setBounds(115, 124, 190, 20);
		panel.add(contraseniaInput);
		contraseniaInput.setColumns(10);
		
		usuarioInput = new JTextField();
		usuarioInput.setColumns(10);
		usuarioInput.setBounds(115, 62, 190, 20);
		panel.add(usuarioInput);
		
		JLabel usuarioLabel = new JLabel("Usuario");
		usuarioLabel.setBounds(115, 37, 46, 14);
		panel.add(usuarioLabel);
		
		JLabel contraseniaLabel = new JLabel("Contrase\u00F1a");
		contraseniaLabel.setBounds(115, 99, 76, 14);
		panel.add(contraseniaLabel);
		
		JButton insertButton = new JButton("Siguiente");
		insertButton.setBounds(399, 268, 89, 23);
		panel.add(insertButton);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setBounds(115, 170, 76, 14);
		panel.add(emailLabel);
		
		emailInput = new JTextField();
		emailInput.setColumns(10);
		emailInput.setBounds(115, 195, 190, 20);
		panel.add(emailInput);
		
		// Acciones
		
	
		
		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = usuarioInput.getText();
				String password = contraseniaInput.getText();
				String email = emailInput.getText();
				new controlador.Login().insertarUsuario(user, password,email);
				
				MainMenu frame = new MainMenu();
				frame.setVisible(true);
				
			}
		});
		
		
	}
}