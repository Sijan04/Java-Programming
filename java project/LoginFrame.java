
package swings;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
    private JLabel userLabel ,passLabel;
    private JTextField tf;
    private JPasswordField pf;
    private JButton LoginButton ,clearButton;
    private Container c;
    private Font f;
    
    LoginFrame()
    {
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,430,350);
        this.setTitle("Login Here");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);
        
        f=new Font("Arial",Font.BOLD,20);
        
        userLabel =new JLabel("Name: ");
        userLabel.setBounds(50,50,150,50);
        userLabel .setFont(f);
        c.add(userLabel);
        
        tf=new JTextField();
        tf.setBounds(170,50,200,50);
        c.add(tf);
        
         passLabel =new JLabel("Password: ");
        passLabel.setBounds(50,130,150,50);
        passLabel .setFont(f);
        c.add(passLabel);
        
        pf=new JPasswordField();
        pf.setBounds(170,120,200,50);
        pf.setEchoChar('*');
        c.add(pf);
        
        LoginButton=new JButton("Login");
        LoginButton.setBounds(170,200,90,50);
        LoginButton.setFont(f);
        c.add(LoginButton);
        
        clearButton=new JButton("Clear");
        clearButton.setBounds(280,200,90,50);
        clearButton.setFont(f);
        c.add(clearButton); 
     clearButton.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent ae) {
              
               tf.setText("");
               pf.setText("");
               
           }
  
   });
                  
   LoginButton.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent ae) {
              
              String userName=tf.getText();
              String password=pf.getText();
              
              if(userName.equals("sijan") && password.equals("123456") )
              {
               
               JOptionPane.showMessageDialog(null, "You are succesfully login");
               
             
               
               
           }
              else
              {
                JOptionPane.showMessageDialog(null,"Wrong password");
              }
   
           }
   
   });
          
    }
   public static void main( String[] args){
       
           LoginFrame frame =new LoginFrame();
    
           frame.setVisible(true);
}
}