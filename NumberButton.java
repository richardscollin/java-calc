import javax.swing.JButton;

public class NumberButton extends JButton {

    public NumberButton(int number, Calculator calc) {
        super(""+number);
        this.addActionListener(new NumberButtonListener(number, calc));
    }

}

