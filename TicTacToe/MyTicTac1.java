import java.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyTicTac1 extends JFrame {
    
      MenuBar mb1;
    Menu m1;
	
	MenuItem rules;
	static String Status[] =new String[10];
	static String thewinner="";
	boolean available=false;
	String sign="X";
	static JButton button[];
	ImageIcon ic;
	

public MyTicTac1(){
super("this is Mukesh's tictactoe");
JPanel pan=new JPanel();
pan.setLayout(new BorderLayout());
JPanel p1=new JPanel();
p1.setLayout(new GridLayout(3,3));
//**************************************************for the menu bar***********************************************************************************
		mb1=new MenuBar();
		m1=new Menu();
		
		rules=new MenuItem("CLICK");
		m1.setLabel("RULES of GAME");
		
		

rules.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent evt){
JOptionPane.showMessageDialog( MyTicTac1.this,
 "Click the button to\n put X On it  \n try to make \nThree consecutive X \n\t eg.....\"XXX\"",
"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE );
}});
m1.add(rules);
mb1.add(m1);
setMenuBar(mb1);
//*********************************************windowListener*************************************************************		
addWindowListener(new WindowAdapter(){
	public void windowCloseing(WindowEvent evt){
		//dispose();
		System.exit(0);
		
		
		}
		});
//****************************************Defining the buttons**************************************************************
button=new JButton[10];
for(int i=1;i<10;i++){
	button[i]=new JButton();
	button[i].setFocusPainted(false);
	button[i].setActionCommand(Integer.toString(i));
	button[i].setFont(new Font("Arial",Font.BOLD,50));
	button[i].setToolTipText("click the button");
	button[ i ].addActionListener( new ActionListener() {
                public void actionPerformed( ActionEvent e ) {
                    buttonAction( e.getActionCommand() ); }
            } );
	p1.add(button[i]);
	}
//****************************************************additional button**************************************************************
	JPanel pi=new JPanel();
	pi.setLayout(new GridLayout(1,3));
	JButton bb1=new JButton("New Game");
	
	JButton bb2=new JButton(" QUIT ",new ImageIcon("cross.gif"));
	JButton bb3=new JButton("Designer",new ImageIcon("mukesh.gif"));
	
		bb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
			newgame();
			}});
	pi.add(bb1);
	
	
		bb2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent evt){
		//System.exit(0);
		//dispose();
		//ThankYou ty=new ThankYou();
		exitt();
		}
		});
	pi.add(bb2);
	
		bb3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent evt){
		/*String str;
		Font f=new Font("\tMUKESH KUMAR SAH \n Btech 10406033 \nPlay and enjoy it !",Font.BOLD,10);
		str="\tMUKESH KUMAR SAH \n Btech 10406033 \nPlay and enjoy it !";
		setFont(f);
		JOptionPane.showMessageDialog( MyTicTac.this, str,	"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE );*/
		setVisible(false);
		firstPage ft=new firstPage();
		
		//dispose();
		}});
	pi.add(bb3);
		add(p1,"Center");
		add(pi,"South");
		
		setSize(500,400);
	setLocation(200,200);
	setVisible(true);
	setResizable(false);
	newgame();
	
	
	
	}

