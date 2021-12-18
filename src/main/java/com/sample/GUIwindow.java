package com.sample;

public class GUIwindow implements GUI {
	public GUIwindow() {};
	
	@Override
	public String askQuestion(String question, String[] possibleAnswers) {
		System.out.println(question);
		return "0-5";
	}

	@Override
	public void showResult(String result) {
		System.out.println(result);
	}
}
