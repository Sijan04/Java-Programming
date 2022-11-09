import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;   
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table. DefaultTableModel;
import javax.swing.JScrollPane;
import java .awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.JOptionPane;


public class studentTable extends JFrame implements ActionListener {
     private JTable table;
     private JScrollpane scroll;
     private DefaultTableModel model; 
  
  
  
  
     private Container c;
     private JLabel titleLabel,nLabel,mnLabel,timeLabel,priceLabel;
     private JTextField nTf,mnTf,timeTf,priceTf;
     private JButton addButton,updateButton,deleteButton,clearButton;
 
  private String[] columns = {"Name","Movie Name","Time","Price"};
   private String[] rows = new String[4];
 
 
  studentTable() {
         initCompotents();
  }
     public void initCompotents(){
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setSize(780,690);
       this.setLocationRelativeTo(null);
       this.setTitle("Cineplex Ticketing System");
        
       c = this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.YELLOW);
      
     Font font = new Font("Arial",Font.BOLD,16);
    
     titleLabel = new JLabel("Cineplex Ticketing System");
     titleLabel.setBounds(140,10,250,50);
     titleLabel.setFont(font);
     c.add(titleLabel);
    
     nLabel = new JLabel("Name   ");
     nLabel.setBounds(10,80,140,30);
     nLabel.setFont(font);
     c.add(nLabel);
 
     nTf = new JTextField();
     nTf.setBounds(110,80,200,30);
     nTf.setFont(font);
     c.add(nTf);
     
    
     addButton = new JButton("ADD");
     addButton.setBounds(400,80,100,30);
     addButton.setFont(font);
     c.add(addButton);
     
    
     mnLabel = new JLabel("Movie Name    ");
     mnLabel.setBounds(10,130,150,30);
     mnLabel.setFont(font);
     c.add(mnLabel);
    
     mnTf = new JTextField();
     mnTf.setBounds(110,130,200,30);
     mnTf.setFont(font);
     c.add(mnTf);
    
     updateButton = new JButton("update");
     updateButton.setBounds(400,130,100,30);
     updateButton.setFont(font);
     c.add(updateButton);
    
     timeLabel = new JLabel("Time  ");
     timeLabel.setBounds(10,180,150,30);
     timeLabel.setFont(font);
     c.add(timeLabel);
    
     timeTf = new JTextField();
     timeTf.setBounds(110,180,200,30);
     timeTf.setFont(font);
     c.add(timeTf);
    
     deleteButton = new JButton("delete");
     deleteButton.setBounds(400,180,100,30);
     deleteButton.setFont(font);
     c.add(deleteButton);
     
     priceLabel = new JLabel("Price  ");
     priceLabel.setBounds(110,230,200,30);
     priceLabel.setFont(font);
     c.add(priceLabel);
 
 
  priceTf = new JTextField();
     priceTf.setBounds(110,230,200,30);
     priceTf.setFont(font);
     c.add(priceTf);
    
      clearButton = new JButton("clear");
     clearButton.setBounds(400,230,100,30);
     clearButton.setFont(font);
     c.add(clearButton);
    
     table = new JTable();
 
  model = new DefaultTableModel();
 
     model.setColumnIdentifiers(columns);
  table.setModel(model);
  table.setFont(font);
  table.setSelectionBackground(color.BLUE);
  table.setBackground(color.WHITE);
 
 
  scroll = new JScrollPane(table);
  scroll.setBounds(10,360,740,265);
  c.add(scroll);
 
  addButton.addActionListener(this);
  clearButton.addActionListener(this);
  deleteButton.addActionListener(this);
  updateButton.addActionListener(this);
 
 
 table.addMouseListener(new Mousedapter(){
  
  public void mouseClicked(MouseEvent me){
   
   int numberOfRow = table.getSelectedRow();
   
    String name = model.getValueAt(numberOfRow, 0).toString();
    String m_name = model.getValueAt(numberOfRow, 1).toString();
    String time = model.getValueAt(numberOfRow, 2).toString();
   
   String price = model.getValueAt(numberOfRow, 3).toString();
   
   
                 nTf.setText(name);
                 mnTf.setText(m_name);
                 timeTf.setText(time);
                 priceTf.setText(price);
    
    
    
 
  }  
  
     

   @Override
	
	public void actionPerformed(ActionEvent e){
   
       
   
   if(e.getSource()==addButton)
   {
  
    rows[0] = nTf.getText();
    rows[1] = mnTf.getText();
    rows[2] = timeTf.getText();
    rows[3] = priceTf.getText();
    model.addRow(rows);
  
   }   
    else if(e.getSource()==clearButton)
    {
    nTf.setText("");
          mnTf.setText("");
          timeTf.setText("");
          priceTf.setText("");
   
    
    
    
    
    }    
   
    else if(e.getSource()==deleteButton){
    
            int numberOfRow = table.getSelectedRow();  
   if(numberOfRow>=0)   
   {
    
       model.removeRow(numberOfRow);
    
   }
         else{
    
    JOptionPane.showMessageDialog(null,"no row has been selected or no row exists");
    
   }
   
    }
	} 
   
    else if(e.getSource()==updateButton){
    
        int numberRow = table.getSelectedRow();
    
     String name = nTf.getText();
   
     String m_name = mnTf.getText;
    
    
     String time = timeTf.getText;
   
     String price = priceTf.getText;
    
      
          model.setValueAt(name,numberOfRow ,0 );
             model.setValueAt(m_name,numberOfRow ,1 );
             model.setValueAt(time,numberOfRow ,2 );
             model.setValueAt(price,numberOfRow ,3 );

    }
   
   
   

  public static void main(String[] args)
{
   studentTable frame = new studentTable();
    frame.setVisible(true);
}
	

 
 
 
 
