package com.sample;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class Window extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public Window() {
		this.setTitle("Drools Project");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(512, 512);
		this.setLayout(new FlowLayout());
		
		for(String text : new String[] {"test1", "test2", "test3"}) {
			JButton button = new JButton(text);
			this.add(button);
		}
		
		this.setVisible(true);
	}
}
