package game;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MainClass {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Snake Game");
		JMenuBar menuBar = new JMenuBar();
		frame.setContentPane(new GamePanel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.pack();
		//frame.add(new GamePanel());
		
		frame.setPreferredSize(new Dimension(GamePanel.WIDTH, GamePanel.HEIGHT));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		/*
		frame.setContentPane(new GamePanel());
		GamePanel.setLayout(new BorderLayout());
		
		frame.add(menuBar, BorderLayout.NORTH );
		JMenu speedMenu = new JMenu("Speed");
		JMenu modeMenu = new JMenu("Mode");
		JMenu colorMenu = new JMenu("Color");	    
		menuBar.add(speedMenu);
		menuBar.add(modeMenu);
		menuBar.add(colorMenu);
	*/
	}
}
