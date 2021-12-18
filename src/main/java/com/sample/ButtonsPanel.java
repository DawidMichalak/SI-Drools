package com.sample;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel {

	public ButtonsPanel() {
		this.setLayout(new FlowLayout());
		for(String text : new String[] {"test1", "test2", "test3"}) {
			JButton button = new JButton(text);
			this.add(button);
		}
	}
	
	public void addButtons() {
		
	}
	private static final long serialVersionUID = 1L;

}
