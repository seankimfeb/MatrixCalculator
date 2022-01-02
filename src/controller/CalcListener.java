package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Context;

public class CalcListener implements ActionListener {
	//do I really need this class?
	Context con ;
	public CalcListener() {
		con = new Context();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public Context getContext() {
		return con;
	}

}
