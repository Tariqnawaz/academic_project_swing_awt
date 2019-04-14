/*
public class Customer {

	public void mas(){

		System.out.println("i m in customer");
		}
	public static void main(String[] args) {
		Customer c=new Customer();
		c.mas();

	}

}
*/
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
//import java.awt.Event.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class Customer
{
	Frame f;
	Panel p1,p2,p3,p4;
	Label l1,l2,l3,l4;
	TextField t1,t2,t3,t4;
	Button b1,b2,b3;
	Customer(){
		f = new Frame("Customer");
		
		
		p1 = new Panel(new GridBagLayout());
		p2 = new Panel();
		p3 = new Panel();
		p4 = new Panel();
		
		GridBagConstraints ca=new GridBagConstraints();
		
		l1 = new Label("Name");
		l2 = new Label("Addres");
		l3 = new Label("Country");
		l4 = new Label("Telephone");
		
		t1 =new TextField(20);
		t2 =new TextField(40);
		t3 =new TextField(20);
		t4 =new TextField(20);
		
		b1 =new Button("Add");
		b2 =new Button("Edit");
		b3 =new Button("Save");
		
		ca.gridx=0;
		ca.gridy=1;
		p1.add(l1,ca);
		
		ca.gridx=0;
		ca.gridy=2;
		p1.add(l2,ca);
		
		ca.gridx=0;
		ca.gridy=3;
		p1.add(l3,ca);
		
		ca.gridx=0;
		ca.gridy=4;
		p1.add(l4,ca);
		
		ca.gridx=1;
		ca.gridy=1;
		p2.add(t1,ca);
		
		ca.gridx=1;
		ca.gridy=2;
		p2.add(t2,ca);
		
		ca.gridx=1;
		ca.gridy=3;
		p2.add(t3,ca);
		
		ca.gridx=1;
		ca.gridy=4;
		p2.add(t4,ca);
		
		//ca.gridx=0;
		//ca.gridy=9;
		p3.add(b1);
		
		//ca.gridx=0;
	//	ca.gridy=10;
		p3.add(b2);
		
		p3.add(b3);
		
		// p1.setVerticalAlignment(AwtConstants.TOP);

		f.add(p1,BorderLayout.WEST);
		f.add(p2,BorderLayout.CENTER);
		f.add(p3,BorderLayout.SOUTH);
		
		/*b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			if(e.getSource()==b1)
			{
			f.dispose();

			}
			}
		});
				
			
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			if(e.getSource()==b1)
			{
			f.dispose();

			}
			}
		});
		
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			if(e.getSource()==b1)
			{
			f.dispose();

			}
			}
		});*/
		
		f.setSize(400,400);
		f.setVisible(true);
		//f.setDefaultClosperation(Frame.EXIT_ON_CLOSE);
	
		
		
	}
	public void mas(){

	System.out.println("i m in supplier");
	}
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Customer sp=new Customer();
		sp.mas();

	}

}
