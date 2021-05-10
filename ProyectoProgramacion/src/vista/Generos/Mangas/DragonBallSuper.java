package vista.Generos.Mangas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DragonBallSuper extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DragonBallSuper frame = new DragonBallSuper();
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
	public DragonBallSuper() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\src\\imagenes\\icono.png"));
		setTitle("DragonBallSuper");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 694, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\CasanovaPozoVicente\\ProyectoProgramacion\\src\\imagenes\\dragon_ball_super.jpg"));
		lblNewLabel.setBounds(0, 0, 279, 414);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setIcon(new ImageIcon(".\\src\\imagenes\\fondo_mainMenu.jpg"));
		lblNewLabel_1.setBounds(281, 0, 397, 414);
		contentPane.add(lblNewLabel_1);
	}
}
