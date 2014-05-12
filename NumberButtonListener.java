import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NumberButtonListener implements ActionListener {

    int number;
    Calculator calc;

    public NumberButtonListener(int number, Calculator calc) {
        this.number = number;
        this.calc = calc;
    }

    public void actionPerformed(ActionEvent e) {
        String str = calc.getText();

        if (str.equals(Calculator.DEFAULT_TEXT) ||
                str.charAt(str.length()-1) == '+' ||
                str.charAt(str.length()-1) == '-' ||
                str.charAt(str.length()-1) == '*' ||
                str.charAt(str.length()-1) == '÷' ) {

            calc.setText(""+number);
        } else {
            calc.setText(calc.getText() + number);
        }
    }

    public static void main(String[] args) {
        
    }
}

