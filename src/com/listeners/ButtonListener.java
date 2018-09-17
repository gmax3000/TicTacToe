package com.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.game.Game;
import com.game.ScorePanel;

public class ButtonListener implements ActionListener {
	JButton b;
	private int sign = 0;
	Game game;
	ScorePanel score;
	int gameCount = 0;

	public ButtonListener(JPanel panel) {
		game = (Game) panel;
		score = ScorePanel.getScorePanel();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		b = (JButton) e.getSource();
		System.out.println("The text is " + b.getText()
				+ " and the gamecount is " + gameCount);
		if (b.getText() == "") {
			gameCount++;
			b.setText(getSign());
		}

		if (game.checkWin()) {
			String player = b.getText().equals("X") ? "1" : "2";
			JOptionPane.showMessageDialog(b, "Player nr " + player
					+ " is a winner", "The game result", 2);
			game.reset();
			gameCount = 0;
			if (player == "1") {
				score.incrementPlayer1Score();
			} else {
				score.incrementPlayer2Score();
			}
		} else {
			if (gameCount >= 9) {
				game.reset();
				gameCount = 0;
				JOptionPane.showMessageDialog(b, "None won!", "The game result", 2);
			}
		}
	}

	private String getSign() {
		if (sign == 0) {
			sign = 1;
			return "X";
		} else {
			sign = 0;
			return "O";
		}
	}

}
