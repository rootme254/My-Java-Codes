
import java.awt.EventQueue;
import java.math.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DemoFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField si;
	private JTextField mw;
	private JTextField st;
	private JTextField sd;
	private JTextField lp;
	private JTextField tlp;
	private JTextField m;
	private JTextField w;
	private JTextField l;
	private JTextField p;
	private JTextField rate;
	
	private double sumIn ;
	private double war;
	private double marwar;
	private double subTotal;
	private double levy;
	private double phcf;
	private double levPhc;
	private double stumpDuty;
	private double ratee;
	
    
     public static void  newWind() {
	
    	 EventQueue.invokeLater(new Runnable() {
 			public void run() {
 				try {
 					DemoFrame frame = new DemoFrame();
 					frame.setVisible(true);
 				} catch (Exception e) {
 					e.printStackTrace();
 				}
 			}
 		});
	
	
	
     }

	/**
	 * Launch the application.
	 */
     
     
	public static void main(String[] args) {
		 SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
				
					DemoFrame frame = new DemoFrame();
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
	
	
	
	public DemoFrame() {
		setResizable(false);
		setFont(new Font("Arial", Font.BOLD, 12));
		
		Image img = new ImageIcon("C://calculator-icon.png").getImage();
		setIconImage(img);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 492);
		setTitle("PREMIUM CALCULATOR");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setForeground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(128, 128, 0));
		menuBar.setBounds(0, 0, 604, 21);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu);
		
		JMenuItem mnNewMenu_2 = new JMenuItem("New Window");
		mnNewMenu_2.setBackground(new Color(255, 255, 255));
		
		mnNewMenu_2.addActionListener(arg0 -> {
					
				dispose();
				
				newWind();	
		
		});
		
		
		mnNewMenu.add(mnNewMenu_2);
		
		JMenu mnInfor = new JMenu("Infor");
		mnInfor.setForeground(Color.BLACK);
		menuBar.add(mnInfor);
		
		JMenuItem mnInformation = new JMenuItem("Information");
		mnInformation.setBackground(new Color(255, 255, 255));
		
		mnInformation.addActionListener(arg0 ->  {
				new Infor();
			
		});
		
		
		mnInfor.add(mnInformation);
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		mnNewMenu_1.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mnAboutMe = new JMenuItem("About Me");
		mnAboutMe.setBackground(new Color(255, 255, 255));
		mnAboutMe.addActionListener( arg0 -> {
			
				JOptionPane.showMessageDialog(contentPane,"YOUR PREMIUM CALCULATOR VERSION 1.0.0.2 \n\n"+
				          
				  "                                                      Prepared by Gerson Maina\n"+
		  
				  "--------------------------------------------------------------------------------\n"+
				  "--------------------------------------------------------------------------------\n"+
				  
				  "I Used jdk 1.8 to compile this code\n" +
				  "Thanks for using Premium Calculator\n"+
				  "Your comments are welcomed ...\n "+
				  
				  "-------------------------------------------------------------------------------\n"+
				  "                     gersonmaina@gmail.com\n"+
				  "------------------------------------------------------------------------------\n"
				  	  
		); 
		;			
		}
		);
		
		mnNewMenu_1.add(mnAboutMe);
		
		JLabel lblNewLabel = new JLabel("SUM INSURED");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 59, 122, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblMarineWar = new JLabel("MARINE &WAR");
		lblMarineWar.setForeground(new Color(128, 0, 0));
		lblMarineWar.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMarineWar.setBounds(10, 95, 122, 30);
		contentPane.add(lblMarineWar);
		
		JLabel lblSubtotal = new JLabel("SUBTOTAL");
		lblSubtotal.setForeground(new Color(128, 0, 0));
		lblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSubtotal.setBounds(327, 95, 89, 30);
		contentPane.add(lblSubtotal);
		
		JLabel lblStumpDuty = new JLabel("STUMP DUTY");
		lblStumpDuty.setToolTipText("round off to nearest 5 or 10");
		lblStumpDuty.setForeground(new Color(128, 0, 0));
		lblStumpDuty.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStumpDuty.setBounds(10, 314, 122, 30);
		contentPane.add(lblStumpDuty);
		
		JLabel lblLevyPcff = new JLabel("LEVY & PHCF");
		lblLevyPcff.setForeground(new Color(128, 0, 0));
		lblLevyPcff.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLevyPcff.setBounds(10, 136, 122, 30);
		contentPane.add(lblLevyPcff);
		
		JLabel lblTotalPremium = new JLabel("TOTAL PREMIUM");
		lblTotalPremium.setForeground(new Color(128, 0, 0));
		lblTotalPremium.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotalPremium.setBounds(291, 314, 135, 30);
		contentPane.add(lblTotalPremium);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Destination Via JKIA");
		chckbxNewCheckBox.setBackground(new Color(192, 192, 192));
		chckbxNewCheckBox.setForeground(new Color(255, 69, 0));
		chckbxNewCheckBox.setToolTipText("select when destinations is as such");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxNewCheckBox.setBounds(6, 282, 189, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("CLEAR");	
		
		btnNewButton.addActionListener( e ->  {
				
				chckbxNewCheckBox.setSelected(false);	
				si.setText(null);
				mw.setText(null);;
			    st.setText(null);;
				sd.setText(null);;
				lp.setText(null);;
				tlp.setText(null);;
				m.setText(null);;
				w.setText(null);;
				l.setText(null);;
				p.setText(null);;
				rate.setText(null);;
			
			
		});
		
		
		btnNewButton.setToolTipText("clears the values");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(136, 376, 98, 34);
		contentPane.add(btnNewButton);
	
		
		//.......................Total premium........................................
		
		JButton btnCalculate = new JButton("TOTAL PREMIUM");
		
		btnCalculate.addActionListener(arg0 -> {
					
					
			  if ( chckbxNewCheckBox.isSelected() ) {
				  
				  stumpDuty = 40.00;  
			  }
				
			  else {
				  
				  stumpDuty = Double.parseDouble(sd.getText());
			  }
			
			 
			 double levv = Double.parseDouble(lp.getText());
			 
			 double subT =Double.parseDouble(st.getText());
			 
			 double t = round((stumpDuty + levv + subT),2);
			 
			 tlp.setText(String.valueOf(t));
			 
			 

		
		});
		
	
		
		btnCalculate.setToolTipText("calculates the premium");
		btnCalculate.setForeground(Color.GREEN);
		btnCalculate.setBackground(Color.DARK_GRAY);
		btnCalculate.setBounds(314, 376, 151, 34);
		contentPane.add(btnCalculate);
		
		si = new JTextField();
		si.setFont(new Font("Arial Black", Font.BOLD, 13));
		si.setEditable(true);
		si.setToolTipText("Enter the sum insured(kshs)");
		si.setBounds(166, 57, 131, 31);
		contentPane.add(si);
		si.setColumns(10);
		
		mw = new JTextField();
		mw.setFont(new Font("Arial Black", Font.BOLD, 13));
		mw.setEditable(false);
		mw.setColumns(10);
		mw.setBounds(166, 102, 131, 27);
		contentPane.add(mw);
		
		st = new JTextField();
		st.setFont(new Font("Arial Black", Font.BOLD, 13));
		st.setEditable(false);
		st.setColumns(10);
		st.setBounds(447, 100, 131, 27);
		contentPane.add(st);
		
		sd = new JTextField();
		sd.setFont(new Font("Arial Black", Font.BOLD, 13));
		sd.setEditable(true);
		sd.setToolTipText("enter the stump duty");
		sd.setColumns(10);
		sd.setBounds(148, 319, 131, 27);
		contentPane.add(sd);
		
		lp = new JTextField();
		lp.setFont(new Font("Arial Black", Font.BOLD, 13));
		lp.setEditable(false);
		lp.setColumns(10);
		lp.setBounds(166, 138, 131, 27);
		contentPane.add(lp);
		
		tlp = new JTextField();
		tlp.setFont(new Font("Arial Black", Font.BOLD, 13));
		tlp.setEditable(false);
		tlp.setBounds(438, 316, 131, 27);
		contentPane.add(tlp);
		tlp.setColumns(10);
		
		JLabel lblMarine = new JLabel("Marine");
		lblMarine.setForeground(new Color(128, 0, 0));
		lblMarine.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMarine.setBounds(327, 136, 122, 30);
		contentPane.add(lblMarine);
		
		JLabel lblWar = new JLabel("War");
		lblWar.setForeground(new Color(128, 0, 0));
		lblWar.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWar.setBounds(327, 170, 122, 30);
		contentPane.add(lblWar);
		
		JLabel lblLevy = new JLabel("Levy");
		lblLevy.setForeground(new Color(128, 0, 0));
		lblLevy.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLevy.setBounds(10, 179, 122, 30);
		contentPane.add(lblLevy);
		
		JLabel lblPhcff = new JLabel("Phcf");
		lblPhcff.setForeground(new Color(128, 0, 0));
		lblPhcff.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPhcff.setBounds(327, 210, 122, 30);
		contentPane.add(lblPhcff);
		
		m = new JTextField();
		m.setFont(new Font("Arial Black", Font.BOLD, 13));
		m.setEditable(false);
		m.setColumns(10);
		m.setBounds(447, 141, 131, 27);
		contentPane.add(m);
		
		w = new JTextField();
		w.setFont(new Font("Arial Black", Font.BOLD, 13));
		w.setEditable(false);
		w.setColumns(10);
		w.setBounds(447, 179, 131, 27);
		contentPane.add(w);
		
		l = new JTextField();
		l.setFont(new Font("Arial Black", Font.BOLD, 13));
		l.setEditable(false);
		l.setColumns(10);
		l.setBounds(166, 175, 131, 27);
		contentPane.add(l);
		
		p = new JTextField();
		p.setFont(new Font("Arial Black", Font.BOLD, 13));
		p.setEditable(false);
		p.setColumns(10);
		p.setBounds(447, 215, 131, 27);
		contentPane.add(p);
		
		JLabel lblEnterRateeg = new JLabel("ENTER RATE(eg 0.25)");
		lblEnterRateeg.setForeground(new Color(128, 0, 0));
		lblEnterRateeg.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnterRateeg.setBounds(327, 51, 138, 30);
		contentPane.add(lblEnterRateeg);
		
		rate = new JTextField();
		rate.setFont(new Font("Arial Black", Font.BOLD, 13));
		rate.setEditable(true);
		rate.setToolTipText("enter the rate");
		rate.setColumns(10);
		rate.setBounds(500, 54, 78, 31);
		contentPane.add(rate);
		
 
		
		JButton btnPremium = new JButton("CALCULATE");
		
		// ******************************Calculate******************************************
		btnPremium.addActionListener(  arg0 -> {
	
				
			sumIn =Double.parseDouble(si.getText());
					
			ratee=Double.parseDouble(rate.getText());
			
			marwar =round((sumIn * (ratee/100)),2);
			
			if (marwar < 1000) {
				
				double newMarWar =1000.00;
				
				mw.setText(String.valueOf(newMarWar));
				
				st.setText(String.valueOf(newMarWar));
				
				m.setText(String.valueOf(newMarWar));
				
				levPhc =round(newMarWar *(0.45/100),2);
				
				lp.setText(String.valueOf(levPhc));
				
			}
			else {
				
		
			
			war = round((sumIn * (0.05/100)),2);
		
			subTotal = round((marwar),2);
			
			double calMarine =round((subTotal - war  ),2);
			
			levy =  round(subTotal *(0.2/100),2);
			
			phcf =round(subTotal *(0.25/100),2);
			
			levPhc =round( (levy + phcf),2);
	
			m.setText(String.valueOf(calMarine));
			
			mw.setText(String.valueOf(marwar));
			
			w.setText(String.valueOf(war));
				
			l.setText(String.valueOf(levy));
			
			p.setText(String.valueOf(phcf));
			
			lp.setText(String.valueOf(levPhc));
			
			st.setText(String.valueOf(subTotal));
			
			}		
		});
		
		btnPremium.setToolTipText("calculates the premium");
		btnPremium.setForeground(Color.GREEN);
		btnPremium.setBackground(Color.DARK_GRAY);
		btnPremium.setBounds(138, 220, 122, 34);
		contentPane.add(btnPremium);
			
	}
	
	
	public  double round(double value, int decPlace)
    {
        if (decPlace < 0)
        {
            return value;
        }
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(decPlace, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
