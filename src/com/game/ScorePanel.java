package com.game;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ScorePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private int player1Score;
	private int player2Score;
	private static ScorePanel score;
	
	public ScorePanel() {
		score = this;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Welcome to TicTacToe", 20, 30);
		g.setFont(new Font("Comic Sans", Font.PLAIN, 32));
		g.drawString("Player 1", 20, 100);
		g.drawString("Player 2", 180, 100);
		g.drawString(String.valueOf(player1Score), 20, 150);
		g.drawString(String.valueOf(player2Score), 180, 150);
	}

	public int getPlayer1Score() {
		return player1Score;
	}

	public void incrementPlayer1Score() {
		player1Score++;
		repaint();
	}

	public int getPlayer2Score() {
		return player2Score;
	}

	public void incrementPlayer2Score() {
		player2Score++;
		repaint();
	}
	
	public static ScorePanel getScorePanel(){
		return score;
	}
	
}
