package com.sample;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;

public class DialogGUI implements GUI {
	private String title = "Question";
	
	public DialogGUI() {
		UIManager.put("OptionPane.minimumSize", new Dimension(400, 150));
		UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Arial", Font.PLAIN, 20))); 
		UIManager.put("OptionPane.background", new Color(245, 245, 245));
		UIManager.put("Panel.background", new Color(245, 245, 245));
		UIManager.put("Button.background", new Color(255, 255, 255));
		UIManager.put("Button.foreground", Color.black);
		UIManager.put("Button.focus", new Color(0, 0, 0, 0));
	}

	@Override
	public String askQuestion(String question, String[] possibleAnswers) {
		JLabel label = createLabel(question);
		
		int answerIndex = JOptionPane.showOptionDialog(
				null,
				label,
				title,
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE,
				null,
				possibleAnswers,
				possibleAnswers[0]);
		if (answerIndex < 0) {
			System.exit(0);
		}
		return possibleAnswers[answerIndex];
	}

	@Override
	public void showResult(String result) {
		JLabel label = createLabel("Your musical instrument: " + result);
		JOptionPane.showMessageDialog(null, label, "Result", JOptionPane.PLAIN_MESSAGE, null);
	}
	
	private JLabel createLabel(String message) {
		JLabel label = new JLabel(message);
		label.setFont(new Font("Arial", Font.PLAIN, 25));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		return label;
	}

}
