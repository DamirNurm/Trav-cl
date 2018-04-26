package com.sanifrey.test1;

import javax.swing.JFrame;

public class PanelCreator {
	
	private void CreatePanel(JFrame frame, boolean arg, String Title) {
		/**
		 * Отображаем окно
		 */
		frame.setVisible(arg);
		/**
		 * Устанавливаем название окна
		 */
		frame.setTitle(Title);
		/**
		 * Указываем координаты верхней левой вершины окна, а также его ширину и высоту.
		 */
		frame.setBounds(100, 100, 480, 313);
		/**
		 * Указываем операцию, которая будет произведена при закрытии окна.
		 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
	}
	public void PCreatePanel(JFrame frame, boolean arg, String Title) {
		CreatePanel(frame, arg, Title);
	}
}
