package d;

public class Demo {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int[] cloneNumbers = numbers.clone();
        System.out.println(numbers == cloneNumbers);
        System.out.println(numbers[0] == cloneNumbers[0]);
        System.out.println(numbers[1] == cloneNumbers[1]);
        System.out.println(numbers[2] == cloneNumbers[2]);
        System.out.println(numbers[3] == cloneNumbers[3]);
        System.out.println(numbers[4] == cloneNumbers[4]);
    }
}

