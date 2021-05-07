package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Kimetsu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kimetsu frame = new Kimetsu();
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
	public Kimetsu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Documents\\GitHub\\CasanovaPozoVicente\\ProyectoProgramacion\\src\\imagenes\\icono.png"));
		setTitle("Kimetsu no Yaiba");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 694, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\CasanovaPozoVicente\\ProyectoProgramacion\\src\\imagenes\\Kimetsu_no_Yaiba_2.png"));
		lblNewLabel.setBounds(0, 0, 279, 414);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\CasanovaPozoVicente\\ProyectoProgramacion\\src\\imagenes\\fondo_mainMenu.jpg"));
		lblNewLabel_1.setBounds(281, 0, 397, 414);
		contentPane.add(lblNewLabel_1);
	}
}
