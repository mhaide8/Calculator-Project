import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener {

    JLabel n1,n2,result;

    JButton add,subtract,multiply,divide,clear;

    JTextField t1,t2,t3;

    public Calculator() {
        JFrame calc = new JFrame();
        calc.setSize(400, 580);
        calc.setTitle("Basic Calculator");
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
        calc.setLayout(new GridLayout(6,6));

        n1 = new JLabel("First Input: ", JLabel.LEFT);
        n2 = new JLabel("Second Input: ", JLabel.LEFT);
        result = new JLabel("Result: ", JLabel.LEFT);

        add = new JButton("+");
        subtract = new JButton("-");
        multiply = new JButton("*");
        divide = new JButton("/");

        clear = new JButton("Clear");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        clear.addActionListener(this);

        calc.add(n1);
        calc.add(t1);
        calc.add(n2);
        calc.add(t2);
        calc.add(result);
        calc.add(t3);
        calc.add(add);
        calc.add(subtract);
        calc.add(multiply);
        calc.add(divide);
        calc.add(clear);
    }

    public void actionPerformed(ActionEvent e) {

        String operation = e.getActionCommand();
        double firstNumber = 0;
        double secondNumber = 0;
        double total = 0;

        try
        {
            firstNumber = Double.parseDouble(t1.getText());
            secondNumber = Double.parseDouble(t2.getText());
        }
        catch (NumberFormatException e1)
        {
            JOptionPane.showMessageDialog(null,"Invalid input/No Input. Please enter a decimal or integer value only");
            t1.setText("");
            t2.setText("");
            t3.setText("");

        }

        if (operation.equals("+"))
        {
            total = firstNumber + secondNumber;
        }
        else if (operation.equals("-"))
        {
            total = firstNumber - secondNumber;
        }
        else if (operation.equals("*"))
        {
            total = firstNumber * secondNumber;
        }
        else if (operation.equals("/"))
        {
            total = firstNumber / secondNumber;
        }
        else if (operation.equals("Clear"))
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }

        t3.setText("" + total);


    }


    public static void main(String[] args ) {

        Calculator c = new Calculator();

    }


}
