import java.awt.event.*;
 import java.awt.*;
 import javax.swing.*;

public class ThankYou  extends javax.swing.JFrame {
    public ThankYou() {
        initComponents();
    }
    
   
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
		
		 getContentPane().setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jPanel1.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 64));
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THANK YOU");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 90, 400, 100);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jButton1.setText("EXIT");
        jButton1.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent evt)
			{
                
				System.exit(0);
			
            }
        });

        jPanel1.add(jButton1);
        jButton1.setBounds(200, 240, 80, 40);

      
       
        
           getContentPane().add(jPanel1);
       jPanel1.setBounds(0, 0, 500, 400);
       
        pack();
		setSize(500,400);
		setVisible(true);
		setLocation(200,200);
		
    }

    

    public static void main(String args[]) {
	ThankYou ty=new ThankYou();
	
        
    }
    
   
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    
    

}
