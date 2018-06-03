package come.practice.class17;

public class OverloadOverrideExamples {
    public static class A {
        public String show(D obj) {
            return "A and D";
        }
        public String show(A obj) {
            return "A and A";
        }
    }
    public static class B extends A {
        public String show(B obj) {
            return "B and B";
        }
        public String show(A obj) {
            return "B and A";
        }
    }
    public static class C extends B {}
    public static class D extends B {}

    public static class Test {
        public static void main(String[] args) {
            A a1 = new A();
            A a2 = new B();
            B b = new B();
            C c = new C();
            D d = new D();

            System.out.println("example 1: " + a1.show(b)); // "A and A"
            System.out.println("example 2: " + a1.show(c)); // "A and A"
            System.out.println("example 3: " + a1.show(d)); // "A and D"
            System.out.println("example 4: " + a2.show(b)); // "B and A"
            System.out.println("example 5: " + a2.show(c)); // "B and A"
            System.out.println("example 6: " + a2.show(d)); // "A and D"
            System.out.println("example 7: " + b.show(b));  // "B and B"
            System.out.println("example 8: " + b.show(c));  // "B and B"
            System.out.println("example 9: " + b.show(d));  // "A and D"
        }
    }
}
