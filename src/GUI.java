import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	private DefaultListModel<String> ListaFCmodel = new DefaultListModel<>();
    private JList<String> ListaFC = new JList<>(ListaFCmodel);
    
    private DefaultListModel<String> ListaFPmodel = new DefaultListModel<>();
    private JList<String> ListaFP = new JList<>(ListaFCmodel);
	
	private static DefaultListModel<fruta> ListaF = new DefaultListModel<>();
	private static JList<fruta> Lista = new JList<>(ListaF);
	Comparator<fruta> comparador = Comparator.comparingInt(fruta::getCantidad);
	Queue<fruta> cola = new PriorityQueue<>(comparador);
	int i;
	
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
		
		JList Lista = new JList();
		Lista.setBounds(117, 77, 208, 254);
		contentPane.add(Lista);
		
		JButton btnMango = new JButton("Mango");
		btnMango.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String c = JOptionPane.showInputDialog("¿Cuántos Mangos quiere?");
				
				try{
					if(!c.isEmpty()){
						int canti = Integer.parseInt(c);
						cola.add(new fruta(canti, "pz. ", "Mangos"));
					}else {
						JOptionPane.showMessageDialog(null, "Tiene que ingresar una cantidad.", "Error", JOptionPane.WARNING_MESSAGE);
						return;
					}
					fruta f = cola.remove();
					ListaF.addElement(f);
					Lista.setModel(ListaF);
					JOptionPane.showMessageDialog(null, "Se agrego a la lista :)");
				}catch (NumberFormatException a){
					JOptionPane.showMessageDialog(null, "Solo puede ingresar números.", "Error", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnMango.setBackground(new Color(255, 255, 128));
		btnMango.setBounds(10, 47, 89, 48);
		contentPane.add(btnMango);
		
		JButton btnSandia = new JButton("Sandia");
		btnSandia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String c = JOptionPane.showInputDialog("¿Cuántas Sandias quiere?");
				
				try{
					if(!c.isEmpty()){
						int canti = Integer.parseInt(c);
						cola.add(new fruta(canti, "pz. ", "Sandias"));
					}else {
						JOptionPane.showMessageDialog(null, "Tiene que ingresar una cantidad.", "Error", JOptionPane.WARNING_MESSAGE);
						return;
					}
					fruta f = cola.remove();
					ListaF.addElement(f);
					Lista.setModel(ListaF);
					JOptionPane.showMessageDialog(null, "Se agrego a la lista :)");
				}catch (NumberFormatException a){
					JOptionPane.showMessageDialog(null, "Solo puede ingresar números.", "Error", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnSandia.setBackground(Color.RED);
		btnSandia.setBounds(10, 106, 89, 48);
		contentPane.add(btnSandia);
		
		JButton btnManzana = new JButton("Manzana");
		btnManzana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String c = JOptionPane.showInputDialog("¿Cuántas Manzanas quiere?");
				
				try{
					if(!c.isEmpty()){
						int canti = Integer.parseInt(c);
						cola.add(new fruta(canti, "pz. ", "Manzanas"));
					}else {
						JOptionPane.showMessageDialog(null, "Tiene que ingresar una cantidad.", "Error", JOptionPane.WARNING_MESSAGE);
						return;
					}
					fruta f = cola.remove();
					ListaF.addElement(f);
					Lista.setModel(ListaF);
					JOptionPane.showMessageDialog(null, "Se agrego a la lista :)");
				}catch (NumberFormatException a){
					JOptionPane.showMessageDialog(null, "Solo puede ingresar números.", "Error", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnManzana.setForeground(Color.WHITE);
		btnManzana.setBackground(new Color(128, 0, 0));
		btnManzana.setBounds(10, 165, 89, 48);
		contentPane.add(btnManzana);
		
		JButton btnUva = new JButton("Uva");
		btnUva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String c = JOptionPane.showInputDialog("¿Cuántas Uvas quiere? 1 pieza = 1 racimo");
				
				try{
					if(!c.isEmpty()){
						int canti = Integer.parseInt(c);
						cola.add(new fruta(canti, "pz. ", "Uvas"));
					}else {
						JOptionPane.showMessageDialog(null, "Tiene que ingresar una cantidad.", "Error", JOptionPane.WARNING_MESSAGE);
						return;
					}
					fruta f = cola.remove();
					ListaF.addElement(f);
					Lista.setModel(ListaF);
					JOptionPane.showMessageDialog(null, "Se agrego a la lista :)");
				}catch (NumberFormatException a){
					JOptionPane.showMessageDialog(null, "Solo puede ingresar números.", "Error", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnUva.setForeground(Color.WHITE);
		btnUva.setBackground(new Color(128, 0, 128));
		btnUva.setBounds(10, 224, 89, 48);
		contentPane.add(btnUva);
		
		JButton btnNaranja = new JButton("Naranja");
		btnNaranja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String c = JOptionPane.showInputDialog("¿Cuántas Naranjas quiere?");
				
				try{
					if(!c.isEmpty()){
						int canti = Integer.parseInt(c);
						cola.add(new fruta(canti, "pz. ", "Naranjas"));
					}else {
						JOptionPane.showMessageDialog(null, "Tiene que ingresar una cantidad.", "Error", JOptionPane.WARNING_MESSAGE);
						return;
					}
					fruta f = cola.remove();
					ListaF.addElement(f);
					Lista.setModel(ListaF);
					JOptionPane.showMessageDialog(null, "Se agrego a la lista :)");
				}catch (NumberFormatException a){
					JOptionPane.showMessageDialog(null, "Solo puede ingresar números.", "Error", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNaranja.setBackground(new Color(255, 128, 64));
		btnNaranja.setBounds(10, 283, 89, 48);
		contentPane.add(btnNaranja);
		
		JButton btnFresa = new JButton("Fresa");
		btnFresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String c = JOptionPane.showInputDialog("¿Cuántas Fresas quiere?");
				
				try{
					if(!c.isEmpty()){
						int canti = Integer.parseInt(c);
						cola.add(new fruta(canti, "pz. ", "Fresas"));
					}else {
						JOptionPane.showMessageDialog(null, "Tiene que ingresar una cantidad.", "Error", JOptionPane.WARNING_MESSAGE);
						return;
					}
					fruta f = cola.remove();
					ListaF.addElement(f);
					Lista.setModel(ListaF);
					JOptionPane.showMessageDialog(null, "Se agrego a la lista :)");
				}catch (NumberFormatException a){
					JOptionPane.showMessageDialog(null, "Solo puede ingresar números.", "Error", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnFresa.setBackground(new Color(255, 128, 128));
		btnFresa.setBounds(10, 342, 89, 48);
		contentPane.add(btnFresa);
		
		JList ListaFC = new JList();
		ListaFC.setBounds(335, 77, 221, 284);
		contentPane.add(ListaFC);
		
		JList ListaFP = new JList();
		ListaFP.setBounds(566, 77, 208, 284);
		contentPane.add(ListaFP);
		
		JButton btnComprado = new JButton("Comprar");
		btnComprado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Object selectedFruta = Lista.getSelectedValue();
                if (selectedFruta == null) {
                    JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fruta.", "Error", 1);
                } else { 
                	JOptionPane.showMessageDialog(null, "Se ha comprado la fruta :)", "Atención", 1);
                    ListaFCmodel.addElement(selectedFruta.toString());
                    ListaFC.setModel(ListaFCmodel);
                    
                    if (ListaF.getSize()!=0) {
                    	ListaF.removeElement(selectedFruta);
    				}
    				Lista.setModel(ListaF);
    				} 
               }
		});
		btnComprado.setToolTipText("Seleccione el elemento y le da click.");
		btnComprado.setForeground(new Color(0, 128, 0));
		btnComprado.setBackground(new Color(128, 255, 128));
		btnComprado.setBounds(167, 342, 103, 23);
		contentPane.add(btnComprado);
		
		JButton btnPendiente = new JButton("Agregar a Pendientes");
		btnPendiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				Object selectedFruta = Lista.getSelectedValue();               
                if (selectedFruta == null) {
                    JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fruta.", "Error", 1);
                } else {
                	JOptionPane.showMessageDialog(null, "Se ha agregado a la lista de pendientes :)", "Atención", 1);
                    ListaFPmodel.addElement(selectedFruta.toString());
                    ListaFP.setModel(ListaFPmodel); 
                    if (ListaF.getSize()!=0) {
                    	ListaF.removeElement(selectedFruta);
    				}
    				Lista.setModel(ListaF);
    			} 
			}
		});
		btnPendiente.setToolTipText("Seleccione el elemento y le da click.");
		btnPendiente.setForeground(new Color(128, 0, 0));
		btnPendiente.setBackground(new Color(255, 255, 128));
		btnPendiente.setBounds(141, 376, 167, 23);
		contentPane.add(btnPendiente);
				
		JButton btnEliminarL = new JButton("Eliminar Lista");
		btnEliminarL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Borra todos los elementos de la lista de frutas compradas
				ListaFCmodel.clear();
				JOptionPane.showMessageDialog(null, "Ha eliminado la lista de Frutas Compradas");
			}
		});
		btnEliminarL.setToolTipText("Dejara la lista en blanco.");
		btnEliminarL.setForeground(Color.RED);
		btnEliminarL.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnEliminarL.setBackground(new Color(255, 128, 128));
		btnEliminarL.setBounds(453, 376, 103, 23);
		contentPane.add(btnEliminarL);
		
		JButton btnEliminarE = new JButton("Eliminar Fruta");
		btnEliminarE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              // Este Boton sirve para eliminar lo seleccionado en la lista, uno por uno
				
			int selectedIndex = ListaFC.getSelectedIndex(); 
		    if (selectedIndex != -1) {
		         ListaFCmodel.removeElementAt(selectedIndex);
		         JOptionPane.showMessageDialog(null, "Ha eliminado una fruta ");
		    }else {
		         JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fruta.");
		        }
			}
		});
		btnEliminarE.setToolTipText("Seleccione el elemento y le da click.");
		btnEliminarE.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnEliminarE.setBackground(new Color(255, 128, 128));
		btnEliminarE.setBounds(335, 376, 108, 23);
		contentPane.add(btnEliminarE);
		
		JLabel lblFrutasC = new JLabel("Frutas compradas");
		lblFrutasC.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrutasC.setForeground(new Color(0, 128, 0));
		lblFrutasC.setFont(new Font("Yu Gothic", Font.ITALIC, 18));
		lblFrutasC.setBounds(348, 47, 183, 40);
		contentPane.add(lblFrutasC);
		
		JLabel lblFrutasP = new JLabel("Frutas pendientes");
		lblFrutasP.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrutasP.setForeground(Color.RED);
		lblFrutasP.setFont(new Font("Yu Gothic", Font.ITALIC, 18));
		lblFrutasP.setBounds(578, 47, 183, 40);
		contentPane.add(lblFrutasP);
		
		
		JButton btnComprado1 = new JButton("Comprar");
		btnComprado1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				Object selectedFruta = ListaFP.getSelectedValue();
                if (selectedFruta == null) {
                    JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fruta.", "Error", 1);
                } else {
                	JOptionPane.showMessageDialog(null, "Se ha comprado la fruta :)", "Atención ", 1);
                    ListaFCmodel.addElement(selectedFruta.toString());
                    ListaFC.setModel(ListaFCmodel);
                    
                    if (ListaFPmodel.getSize()!=0) {
                    	ListaFPmodel.removeElement(selectedFruta);
    				}
    				ListaFP.setModel(ListaFPmodel);
    				} 
			}
		});
		btnComprado1.setToolTipText("Seleccione el elemento y le da click.");
		btnComprado1.setForeground(new Color(0, 128, 0));
		btnComprado1.setBackground(new Color(128, 255, 128));
		btnComprado1.setBounds(566, 376, 89, 23);
		contentPane.add(btnComprado1);
		
		JButton btnEliminarE_1 = new JButton("Eliminar Fruta");
		btnEliminarE_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Boton para eliminar las frutas seleccionadas de la lista de pendientes
				int selectedIndex = ListaFP.getSelectedIndex(); 
			    if (selectedIndex != -1) {
			         ListaFPmodel.removeElementAt(selectedIndex);
			         JOptionPane.showMessageDialog(null, "Ha eliminado una fruta de los pendientes.");
			    }else {
			         JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fruta.");
			        }
				
			}
		});
		btnEliminarE_1.setToolTipText("Seleccione el elemento y le da click.");
		btnEliminarE_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnEliminarE_1.setBackground(new Color(255, 128, 128));
		btnEliminarE_1.setBounds(665, 376, 111, 23);
		contentPane.add(btnEliminarE_1);
	}
}
