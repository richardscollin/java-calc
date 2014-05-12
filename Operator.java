public enum Operator {
    PLUS("+"), MINUS("-"), MULT("*"), DIVIDE("÷"), EQUALS("ENTER"), DOT("."), CLEAR("CLS");

    String name;
    private Operator(String s) {
        name = s;
    }

    @Override
    public String toString() {
        return name;
    }
    public static void main(String[] args) {
        System.out.println(DIVIDE);
    }
}
