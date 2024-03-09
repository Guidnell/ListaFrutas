import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Lista de Frutas");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 22));
		lblTitulo.setBounds(292, 11, 195, 36);
		contentPane.add(lblTitulo);
		
		JButton btnNewButton = new JButton("Mango");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 128));
		btnNewButton.setBounds(10, 47, 89, 48);
		contentPane.add(btnNewButton);
		
		JButton btnSandia = new JButton("Sandia");
		btnSandia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSandia.setBackground(Color.RED);
		btnSandia.setBounds(10, 106, 89, 48);
		contentPane.add(btnSandia);
		
		JButton btnManzana = new JButton("Manzana");
		btnManzana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnManzana.setForeground(Color.WHITE);
		btnManzana.setBackground(new Color(128, 0, 0));
		btnManzana.setBounds(10, 165, 89, 48);
		contentPane.add(btnManzana);
		
		JButton btnUva = new JButton("Uva");
		btnUva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUva.setForeground(Color.WHITE);
		btnUva.setBackground(new Color(128, 0, 128));
		btnUva.setBounds(10, 224, 89, 48);
		contentPane.add(btnUva);
		
		JButton btnNaranja = new JButton("Naranja");
		btnNaranja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNaranja.setBackground(new Color(255, 128, 64));
		btnNaranja.setBounds(10, 283, 89, 48);
		contentPane.add(btnNaranja);
		
		JButton btnFresa = new JButton("Fresa");
		btnFresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFresa.setBackground(new Color(255, 128, 128));
		btnFresa.setBounds(10, 342, 89, 48);
		contentPane.add(btnFresa);
		
		JButton btnComprado = new JButton("Comprado");
		btnComprado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnComprado.setToolTipText("Seleccione el elemento y le da click.");
		btnComprado.setForeground(new Color(0, 128, 0));
		btnComprado.setBackground(new Color(128, 255, 128));
		btnComprado.setBounds(117, 342, 103, 23);
		contentPane.add(btnComprado);
		
		JButton btnPendiente = new JButton("Pendiente");
		btnPendiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPendiente.setToolTipText("Seleccione el elemento y le da click.");
		btnPendiente.setForeground(new Color(128, 0, 0));
		btnPendiente.setBackground(new Color(255, 255, 128));
		btnPendiente.setBounds(230, 342, 95, 23);
		contentPane.add(btnPendiente);
		
		JList Lista = new JList();
		Lista.setBounds(117, 47, 208, 284);
		contentPane.add(Lista);
		
		JList ListaFC = new JList();
		ListaFC.setBounds(348, 77, 208, 284);
		contentPane.add(ListaFC);
		
		JButton btnNewButton_1 = new JButton("Eliminar Lista");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setToolTipText("Dejara la lista en blanco.");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.setBackground(new Color(255, 128, 128));
		btnNewButton_1.setBounds(348, 378, 103, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Eliminar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setToolTipText("Seleccione el elemento y le da click.");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1_1.setBackground(new Color(255, 128, 128));
		btnNewButton_1_1.setBounds(461, 378, 95, 23);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblFrutasC = new JLabel("Frutas compradas");
		lblFrutasC.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrutasC.setForeground(new Color(0, 128, 0));
		lblFrutasC.setFont(new Font("Yu Gothic", Font.ITALIC, 18));
		lblFrutasC.setBounds(359, 47, 183, 40);
		contentPane.add(lblFrutasC);
		
		JLabel lblFrutasP = new JLabel("Frutas pendientes");
		lblFrutasP.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrutasP.setForeground(Color.RED);
		lblFrutasP.setFont(new Font("Yu Gothic", Font.ITALIC, 18));
		lblFrutasP.setBounds(578, 47, 183, 40);
		contentPane.add(lblFrutasP);
		
		JList ListaFP = new JList();
		ListaFP.setBounds(566, 77, 208, 284);
		contentPane.add(ListaFP);
		
		JButton btnComprado1 = new JButton("Comprado");
		btnComprado1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnComprado1.setToolTipText("Seleccione el elemento y le da click.");
		btnComprado1.setForeground(new Color(0, 128, 0));
		btnComprado1.setBackground(new Color(128, 255, 128));
		btnComprado1.setBounds(618, 376, 109, 23);
		contentPane.add(btnComprado1);
	}
}