package univel.br;

	import java.awt.BorderLayout;
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import java.awt.GridBagLayout;
	import javax.swing.JButton;
	import java.awt.GridBagConstraints;
	import javax.swing.JScrollPane;
	import java.awt.Insets;
	import javax.swing.JTable;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;

	public class Ex01Principal extends JFrame {

		private JPanel contentPane;
		private JTable table;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Ex01Principal frame = new Ex01Principal();
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
		public Ex01Principal() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 581, 434);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			GridBagLayout gbl_contentPane = new GridBagLayout();
			gbl_contentPane.columnWidths = new int[]{0, 0, 0};
			gbl_contentPane.rowHeights = new int[]{0, 0, 0};
			gbl_contentPane.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
			gbl_contentPane.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
			contentPane.setLayout(gbl_contentPane);
			
			JButton btnBotao = new JButton("Botao");
			btnBotao.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String ra = "169978";
					table.setModel(new Ex02Model(ra));
				}
			});
			GridBagConstraints gbc_btnBotao = new GridBagConstraints();
			gbc_btnBotao.gridwidth = 2;
			gbc_btnBotao.fill = GridBagConstraints.VERTICAL;
			gbc_btnBotao.anchor = GridBagConstraints.WEST;
			gbc_btnBotao.insets = new Insets(0, 0, 5, 5);
			gbc_btnBotao.gridx = 0;
			gbc_btnBotao.gridy = 0;
			contentPane.add(btnBotao, gbc_btnBotao);
			
			JScrollPane scrollPane = new JScrollPane();
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.gridwidth = 2;
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 0;
			gbc_scrollPane.gridy = 1;
			contentPane.add(scrollPane, gbc_scrollPane);
			
			table = new JTable();
			scrollPane.setViewportView(table);
		}

	}