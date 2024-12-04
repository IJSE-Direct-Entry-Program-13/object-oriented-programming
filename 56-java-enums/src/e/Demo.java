package e;

public class Demo {

    public static void main(String[] args) {

    }
}

enum Status{
    BACKLOG,
    WIP,
    COMPLETED
}

/*
final class Status extends Enum{
    public static final Status BACKLOG;
    public static final Status WIP;
    public static final Status COMPLETED;

    public static void <clinit>(){
        BACKLOG = new Status("BACKLOG", 0);
        WIP = new Status("WIP", 1);
        COMPLETED = new Status("COMPLETED", 2);
    }

    private void <init>(String name, int ordinal){
        super(name, ordinal);
    }

    public static Status[] values(){
        return new Status[]{BACKLOG, WIP, COMPLETED};
    }

    public static Status valueOf(String name){
        if (name == null) throw new NullPointerException("Name is null");
        for(Status status: values()){
            if (status.name == name) return status;
        }
        throw new IllegalArgumentException("No enum constant Gender." + name);
    }
}
 */