package vista.Generos.Mangas;
import beans.Manga;

import controlador.*;
import modelo.Mangas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Kimetsu extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Kimetsu(Manga manga) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\src\\imagenes\\icono.png"));
		setTitle("Kimetsu no Yaiba");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 694, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel mangaTitulo = new JLabel("");
		mangaTitulo.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		mangaTitulo.setForeground(Color.WHITE);
		
		mangaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		mangaTitulo.setBounds(289, 66, 379, 260);
		contentPane.add(mangaTitulo);
		mangaTitulo.setText(manga.getDescripcion());
		
		
		JLabel lblNewLabel_2 = new JLabel("Kimetsu no Yaiba");
		lblNewLabel_2.setBounds(422, 21, 193, 34);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_2);
		
	
		
		JButton btnComprar = new JButton("Comprar\r\n");
		btnComprar.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnComprar.setBounds(509, 371, 159, 23);
		contentPane.add(btnComprar);
		
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setBounds(0, 0, 279, 414);
		lblNewLabel.setIcon(new ImageIcon(".\\src\\imagenes\\Kimetsu_no_Yaiba_2.png"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setBounds(289, 0, 397, 414);
		lblNewLabel_1.setIcon(new ImageIcon(".\\src\\imagenes\\fondo_mainMenu.jpg"));
		contentPane.add(lblNewLabel_1);
		

	
		
		
	}
}

