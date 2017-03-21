package univel.br;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;

public class Ex02 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex02 frame = new Ex02();
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
	public Ex02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(new JPanel(){
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				Graphics2D g2 = (Graphics2D)g;
				
				int w = getWidth();
				int h = getHeight();
				
				int x = (w / 2);
				int y = (h / 2);
				
				g2.drawLine(w / 2, 0, w / 2, h);
				g2.drawLine(0, 0, x - 10, h);
				g2.drawLine(x + 10, h, w, 0);
				g2.drawLine(w, y, 0, h);
				
				g2.dispose();
			}
		});
	}

}