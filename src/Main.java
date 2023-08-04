public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2); // a = 3
        int b = calc.minus.apply(1, 1); // b = 0
        int c = calc.devide.apply(a, b); // c = 3/0, а на ноль делить нельзя

        calc.println.accept(c);
    }
}
