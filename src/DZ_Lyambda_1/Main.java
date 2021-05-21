package DZ_Lyambda_1;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1,2);
        int b = calc.minus.apply(5,2);
        int c = calc.devide.apply(b,a);
        int d = calc.multiply.apply(a,c);
        int e = calc.pow.apply(9);
        int f = calc.abs.apply(-7);

        calc.println.accept(c);
        calc.println.accept(d);
        calc.println.accept(e);
        calc.println.accept(f);
    }
}