package vista.Generos.Mangas;

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

import vista.InicioSesion;

public class Shonen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shonen frame = new Shonen();
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
	
		public Shonen() {
			setResizable(false);
			setIconImage(Toolkit.getDefaultToolkit().getImage(".\\src\\imagenes\\icono.png"));
			setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
			setTitle("Shonen");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(100, 100, 701, 466);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton btnNewButton = new JButton("Shonen\r\n");
			btnNewButton.setBackground(new Color(255, 0, 0));
			btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
			btnNewButton.setBounds(22, 82, 164, 57);
			contentPane.add(btnNewButton);
			JButton btnNewButton_1 = new JButton("Shojo\r\n");
			btnNewButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
			btnNewButton_1.setBounds(22, 152, 164, 57);
			contentPane.add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("Seinen\r\n");
			btnNewButton_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
			btnNewButton_2.setBounds(22, 220, 164, 57);
			contentPane.add(btnNewButton_2);
			
			JButton btnNewButton_1_1 = new JButton("Terror");
			btnNewButton_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
			btnNewButton_1_1.setBounds(22, 286, 164, 57);
			contentPane.add(btnNewButton_1_1);
			
			JButton btnNewButton_2_1 = new JButton("Comedia\r\n");
			btnNewButton_2_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
			btnNewButton_2_1.setBounds(22, 354, 164, 57);
			contentPane.add(btnNewButton_2_1);
			
			JButton btnNewButton_3 = new JButton("");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				
				}
			});
			btnNewButton_3.setIcon(new ImageIcon(".\\src\\imagenes\\fullmetal.jpg"));
			btnNewButton_3.setBounds(196, 82, 141, 222);
			contentPane.add(btnNewButton_3);
			
			JButton btnNewButton_3_1 = new JButton("");
			btnNewButton_3_1.setIcon(new ImageIcon(".\\src\\imagenes\\hunter_x_hunter.jpg"));
			btnNewButton_3_1.setBounds(368, 82, 141, 222);
			contentPane.add(btnNewButton_3_1);
			
			JButton btnNewButton_3_2 = new JButton("");
			btnNewButton_3_2.setIcon(new ImageIcon(".\\src\\imagenes\\shingeki-no-kyojin.jpg"));
			btnNewButton_3_2.setBounds(531, 82, 141, 222);
			contentPane.add(btnNewButton_3_2);
			
			JLabel lblNewLabel_1_2 = new JLabel("Fullmetal Alchemist");
			lblNewLabel_1_2.setForeground(Color.WHITE);
			lblNewLabel_1_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
			lblNewLabel_1_2.setBounds(196, 286, 141, 57);
			contentPane.add(lblNewLabel_1_2);
			
			JLabel lblNewLabel_1_2_1 = new JLabel("Hunter x Hunter\r\n");
			lblNewLabel_1_2_1.setForeground(Color.WHITE);
			lblNewLabel_1_2_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
			lblNewLabel_1_2_1.setBounds(378, 286, 131, 57);
			contentPane.add(lblNewLabel_1_2_1);
			
			JLabel lblNewLabel_1_2_1_1 = new JLabel("Shingeki no Kyojin");
			lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_2_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
			lblNewLabel_1_2_1_1.setBounds(541, 286, 131, 57);
			contentPane.add(lblNewLabel_1_2_1_1);
			
			JLabel lblNewLabel_1 = new JLabel("Generos\r\n");
			lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setBounds(24, 26, 162, 57);
			contentPane.add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_1 = new JLabel("Shonen");
			lblNewLabel_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
			lblNewLabel_1_1.setBounds(196, 26, 489, 57);
			contentPane.add(lblNewLabel_1_1);
			
			
			
			JButton btnNewButton_4 = new JButton("Cambiar de usuario\r\n");
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					InicioSesion frame = new InicioSesion();
					frame.setVisible(true);
					dispose();
				}
			});
			btnNewButton_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
			btnNewButton_4.setBounds(517, 388, 155, 23);
			contentPane.add(btnNewButton_4);
			
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(".\\src\\imagenes\\fondo_mainMenu.jpg"));
			lblNewLabel.setBounds(0, 0, 705, 437);
			contentPane.add(lblNewLabel);
			
			
			
			
		}
	}
