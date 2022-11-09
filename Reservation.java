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

    public class   Reservation extends JFrame implements  ActionListener{
		
	private JTable table;	
	private JScrollPane scroll;
	
	private DefaultTableModel model;	
    
    private Container c;
    private JLabel titleLabel,fnLabel,lnLabel,phLabel,gpLabel,tkLabel;
    private JTextField fnTf,lnTf,endTf,phTf,gpTf,tkTf;
    private JButton addButton,updateButton,deleteButton,clearButton;
    
	private String[] columns={"Start Station","End Station","Train Name","Cavin Class","Total tk"};
	private String[] rows=new String[5];
	
        Reservation (){
         
        initComponents();       
    
     } 

        public void initComponents() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(780,690);
        this.setLocationRelativeTo(null);
        this.setTitle("Railway Ticket Reservation Sysem");
        
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);
        
        
         Font font =new Font("Arial",Font.BOLD,16);
        
         titleLabel =new JLabel ("Railway Ticket Reservation Sysem");
         titleLabel .setFont(font);
         titleLabel.setBounds(140,10,250,50);
         c.add(titleLabel);
         
         fnLabel=new JLabel("Start Station  ");
         fnLabel.setBounds(10,80,140,30);
         fnLabel.setFont(font);
         c.add(fnLabel);
         
         fnTf =new JTextField();
         fnTf.setBounds(110,80,200,30);
         fnTf.setFont(font);
         c.add(fnTf);
         
         addButton=new JButton("Reserve");
         addButton.setBounds(400,80,100,30);
         addButton.setFont(font);
         c.add(addButton);
         
         
         lnLabel=new JLabel("End Station ");
         lnLabel.setBounds(10,130,150,30);
         lnLabel.setFont(font);
         c.add(lnLabel);
         
		 
         lnTf=new JTextField();
         lnTf.setBounds(110,130,200,30);
         lnTf.setFont(font);
         c.add(lnTf);
         
		 
         updateButton=new JButton("update");
         updateButton.setBounds(400,130,100,30);
         updateButton.setFont(font);
         c.add(updateButton);
         
		 
         phLabel =new JLabel ("Train Name     ");
         phLabel .setFont(font);
         phLabel.setBounds(10,180,150,30);
         c.add(phLabel);
         
         phTf=new JTextField();
         phTf.setBounds(110,180,200,30);
         phTf.setFont(font);
         c.add(phTf);
         
         deleteButton=new JButton("delete");
         deleteButton.setBounds(400,180,100,30);
         deleteButton.setFont(font);
         c.add(deleteButton);
         
         
         gpLabel =new JLabel ("Cavin Class   ");
         gpLabel .setFont(font);
         gpLabel.setBounds(10,230,150,30);
         c.add(gpLabel);
         
         gpTf=new JTextField();
         gpTf.setBounds(110,230,200,30);
         gpTf.setFont(font);
         c.add(gpTf);
		 
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
         
         clearButton=new JButton("clear    ");
         clearButton.setBounds(400,230,100,30);
         clearButton.setFont(font);
         c.add(clearButton);
          
		  
		  
		  
		   
		 tkLabel=new JLabel("Total tk ");
         tkLabel.setBounds(10,280,150,30);
         tkLabel.setFont(font);
         c.add(tkLabel);
         
		 
         tkTf=new JTextField();
         tkTf.setBounds(110,280,200,30);
         tkTf.setFont(font);
         c.add(tkTf);
		  
		  
		  
		  
		  
		  table =new JTable();
		  
		  model=new DefaultTableModel();
		  model.setColumnIdentifiers(columns);
		  
		  table.setModel(model);
		  
		  table.setFont(font);
		  table.setSelectionBackground(Color.green);
		  table.setBackground(Color.white);
		  table.setRowHeight(30);
		  
		  scroll=new JScrollPane(table);
		  scroll.setBounds(10,360,740,265);
		  c.add(scroll);
		  
		  
		  addButton.addActionListener(this);
		  clearButton.addActionListener(this);
		  
		  
    }
	
	@Override
	
	public void actionPerformed(ActionEvent e){
	
	
	if(e.getSource()==addButton){
		
		rows[0]=fnTf.getText();
		rows[1]=lnTf.getText();
		rows[2]=endTf.getText();
		rows[3]=phTf.getText();
		rows[4]=gpTf.getText();
		rows[5]=tkTf.getText();
		model.addRow(columns);
		
	}
	else if(e.getSource()==clearButton){
	
	    fnTf.setText("");
		lnTf.setText("");
		endTf.setText("");
		phTf.setText("");
		gpTf.setText("");
		tkTf.setText("");
	
	}
	}
	
public static void main (String [] args){
    
   Reservation frame =new Reservation();
    frame.setVisible(true);
       
    }
}