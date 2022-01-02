package controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import model.Context;
import model.Multiplication;
import model.Strategy;
import model.Subtraction;
import model.addition;
import view.CalcPanel;

public class ButtonListener implements MouseListener{
	Context con = new Context(); // instead bring calclistener's con?
	
	Strategy add;
	Strategy sub;
	Strategy mul;
	private final CalcPanel cp;
	JLabel text = new JLabel();
	
	public ButtonListener(CalcPanel panel) {
		add= new addition();
		sub =  new Subtraction();
		mul = new Multiplication();
		this.cp = panel;
		text.setFont(new Font("UI", Font.BOLD, 30));
		 text.setVisible(true);
		 text.setBounds(350, 100, 300, 150);
		 cp.add(text);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		JButton button = (JButton)e.getSource();
		  String str = button.getText();
		 
		  //button.setBackground(Color.GRAY);
		  if(str.equals("+")) {
			  con.setStrategy(add);
			  con.CheckStrategy();
			  
			  text.setText("  Adding");
			 
			 
		  }
		  if(str.equals("-")) {
			  con.setStrategy(sub);
			  con.CheckStrategy();
			  
			  text.setText("Subtracting");
			
			 
		  }
		  if(str.equals("*")) {
			  con.setStrategy(mul);
			  con.CheckStrategy();
			  text.setText("Multiplying");
			
		  }
		  if(str.equals("calculate")) {
			  System.out.println("Calc button pressed!");
			  //cp.calcualte();
		  }
		  if(str.equals("select 1st")) {
			  System.out.println("First matrix created!");
			  cp.matrixChosen(1);
			  
			  
		  }
		  if(str.equals("select 2nd")) {
			  System.out.println("Second matrix created!");
			  cp.matrixChosen(2);
		  }
		  if(button.getName()== "other1") {
			  System.out.println("Choose other dimension");
		  }
		  cp.revalidate();
		  cp.repaint();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public CalcPanel getPanel() {
		return null;
	}

}
