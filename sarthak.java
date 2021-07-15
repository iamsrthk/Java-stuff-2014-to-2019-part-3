package while_loop;
import javax.swing.*;  
import java.awt.event.*;
import java.awt.*; 

public class sarthak implements ActionListener {
   
    private static void createAndShowGUI() {
    sarthak app=new sarthak();
        // make frame..
       JFrame.setDefaultLookAndFeelDecorated(true);
       JFrame frame = new JFrame("sarthak likes colours");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(20,30,300,120);
      frame.setLayout(null);
     
   //Create a split pane
JSplitPane myPane = new JSplitPane();
myPane.setOpaque(true);
myPane.setDividerLocation(150);

app.right = new JPanel();
app.right.setBackground(new Color(255,0,0));
app.left = new JPanel();
app.left.setBackground(new Color(0,255,0));
app.left.setLayout(null);
myPane.setRightComponent(app.right);
myPane.setLeftComponent(app.left);
// make buttons
app.butt1=new JButton("Red");
app.butt2=new JButton("Blue");
app.butt3=new JButton("Green");
// add and size buttons
app.left.add(app.butt1);
app.butt1.setBounds(10,10, 100,20);
app.left.add(app.butt2);
app.butt2.setBounds(10,30, 100,20);
app.left.add(app.butt3);
app.butt3.setBounds(10,50, 100,20);
// set up listener
app.butt1.addActionListener(app);
app.butt2.addActionListener(app);
app.butt3.addActionListener(app);
frame.setContentPane(myPane);
frame.setVisible(true); 
 
    }
    
public void actionPerformed(ActionEvent e)
{
// check which button and act accordingly
    if (e.getSource()==butt1)
      right.setBackground(new Color(255,0,0));
   if (e.getSource()==butt2)
      right.setBackground(new Color(0,0,255)); 
if (e.getSource()==butt3)
      right.setBackground(new Color(0,255,0));
}


    public static void sarthak(String[] args) {
        // start off..
       try  {        
   UIManager.setLookAndFeel(   
   "javax.swing.plaf.metal.MetalLookAndFeel"   );   
      } 
catch (Exception e) 
  {
  System.out.println("Cant get laf"); 
   }





        Object a[]= UIManager.getInstalledLookAndFeels();
        for (int i=0; i<a.length; i++)
            System.out.println(a[i]); 

        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
// application object fields    
int clickCount=0;  
JLabel label;
JButton butt1;
JButton butt2;
JButton butt3;
JPanel left;
JPanel right;
}


