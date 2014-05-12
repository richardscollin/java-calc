import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    public static final String DEFAULT_TEXT = "0.0";

    JLabel calcDisplay;
    Double lastNumber = 0.0;
    Operator lastOperator;

    public Calculator() {
        super("Calculator");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        makeButtons(buttonPanel);

        super.add(buttonPanel, BorderLayout.CENTER);
        JPanel display = new JPanel();
        makeDisplay(display);

        super.add(display, BorderLayout.NORTH);

        JPanel enterPanel = new JPanel();
        enterPanel.setLayout(new BorderLayout());
        enterPanel.add(new OperatorButton(Operator.EQUALS,this),BorderLayout.EAST);
        super.add(enterPanel, BorderLayout.SOUTH);
    }

    private void makeDisplay(JPanel panel) {
        calcDisplay = new JLabel(lastNumber.toString(), JLabel.RIGHT);
        panel.add(calcDisplay);
    }

    private void makeButtons(JPanel panel) {
        int rows = 4;
        int cols = 4;
        panel.setLayout(new GridLayout(rows,cols));
        panel.add(new NumberButton(1,this));
        panel.add(new NumberButton(2,this));
        panel.add(new NumberButton(3,this));
        panel.add(new OperatorButton(Operator.PLUS,this));
        panel.add(new NumberButton(4,this));
        panel.add(new NumberButton(5,this));
        panel.add(new NumberButton(6,this));
        panel.add(new OperatorButton(Operator.MINUS,this));
        panel.add(new NumberButton(7,this));
        panel.add(new NumberButton(8,this));
        panel.add(new NumberButton(9,this));
        panel.add(new OperatorButton(Operator.MULT,this));
        panel.add(new OperatorButton(Operator.DOT,this));
        panel.add(new NumberButton(0,this));
        panel.add(new OperatorButton(Operator.CLEAR,this));
        panel.add(new OperatorButton(Operator.DIVIDE,this));
    }

    public String getText() {
        return calcDisplay.getText();
    }
    public void setText(String text) {
        calcDisplay.setText(text);
    }

    public Double getLastNumber() {
        return lastNumber;
    }
    public void setLastNumber(Double number) {
        lastNumber = number;
    }
    public void setLastOperator(Operator lastOperator) {
        this.lastOperator = lastOperator;
    }
    public Operator getLastOperator() {
        return lastOperator;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.pack();
        c.show();
    }
}

