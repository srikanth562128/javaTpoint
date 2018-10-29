import java.awt.*;
import java.awt.event.*;
public class Awtexample extends Frame implements ActionListener
,WindowListener
{
Label l1,l2,l3;	
TextField tf1,tf2,tf3;
Button b1,b2,b3,b4;
Awtexample()
{
	l1=new Label("enter a no"); 	l2=new Label("enter a no");
	l3=new Label("Result");	tf1=new TextField(20); 
	tf2=new TextField(20); 	tf3=new TextField(20);
	b1=new Button("add");	b2=new Button("sub");
	b3=new Button("mul");	b4=new Button("div");
	b1.addActionListener(this);//self ref pointer it points to itself (object b1);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	addWindowListener(this);
		setLayout(new FlowLayout());
	add(l1);add(tf1);	add(l2);add(tf2);	add(l3);add(tf3);
	add(b1);add(b2);	add(b3);add(b4);
	}
public static void main(String[] args) 
{
	Awtexample obj=new Awtexample();
	obj.setVisible(true);
	obj.setSize(260,400);
	obj.setTitle("My First Calculator");
	}
public void actionPerformed(ActionEvent au) 
{
	if(au.getSource()==b1)
	{
		int a=Integer.parseInt(tf1.getText());
		int b=Integer.parseInt(tf2.getText());
		int c=a+b;
		tf3.setText(String.valueOf(c));
			}
	 if(au.getSource()==b2)
	{
		int a=Integer.parseInt(tf1.getText());
		int b=Integer.parseInt(tf2.getText());
		int c=a-b;
		tf3.setText(String.valueOf(c));
			}
	 if(au.getSource()==b3)
		{
			int a=Integer.parseInt(tf1.getText());
			int b=Integer.parseInt(tf2.getText());
			int c=a*b;
			tf3.setText(String.valueOf(c));
				}
	 if(au.getSource()==b4)
		{
			int a=Integer.parseInt(tf1.getText());
			int b=Integer.parseInt(tf2.getText());
			int c=a/b;
			tf3.setText(String.valueOf(c));
				}
}
public void windowActivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
public void windowClosed(WindowEvent arg0) {
	dispose();
	System.exit(0);
	
}
public void windowClosing(WindowEvent arg0) {
	dispose();
	System.exit(0);
	
}
public void windowDeactivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
public void windowDeiconified(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
public void windowIconified(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
public void windowOpened(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
}

