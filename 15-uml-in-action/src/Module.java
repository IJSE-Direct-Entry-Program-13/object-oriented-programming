public class Module {
    private String id;
    private String name;

    public Module(String id, String name) {
        if (id == null || id.isBlank() || name == null || name.isBlank()) {
            throw new IllegalStateException("Module id or name can't be null or empty");
        }
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.isBlank()) throw new IllegalStateException("Module id can't be null or empty");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) throw new IllegalStateException("Module name can't be null or empty");
        this.name = name;
    }
}
