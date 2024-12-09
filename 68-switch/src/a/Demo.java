package a;

public class Demo {

    public static void main(String[] args) {
        System.out.println("I am a statement");
        if (true) System.out.println("I am a statement too");

//        if (false);
//        while (false);
//        do;while(false);
//        for(;false;);

        int expression = 10 + 15;
        switch (expression){
            // You can't use yield statement here because this is not a switch expression
//            case 5:
//                yield 10;
//            default:
//                yield 20;
        }

        System.out.println(switch (expression){
            case 5:
                yield 10;
            default:
                yield 20;
        });
    }
}
