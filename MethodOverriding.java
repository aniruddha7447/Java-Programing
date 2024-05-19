package Practice;

public class MethodOverriding {

    public static void main(String[] args) {
        Deer d = new Deer();//Here i have created an obj of class deer so it will must print "Eats only Grass"
        d.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("Eats Anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats only Grass");
    }
}
