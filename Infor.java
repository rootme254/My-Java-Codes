


import java.awt.Font;

import javax.swing.*;

public class Infor extends  JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JTextArea ja = new JTextArea();

	JScrollPane scrol= new JScrollPane(ja);  
	
	String passwrd;
	
	public Infor() {
		
		passwrd =JOptionPane.showInputDialog(this,"Enter Password");
		scrol.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrol.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		if (passwrd.equalsIgnoreCase("atlas")) {
			
			
			ja.setText("For Alpharama rate is = 0.3% Inc of War,Marine and srcc \n"
					+ "For Simba rate = 0.25% Inc of War,Marine and srcc \n"+
					"For Northstar rate =0.35% inc of Marine and War\n"
					+
					"If shipment is by flight click on checkbox 'Destination via jkia' AFTER clicking Calculte button "
					+"If by Air transport 'Place Of Shipment' =.... else put port of loading"
					
					);	
			
			
			ja.setLineWrap(true);
		    ja.setWrapStyleWord(true);
			ja.setEditable(false);
			ja.setFont(new Font("Arial", Font.BOLD, 16));
		}
		
		else
		{
			JOptionPane.showMessageDialog(this,"NOT ALLOWED TO VIEW!!!!!","Alert",JOptionPane.WARNING_MESSAGE);
			
			ja.setVisible(false);
			ja.setEditable(false);
			this.dispose();	
		
		}   
		
		add(scrol);	

		
		setLocationRelativeTo(this);
		setTitle("INFORMATION");
		setVisible(true);
		setSize(600,400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
		
	}
	
}
