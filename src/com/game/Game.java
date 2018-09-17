package com.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.listeners.ButtonListener;

public class Game extends JPanel {
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eigth;
	private JButton nine;

	private static final long serialVersionUID = 1L;

	public Game() {
		repaint();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(Color.blue);

	}

	// public void printTable(Graphics g) {
	// g.drawRect(50, 50, 300, 300);
	// g.drawLine(150, 50, 150, 350);
	// g.drawLine(250, 50, 250, 350);
	// g.drawLine(50, 150, 350, 150);
	// g.drawLine(50, 250, 350, 250);
	// }

	public void addButtons() {
		ButtonListener listener = new ButtonListener(this);
		one = new JButton();
		one.addActionListener(listener);
		one.setFont(new Font("Arial", Font.PLAIN, 44));
		this.add(one);
		two = new JButton();
		two.addActionListener(listener);
		two.setFont(new Font("Arial", Font.PLAIN, 44));
		this.add(two);
		three = new JButton();
		three.addActionListener(listener);
		three.setFont(new Font("Arial", Font.PLAIN, 44));
		this.add(three);
		four = new JButton();
		four.addActionListener(listener);
		four.setFont(new Font("Arial", Font.PLAIN, 44));
		this.add(four);
		five = new JButton();
		five.addActionListener(listener);
		five.setFont(new Font("Arial", Font.PLAIN, 44));
		this.add(five);
		six = new JButton();
		six.addActionListener(listener);
		six.setFont(new Font("Arial", Font.PLAIN, 44));
		this.add(six);
		seven = new JButton();
		seven.addActionListener(listener);
		seven.setFont(new Font("Arial", Font.PLAIN, 44));
		this.add(seven);
		eigth = new JButton();
		eigth.addActionListener(listener);
		eigth.setFont(new Font("Arial", Font.PLAIN, 44));
		this.add(eigth);
		nine = new JButton();
		nine.addActionListener(listener);
		nine.setFont(new Font("Arial", Font.PLAIN, 44));
		this.add(nine);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(400, 400);
	}
	
	public void reset(){
		one.setText("");
		two.setText("");
		three.setText("");
		four.setText("");
		five.setText("");
		six.setText("");
		seven.setText("");
		eigth.setText("");
		nine.setText("");
	}

	public boolean checkWin() {
		if (one.getText().equals(two.getText())
				&& two.getText().equals(three.getText())
				&& !one.getText().equals("")) {
			return true;
		} else if (one.getText().equals(five.getText())
				&& five.getText().equals(nine.getText())
				&& !one.getText().equals("")) {
			return true;
		} else if (one.getText().equals(four.getText())
				&& four.getText().equals(seven.getText())
				&& !one.getText().equals("")) {
			return true;
		} else if (two.getText().equals(five.getText())
				&& five.getText().equals(eigth.getText())
				&& !two.getText().equals("")) {
			return true;
		} else if (four.getText().equals(five.getText())
				&& four.getText().equals(six.getText())
				&& !four.getText().equals("")) {
			return true;
		} else if (seven.getText().equals(eigth.getText())
				&& seven.getText().equals(nine.getText())
				&& !seven.getText().equals("")) {
			return true;
		} else if (seven.getText().equals(five.getText())
				&& seven.getText().equals(three.getText())
				&& !seven.getText().equals("")) {
			return true;
		} else if (nine.getText().equals(six.getText())
				&& nine.getText().equals(three.getText())
				&& !nine.getText().equals("")) {
			return true;
		}
		return false;

	}

}
