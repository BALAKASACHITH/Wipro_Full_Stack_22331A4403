class OperatorsDemo {
    public static void main(String[] args) {
        int a = 15, b = 4;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        int c = 10;
        c += 5;
        System.out.println("c += 5: " + c);
        c -= 3;
        System.out.println("c -= 3: " + c);
        c *= 2;
        System.out.println("c *= 2: " + c);
        c /= 4;
        System.out.println("c /= 4: " + c);
        c %= 3;
        System.out.println("c %= 3: " + c);

        int d = 7, e = 10;
        System.out.println("d == e: " + (d == e));
        System.out.println("d != e: " + (d != e));
        System.out.println("d > e: " + (d > e));
        System.out.println("d < e: " + (d < e));
        System.out.println("d >= e: " + (d >= e));
        System.out.println("d <= e: " + (d <= e));

        int f = 5, g = 3;
        System.out.println("f & g: " + (f & g));
        System.out.println("f | g: " + (f | g));
        System.out.println("f ^ g: " + (f ^ g));
        System.out.println("~f: " + (~f));
        System.out.println("f << 1: " + (f << 1));
        System.out.println("f >> 1: " + (f >> 1));
        System.out.println("f >>> 1: " + (f >>> 1));
    }
}
