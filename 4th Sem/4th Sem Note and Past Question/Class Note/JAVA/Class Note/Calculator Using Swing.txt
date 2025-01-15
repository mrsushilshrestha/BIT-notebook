package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    JLabel calLabel, firstNumber, secondNumber, result;
    JTextField textFirst, textSecond, textResult;
    JButton addButton, subButton, exitButton;

    Calculator() {
        JFrame frame = new JFrame("Java Program Calculator");

        calLabel = new JLabel("Calculator");
        calLabel.setBounds(10, 5, 100, 30);
        frame.add(calLabel);

        firstNumber = new JLabel("First Number:");
        firstNumber.setBounds(10, 40, 100, 30);
        frame.add(firstNumber);

        textFirst = new JTextField();
        textFirst.setBounds(110, 40, 150, 30);
        frame.add(textFirst);

        secondNumber = new JLabel("Second Number:");
        secondNumber.setBounds(10, 75, 100, 30);
        frame.add(secondNumber);

        textSecond = new JTextField();
        textSecond.setBounds(110, 75, 150, 30);
        frame.add(textSecond);

        result = new JLabel("Result:");
        result.setBounds(10, 110, 100, 30);
        frame.add(result);

        textResult = new JTextField();
        textResult.setBounds(110, 110, 150, 30);
        frame.add(textResult);
        textResult.setEditable(false);

        addButton = new JButton("ADD");
        addButton.setBounds(25, 155, 80, 30);
        frame.add(addButton);

        subButton = new JButton("SUB");
        subButton.setBounds(110, 155, 80, 30);
        frame.add(subButton);

        exitButton = new JButton("Exit");
        exitButton.setBounds(195, 155, 80, 30);
        frame.add(exitButton);

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        exitButton.addActionListener(this);

        frame.setSize(500, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(textFirst.getText());
        int num2 = Integer.parseInt(textSecond.getText());
        int resultNum = 0;

        if (e.getSource() == addButton) {
            resultNum = num1 + num2;
        } else if (e.getSource() == subButton) {
            resultNum = num1 - num2;
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }

        String resultShow = String.valueOf(resultNum);
        textResult.setText(resultShow);
    }
    public static void main(String[] args) {
        new Calculator();
    }
}