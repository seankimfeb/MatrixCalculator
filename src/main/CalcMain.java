package main;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

import controller.CalcListener;
import view.Addbutton;
import view.CalcPanel;
import view.Subtractbutton;

public class CalcMain {
	
	//strategy pattern

	public static void main(String[] args) {
		JFrame calcFrame = new JFrame("Matrix Calculator");
		//calcFrame.setBackground(Color.ORANGE);
		CalcPanel cp = new CalcPanel();
		//cp.setBounds(0, 0, 900, 800);
		cp.setLayout(null);
		CalcListener cl = new CalcListener();
		//JButton ab = new Addbutton();
		//ab.setBorder(null);
		//ab.setBounds(400,200,40,40);
		JButton sb = new Subtractbutton();
		sb.setBorder(null);
		sb.setBounds(400,280 , 40, 40);
		//JButton 
		
		
		
		
		//cp.add(ab);
		//cp.add(sb);
		calcFrame.add(cp);
		
		calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calcFrame.setSize(900, 800);
		calcFrame.setLocationRelativeTo(null);
		calcFrame.setResizable(false);
		calcFrame.setVisible(true);
	}

}
