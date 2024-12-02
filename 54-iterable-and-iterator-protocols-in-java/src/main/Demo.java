package main;

public class Demo {

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        int x = 0;
        while (x < nums.length) {
            int value = nums[x];
            System.out.println(value);
            x++;
        }

        System.out.println("==================");

        x = 0;
        do {
            int value = nums[x];
            System.out.println(value);
            x++;
        } while (x < nums.length);

        System.out.println("==================");

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            System.out.println(value);
        }

        System.out.println("==================");

        /* Pros (Advantages)
        * 1. Readability
        * 2. Simplicity
        * */

        /* Cons (Drawbacks)
        * 1. You can't set the starting point of the loop
        * 2. You can't set the predicate (condition of the loop) hence you can't control the iteration logic
        * 3. You can't manipulate the step of the loop
        * */

        for (final int value : nums) {
            System.out.println(value);
        }
    }
}
