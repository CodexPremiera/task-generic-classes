package arithmetic;

public class Arithmetic<T extends Number> {
    /* FIELDS */
    private final Number num1;
    private final Number num2;
    private T type;

    boolean typeIsDecimal;
    boolean eitherNumIsDecimal;

    boolean eitherNumIsLong;
    boolean eitherNumIsInteger;
    boolean eitherNumIsShort;

    private boolean isNumberDecimal(Number num) {
        return num instanceof Double || num instanceof Float;
    }

    /* CONSTRUCTOR */
    @SuppressWarnings("unchecked")
    public Arithmetic(Number num1, Number num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.type = (T) num1;

        this.typeIsDecimal = isNumberDecimal(type);
        this.eitherNumIsDecimal = isNumberDecimal(num1) || isNumberDecimal(num2);

        this.eitherNumIsLong = num1 instanceof Long || num2 instanceof Long;
        this.eitherNumIsInteger = num1 instanceof Integer || num2 instanceof Integer;
        this.eitherNumIsShort = num1 instanceof Short || num2 instanceof Short;
    }

    /* METHODS */
    public Number add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public Number subtract() {
        return num1.doubleValue() - num2.doubleValue();
    }

    public Number multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }

    public Number divide() {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Cannot divide by num2 with value 0.");
        }

        return num1.doubleValue() / num2.doubleValue();
    }

    public Number getMin() {
        return Math.min(num1.doubleValue(), num2.doubleValue());
    }

    public Number getMax() {
        return Math.max(num1.doubleValue(), num2.doubleValue());
    }
}
