package System;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Bill extends Frame implements ActionListener
{
	Label l1;
	Bill()
	{
		setBackground(Color.pink);
		l1=new Label(" YOUR ORDER IS SUCCESFULL.\n PLEASE WAIT FOR YOUR ORDER !!! ");
		l1.setBounds(50,80,480,20);
		add(l1);
		
		setSize(500,150);  
        setLayout(null);  
        setVisible(true);
	    
        close cm=new close();
		addWindowListener(cm);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		
	}
	public static void main(String[] args) 
	{
		new Bill();
	}
	class close extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	}
}
