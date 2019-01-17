package System;
import java.awt.*;
import java.awt.event.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Body extends JFrame implements ActionListener
{
	JFrame f;
	
	Label l,l1,l2,l3,l4,l5,l6,l7;
	Label w;
	Label l11,l12,l13,l14,l15,l16,l17,l18,l19,l00,l01,l02,lq,gst;
	TextField t1,t2,t3,t4;
	TextField t5,t6,t7,t8,t9,t0,t11,t12,t13,t14,t15,t16,t17,t18,t19;
	TextField x;
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9,c0,c11,c12;
	Button b1,b2;
	double c=0;
	String r;

	private String msg;
	
	Body()
	{
		//setBackground(Color.pink);
f=new JFrame();
		
		f.setContentPane(new JLabel(new ImageIcon("D:\\ao.jpg")));
		
		
		
		
		
		
		l1=new Label(" M  E  N  U ");
		l1.setBounds(110,60,100,20);
		f.add(l1);
		
		lq=new Label(" YOUR  ORDER ");
		lq.setBounds(850,100,100,20);
		f.add(lq);
		
		l2=new Label(" FOOD  ITEM ");
		l2.setBounds(50,100,100,20);
		f.add(l2);
	
		c1=new Checkbox(" MOMOS                               180");
		c1.setBounds(30,130,240,20);
		f.add(c1);
		c1.addItemListener(new ItemListener() {  
             public void itemStateChanged(ItemEvent e1) {               
            	 if(e1.getStateChange()==1)
         		{
         			l11=new Label(" MOMOS                            180");
         		    l11.setBounds(800,130,160,20);
         		    f.add(l11);
         		    c+=180;
         		}
             }  
          });  
		
		c2=new Checkbox(" SPRING ROLLS                   150");
		c2.setBounds(30,160,240,20);
		f.add(c2);
		c2.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e1) {               
            	if(e1.getStateChange()==1)
        		{
        			l12=new Label(" NOODLES                         150");
        		    l12.setBounds(800,160,160,20);
        		    f.add(l12);
        		    c+=150;
        		}
            }  
         });  
		
		c3=new Checkbox(" BUTTER PANEER                420");
		c3.setBounds(30,190,240,20);
		f.add(c3);
		c3.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e1) {               
            	if(e1.getStateChange()==1)
        		{
        			 l13=new Label(" BUTTER PANEER            420");
        			 l13.setBounds(800,190,160,20);
        		     f.add(l13);
        		     c+=420;
        		}
            }  
         });  
		
		c4=new Checkbox(" SHAHI PANEER                   380");
		c4.setBounds(30,220,240,20);
		f.add(c4);
		c4.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e1) {               
            	if(e1.getStateChange()==1)
        		{
        			 l14=new Label(" SHAHI PANEER                380");
        			    l14.setBounds(800,220,160,20);
        			    f.add(l14);
        		     c+=380;
        		}
            }  
         });  
		
		c5=new Checkbox(" KADHAI PANEER                400");
		c5.setBounds(30,250,240,20);
		f.add(c5);
		c5.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e1) {               
            	if(e1.getStateChange()==1)
        		{
        			l15=new Label(" KADHAI PANEER             400");
        		    l15.setBounds(800,250,160,20);
        		    f.add(l15);
        		     c+=400;
        		}
            }  
         });  
		
		c6=new Checkbox(" BUTTER CHICKEN              580");
		c6.setBounds(30,280,240,20);
		f.add(c6);
		c6.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e1) {               
            	if(e1.getStateChange()==1)
        		{
        			l16=new Label(" BUTTER CHICKEN           580");
        		    l16.setBounds(800,280,160,20);
        		    f.add(l16);
        		     c+=580;
        		}
            }  
         });  
		r=String.valueOf(c);
		
		c7=new Checkbox(" KADHAI CHICKEN               600");
		c7.setBounds(30,310,240,20);
		f.add(c7);
		c7.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e1) {               
            	if(e1.getStateChange()==1)
        		{
        			l17=new Label(" KADHAI CHICKEN            600");
        		    l17.setBounds(800,310,160,20);
        		    f.add(l17);
        		     c+=600;
        		}
            }  
         });  
		
		c8=new Checkbox(" TANDOORI CHICKEN         800");
		c8.setBounds(30,340,240,20);
		f.add(c8);
		c8.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e1) {               
            	if(e1.getStateChange()==1)
        		{
        			l18=new Label(" TANDOORI CHICKEN       800");
        		    l18.setBounds(800,340,160,20);
        		    f.add(l18);
        		     c+=800;
        		}
            }  
         });  
		
		c9=new Checkbox(" MASALA DOSA                  100");
		c9.setBounds(30,370,240,20);
		f.add(c9);
		c9.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e1) {               
            	if(e1.getStateChange()==1)
        		{
        			l19=new Label(" MASALA DOSA                100");
        		    l19.setBounds(800,370,160,20);
        		    f.add(l19);
        		     c+=100;
        		}
            }  
         });  
		
		c0=new Checkbox(" SHAKES                               75");
		c0.setBounds(30,400,240,20);
		f.add(c0);
		c0.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e1) {               
            	if(e1.getStateChange()==1)
        		{
        			l00=new Label(" SHAKES                               75");
        		    l00.setBounds(800,400,160,20);
        		    f.add(l00);
        		     c+=75;
        		}
            }  
         });  
		
		
		c11=new Checkbox(" ICE-CREAM                          75");
		c11.setBounds(30,430,240,20);
		f.add(c11);
		c11.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e1) {               
            	if(e1.getStateChange()==1)
        		{
        			l01=new Label(" ICE-CREAM                         75");
        		    l01.setBounds(800,430,160,20);
        		    f.add(l01);
        		     c+=75;
        		}
            }  
         });  
		
		c12=new Checkbox(" BUTTER NAAN                    50");
		c12.setBounds(30,460,240,20);
		f.add(c12);
		c12.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e1) {               
            	if(e1.getStateChange()==1)
        		{
        			l02=new Label(" BUTTER NAAN                   50");
        		    l02.setBounds(800,460,160,20);
        		    f.add(l02);
        		     c+=50;
        		}
            }  
         });  
		
		l3=new Label(" PRICE ");
		l3.setBounds(170,100,100,20);
		f.add(l3);
		
		l4=new Label(" TABLE NO. ");
		l4.setBounds(400,130,80,20);
		f.add(l4);
		
		t1=new TextField();
		t1.setBounds(480,130,50,20);
		f.add(t1);
		
		l5=new Label(" DATE ");
		l5.setBounds(560,130,50,20);
		f.add(l5);
		
		t2=new TextField();
		t2.setBounds(610,130,80,20);
		f.add(t2);
		
		l6=new Label(" CUSTOMER'S NAME ");
		l6.setBounds(400,170,120,20);
		f.add(l6);
		
		t3=new TextField();
		t3.setBounds(520,170,170,20);
		f.add(t3);
		
		l7=new Label(" PHONE NO. ");
		l7.setBounds(400,210,80,20);
		f.add(l7);
		
		t4=new TextField();
		t4.setBounds(480,210,210,20);
		f.add(t4);
		
		w=new Label(" WAITER'S NAME ");
		w.setBounds(400,250,100,20);
		f.add(w);
		
		x=new TextField();
		x.setBounds(500,250,190,20);
		f.add(x);
		
	    b1=new Button(" D O N E ");
	    b1.setBounds(830,550,120,40);
	    f.add(b1);
	    
	    b2=new Button(" TOTAL ");
	    b2.setBounds(790,490,80,20);
	    f.add(b2);
	    
	    t17=new TextField();
	    t17.setBounds(890,490,100,20);
	    f.add(t17);
	    
	    gst=new Label(" *GST 18% INCLUDED ");
	    gst.setBounds(810,520,150,15);
	    f.add(gst);
	    
	    
		
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	     
		f.setSize(1050,700);  
        f.setLayout(null);  
        f.setVisible(true);
        
        close cm=new close();
		f.addWindowListener(cm);
		
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		String msg="";
		msg+="THANK YOU! YOUR ORDER IS PLACED.\nYOUR ORDER NUMBER IS 314";
		c=c+(c*18/100);
		r=String.valueOf(c);
		if(e.getSource()==b2)
		{
			t17.setText(r);
			
		}
		if(e.getSource()==b1)
		{
			f.dispose();
			JOptionPane.showMessageDialog(this,msg+"\nYOUR BILL AMOUNT IS : "+c); 
			
			
		}
		
	}
	public static void main(String[] args) 
	{
		new Body();
	}
	class close extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	}
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}