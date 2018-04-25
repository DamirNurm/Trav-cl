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
	 * Объявляем конструктор JFrame
	 */
	private JFrame frame;
	/**
	 * Объявляем поля ввода JTextField. 
	 * textField_AllArea - Поле для ввода значения всей площади комнаты. 
	 * textField_WidthObj - Поле для ввода значения ширины объекта.
	 * textField_LengthObj - Поле для ввода значения длины объекта. 
	 * textField_FreeArea - Поле для вывода значения свободной площади в комнате.
	 * textField_AmountObj - Поле для вывода количества объектов.
	 */
	private JTextField textField_AllArea; 
	private JTextField textField_WidthObj;
	private JTextField textField_LengthObj;
	private JTextField textField_FreeArea;
	private JTextField textField_AmountObj;
	/**
	 * Создаем экземпляр класса eHandler и возвращает ссылку на вновь созданный объект
	 */
	private eHandler handler = new eHandler();
	/**
	 * Объявляем элементы для отображения текста. 
	 * label_AllArea - Отображает "Введите площадь всей комнаты". 
	 * label_ParametersObj - Отображает "Параметры объекта". 
	 * label_WidthObj - Отображает "Ширина". 
	 * label_LengthObj - Отображает "Длина". 
	 * label_AmountObj - Отображает "Количество объектов".
	 */
	private JLabel label_AllArea;
	private JLabel label_ParametersObj;
	private JLabel label_WidthObj;
	private JLabel label_LengthObj;
	private JLabel label_AmountObj;
	/**
	 * Объявляем элементы для отображения текста. button_AddObject - Кнопка для добавления объекта.
	 * button_CountFreeArea - Кнопка для вызова метода по подсчёту свободной площади в комнате.
	 * button_GoToMainMenu - Кнопка для возвращения в главное меню.
	 * button_DeleteAllObjects - Кнопка для удаления всех объектов из расчётов.
	 */
	private JButton button_AddObject;
	private JButton button_CountFreeArea;
	private JButton button_GoToMainMenu;
	private JButton button_DeleteAllObjects;
	
	/**
	 * Объявляем приватные переменные
	 */
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
		/**
		 * Создаем экземпляр класса Formula
		 */
		fl = new Formula();
		/**
		 * Создаем экземпляр класса ComponentsCreator
		 */
		cc = new ComponentsCreator(frame);
		/**
		 * Создаем экземпляр класса PanelCreator
		 */
		pc = new PanelCreator();

		/**
		 * Создаём простые компоненты класса JLabel
		 */
		label_AllArea = new JLabel();
		label_ParametersObj = new JLabel();
		label_WidthObj = new JLabel();
		label_LengthObj = new JLabel();
		label_AmountObj = new JLabel();

		/**
		 * Создаём простые компоненты класса JTextField
		 */
		textField_AllArea = new JTextField();
		textField_WidthObj = new JTextField();
		textField_LengthObj = new JTextField();
		textField_FreeArea = new JTextField();
		textField_AmountObj = new JTextField();
		
		/**
		 * Создаём простые компоненты класса JButton
		 */
		button_CountFreeArea = new JButton();
		button_GoToMainMenu = new JButton();
		button_AddObject = new JButton();
		button_DeleteAllObjects = new JButton();

		/**
		 * При помощи метода PJTextFieldSettings задаем параметры для textField-ов.
		 * 1-ый параметр - Для какого textField'а задаются следующие параметры.
		 * 2-ой параметр - Разрешено ли редактировать.
		 * 3-ий параметр - Координата размещения по оси X.
		 * 4-ый параметр - Координата размещения по оси Y.
		 * 5-ый параметр - Ширина.
		 * 6-ой параметр - Длина.
		 */

		cc.PJTextFieldSettings(textField_AllArea, true, 10, 20, 86, 20);
		cc.PJTextFieldSettings(textField_WidthObj, true, 10, 109, 86, 20);
		cc.PJTextFieldSettings(textField_LengthObj, true, 10, 155, 86, 20);
		cc.PJTextFieldSettings(textField_FreeArea, false, 248, 228, 86, 20);
		cc.PJTextFieldSettings(textField_AmountObj, false, 308, 58, 44, 20);

		/**
		 * При помощи метода PJLabelSettings задаем параметры для label-ов.
		 * 1-ый параметр - Для какого label'а задаются следующие параметры.
		 * 2-ой параметр - Что будет показано этим label'ом.
		 * 3-ий параметр - Координата размещения по оси X.
		 * 4-ый параметр - Координата размещения по оси Y.
		 * 5-ый параметр - Ширина.
		 * 6-ой параметр - Длина.
		 */
		cc.PJLabelSettings(label_AllArea, "Введите площадь всей комнаты", 10, 0, 434, 14);
		cc.PJLabelSettings(label_ParametersObj, "Параметры объекта", 10, 61, 123, 14);
		cc.PJLabelSettings(label_WidthObj, "Ширина", 10, 89, 69, 14);
		cc.PJLabelSettings(label_LengthObj, "Длина", 10, 135, 69, 14);
		cc.PJLabelSettings(label_AmountObj, "Количество объектов:", 168, 61, 130, 14);

		/**
		 * При помощи метода PJButtonSettings задаем параметры для кнопок.
		 * 1-ый параметр - Для какого button'а задаются следующие параметры.
		 * 2-ой параметр - Что будет написано в этой кнопке.
		 * 3-ий параметр - Координата размещения по оси X.
		 * 4-ый параметр - Координата размещения по оси Y.
		 * 5-ый параметр - Ширина.
		 * 6-ой параметр - Длина.
		 */
		cc.PJButtonSettings(button_AddObject, "Добавить объект", 10, 193, 150, 23);
		cc.PJButtonSettings(button_CountFreeArea, "Расчёт свободной площади", 10, 227, 230, 23);
		cc.PJButtonSettings(button_GoToMainMenu, "В меню", 361, 240, 93, 23);
		cc.PJButtonSettings(button_DeleteAllObjects, "Удалить все объекты", 170, 193, 164, 23);

		/**
		 * Добавляем слушателей для кнопок
		 */
		button_CountFreeArea.addActionListener(handler);
		button_AddObject.addActionListener(handler);
		button_GoToMainMenu.addActionListener(handler);
		button_DeleteAllObjects.addActionListener(handler);
		
		/**
		 * При помощи метода PCreatePanel задаем необходимые параметры для frame
		 */
		pc.PCreatePanel(frame, false);
		/**
		 * При выполнении первой загрузки вызываем метод FirstLoad для того, чтобы заполнилось поле с информацией о значении количества объектов
		 */
		FirstLoad();
	}
	
	/**
	 * Создаём новый класс и реализуем интерфейс.
	 * implements это ключевое слово, предназначенное для реализации интерфейса (interface).
	 */
	private class eHandler implements ActionListener {
		
		/**
		 * Интерфейс ActionListener требует только реализации одного метода —
		 * actionPerformed.
		 * 
		 * ActionEvent - событие
		 */
		public void actionPerformed(ActionEvent e) {

			/**
			 * Проверка нажатия на кнопку button_AddObject
			 */
			if (e.getSource() == button_AddObject) {
				/**
				 * При помощи метода setTextField заполняем поле textField_AmountObj
				 */
				setTextField(textField_AmountObj, fl.PublicAddObject(gettextField_WidthObj(), gettextField_LengthObj()));
			}
			
			/**
			 * Проверка нажатия на кнопку button_CountFreeArea
			 */
			if (e.getSource() == button_CountFreeArea) {
				/**
				 * При помощи метода setTextField заполняем поле textField_FreeArea
				 */
				setTextField(textField_FreeArea, fl.PFormula(gettextField_AllArea()));
			}
			
			/**
			 * Проверка нажатия на кнопку button_GoToMainMenu
			 */
			if (e.getSource() == button_GoToMainMenu) {
				/**
				 * Скрываем окно "Планировщик"
				 */
				frame.setVisible(false);
			}
			
			/**
			 * Проверка нажатия на кнопку DeleteAllObjects
			 */
			if (e.getSource() == button_DeleteAllObjects) {
				/**
				 * При помощи метода setTextField заполняем поле textField_AmountObj
				 */
				setTextField(textField_AmountObj, fl.PublicDeleteObjects());
			}

		}

	}
	
	/**
	 * Приваный метод для заполнения полей(JTextField) значением типа String
	 */
	private void setTextField(JTextField textFieldPL, String text) {
		textFieldPL.setText(text);
	}
	
	/**
	 * Приваный, который заполняет поле textField_AmountObj значением кол-ва созданных объектов.
	 */
	private void FirstLoad() {
		setTextField(textField_AmountObj, String.valueOf(Formula.getAmount()));
	}

	/**
	 * Геттер для получения значения из поля textField_AllArea
	 */
	public String gettextField_AllArea() {
		return textField_AllArea.getText();
	}

	/**
	 * Геттер для получения значения из поля textField_WidthObj
	 */
	public String gettextField_WidthObj() {
		return textField_WidthObj.getText();
	}

	/**
	 * Геттер для получения значения из поля textField_LengthObj
	 */
	public String gettextField_LengthObj() {
		return textField_LengthObj.getText();
	}

	/**
	 * Публичный метод для указания значения для setVisiable в окне "Планировщик"
	 */
	public void Visiable(boolean arg) {
		frame.setVisible(arg);
	}

}
