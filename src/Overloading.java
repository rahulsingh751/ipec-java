public class Overloading {
    public static void main(String[] args) {
        System.out.println(add(90, 88));
        System.out.println(add(90, 83, 387));
        System.out.println(add(83, 93, 28, 29));
        System.out.println(add("Mark", 28));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    static String add(String name, int age) {
        return name + " " + age;
    }
}
