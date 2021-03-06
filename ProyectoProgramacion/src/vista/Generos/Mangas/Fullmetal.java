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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import beans.Manga;
import vista.Comprar;

public class Fullmetal extends JFrame {

	private JPanel contentPane;

	
	public Fullmetal(Manga manga) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\src\\imagenes\\icono.png"));
		setTitle("Fullmetal Alchemist");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 694, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel mangaDescripcion = new JLabel("");
		mangaDescripcion.setVerticalAlignment(SwingConstants.TOP);
		mangaDescripcion.setHorizontalAlignment(SwingConstants.TRAILING);
		mangaDescripcion.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mangaDescripcion.setForeground(Color.WHITE);
		mangaDescripcion.setBounds(289, 116, 389, 244);
		contentPane.add(mangaDescripcion);
		mangaDescripcion.setText("<html>"+manga.getDescripcion()+"</html>");
	
		
		JLabel mangaPrecio = new JLabel("\r\n");
		String precio = String.valueOf(manga.getPrecio());
		mangaPrecio.setForeground(Color.WHITE);
		mangaPrecio.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		mangaPrecio.setBounds(299, 371, 97, 23);
		contentPane.add(mangaPrecio);
		mangaPrecio.setText("Precio="+precio);
		
		JLabel mangaId = new JLabel("");
		mangaId.setHorizontalAlignment(SwingConstants.RIGHT);
		mangaId.setForeground(Color.WHITE);
		mangaId.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		mangaId.setBounds(536, 70, 132, 26);
		contentPane.add(mangaId);
		mangaId.setText("ID= "+manga.getIdManga());
		
		JLabel mangaGenero = new JLabel("");
		mangaGenero.setForeground(Color.WHITE);
		mangaGenero.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		mangaGenero.setBounds(292, 61, 252, 44);
		contentPane.add(mangaGenero);
		mangaGenero.setText("Genero= "+manga.getGenero());
		
		JLabel mangaTitulo = new JLabel("");
		mangaTitulo.setBounds(422, 21, 193, 34);
		mangaTitulo.setForeground(Color.WHITE);
		mangaTitulo.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		contentPane.add(mangaTitulo);
		mangaTitulo.setText(manga.getTitulo());
	
		
		JButton btnComprar = new JButton("Comprar\r\n");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Comprar frame = new Comprar();
				frame.setVisible(true);
				
			}
		});
		btnComprar.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnComprar.setBounds(509, 371, 159, 23);
		contentPane.add(btnComprar);
		
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setBounds(0, 0, 279, 414);
		lblNewLabel.setIcon(new ImageIcon(".\\src\\imagenes\\fullmetal2.jpg"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setBounds(289, 0, 397, 414);
		lblNewLabel_1.setIcon(new ImageIcon(".\\src\\imagenes\\fondo_mainMenu.jpg"));
		contentPane.add(lblNewLabel_1);
		
		
		

	
		
		
	}
}
