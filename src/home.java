import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Frame.*;
import java.awt.color.*;
class home implements ActionListener{
	Frame f;
	MenuBar mb;
	Menu m1,m2,m3,m4;
	MenuItem m1i1,m1i2,m1i3;

	MenuItem m2i1,m2i2;

	MenuItem m3i1,m3i2,m3i3;
	MenuItem m4i1;


	Dialog d;
	home()
	{
		f=new Frame("Ylip Home");


		mb=new MenuBar();

		m1=new Menu("Masters");
		m2=new Menu("Transactions");
		m3=new Menu("Tools");
		m4=new Menu("Exit");


		m1i1=new MenuItem("Suplier");
		m1i2=new MenuItem("Customer");
		m1i3=new MenuItem("Staff");


		m2i1=new MenuItem("Sale");
		m2i2=new MenuItem("Purchase");
		//m2i3=new MenuItem("Purchase");
		//m2i4=new MenuItem("sales");


		m3i1=new MenuItem("Password Maintence");
		m3i2=new MenuItem("Year Creation");
		m3i3=new MenuItem("Year Selection");


		m4i1=new MenuItem("Yes");
		//m4i2=new MenuItem("Back Order Report");
		//m4i3=new MenuItem("Stock Purchase Report");

		f.setLayout(new FlowLayout(FlowLayout.CENTER));
         m1.add(m1i1);
         m1.add(m1i2);
         m1.add(m1i3);
         
         m2.add(m2i1);
         m2.add(m2i2);
         
         m3.add(m3i1);
         m3.add(m3i2);
         m3.add(m3i3);
         
         m4.add(m4i1);
         
         mb.add(m1);
         mb.add(m2);
         mb.add(m3);
         mb.add(m4);
         
         f.setMenuBar(mb);
         m1i1.addActionListener(this);
         m1i2.addActionListener(this);
         m1i3.addActionListener(this);

         m2i1.addActionListener(this);
         m2i2.addActionListener(this);
         //m2i3.addActionListener(this);
         //m2i4.addActionListener(this);


         m3i1.addActionListener(this);
         m3i2.addActionListener(this);
         m3i3.addActionListener(this);





         m4i1.addActionListener(this);
         //m4i2.addActionListener(this);
        // m4i3.addActionListener(this);



         f.setSize(800,800);
         f.setVisible(true);
         
         f.setBackground(Color.lightGray);

         f.addWindowListener(
         new WindowAdapter()
         {
         public void windowClosing(WindowEvent e)
         {
         f.dispose();
         }

         });
	}

         public void actionPerformed(ActionEvent e)
         {
         if(e.getSource()==m4i1)
         {
         System.exit(0);
         }
         else if(e.getSource()==m1i1)
         {

        	 Suplier s = new Suplier();

         }
         else if(e.getSource()==m1i2)
         {

        	 Customer c = new Customer();

         }
         else if(e.getSource()==m1i3)
         {

        	 Staff st = new Staff();

         }
         else if(e.getSource()==m2i1)
         {

        	 Sale sa = new Sale();

         }
         else if(e.getSource()==m2i2)
         {

        	 Purchase p = new Purchase();

         }
         else if(e.getSource()==m3i1)
         {

        	 Password_Maintance pm = new Password_Maintance();

         }
         else if(e.getSource()==m3i2)
         {

        	 Year_Creation  yc = new Year_Creation ();

         }
         else if(e.getSource()==m3i3)
         {

        	 Year_Selection  ys = new  Year_Selection();

         }
         }


         
	

	public static void main(String[] args) {
		home h =new home();
			}

}
