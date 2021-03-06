package vista;
import vista.Generos.*;
import modelo.Mangas;
import controlador.MangaInfo;
import beans.Manga;
import vista.Generos.Mangas.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Manga;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public MainMenu() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\src\\imagenes\\icono.png"));
		setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 701, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botonShonen = new JButton("Shonen\r\n");
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
		
		JButton botonKimetsu = new JButton("");
		botonKimetsu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String titulo = "Kimetsu No Yaiba";
				Manga manga = new controlador.MangaInfo().getMangaInfo(titulo);
				Kimetsu frame = new Kimetsu(manga);
				frame.setVisible(true);
			}
		});
		botonKimetsu.setIcon(new ImageIcon(".\\src\\imagenes\\Kimetsu_no_Yaiba.png"));
		botonKimetsu.setBounds(206, 82, 141, 222);
		contentPane.add(botonKimetsu);
		
		JButton btnNewButton_3_1 = new JButton("");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String titulo = "One Piece";
				Manga manga = new controlador.MangaInfo().getMangaInfo(titulo);
				OnePiece frame = new OnePiece(manga);
				frame.setVisible(true);
			}
		});
		btnNewButton_3_1.setIcon(new ImageIcon(".\\src\\imagenes\\One Piece.png"));
		btnNewButton_3_1.setBounds(368, 82, 141, 222);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String titulo = "Dragon ball Super";
				Manga manga = new controlador.MangaInfo().getMangaInfo(titulo);
				DragonBallSuper frame = new DragonBallSuper(manga);
				frame.setVisible(true);
			}
		});
		btnNewButton_3_2.setIcon(new ImageIcon(".\\src\\imagenes\\dragon_ball_super.jpg"));
		btnNewButton_3_2.setBounds(531, 82, 141, 222);
		contentPane.add(btnNewButton_3_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Kimetsu no yaiba\r\n");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(216, 286, 131, 57);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("One Piece\r\n");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2_1.setBounds(402, 286, 85, 57);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Dragon ball Super\r\n");
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
		
		JLabel lblNewLabel_1_1 = new JLabel("Mangas Populares");
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
