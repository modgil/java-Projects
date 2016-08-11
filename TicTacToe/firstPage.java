 import java.awt.event.*;
 import java.awt.*;
 import javax.swing.*;

public class firstPage extends JFrame {
    public firstPage() {
        initComponents();
    }
    
    private void initComponents() {
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
		
		jLabel6 = new JLabel();
        jButton1 = new JButton();
		
		jLabel1 = new JLabel();
        
        jButton3 = new JButton();
        jButton4 = new JButton();
		

        getContentPane().setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jPanel1.setLayout(null);

        jPanel1.setBackground(new Color(153, 255, 255));
        jLabel1.setFont(new Font("Tahoma", 3, 36));
        jLabel1.setForeground(new Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("TIC TAC TOE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 80, 280, 40);

        jLabel2.setText("Designed By");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 170, 70, 20);

        jLabel3.setFont(new Font("Tahoma", 3, 12));
        jLabel3.setForeground(new Color(204, 0, 0));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("MUKESH KUMAR SAH");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 200, 150, 20);

        jLabel4.setFont(new Font("Tahoma", 3, 12));
        jLabel4.setForeground(new Color(204, 0, 0));
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("10406033");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 230, 130, 20);

        jLabel5.setFont(new Font("Tahoma", 3, 12));
        jLabel5.setForeground(new Color(204, 0, 0));
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel5.setText("Btech 5th sem");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 260, 130, 20);
		
		jLabel6.setText("   MODE");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(300, 20, 70, 20);
		
		
		jButton3.setText("DIFFICULT");
        jPanel1.add(jButton3);
		jButton3.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent evt)
			{
				setVisible(false);
					
			MyTicTac tic=new MyTicTac();
			dispose();
            }
        });
		
		
        jButton3.setBounds(380, 45, 85, 30);

        jButton4.setText("EASY");
		jButton4.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent evt)
			{
				setVisible(false);
					
			MyTicTac1 tic=new MyTicTac1();
			dispose();
            }
        });
		
		
        jPanel1.add(jButton4);
        jButton4.setBounds(380, 10, 85, 30);

        jButton1.setBackground(new java.awt.Color(153, 255, 204));
        jButton1.setFont(new Font("Tahoma", 1, 18));
        jButton1.setForeground(new Color(51, 51, 0));
        jButton1.setText("PLAY");
        jButton1.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent evt)
			{
                //dispose();
				setVisible(false);
			//jPanel1.setEnabled(false);
			//jButton1.setEnabled(false);
			//jPanel1.setBackground(new java.awt.Color(0,0,0));
			
			MyTicTac tic=new MyTicTac();
			
			//newgame();
			dispose();
            }
        });

        jPanel1.add(jButton1);
        jButton1.setBounds(350, 250, 90, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 400);

        pack();
		setSize(500,400);
		setVisible(true);
		setResizable(false);
		setLocation(200,200);
		
		
    }

    public static void main(String args[]) {
        firstPage fp=new firstPage();
		
		
    }
    
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
	
    private JPanel jPanel1;
	
	private JButton jButton3;
    private JButton jButton4;
	private JLabel jLabel6;
	
    
    
    

}
