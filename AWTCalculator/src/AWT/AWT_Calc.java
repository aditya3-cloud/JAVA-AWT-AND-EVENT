package AWT;

import java.awt.*;
import java.awt.event.*;


class Awt_Calc implements ActionListener {
	// Declaring Objects
	private static Dialog d;
  
	//frame icon 
	Frame f = new Frame("CodeRed CALCULATOR");
	Image icon = Toolkit.getDefaultToolkit().getImage("D:\\icon.png");    
	
	//Labels for text fields
	Label lh = new Label("CodeRed Calculator");
	Label dh = new Label("CodeRed Calculator");
	Label l1 = new Label("1st Number");
	Label l2 = new Label("2nd Number");
	Label l3 = new Label("Result");

	//adding custom fonts
	Font myFont = new Font("Roboto Condensed Light", Font.PLAIN, 14);
	
	//text fields
	TextField t1 = new TextField();
	TextField t2 = new TextField();
	TextField t3 = new TextField();

	//buttons
	Button b1 = new Button("Add");
	Button b2 = new Button("Sub");
	Button b3 = new Button("Mul");
	Button b4 = new Button("Div");
	Button b5 = new Button("Cancel");
	Button b6 = new Button("Cancel");
	 
	         
	     
	//constructor 
	Awt_Calc() {
		
		// Giving Coordinates
		lh.setBounds(140, 50, 110, 20);
		lh.setForeground(Color.RED);
		lh.setBackground(Color.BLACK);
		
		dh.setBounds(140, 50, 110, 20);
		dh.setForeground(Color.RED);
		dh.setBackground(Color.BLACK);
		
		l1.setBounds(50, 100, 100, 20);
		l2.setBounds(50, 140, 100, 20);
		l3.setBounds(50, 180, 100, 20);

		t1.setBounds(200, 100, 100, 20);
		t2.setBounds(200, 140, 100, 20);
		t3.setBounds(200, 180, 100, 20);

		b1.setBounds(50, 250, 50, 20);
		b2.setBounds(110, 250, 50, 20);
		b3.setBounds(170, 250, 50, 20);
		b4.setBounds(230, 250, 50, 20);
		b5.setBounds(290, 250, 50, 20);
		b6.setBounds(290, 270, 50, 20);
		
		//adding colors to buttons
		b2.setBackground(Color.gray);
		b3.setBackground(Color.CYAN);
		b4.setBackground(Color.blue);
		b5.setBackground(Color.red);
		b6.setBackground(Color.red);
	

		// Adding components to the frame
		f.setIconImage(icon); 
		f.add(lh);
		f.add(l1);
		f.add(l2);
		f.add(l3);

		f.add(t1);
		f.add(t2);
		f.add(t3);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		
		//dailog box
		
		d = new Dialog(f , "CodeRed CALCULATOR", true);  
        d.setLayout( new FlowLayout() );  
        Button b = new Button ("OK");  
        b.setBackground(Color.green);
        Button bn = new Button ("CANCEL");
        bn.setBackground(Color.red);
        
        b.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
                Awt_Calc.d.setVisible(false);  
            }  
        });  
        bn.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
                Awt_Calc.d.setVisible(false); 
                System.exit(0);
            }  
        });
        d.add(dh); 
        d.add( new Label ("Click OK to continue the Calculator"));
        d.add(b); 
        d.add( new Label ("Click CANCEL to exit "));  
        d.add(bn);  
        d.setSize(300,200);    
        d.setVisible(true); 
        
		
		f.addWindowListener(new WindowAdapter() {
			 
		    public void windowClosing(WindowEvent evt) {
		 
		  // Exit the application
		 
		  System.exit(0);
		 
		    }
		 
		});

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);

		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400, 350);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		int n1 = Integer.parseInt(t1.getText());
		int n2 = Integer.parseInt(t2.getText());

		if (e.getSource() == b1) {
			t3.setText(String.valueOf(n1 + n2));
		}

		if (e.getSource() == b2) {
			t3.setText(String.valueOf(n1 - n2));
		}

		if (e.getSource() == b3) {
			t3.setText(String.valueOf(n1 * n2));
		}

		if (e.getSource() == b4) {
			t3.setText(String.valueOf(n1 / n2));
		}

		if (e.getSource() == b5) {
			System.exit(0);
		}
		
		if (e.getSource() == b6) {
			System.exit(0);
		}
	}

	public static void main(String... s) {
		new Awt_Calc();
	}
	
}