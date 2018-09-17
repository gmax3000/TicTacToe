package com.game;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(300, 200, 600, 400);
		Game game = new Game();
		ScorePanel score = new ScorePanel();
		game.setLayout(new GridLayout(3, 3));
		game.addButtons();
		game.setPreferredSize(new Dimension(400, 300));
		score.setPreferredSize(new Dimension(100, 300));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(1, 2));
		frame.getContentPane().add(score);
		frame.getContentPane().add(game);
		frame.pack();
		frame.setVisible(true);
	}
}