//***************************************** Definining the button action listener***************************************************************
public void buttonAction(String btn){
int index=Integer.parseInt(btn);
if(button[index].getText()==""){
	button[index].setText(sign);
	button[index].setForeground(Color.red);
	button[index].setBackground(Color.gray);
	Status[index]=sign;
	
        
	GameStatusCheck();
	nextMove();
	
	}
	else
		JOptionPane.showMessageDialog(MyTicTac1.this,"Sorry try an empty square","SORRY!!!!!",JOptionPane.ERROR_MESSAGE);
		
}
public void nextMove() {

			
				 int win=0;
//************************************First try to attack*************************************************************************************		 
				 if ((( Status[ 1 ]=="O") && (Status [ 2 ] =="O"))&&(Status[3]==""))
		win=3;
		else if(((Status[ 2] =="O") &&( Status[ 3 ] =="O"))&&(Status[1]=="") )
		win=1;
			else if(( ( Status[ 1 ] =="O") &&(Status [ 3 ]=="O" ))&&(Status[2]==""))
			win=2;
	else if( (( Status[ 4] =="O")&&( Status [ 5 ]=="O" ))&&(Status[6]==""))
		win=6;
			else if (( ( Status[ 5 ] =="O")&&( Status [ 6 ]=="O")) &&(Status[4]==""))
			win=4;
				else if( (( Status[ 4] =="O")&& (Status [ 6 ]=="O" ))&&(Status[5]==""))
				win=5;
		else if( (( Status[ 7] =="O")&&(Status [ 8]=="O" ))&&(Status[9]==""))
			win=9;
				else if( (( Status[ 7] =="O")&& (Status [ 9]=="O" ))&&(Status[8]==""))
					win=8;
				else if( (( Status[ 8] =="O")&&( Status [ 9 ]=="O" ))&&(Status[7]==""))
					win=7;
		else if(( ( Status[ 1] =="O")&&( Status [ 4] =="O"))&&(Status[7]==""))
			win=7;
			else if(( ( Status[ 1] =="O")&&( Status [ 7 ]=="O" ))&&(Status[4]==""))
			 win=4;
				else if(( ( Status[ 4] =="O")&&( Status [ 7 ]=="O" ))&&(Status[1]==""))
									win=1;
		else if( (( Status[ 2] =="O")&&( Status [ 5]=="O") )&&(Status[8]==""))
			win=8;
			else if( (( Status[ 2] =="O")&&( Status [ 8 ]=="O" ))&&(Status[5]==""))
			 win=5;
				else if( (( Status[ 5] =="O")&&( Status [ 8 ]=="O" ))&&(Status[2]==""))
									win=2;
		else if( (( Status[ 3] =="O")&&( Status [ 6]=="O" ))&&(Status[9]==""))
			win=9;
			else if( (( Status[ 3] =="O")&&( Status [ 9 ]=="O") )&&(Status[6]==""))
			 win=6;
				else if( (( Status[ 6] =="O")&&( Status [ 9]=="O") )&&(Status[3]==""))
									win=3;
		else if( (( Status[ 1] =="O")&&( Status [ 5]=="O" ))&&(Status[9]==""))
			win=9;
			else if( (( Status[ 1] =="O")&& ( Status [ 9 ]=="O" ))&&(Status[5]==""))
			 win=5;
				else if(( ( Status[ 5] =="O")&&( Status [ 9 ]=="O") )&&(Status[1]==""))
									win=1;
		else if( (( Status[ 3] =="O")&& (Status [ 5]=="O" ))&&(Status[7]==""))
			win=7;
			else if( (( Status[ 3] =="O")&&( Status [ 7 ]=="O") )&&(Status[5]==""))
			 win=5;
				else if(( ( Status[ 5] =="O")&&( Status [ 7 ]=="O" ))&&(Status[3]==""))
				win=3;
		//**************************Defencinve move**************************************************************						 
else
	if (( Status[ 1 ]=="X") && (Status [ 2 ] =="X")&&(Status[3]==""))
		win=3;
		else if((Status[ 2] =="X") &&( Status[ 3 ] =="X")&&(Status[1]=="") )
		win=1;
			else if(( ( Status[ 1 ] =="X") &&(Status [ 3 ]=="X" ))&&(Status[2]==""))
			win=2;
	else if( ( Status[ 4] =="X")&&( Status [ 5 ]=="X" )&&(Status[6]==""))
		win=6;
			else if ( ( Status[ 5 ] =="X")&&( Status [ 6 ]=="X") &&(Status[4]==""))
			win=4;
				else if( ( Status[ 4] =="X")&& (Status [ 6 ]=="X" )&&(Status[5]==""))
				win=5;
		else if( ( Status[ 7] =="X")&&(Status [ 8]=="X" )&&(Status[9]==""))
			win=9;
				else if( ( Status[ 7] =="X")&& (Status [ 9]=="X" )&&(Status[8]==""))
					win=8;
				else if( ( Status[ 8] =="X")&&( Status [ 9 ]=="X" )&&(Status[7]==""))
					win=7;
		else if( ( Status[ 1] =="X")&&( Status [ 4] =="X")&&(Status[7]==""))
			win=7;
			else if( ( Status[ 1] =="X")&&( Status [ 7 ]=="X" )&&(Status[4]==""))
			 win=4;
				else if( ( Status[ 4] =="X")&&( Status [ 7 ]=="X" )&&(Status[1]==""))
									win=1;
		else if( ( Status[ 2] =="X")&&( Status [ 5]=="X" )&&(Status[8]==""))
			win=8;
			else if( ( Status[ 2] =="X")&&( Status [ 8 ]=="X" )&&(Status[5]==""))
			 win=5;
				else if( ( Status[ 5] =="X")&&( Status [ 8]=="X" )&&(Status[2]==""))
									win=2;
		else if( ( Status[ 3] =="X")&&( Status [ 6]=="X" )&&(Status[9]==""))
			win=9;
			else if( ( Status[ 3] =="X")&&( Status [ 9 ]=="X" )&&(Status[6]==""))
			 win=6;
				else if( ( Status[ 6] =="X")&&( Status [ 9]=="X" )&&(Status[3]==""))
									win=3;
		else if( (( Status[ 1] =="X")&&( Status [ 5]=="X" ))&&(Status[9]==""))
			win=9;
			else if( (( Status[ 1] =="X")&& ( Status [ 9 ]=="X" ))&&(Status[5]==""))
			 win=5;
				else if( (( Status[ 5] =="X")&&( Status [ 9 ]=="X" ))&&(Status[1]==""))
									win=1;
		else if( (( Status[ 5] =="X")&& (Status [ 9]=="X" ))&&(Status[1]==""))
			win=1;
			else if(( ( Status[ 1] =="X")&&( Status [ 9 ]=="X" ))&&(Status[5]==""))
			 win=5;
				else if( (( Status[ 1] =="X")&&( Status [ 5 ]=="X" ))&&(Status[9]==""))
				win=9;
				// ************************RANDOM MOVE AT LAST*******************************************
				
	/*		else if(Status[ 5] =="")
				win=5;
				else if(Status[5]=="X")
				win=3;
				
			else if((Status[1]=="X")&&(Status[9]=="X")||(Status[3]=="X")&&(Status[7]=="X"))
			win=2;
				*/
				else
			win=randomMove();
			
			//System.out.println(win);
			
					
		if ( button[ win].getText() != "" )
                nextMove();
					
        if ( button[win].getText() == "" ){
		button[win].setText( "O" );
		button[win].setForeground( Color.blue);
			button[win].setBackground(Color.yellow);
			
            Status[win] = "O";	
			
		GameStatusCheck();
		}
    }
	//*********************************************************Random move*****************************************************
