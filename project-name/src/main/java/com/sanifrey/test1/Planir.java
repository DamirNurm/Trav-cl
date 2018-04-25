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
/**
 * Подключаем класс событий
 */
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Planir {
	/**
	 * Для создания основного контейнера для приложения используем контейнер JFrame
	 */
	private JFrame frame;
	/**
	 * Объявляем поля ввода JTextField. textField - Поле для ввода значения всей
	 * площади комнаты. textField_1 - Поле для ввода значения ширины объекта.
	 * textField_2 - Поле для ввода значения длины объекта. textField_3 - Поле для
	 * вывода значения свободной площади в комнате.
	 */
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	private eHandler handler = new eHandler();
	/**
	 * Объявляем элементы для отображения текста. label - Отображает "Введите
	 * площадь всей комнаты". lblNewLabel - Отображает "Параметры объекта". label_1
	 * - Отображает "Ширина". label_2 - Отображает "Длина".
	 */
	private JLabel label;
	private JLabel lblNewLabel;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;

	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private ComponentsCreator cc;
	private PanelCreator pc;

	private Formula fl;

	/**
	 * Вызываем конструктор.
	 */
	public Planir() {
		/**
		 * Вызываем метод
		 */
		initialize();
	}

	/**
	 * Инициализируем компоненты фрейма
	 */
	private void initialize() {
		/**
		 * Создаем экземпляр класса JFrame
		 */
		frame = new JFrame();
		fl = new Formula();

		pc = new PanelCreator();
		pc.PCreatePanel(frame, false);

		/**
		 * Создаём простые компоненты класса JLabel
		 */
		label = new JLabel();
		lblNewLabel = new JLabel();
		label_1 = new JLabel();
		label_2 = new JLabel();
		label_3 = new JLabel();

		/**
		 * Создаём простые компоненты класса JTextField
		 */
		textField = new JTextField();
		textField_1 = new JTextField();
		textField_2 = new JTextField();
		textField_3 = new JTextField();
		textField_4 = new JTextField();
		/**
		 * Указываем количество символов в строке
		 */

		button_1 = new JButton();
		button_2 = new JButton();
		button = new JButton();
		button_3 = new JButton();

		/**
		 * Создаем экземпляр класса Formula
		 */
		cc = new ComponentsCreator(frame);

		cc.PJTextFieldSettings(textField, true, 10, 20, 86, 20);
		cc.PJTextFieldSettings(textField_1, true, 10, 109, 86, 20);
		cc.PJTextFieldSettings(textField_2, true, 10, 155, 86, 20);
		cc.PJTextFieldSettings(textField_3, false, 248, 228, 86, 20);
		cc.PJTextFieldSettings(textField_4, false, 308, 58, 44, 20);

		cc.PJLabelSettings(label, "Введите площадь всей комнаты", 10, 0, 434, 14);
		cc.PJLabelSettings(lblNewLabel, "Параметры объекта", 10, 61, 123, 14);
		cc.PJLabelSettings(label_1, "Ширина", 10, 89, 69, 14);
		cc.PJLabelSettings(label_2, "Длина", 10, 135, 69, 14);
		cc.PJLabelSettings(label_3, "Количество объектов:", 168, 61, 130, 14);

		cc.PJButtonSettings(button, "Добавить объект", 10, 193, 150, 23);
		cc.PJButtonSettings(button_1, "Расчёт свободной площади", 10, 227, 230, 23);
		cc.PJButtonSettings(button_2, "В меню", 361, 240, 93, 23);
		cc.PJButtonSettings(button_3, "Удалить все объекты", 170, 193, 164, 23);

		/**
		 * Добавляем фильтр на вводимые символы
		 */

		/**
		 * Создаём простой компонент button_1 класса JButton
		 */

		button_1.addActionListener(handler);
		button.addActionListener(handler);
		button_2.addActionListener(handler);
		button_3.addActionListener(handler);
		
		FirstLoad();
	}

	private class eHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == button) {
				setTextField(textField_4, fl.PublicAddObject(gettextField_1(), gettextField_2()));
			}
			if (e.getSource() == button_1) {
				setTextField(textField_3, fl.PFormula(gettextField()));
			}
			if (e.getSource() == button_2) {
				frame.setVisible(false);
			}
			if (e.getSource() == button_3) {
				setTextField(textField_4, fl.PublicDeleteObjects());
			}

		}

	}

	private void setTextField(JTextField textFieldPL, String text) {
		textFieldPL.setText(text);
	}

	/**
	 * Геттер для получения значения из поля textField
	 */
	public String gettextField() {
		return textField.getText();
	}

	/**
	 * Геттер для получения значения из поля textField_1
	 */
	public String gettextField_1() {
		return textField_1.getText();
	}

	/**
	 * Геттер для получения значения из поля textField_2
	 */

	public String gettextField_2() {
		return textField_2.getText();
	}

	/**
	 * Публичный метод для указания значения для setVisiable в окне "Планировщик"
	 */
	public void Visiable(boolean arg) {
		frame.setVisible(arg);
	}

	public void setFrame(JFrame Pframe) {
		frame = Pframe;
	}
	
	public void FirstLoad() {
		setTextField(textField_4, String.valueOf(Formula.getAmount()));
	}
}
