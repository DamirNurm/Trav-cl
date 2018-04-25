package com.sanifrey.test1;

import javax.swing.JFrame;

public class PanelCreator {
	
	private void CreatePanel(JFrame frame, boolean arg) {
		/**
		 * Отображаем окно
		 */
		frame.setVisible(arg);
		/**
		 * Устанавливаем название окна
		 */
		frame.setTitle("Планировщик");
		/**
		 * Указываем координаты верхней левой вершины окна, а также его ширину и высоту.
		 */
		frame.setBounds(100, 100, 480, 313);
		/**
		 * Указываем операцию, которая будет произведена при закрытии окна.
		 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(null);
	}
	public void PCreatePanel(JFrame frame, boolean arg) {
		CreatePanel(frame, arg);
	}
}
