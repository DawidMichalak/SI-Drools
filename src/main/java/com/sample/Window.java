package com.sample;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class Window extends JFrame{
	
	private static final long serialVersionUID = 1L;
	public JPanel buttonsPanel;
	public JLabel questionLabel;
	
	public Window() {
		this.buttonsPanel = new ButtonsPanel();
		this.questionLabel = new JLabel();
		this.setTitle("Drools Project");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(512, 512);
		
		this.setLayout(new GridLayout(2, 1));
		
		this.questionLabel.setText("test question");
		this.add(questionLabel);
		
		this.add(buttonsPanel);
		this.pack();
		this.setVisible(true);
	}
}
