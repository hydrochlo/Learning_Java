package com.shahadat.staticExample;

class Test2{
    static String name;

    public Test2(String name) {
        Test2.name = name;
    }
}

public class InnerClasses {
    static class Test{
        static String name;

        public Test(String name) {
            Test.name = name;
        }
    }

    static class Test3 {
        String name;

        public Test3(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Fatima");
        Test f = new Test("Fatiha");
        System.out.println(a.name);
        System.out.println(f.name);


        Test2 b = new Test2("Shahadat");
        Test2 c = new Test2("Hossain");

        System.out.println(b.name);
        System.out.println(c.name);

        Test3 d = new Test3("Mirazul Islam");
        Test3 e = new Test3("Mati");

        System.out.println(d.name);
        System.out.println(e.name);

        System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
        System.out.println(d);
        System.out.println(e);
    }

}

