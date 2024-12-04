package g;

public class Demo {

    public static void main(String[] args) {
        Status myStatus = Status.COMPLETED;
        System.out.println(myStatus.name());
        System.out.println(myStatus.ordinal());
        Status[] values = myStatus.values();
        System.out.println(values[0] == myStatus);
        //Status status = myStatus.valueOf(null);
        Status status = myStatus.valueOf("NOT_COMPLETED");
        System.out.println(status.name());
        System.out.println(status.ordinal());
    }
}

enum Status {
    COMPLETED, NOT_COMPLETED
}

/*
final class Status extends Enum{
    public static final Status COMPLETED;
    public static final Status NOT_COMPLETED;

    public static void <clinit>(){
        COMPLETED = new Status("COMPLETED", 0);
        NOT_COMPLETED = new Status("NOT_COMPLETED", 1);
    }

    private void <init>(String name, int ordinal){
        super(name, ordinal);
    }

    public static Status[] values(){
        return new Status[]{COMPLETED, NOT_COMPLETED};
    }

    public static Status valueOf(String name){
        if (name == null) throw new NullPointerException("Name is null");
        for(Status status: values()){
            if (status.name().equals(name)) return status;
        }
        throw new IllegalArgumentException("No enum constant Status." + name);
    }
}
 */
