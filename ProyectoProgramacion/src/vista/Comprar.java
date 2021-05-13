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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Comprar extends JFrame {

	private JPanel contentPane;
	private JTextField idUsuarioInput;
	private JTextField idMangaInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Comprar frame = new Comprar();
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
	public Comprar() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\src\\imagenes\\icono.png"));
		setTitle("Pago");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		idMangaInput = new JTextField();
		idMangaInput.setColumns(10);
		idMangaInput.setBounds(386, 99, 86, 20);
		panel.add(idMangaInput);
	
		
		JLabel idUsuarioLabel = new JLabel("idUsuario");
		idUsuarioLabel.setForeground(Color.WHITE);
		idUsuarioLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		idUsuarioLabel.setBounds(315, 46, 76, 14);
		panel.add(idUsuarioLabel);
		
		idUsuarioInput = new JTextField();
		idUsuarioInput.setBounds(386, 45, 86, 20);
		panel.add(idUsuarioInput);
		idUsuarioInput.setColumns(10);
		
		JLabel idMangaLabel = new JLabel("idManga");
		
		idMangaLabel.setForeground(Color.WHITE);
		idMangaLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		idMangaLabel.setBounds(315, 100, 76, 14);
		panel.add(idMangaLabel);
		
		JButton insertButton = new JButton("Pagar");
		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String idUsuario = idUsuarioInput.getText();
				String idManga = idMangaInput.getText();
				new controlador.Pagar().insertarPago(idUsuario, idManga);
				CompraRealizada frame = new CompraRealizada();
				frame.setVisible(true);
				dispose();
			}
		});
		insertButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		insertButton.setBounds(446, 266, 100, 23);
		panel.add(insertButton);
		
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setBounds(0, 0, 305, 407);
		lblNewLabel.setIcon(new ImageIcon(".\\src\\imagenes\\rengokugif.gif"));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(".\\src\\imagenes\\fondo_registro.jpg"));
		lblNewLabel_1.setBounds(306, 0, 275, 407);
		panel.add(lblNewLabel_1);
		
		
		// Acciones
		
	
		
		
		
		
	}
}