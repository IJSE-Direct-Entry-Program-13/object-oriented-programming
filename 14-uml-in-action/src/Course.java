import java.util.ArrayList;

public class Course {
    private String id;
    private String name;
    private ArrayList<Module> moduleList;

    public Course(String id, String name, ArrayList<Module> moduleList) {
        if (id == null || id.isBlank() || name == null || name.isBlank() ||
                moduleList == null || moduleList.isEmpty()) {
            throw new IllegalStateException("Course id, name or module list can't be empty or null");
        }
        this.id = id;
        this.name = name;
        this.moduleList = moduleList;
    }

    public void printModules() {
        System.out.printf("Course: %s Module List %n", name);
        for (int i = 0; i < moduleList.size(); i++) {
            System.out.printf("Module: %s - %s", moduleList.get(i).getId(), moduleList.get(i).getName());
        }
    }

    public void addModule(Module module) {
        if (module == null || module.getId() == null || module.getId().isBlank() ||
                module.getName() == null || module.getName().isBlank()) {
            throw new IllegalStateException("Invalid module");
        }
        for (int i = 0; i < moduleList.size(); i++) {
            Module mod = moduleList.get(i);
            if (mod.getId().equals(module.getId())) { throw new IllegalStateException("Duplicate module"); }
        }
        this.moduleList.add(module);
    }

    public boolean removeModule(String moduleId){
        for (int i = 0; i < moduleList.size(); i++) {
            Module mod = moduleList.get(i);
            if (mod.getId().equals(moduleId)) {
                if (this.moduleList.size() == 1) throw new IllegalStateException("Module list can't be empty");
                this.moduleList.remove(i);
                return true;
            }
        }
        return false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.isBlank()) throw new IllegalStateException("Id can't be null or empty");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) throw new IllegalStateException("Name can't be null or empty");
        this.name = name;
    }
}
