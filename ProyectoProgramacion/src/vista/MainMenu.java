package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 739, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(173, 55, 540, 375);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(35, 35, 144, 132);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("New button");
		btnNewButton_2_1.setBounds(202, 35, 144, 132);
		panel_1.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("New button");
		btnNewButton_2_2.setBounds(366, 35, 144, 132);
		panel_1.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("New button");
		btnNewButton_2_3.setBounds(35, 198, 144, 132);
		panel_1.add(btnNewButton_2_3);
		
		JButton btnNewButton_2_1_1 = new JButton("New button");
		btnNewButton_2_1_1.setBounds(202, 198, 144, 132);
		panel_1.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_2_1 = new JButton("New button");
		btnNewButton_2_2_1.setBounds(366, 198, 144, 132);
		panel_1.add(btnNewButton_2_2_1);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 204, 255));
		panel_2.setBounds(173, 0, 550, 44);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Inicio Sesion");
		btnNewButton.setBackground(new Color(51, 204, 51));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnNewButton.setBounds(300, 0, 115, 33);
		panel_2.add(btnNewButton);
		
		JButton btnRegistro = new JButton("Registro");
		btnRegistro.setBackground(new Color(51, 204, 51));
		btnRegistro.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnRegistro.setBounds(425, 0, 115, 33);
		panel_2.add(btnRegistro);
		
		JLabel lblMangasPopulares = new JLabel("      Mangas Populares");
		lblMangasPopulares.setBackground(new Color(153, 204, 255));
		lblMangasPopulares.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblMangasPopulares.setBounds(10, 11, 154, 22);
		panel_2.add(lblMangasPopulares);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 204, 255));
		panel.setBounds(10, 0, 153, 44);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("          Generos");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 11, 133, 22);
		panel.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(204, 255, 255));
		panel_3.setBounds(10, 55, 153, 375);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Shonen");
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnNewButton_1.setBounds(10, 11, 133, 39);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Shoujo");
		btnNewButton_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnNewButton_1_1.setBounds(10, 61, 133, 39);
		panel_3.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Seinen");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnNewButton_1_2.setBounds(10, 111, 133, 39);
		panel_3.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_1 = new JButton("Isekai");
		btnNewButton_1_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnNewButton_1_1_1.setBounds(10, 161, 133, 39);
		panel_3.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Terror");
		btnNewButton_1_1_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnNewButton_1_1_1_1.setBounds(10, 261, 133, 39);
		panel_3.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("Comedia");
		btnNewButton_1_2_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnNewButton_1_2_1.setBounds(10, 211, 133, 39);
		panel_3.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("Drama");
		btnNewButton_1_1_1_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnNewButton_1_1_1_1_1.setBounds(10, 311, 133, 39);
		panel_3.add(btnNewButton_1_1_1_1_1);
	}
}
