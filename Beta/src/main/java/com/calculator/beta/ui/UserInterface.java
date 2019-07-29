package com.calculator.beta.ui;

import javax.swing.*;

import com.calculator.beta.exceptions.InvalidNumberException;
import com.calculator.beta.service.BetaFunction;
import com.calculator.beta.service.IBetaFunction;
import com.calculator.beta.utilities.Constants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * User interface using swing
 * 
 * @author karam
 *
 */
public class UserInterface implements ActionListener {

	private JTextField inputX, inputY, output;
	private JButton calculate, reset;
	private JLabel labelX, labelY, answer, errorMessage;

	public UserInterface() {
		JFrame f = new JFrame();

		labelX = new JLabel("Enter the first number(say x)");
		labelX.setBounds(50, 50, 200, 30);

		inputX = new JTextField();
		inputX.setBounds(320, 50, 50, 30);

		labelY = new JLabel("Enter the second number(say y)");
		labelY.setBounds(50, 100, 200, 30);

		inputY = new JTextField();
		inputY.setBounds(320, 100, 50, 30);

		calculate = new JButton("calculate");
		calculate.setBounds(50, 150, 95, 30);
		reset = new JButton("reset");
		reset.setBounds(180, 150, 95, 30);

		answer = new JLabel("The result is ");
		answer.setBounds(50, 250, 100, 30);

		output = new JTextField();
		output.setBounds(150, 250, 200, 30);
		
		errorMessage = new JLabel("");
		errorMessage.setBounds(50, 300, 400, 30);

		calculate.addActionListener(this);
		reset.addActionListener(this);
		f.add(labelX);
		f.add(inputX);
		f.add(labelY);
		f.add(inputY);
		f.add(reset);
		f.add(calculate);
		f.add(answer);
		f.add(output);
		f.add(errorMessage);

		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String xValue = inputX.getText();
		String yValue = inputY.getText();
		if (xValue == null || yValue == null) {
			handleNullPointerException();
		}
		int x = Integer.parseInt(xValue);
		int y = Integer.parseInt(yValue);
		if (x <= 0 || y <= 0) {
			handleInvalidArgumentException();
		}
		
		if (e.getSource().equals(calculate)) {
			IBetaFunction iBeta = new BetaFunction();
			double result = iBeta.calculateBetaFunction(x, y);
			output.setText(String.valueOf(result));
		} else if (e.getSource().equals(reset)) {
			inputX.setText("");
			inputY.setText("");
			output.setText("");
			errorMessage.setText("");
		}
	}
	
	private void handleInvalidArgumentException() {
		try {
			errorMessage.setText(Constants.INVALID_NUMBER_EXCEPTION);
			throw new InvalidNumberException(Constants.INVALID_NUMBER_EXCEPTION);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
	
	private void handleNullPointerException() {
		try {
			errorMessage.setText(Constants.NULL_POINTER_EXCEPTION);
			throw new NullPointerException(Constants.NULL_POINTER_EXCEPTION);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
}
