package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ButtonListener;

//singleton
public class CalcPanel extends JPanel{
	private MouseListener bl = new ButtonListener(this);
	private final Font uiFont;
	private final Font bracketFont;
	JTextField matRow1 = new JTextField();
	JTextField matCol1 = new JTextField();
	JTextField matRow2 = new JTextField();
	JTextField matCol2 = new JTextField();
	JButton firstMatButton;
	JButton secondMatButton; 
	public CalcPanel() {
		super(null);
		super.setBackground(Color.ORANGE);
		uiFont = new Font("UI", Font.BOLD, 15);
		bracketFont = new Font("UI", Font.ROMAN_BASELINE, 200);
		matRow1.setBounds(120, 270, 30, 30);
		matCol1.setBounds(270, 270, 30, 30);
		matRow2.setBounds(550, 270, 30, 30);
		matCol2.setBounds(700, 270, 30, 30);
		
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//g.setFont(uiFont);
		//g.drawString("Choose Dimensions", 400, 50);
		
		drawBrackets(g);
		addButtons();
		addTextFields();
	}
	
	private void drawBrackets(Graphics g) {
		g.setFont(bracketFont);
		g.drawString("[", 10, 350);
		g.drawString("]", 340, 350);
		g.drawString("[", 440, 350);
		g.drawString("]", 800, 350);
	}
	
	private void addButtons() {
		
		JButton ab = new Addbutton();
		ab.addMouseListener(bl);
		ab.setBounds(400,200,50,40);
		this.add(ab);
		
		JButton sb = new Subtractbutton();
		sb.addMouseListener(bl);
		sb.setBounds(400,280,50,40);
		this.add(sb);
		
		Multiplybutton mb = new Multiplybutton();
		mb.addMouseListener(bl);
		mb.setBounds(400,360 , 50, 40);
		this.add(mb);
		
		JButton ans = new JButton();
		ans.setText("calculate");
		ans.addMouseListener(bl);
		ans.setBounds(10, 450, 100, 50);
		this.add(ans);
		
		firstMatButton = new JButton();
		firstMatButton.addMouseListener(bl);
		firstMatButton.setText("select 1st");
		firstMatButton.setBounds(160, 320, 100, 50);
		firstMatButton.setVisible(true);
		this.add(firstMatButton);
		
		
		secondMatButton = new JButton();
		secondMatButton.addMouseListener(bl);
		secondMatButton.setText("select 2nd");
		secondMatButton.setBounds(590, 320, 100, 50);
		this.add(secondMatButton);
		
	}
	
	private void addTextFields() {
		this.add(matRow1);
		this.add(matCol1);
		this.add(matRow2);
		this.add(matCol2);
		
	}
	/*
	 * 
	 * 
	 * tf.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = tf.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
               tf.setEditable(true);
               label.setText("");
            } else {
               tf.setEditable(false);
               label.setText("* Enter only numeric digits(0-9)");
            }
         }
      });
	 * 
	 */
	
	public void matrixChosen(int matrixNum) {
		//if matrixNum == 1
		int col;
		int row;
		int xCord;
		int yCord;
		int xSize;
		int ySize;
		int xGap;
		int yGap;
		JButton other1 = new JButton("Choose other dimensions");
		//input mismatch exception? NumberFormatException?
		if(matrixNum == 1) {
			if(matCol1.getText().equals("") || matRow1.getText().equals("")) {
				System.out.println("Please Fill the blank!");
			}
			else {
				col = Integer.parseInt(matCol1.getText());
				row = Integer.parseInt(matRow1.getText());
				xCord = 15;
				yCord = 340;
				xSize = 330 / col;
				ySize = 200 / row;
				xGap = 20;
				yGap = 20;
				matRow1.hide();
				matCol1.hide();
				//firstMatButton.hide();
				//matRow1
				//this.remove(firstMatButton);
				firstMatButton.setVisible(false);
				//firstMatButton.hide();
				this.invalidate();
		other1.setBounds(10, 150, 200, 30);
		this.add(other1);
		}
		}
		else {
			if(matCol2.getText().equals("") || matRow2.getText().equals("")) {
				System.out.println("Please Fill the blank!");
			}
			else {
				
			}
			
		}
		
		
		
	}
	
	
	
	public void calcualte() {
		
	}
	
	
	
	

	
	
	

}
