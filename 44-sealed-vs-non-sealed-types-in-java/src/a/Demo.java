package a;

public class Demo {
    public static void main(String[] args) {

    }
}

sealed interface MyMillionDollarIdea1 permits MyMillionDollarIdea2{}

sealed interface MyMillionDollarIdea2 extends MyMillionDollarIdea1 permits BitCoin{}

final class BitCoin implements MyMillionDollarIdea2{}

//class MyTestCoin1 implements MyMillionDollarIdea1{}
//class MyTestCoin2 implements MyMillionDollarIdea2{}
