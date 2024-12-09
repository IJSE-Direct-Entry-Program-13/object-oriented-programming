package a;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Animal[] kooduwa = {new Dog(), new Cat(), new Bird(), new Lion(), new Tiger()};
        Animal satha = kooduwa[new Random().nextInt(kooduwa.length)];
        satha.print();
//        if (satha instanceof Dog d){
//            d.buranawa();
//        }else if (satha instanceof Cat c){
//            c.chanChunChan();
//        }else if (satha instanceof Bird b){
//            b.kamaOni();
//        }else if (satha instanceof Lion l){
//            l.gorawanawa();
//        }else if(satha instanceof Tiger t){
//            t.kanawaAhuwanaEka();
//        }
        switch (satha){
            case Dog d -> d.buranawa();
            case Cat c -> c.chanChunChan();
            case Bird b -> b.kamaOni();
            case Lion l -> l.gorawanawa();
            case Tiger ti -> ti.kanawaAhuwanaEka();
            default -> throw new IllegalStateException("Invalid value");
        }
    }
}

abstract class Animal{
    abstract void print();
}
class Dog extends Animal{
    public void print(){
        System.out.println("I am a Dog");
    }
    void buranawa(){
        System.out.println("Baw baw...");
    }
}
class Cat extends Animal{
    public void print(){
        System.out.println("I am a Cat");
    }
    void chanChunChan(){
        System.out.println("Yaw chan chun");
    }
}
class Bird extends Animal{
    public void print(){
        System.out.println("I am a Bird");
    }
    void kamaOni(){
        System.out.println("Petthata kama oni");
    }
}
class Lion extends Animal{
    public void print(){
        System.out.println("I am a Lion");
    }
    void gorawanawa(){
        System.out.println("Gorawawa ahfds8***___>>>>");
    }
}
class Tiger extends Animal{
    public void print(){
        System.out.println("I am a Tiger");
    }
    void kanawaAhuwanaEka(){
        System.out.println("Kanawa yako...");
    }
}
