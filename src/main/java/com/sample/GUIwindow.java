package com.sample;

public class GUIwindow implements GUI {
	public GUIwindow() {};
	
	@Override
	public String askQuestion(String question, String[] possibleAnswers) {
		System.out.println(question);
		if(question == "How old are you?") {
			return "0-5";
		}
		else {
			return "Yes!";
		}
	}

	@Override
	public void showResult(String result) {
		System.out.println(result);
	}
}
