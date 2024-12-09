package b;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Animal[] kooduwa = {new Dog(), new Cat(), new Bird("Paraviya"),
                new Lion(), new Tiger(), new Bird("Girawa")};
        Animal satha = kooduwa[new Random().nextInt(kooduwa.length)];
        satha.print();

//        if (satha instanceof Dog d){
//            d.buranawa();
//        }else if (satha instanceof Cat c){
//            c.chanChunChan();
//        }else if (satha instanceof Bird b){
//            if (b.name.equals("Parviya")){
//                System.out.println("Paraviya kama kannea");
//            }else if (b.name.equals("Girawa")){
//                System.out.println("Girawa kama kannea");
//            }
//            b.kamaOni();
//        }else if (satha instanceof Lion l){
//            l.gorawanawa();
//        }else if(satha instanceof Tiger t){
//            t.kanawaAhuwanaEka();
//        }

        if (satha instanceof Dog d){
            d.buranawa();
        }else if (satha instanceof Cat c){
            c.chanChunChan();
        }else if (satha instanceof Bird b && b.name.equals("Girawa")) {
            System.out.println("Girawek kama kannea");
            b.kamaOni();
        }else if (satha instanceof Bird b && b.name.equals("Paraviya")){
            System.out.println("Paraviyek kama kannea");
            b.kamaOni();
        }else if (satha instanceof Lion l){
            l.gorawanawa();
        }else if(satha instanceof Tiger t){
            t.kanawaAhuwanaEka();
        }

        switch (satha){
            case Dog d -> d.buranawa();
            case Cat c -> c.chanChunChan();
            case Bird b when b.name.equals("Girawa") ->{
                System.out.println("Girawa kama kannea");
                b.kamaOni();
            }
            case Bird b when b.name.equals("Paraviya") -> {
                System.out.println("Parviya kama kannea");
                b.kamaOni();
            }
            case Lion l -> l.gorawanawa();
            case Tiger ti -> ti.kanawaAhuwanaEka();
            default -> throw new IllegalStateException("Invalid value");
        }

//        switch (satha){
//            case Dog d -> d.buranawa();
//            case Cat c -> c.chanChunChan();
//            case Bird b -> {
//                if (b.name.equals("Parviya")){
//                    System.out.println("Paraviya kama kannea");
//                }else if (b.name.equals("Girawa")){
//                    System.out.println("Girawa kama kannea");
//                }
//                b.kamaOni();
//            }
//            case Lion l -> l.gorawanawa();
//            case Tiger ti -> ti.kanawaAhuwanaEka();
//            default -> throw new IllegalStateException("Invalid value");
//        }
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
    String name;
    public Bird(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println("I am a Bird");
    }
    void kamaOni(){
        System.out.println("Kama oni");
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
