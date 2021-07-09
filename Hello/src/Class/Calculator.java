package Class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
	private JTextField textField;
	private JPanel panel;
	private JButton[] numberButtons;
	private JButton addButton, subButton, mulButton, divButton, decButton, equButton, delButton, clrButton, negButton;
	private Font myFont = new Font(Font.SANS_SERIF, Font.BOLD, 30);
	
	private ActionListener listener = new MyActionListener();
	public Calculator() {
		this.setTitle("Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420, 550);
		this.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(50, 25, 300, 50);
		textField.setFont(myFont);
		textField.setEditable(false);
		
		panel = new JPanel();
		panel.setBounds(50, 100, 300, 300);
		panel.setLayout(new GridLayout(4, 4, 10, 10));
		
		numberButtons = new JButton[10];
		for (int i = 0; i < numberButtons.length; i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
			numberButtons[i].addActionListener(this);
		}
		
		addButton = new JButton("+");
		addButton.setFocusable(false);
		addButton.setFont(myFont);
		addButton.addActionListener(this);
		
		
		subButton = new JButton("-");
		subButton.setFocusable(false);
		subButton.setFont(myFont);
		subButton.addActionListener(this);
		
		mulButton = new JButton("*");
		mulButton.setFocusable(false);
		mulButton.setFont(myFont);
		mulButton.addActionListener(this);
		
		divButton = new JButton("/");
		divButton.setFocusable(false);
		divButton.setFont(myFont);
		divButton.addActionListener(this);
		
		decButton = new JButton(".");
		decButton.setFocusable(false);
		decButton.setFont(myFont);
		decButton.addActionListener(this);
		
		equButton = new JButton("=");
		equButton.setFocusable(false);
		equButton.setFont(myFont);
		equButton.addActionListener(this);
		
		delButton = new JButton("Delete");
		delButton.setFocusable(false);
		delButton.setBounds(150, 430, 100 ,50);
		delButton.addActionListener(this);
		
		clrButton = new JButton("Clear");
		clrButton.setFocusable(false);
		clrButton.setBounds(250, 430, 100 ,50);
		clrButton.addActionListener(this);
		
		negButton = new JButton("(-)");
		negButton.setFocusable(false);
		negButton.setBounds(50,430,100,50);
		negButton.addActionListener(this);
		
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButton);
		
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subButton);

		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulButton);
		
		panel.add(decButton);
		panel.add(numberButtons[0]);
		panel.add(equButton);
		panel.add(divButton);
		
		
		this.add(negButton);
		this.add(clrButton);
		this.add(delButton);
		this.add(panel);
		this.add(textField);
		this.setLocationRelativeTo(null); // frame이 화면 중앙에 나타나도록 함.
		this.setVisible(true);
	}

public static void main(String[] arg) {
	JFrame calculator = new Calculator();
}

@Override
public void actionPerformed(ActionEvent e) {
	for (int i = 0; i < numberButtons.length; i++) {
		if (e.getSource() == numberButtons[i]) {
			System.out.println(i + " 버튼이 클릭되었습니다.");
			break;
		}
	}
	if (e.getSource() == decButton) {
		System.out.println("decimal 버튼이 클릭되었습니다.");
	}else if (e.getSource() == addButton || e.getSource()==subButton ||
			e.getSource() == mulButton || e.getSource() == divButton) {
			System.out.println(((JButton)(e.getSource())).getText() + "버튼이 클릭되었습니다.");
	}else if (e.getSource() == equButton) {
		System.out.println("= 버튼이 클릭되었습니다.");
	}else if (e.getSource() == clrButton) {
		System.out.println("clear 버튼이 클릭되었습니다.");
	}else if (e.getSource() == delButton) {
		System.out.println("delete 버튼이 클릭되었습니다.");
	}else if (e.getSource() == negButton) {
		System.out.println("마이너스 버튼이 클릭되었습니다.");
	}
	
}


}
