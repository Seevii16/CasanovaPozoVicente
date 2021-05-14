package vista.Generos;

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

import beans.Manga;
import vista.InicioSesion;

import vista.Generos.Mangas.Hunter;
import vista.Generos.Mangas.Fullmetal;
import vista.Generos.Mangas.Shingeki;


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
		
		JButton botonShonen = new JButton("Shonen\r\n");
		botonShonen.setBackground(Color.RED);
		botonShonen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Shonen frame = new Shonen();
				frame.setVisible(true);
			}
		});
		botonShonen.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		botonShonen.setBounds(22, 82, 164, 57);
		contentPane.add(botonShonen);
		JButton botonShojo = new JButton("Shojo\r\n");
		botonShojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		botonShojo.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		botonShojo.setBounds(22, 152, 164, 57);
		contentPane.add(botonShojo);
		
		JButton botonSeinen = new JButton("Seinen\r\n");
		botonSeinen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			}
		});
		botonSeinen.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		botonSeinen.setBounds(22, 220, 164, 57);
		contentPane.add(botonSeinen);
		
		JButton botonTerror = new JButton("Terror");
		botonTerror.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		botonTerror.setBounds(22, 286, 164, 57);
		contentPane.add(botonTerror);
		
		JButton botonComedia = new JButton("Comedia\r\n");
		botonComedia.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		botonComedia.setBounds(22, 354, 164, 57);
		contentPane.add(botonComedia);
		
		JButton botonFullmetal = new JButton("");
		botonFullmetal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String titulo = "Fullmetal Alchemist";
				Manga manga = new controlador.MangaInfo().getMangaInfo(titulo);
				Fullmetal frame = new Fullmetal(manga);
				frame.setVisible(true);
			}
		});
		botonFullmetal.setIcon(new ImageIcon(".\\src\\imagenes\\fullmetal.jpg"));
		botonFullmetal.setBounds(206, 82, 141, 222);
		contentPane.add(botonFullmetal);
		
		JButton botonHunter = new JButton("");
		botonHunter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String titulo = "Hunter x Hunter";
				Manga manga = new controlador.MangaInfo().getMangaInfo(titulo);
				Hunter frame = new Hunter(manga);
				frame.setVisible(true);
			}
		});
		botonHunter.setIcon(new ImageIcon(".\\src\\imagenes\\hunter_x_hunter.jpg"));
		botonHunter.setBounds(368, 82, 141, 222);
		contentPane.add(botonHunter);
		
		JButton botonShingeki = new JButton("");
		botonShingeki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String titulo = "Shingeki no Kyojin";
				Manga manga = new controlador.MangaInfo().getMangaInfo(titulo);
				Shingeki frame = new Shingeki(manga);
				frame.setVisible(true);
			}
		});
		botonShingeki.setIcon(new ImageIcon(".\\src\\imagenes\\shingeki-no-kyojin.jpg"));
		botonShingeki.setBounds(531, 82, 141, 222);
		contentPane.add(botonShingeki);
		
		JLabel lblNewLabel_1_2 = new JLabel("Fullmetal Alchemist");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(216, 286, 151, 57);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Hunter x Hunter");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2_1.setBounds(378, 286, 131, 57);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Shingeki no Kyojin\r\n");
		lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2_1_1.setBounds(541, 286, 131, 57);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Generos\r\n");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(24, 26, 162, 57);
		contentPane.add(lblNewLabel_1);
		
		JLabel UsuarioNombre = new JLabel("");
		UsuarioNombre.setForeground(Color.WHITE);
		UsuarioNombre.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		UsuarioNombre.setBounds(452, 40, 197, 23);
		contentPane.add(UsuarioNombre);
		
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