public int randomMove() {
        int randomValue = 0;
        if ( available ) {            
            randomValue = ( 1+ ( int ) ( Math.random() * 9 ) );    
        }
        return randomValue;
    }
		
	//***************************************NEW GAME**************************	
public static void newgame(){
for(int j=1;j<10;j++){
button[j].setText("");
//Color c=new Color(0,100,50);
button[j].setForeground(Color.cyan);
button[j].setBackground(Color.cyan);
Status[j]="";
thewinner="";
}
}
//***********************************************************check the game status**********************************************************
private void GameStatusCheck(){
//fo the top horizontal line
if ( ( Status[ 1 ] != "" ) && ( Status[ 1 ] == Status [ 2 ] && Status[ 2 ] == Status[ 3 ] ) )
		{
            thewinner = Status[ 1 ];
            gameStop( thewinner );
        }
	//for the middle horozontal line
if((Status[4] != "") && (Status[4]==Status[5] && Status[5]==Status[6]))
	{
		thewinner=Status[4];
		gameStop(thewinner);
	}
	//for the botton horizontal line
if((Status[7]!="") && (Status[7]==Status[8] && Status[8]==Status[9]))
	{
		thewinner=Status[7];
		gameStop(thewinner);
	}
	//for the vertial first line
if((Status[1]!="") && (Status[1]==Status[4] && Status[4]==Status[7]))
	{
		thewinner=Status[1];
		gameStop(thewinner);
	}
	//middle
if((Status[2]!="") && (Status[2]==Status[5] && Status[5]==Status[8]))
	{
		thewinner=Status[2];
		gameStop(thewinner);
	}
	//last vertical
if((Status[3]!="") && (Status[3]==Status[6] && Status[6]==Status[9]))
	{
		thewinner=Status[3];
		gameStop(thewinner);
	}
	//diagonal 1
if((Status[1]!="") && (Status[1]==Status[5] && Status[5]==Status[9]))
	{
		thewinner=Status[1];
		gameStop(thewinner);
	}
// the second diagonal
if((Status[3]!="") && (Status[3]==Status[5] && Status[5]==Status[7]))
	{
		thewinner=Status[3];
		gameStop(thewinner);
	}
//*********************************************Check  for the treminating condition***********************************************
	
	
	for(int a=1;a<10;a++){
		if(Status[a]==""){
		available=true;
		break; 
		}
		else
			available=false;
			}
			
			if(!available)
				gameStop("tie");
				}
//***********************************************display  of the result*******************************************************
	public  void gameStop( String winner ) {
        if ( winner == "tie" ){
            JOptionPane.showMessageDialog( MyTicTac1.this, "Would you like to play again???\n think better this time",
                                        "....TIE DUDE.....", JOptionPane.INFORMATION_MESSAGE );
            newgame();
        }
        else {
		String output;
		int choice;
		  if(winner=="X"){
            output = "\tYOU HAVE WON !!!!! \nWould you like to play again?";
			choice = JOptionPane.showConfirmDialog( MyTicTac1.this, output,
                "Congrat.. DUDE!!!", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE );
			}
			else{
			 output="\tYOU LOST!!!!!! \n Would You Like To Play again";
			 
            choice = JOptionPane.showConfirmDialog( MyTicTac1.this, output,
                "SORRY!", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE );
				}
            if ( choice == 0 )
                newgame();
            else
               // System.exit( 0 );
			   exitt();
				
        }
    }
	
	public void exitt(){
	ThankYou ty=new ThankYou();
	}
	
public static void main(String[] args){
	MyTicTac1 tic=new MyTicTac1();
	
	
	

}

    
}
