package com.sample;

import javax.swing.JOptionPane;	

public class DialogGUI implements GUI {

	@Override
	public String askQuestion(String question, String[] possibleAnswers) {
		int answerIndex = JOptionPane.showOptionDialog(
				null,
				question,
				null,
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				possibleAnswers,
				possibleAnswers[0]);
		return possibleAnswers[answerIndex];
	}

	@Override
	public void showResult(String result) {
		JOptionPane.showMessageDialog(null, result);
	}

}
