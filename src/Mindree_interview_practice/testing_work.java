package Mindree_interview_practice;

class Animal {
    public void walks(){
        System.out.println("This animal is walking");
    }
    public void eats(){
        System.out.println("This animal is eating");
    }
}
class Dog extends Animal{
    public void barks(){
        System.out.println("This animal is barking");
    }
    public void eats(){
        System.out.println("This animal is carnivorous");
    }
}
class Cow extends Animal{
    public void walks(){
        System.out.println("This animal walks with 4 legs");
    }
    public void sound(){
        System.out.println("This animal Mows");
    }
}

public class testing_work{
    public static void main(String[] args) {
        Animal ob = new Dog() ;
        ob.eats();
        ob.walks();
        Animal ob2 = new Cow() ;
        ob2.walks();
        ob2.eats();
        System.out.println("Hello World");
    }
}
