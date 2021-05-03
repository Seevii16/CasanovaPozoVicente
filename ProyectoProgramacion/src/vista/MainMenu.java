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
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Toolkit;

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
		setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		setTitle("MenuPrincipal");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Documents\\GitHub\\CasanovaPozoVicente\\ProyectoProgramacion\\src\\imagenes\\icono.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 739, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		/*Image icon = Toolkit.getDefaultToolkit().getImage("src\imagenes\icon.png"); 
        frame.setIconImage(icon); */
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(173, 55, 540, 375);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\CasanovaPozoVicente\\ProyectoProgramacion\\src\\imagenes\\Kimetsu_no_Yaiba.png"));
		btnNewButton_2.setBounds(10, 11, 144, 229);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Kimetsu no Yaiba");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(30, 241, 108, 14);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\CasanovaPozoVicente\\ProyectoProgramacion\\src\\imagenes\\One Piece.png"));
		btnNewButton_2_1.setBounds(164, 11, 144, 229);
		panel_1.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("         One Piece");
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(174, 241, 108, 14);
		panel_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton_2_2 = new JButton("");
		btnNewButton_2_2.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\CasanovaPozoVicente\\ProyectoProgramacion\\src\\imagenes\\dragon_ball_super.jpg"));
		btnNewButton_2_2.setBounds(318, 11, 144, 229);
		panel_1.add(btnNewButton_2_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Dragon Ball Super");
		lblNewLabel_1_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblNewLabel_1_1_1.setBounds(342, 241, 120, 14);
		panel_1.add(lblNewLabel_1_1_1);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 204, 255));
		panel_2.setBounds(173, 0, 550, 44);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
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
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Shonen frame = new Shonen();
				frame.setVisible(true);
			}
		});
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
