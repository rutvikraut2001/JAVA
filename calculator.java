		// A simple calculator using Frame 

import java.awt.*;
import java.util.*;
import java.awt.event.*;

class calculator extends Frame implements ActionListener  // Frame is class and ActionListener is an Interface
{
	private Label lblnum1,lblnum2,lblRes,lblname;
	private TextField txtnum1,txtnum2,txtRes;
	private Button btnAdd,btnSubs,btnMult,btnDiv,btnExit;

	public calculator(String title)
	{
		super( title );    //sends title to frame class constructor

		lblnum1 = new Label ("Number 1:");
		lblnum2 = new Label ("Number 2:");
		lblRes = new Label ("Result:");
		lblname = new Label(" @ Copyright by Rutvik Raut");
		txtnum1 = new TextField (5);
		txtnum2 = new TextField (5);
		txtRes = new TextField (5);
		btnAdd = new Button ( " + " );
		btnSubs = new Button ( " - " );
		btnMult = new Button ( " * " );
		btnDiv = new Button ( " / " );
		btnExit = new Button ( " Exit " );

		btnAdd.addActionListener(this);
		btnSubs.addActionListener(this);
		btnMult.addActionListener(this);
		btnDiv.addActionListener(this);
		btnExit.addActionListener(this);

		setLayout(new FlowLayout());

		add(lblnum1);  //sequence of adding label and textfield matters
		add(txtnum1);
		add(lblnum2);
		add(txtnum2);
		add(lblRes);
		add(txtRes);
		add(btnAdd);
		add(btnSubs);
		add(btnMult);
		add(btnDiv);
		add(btnExit);
		add(lblname);

		setSize(700,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnExit)
		{
			System.exit(1);
		}
		else
		{
			if(txtnum1.getText().equals("") || txtnum2.getText().equals(""))
			{
				System.out.println("Textfields are empty");
			}
			else
			{
				int num1,num2;
				double Res = 0;         //need initialization

				num1 = Integer.parseInt(txtnum1.getText());
				num2 = Integer.parseInt(txtnum2.getText());

				try
				{
					if(e.getSource()==btnAdd)
					{
						Res = num1 + num2;
					}
					if(e.getSource()==btnSubs)
					{
						Res = num1 - num2;
					}
					if(e.getSource()==btnMult)
					{
						Res = num1 * num2;
					}
					if(e.getSource()==btnDiv)
					{
						Res = num1 / num2;
					}
				}
				catch(Exception x)
				{
					System.out.println("Invalid input !");
				}
				txtRes.setText(String.valueOf(Res));      //settting the Result on textfield

			}
		}
	}

	public static void main(String args[])
	{
		calculator c = new calculator ("Calculator in JAVA");
	}
}
