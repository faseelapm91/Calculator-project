package Laelb;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame("calculator");
		jf.setSize(300, 600);
		jf.setLayout(null);
		jf.setVisible(true);
		JLabel jl=new JLabel("num1");
		jl.setBounds(30, 30, 100, 10);
		jf.add(jl);
		JTextField t1=new JTextField();
		t1.setBounds(100, 30, 100, 20);
		jf.add(t1);
        JLabel j2=new JLabel("num2");
        j2.setBounds(30, 60, 200, 10);
        jf.add(j2);
        JTextField t2=new JTextField();
        t2.setBounds(100, 60, 100, 20);
        jf.add(t2);
        JLabel j3=new JLabel("Result");
        j3.setBounds(30, 90, 250, 10);
        jf.add(j3);
        JTextField t3=new JTextField();
        t3.setBounds(100, 90, 100, 30);
        jf.add(t3);
        JButton b1=new JButton("ADD");
        b1.setBounds(60, 130, 80, 20);
        JButton b2=new JButton("sub");
        b2.setBounds(60, 160, 80, 20);
        JButton b3=new JButton("div");
        b3.setBounds(60, 190, 80, 20);
        JButton b4=new JButton("Clear");
        b4.setBounds(60, 220, 80, 20);
        b1.addActionListener(new ActionListener()	{
        	public void actionPerformed(ActionEvent evt)
        	{
        	int a=Integer.parseInt(t1.getText());
        	int b=Integer.parseInt(t2.getText());
        	int sum=a+b;
        	
        	t3.setText(String.valueOf(sum));
        		}
	});
        jf.add(b1);
        b2.addActionListener(new ActionListener()	{
        public void actionPerformed(ActionEvent evt)
    	{
    	int a=Integer.parseInt(t1.getText());
    	int b=Integer.parseInt(t2.getText());
    	int sub=a-b;
    	
    	t3.setText(String.valueOf(sub));
    		}
        });
        jf.add(b2);
        b3.addActionListener(new ActionListener()	{
        	public void actionPerformed(ActionEvent evt)
        	{
        	int a=Integer.parseInt(t1.getText());
        	int b=Integer.parseInt(t2.getText());
        	int div=a/b;
        	
        	t3.setText(String.valueOf(div));
        		}
	});
        jf.add(b3);
        b4.addActionListener(new ActionListener()	{
        	public void actionPerformed(ActionEvent evt)
        	{
        	t1.setText(" ");
        	t2.setText(" ");
        	t3.setText(" ");
        		}
	});
        jf.add(b4);
}
}
