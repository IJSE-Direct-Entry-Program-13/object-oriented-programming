package d;

public class Demo {

    public static void main(String[] args) {
        switch (Status.values()[(int) (Math.random() * 3)]){
            case WIP:
                System.out.println("WIP");
                break;
            case BACKLOG:
                System.out.println("BACKLOG");
                break;
            case PENDING:
                System.out.println("PENDING");
                break;
        }

        switch (Status.values()[(int) (Math.random() * 3)]){
            case WIP ->
                System.out.println("WIP");
            case BACKLOG ->
                System.out.println("BACKLOG");
            case PENDING ->
                System.out.println("PENDING");
        }
    }
}

enum Status{
    BACKLOG, WIP, PENDING
}