package edu.kirkwood.week1demo;

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo(); // this creates a new instance of the Demo class - an object
        demo.sayHello(); // Call a non-static method using an object

        Demo.sayGoodbye(); // Call a static method using the class
    }
}