package lk.ijse.dep13.oop.abstraction.data;

import java.io.Serializable;

public record CustomerTo(String id, String name, String address) implements Serializable {
}
