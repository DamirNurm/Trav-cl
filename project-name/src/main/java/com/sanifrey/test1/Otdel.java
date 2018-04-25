/**
 * Устанавливаем принадлежность класса к пакету
 */
package com.sanifrey.test1;
/**
 * Подключаем библиотеку для работы с графическим интерфейсом
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
/**
 * Подключаем класс событий
 */
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Объявляем класс с модификатором public
 */
public class Otdel {
	/**
	 * Для создания основного контейнера для приложения используем контейнер JFrame
	 */
	private JFrame frame;
	/**
	 * Объявляем поля ввода JTextField.
	 * textField - Для отображения значения всей площади комнаты.
	 * textField_1 - Для отображения значения свободного места в комнате.
	 */
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Вызываем конструктор
	 */
	public Otdel() {
		/**
		 * Вызываем метод
		 */
		initialize(false);
	}
	/**
	 * Инициализируем компоненты фрейма
	 */
	private void initialize(boolean arg) {
		/**
		 * Создаем экземпляр класса JFrame
		 */
		frame = new JFrame();
		/**
		 * Отображаем окно
		 */
		frame.setVisible(arg);
		/**
		 * Устанавливаем название окна
		 */
		frame.setTitle("Отделочник");
		/**
		 * Указываем координаты верхней левой вершины окна, а также его ширину и высоту.
		 */
		frame.setBounds(100, 100, 450, 300);
		/**
		 * Указываем операцию, которая будет произведена при закрытии окна.
		 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/**
		 * Создаём простые компоненты класса JLabel
		 */
		JLabel label = new JLabel("Общая площадь");
		label.setBounds(10, 11, 84, 14);
		JLabel label_1 = new JLabel("Свободная площадь");
		label_1.setBounds(10, 57, 105, 14);
		/**
		 * Создаём простые компоненты класса JTextField
		 */
		textField_1 = new JTextField();
		textField_1.setBounds(10, 77, 86, 20);
		textField = new JTextField();
		textField.setBounds(10, 31, 86, 20);
		/**
		 * Указываем количество символов в строке
		 */
		textField_1.setColumns(10);
		textField.setColumns(10);
		/**
		 * Создаём простой компонент button класса JButton
		 */
		JButton button = new JButton("Сохранить");
		button.setBounds(10, 180, 87, 23);
		/**
		 * Добавляем слушателя к кнопке button с помощью вызова addActionListener
		 */
		button.addActionListener(new ActionListener() {
			/**
			 * Интерфейс ActionListener требует только реализации одного метода —
			 * actionPerformed.
			 */
			public void actionPerformed(ActionEvent e) {
				/**
				 * Вызываем метод для сохранения данных в файл
				 */
				SaveInFile();
			}
		});
		/**
		 * Создаём простой компонент button_1 класса JButton
		 */
		JButton button_1 = new JButton("В меню");
		button_1.setBounds(355, 227, 69, 23);
		/**
		 * Добавляем слушателя к кнопке button_1 с помощью вызова addActionListener
		 */
		button_1.addActionListener(new ActionListener() {
			/**
			 * Интерфейс ActionListener требует только реализации одного метода —
			 * actionPerformed.
			 */
			public void actionPerformed(ActionEvent e) {
				/**
				 * Скрываем окно "Отделочник"
				 */
				frame.setVisible(false);
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(label);
		frame.getContentPane().add(textField);
		frame.getContentPane().add(label_1);
		frame.getContentPane().add(textField_1);
		frame.getContentPane().add(button);
		frame.getContentPane().add(button_1);
	}
	/**
	 * Метод для сохранения в файл
	 */
	private void SaveInFile() {
		/**
		 * Создаем экземпляр класса SaveFile
		 */
		SaveFile sf = new SaveFile();
		/**
		 * Вызываем метод PSaveInFile
		 */
		sf.PSaveInFile();
	}
	/**
	 * Метод для обновления текстовых полей при открытии окна "Отделочник"
	 */
	private void UpdateTextFields() {
		/**
		 * Заполняем поле textField в окне "Отделочник" получая значения через геттер
		 * getAllArea()
		 */
		textField.setText(String.valueOf(Formula.getAllArea()));
		/**
		 * Заполняем поле textField_1 в окне "Отделочник" получая значения через геттер
		 * getFreeArea()
		 */
		textField_1.setText(String.valueOf(Formula.getFreeArea()));
	}
	/**
	 * Публичный метод для установки в окне "Планировщик" значения setVisible
	 */
	public void Visiable(boolean arg) {
		frame.setVisible(arg);
		UpdateTextFields();
	}
	/**
	 * Публичный метод для инициализации окна "Планировщик"
	 */
	public void init(boolean arg) {
		initialize(arg);
	}
}
