package com.sample;

import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

import java.awt.Dimension;
import java.awt.Font;

public class DialogGUI implements GUI {
	private String title = "Question";
	
	public DialogGUI() {
		UIManager.put("OptionPane.minimumSize", new Dimension(400, 150));
		UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Arial", Font.PLAIN, 20))); 
	}

	@Override
	public String askQuestion(String question, String[] possibleAnswers) {
		JLabel label = new JLabel(question);
		label.setFont(new Font("Arial", Font.PLAIN, 25));
		
		int answerIndex = JOptionPane.showOptionDialog(
				null,
				label,
				title,
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				possibleAnswers,
				possibleAnswers[0]);
		
		return possibleAnswers[answerIndex];
	}

	@Override
	public void showResult(String result) {
		JLabel label = new JLabel(result);
		label.setFont(new Font("Arial", Font.PLAIN, 25));
		JOptionPane.showMessageDialog(null, label);
	}

}
