public class Calculator {

    public static void main(String[] args) {
        System.out.println(calculate(10,20,'+'));
        System.out.println(calculate(10,20,'-'));
        System.out.println(calculate(10,2,'/'));
        System.out.println(calculate(10,2,'*'));
        System.out.println(calculate(10,7,'%'));
        System.out.println(calculate(10,7,'^'));
    }


    public static double calculate(double num1, double num2, char operator){
        if (operator == '+'){
            return num1 + num2;
        }else if (operator == '-'){
            return num1 - num2;
        }else if (operator == '*'){
            return num1 * num2;
        }else if (operator == '/') {
            return num1 / num2;
        }else if (operator == '%'){
            return num1 % num2;
        }else{
            throw new RuntimeException("Unknown operator");
        }
    }
}
