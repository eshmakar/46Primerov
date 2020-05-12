package Test2;

class A {
    public A() {
        strl = abc("Stringl");
    }

    static String strl = abc("String2");
    String str3 = abc("String3");

    {
        strl = abc("String4");
    }

    static {
        strl = abc("String5");
    }

    static String str2 = abc("String6");
    String str4 = abc("String7");

    public static void main(String args[]) {
        A a = new A();
    }

    static String abc(String str) {
        System.out.println(str);
        return str;
    }
}
/*

OUTPUT

String2
String5
String6
String3
String4
String7
Stringl

*/
