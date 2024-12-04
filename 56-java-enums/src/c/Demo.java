package c;

public class Demo {

    public static void main(String[] args) {
    }
}

enum Gender {
    MALE, FEMALE
}

/*
final class Gender extends Enum{
    public static final Gender MALE = new Gender("MALE", 0);
    public static final Gender FEMALE = new Gender("FEMALE", 1);
    private Gender(String name, int ordinal){
        super(name, ordinal);
    }
}
*/

//=====================================

/*
final class Gender extends Enum {
    public static final Gender MALE;
    public static final Gender FEMALE;
    public static void <clinit>(){
        MALE = new Gender("MALE", 0);
        FEMALE = new Gender("FEMALE", 1);
    }
    private void <init>(String name, int ordinal){
        super(name, ordinal);
    }
    public static Gender[] values(){
        return new Gender[]{MALE, FEMALE};
    }
    public static Gender valueOf(String name){
        for(Gender gender: values()){
            if (gender.name == name) return gender;
        }
        throw new IllegalArgumentException("No enum constant Gender." + name);
    }
}

*/