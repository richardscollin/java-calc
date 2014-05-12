import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorButtonListener implements ActionListener {

    private Operator op;
    private Calculator calc;

    public OperatorButtonListener(Operator op, Calculator calc) {
        this.op = op;
        this.calc = calc;
    }

    private void saveState() {
        try {
            calc.setLastNumber(Double.parseDouble(calc.getText()));
            calc.setLastOperator(this.op);
            calc.setText(calc.getText()+this.op.toString());
        } catch (Exception e) {
            System.out.println("Invalid input");
            calc.setText(Calculator.DEFAULT_TEXT);
        }
    }

    private void doMath() {
        double currentDouble = (Double.parseDouble(calc.getText()));

        double ans = operate(calc.getLastNumber()
                ,currentDouble,calc.getLastOperator());

        calc.setText(""+ans);
    }

    private double operate(double a, double b, Operator op) {
        switch (op) {
            case PLUS:   return a + b;
            case MINUS:  return a - b;
            case MULT:   return a * b;
            case DIVIDE: return a / b;
            default:     return 0;
        }
    }

    public void actionPerformed(ActionEvent e) {
        switch (op) {
            case DOT:   calc.setText(calc.getText()+".");
                        break;
            case CLEAR: calc.setText(Calculator.DEFAULT_TEXT);
                        calc.setLastNumber(0.0);
                        break;
            case PLUS:  
            case MINUS:
            case MULT:
            case DIVIDE: saveState();
                         break;
            case EQUALS: doMath();
                         break;
        }
    }

    public static void main(String[] args) {
        
    }
}
