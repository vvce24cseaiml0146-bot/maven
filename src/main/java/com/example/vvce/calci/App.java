package com.example.vvce.calci;

public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public double average(int a, int b) {
        return (a + b) / 2.0;
    }

    public static void main(String[] args) {
        App app = new App();

        System.out.println(app.add(5, 6));
        System.out.println(app.sub(5, 6));
        System.out.println(app.mul(5, 6));
        System.out.println(app.average(3, 2));
    }
}
