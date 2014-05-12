import javax.swing.JButton;

public class OperatorButton extends JButton {

    private Operator operator;

    public OperatorButton(Operator op, Calculator calc) {
        super(op.toString());
        operator = op;
        this.addActionListener(new OperatorButtonListener(operator, calc));
    }

}

