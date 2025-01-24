package miniproject;
import java.awt.event.ActionListener;
import java.awt.*;    
import java.awt.event.*;  
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public abstract class food implements ActionListener {
 
    public static void frame()
    {
        Dimension obj=new Dimension(1000,700);
        final JFrame f=new JFrame("RKS FOODS");//frame creation
        f.setMinimumSize(obj);
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(food.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(food.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(food.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(food.class.getName()).log(Level.SEVERE, null, ex);
        }
        final JButton b=new JButton ("ORDER");// first button creation
        f.getContentPane().setBackground(Color.cyan);
        final JLabel lb=new JLabel("ITALIAN");
        lb.setBounds(100,250, 150,50);
        final JLabel lb1=new JLabel("INDIAN");
        lb1.setBounds(350,20, 150,50);
        final JLabel lb2=new JLabel("STARTERS");
        lb2.setBounds(100,20, 150,50);
        final JLabel lb3=new JLabel("CHINESE");
        lb3.setBounds(350,250, 150,50);
        final JLabel lb4=new JLabel("MILK SHAKES");
        lb4.setBounds(650,20, 150,50);
        final JLabel lb5=new JLabel("SOUP");
        lb5.setBounds(650,300, 150,50);
        //check box for Starters
        final JCheckBox cb9 = new JCheckBox("Chilli chicken");  
        cb9.setBounds(100,50, 150,50);
        final JCheckBox cb10 = new JCheckBox("Chicken lollipop");  
        cb10.setBounds(100,100, 150,50);  
        final JCheckBox cb11= new JCheckBox("Veg manchurian");  
        cb11.setBounds(100,150, 150,50);
        final JCheckBox cb12 = new JCheckBox("Panner 65");  
        cb12.setBounds(100,200, 150,50);
       
        //check box for itallian
        final JCheckBox cb1 = new JCheckBox("Pizza");  
        cb1.setBounds(100,300, 150,50);
        final JCheckBox cb2 = new JCheckBox("Burger");  
        cb2.setBounds(100,350, 150,50);  
        final JCheckBox cb3 = new JCheckBox("Sandwich");  
        cb3.setBounds(100,400, 150,50);
        final JCheckBox cb4 = new JCheckBox("Cheese pasta");  
        cb4.setBounds(100,450, 150,50);  
         b.setBounds(130,600,100,40);
         
         
        //check box for Indian
        final JCheckBox cb5 = new JCheckBox("Biriyani");  
        cb5.setBounds(350,50,250,50);
        final JCheckBox cb6 = new JCheckBox("Curd rice");  
        cb6.setBounds(350,100,250,50);  
        final JCheckBox cb7 = new JCheckBox("Lemon rice");  
        cb7.setBounds(350,150, 250,50);
        final JCheckBox cb8 = new JCheckBox("Veg rice");  
        cb8.setBounds(350,200, 250,50);  
       
         //check box for chineese
        final JCheckBox cb13 = new JCheckBox("VEG noodles");  
        cb13.setBounds(350,300, 250,50);
        final JCheckBox cb14 = new JCheckBox("Chicken fried rice");  
        cb14.setBounds(350,350,250,50);  
        final JCheckBox cb15 = new JCheckBox("Chicken Schezwan rice");  
        cb15.setBounds(350,400,250,50);
        final JCheckBox cb16 = new JCheckBox("Chinese soya");  
        cb16.setBounds(350,450,250,50);  
       
        //check box for milkshakes
        final JCheckBox cb17 = new JCheckBox("Chocolate");  
        cb17.setBounds(650,50, 250,50);
        final JCheckBox cb18 = new JCheckBox("Vannila");  
        cb18.setBounds(650,100,250,50);  
        final JCheckBox cb19 = new JCheckBox("Strawberry");  
        cb19.setBounds(650,150,250,50);
        final JCheckBox cb20 = new JCheckBox("Butterscotch");  
        cb20.setBounds(650,200,250,50);  
        final JCheckBox cb21 = new JCheckBox("Choco chips");  
        cb21.setBounds(650,250,250,50);  
       
        //check box for soup
        final JCheckBox cb22 = new JCheckBox("Corn soup");  
        cb22.setBounds(650,350, 250,50);
        final JCheckBox cb23 = new JCheckBox("Chicken Soup");  
        cb23.setBounds(650,400,250,50);  
        final JCheckBox cb24 = new JCheckBox("Veg soup");  
        cb24.setBounds(650,450,250,50);
        final JCheckBox cb25 = new JCheckBox("Tomato soup");  
        cb25.setBounds(650,500,250,50);
       
        f.add(b);f.add(cb1);f.add(cb2);f.add(cb3);f.add(cb4);f.add(cb21);f.add(lb5);    
        f.add(lb);f.add(lb1);f.add(cb5);f.add(cb6);f.add(cb7);f.add(cb8);f.add(cb22);f.add(cb23);f.add(cb24);f.add(cb25);
        f.add(cb9);f.add(cb10);f.add(cb11);f.add(cb12);f.add(lb4);f.add(lb3);
        f.add(lb2);f.add(cb13);f.add(cb14);f.add(cb15);f.add(cb16);f.add(cb17);f.add(cb18);f.add(cb19);f.add(cb20);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        b.addActionListener(null);
   
     
 
        //button is pressed
   
b.addActionListener((ActionEvent e) -> {
    //your action .you can initialise and do any ops here
    
    f.getContentPane().setBackground(Color.pink);
    int amount=0;
    String msg=" ";
    if(cb1.isSelected()){
        amount+=100;
        msg+="Pizza: 100\n";
    }   if(cb2.isSelected()){  
        amount+=30;
        msg+="Burger: 30\n";
    }   if(cb3.isSelected()){  
        amount+=70;
        msg+="Sandwich: 70\n";
    }   if(cb4.isSelected()){  
        amount+=175;
        msg+="Cheese pasta: 175\n";
    }   if(cb5.isSelected()){  
        amount+=100;
        msg+="Biriyani: 250\n";
    }   if(cb6.isSelected()){  
        amount+=90;
        msg+="Curd rice: 90\n";
    }   if(cb7.isSelected()){  
        amount+=100;
        msg+="Lemon rice:100\n";
    }   if(cb8.isSelected()){  
        amount+=75;
        msg+="Veg rice: 75\n";
    }   if(cb9.isSelected()){  
        amount+=199;
        msg+="Chilli chicken: 199\n";
    }   if(cb10.isSelected()){  
        amount+=90;
        msg+="Chicken lollipop: 90\n";
    }   if(cb11.isSelected()){  
        amount+=150;
        msg+="Veg manchurian:150\n";
    }   if(cb12.isSelected()){  
        amount+=75;
        msg+="Panner 65: 75\n";
    }   if(cb13.isSelected()){  
        amount+=125;
        msg+="Veg noodles: 125\n";
    }   if(cb14.isSelected()){  
        amount+=190;
        msg+="Chicken fried rice: 190\n";
    }   if(cb15.isSelected()){  
        amount+=250;
        msg+="Chicken Schezwan rice:250\n";
    }   if(cb16.isSelected()){  
        amount+=75;
        msg+="Chinese Soya: 75\n";
    }   if(cb17.isSelected()){  
        amount+=125;
        msg+="Chocolate: 125\n";
    }   if(cb18.isSelected()){  
        amount+=100;
        msg+="Vannila: 100\n";
    }   if(cb19.isSelected()){  
        amount+=120;
        msg+="Strawberry:120\n";
    }   if(cb20.isSelected()){  
        amount+=125;
        msg+="Butterscotch: 125\n";
    }   if(cb21.isSelected()){  
        amount+=25;
        msg+="Choco chips: 25\n";
    }   if(cb22.isSelected()){  
        amount+=110;
        msg+="Corn soup: 110\n";
    }   if(cb23.isSelected()){  
        amount+=150;
        msg+="Chicken soup:150\n";
    }   if(cb24.isSelected()){  
        amount+=75;
        msg+="Veg soup: 75\n";
    }   if(cb25.isSelected()){  
        amount+=75;
        msg+="Tomato soup: 75\n";
    }   JOptionPane.showMessageDialog(f,msg+"Total:"+amount);
    JOptionPane.showMessageDialog(f,"YOU HAVE TO PAY: Rs."+amount);
            f.setVisible(false);
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                food2 obj1 = new food2();
                obj1.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(food.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(food.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(food.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(food.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
    }
     
    public static void main(String ar[]){
       
        food.frame();
 
  }

}