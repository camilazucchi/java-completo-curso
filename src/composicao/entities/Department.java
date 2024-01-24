package composicao.entities;

public class Department {

    private String name;

    // Construtor sem argumentos:
    public Department() {}

    // Construtor com argumento "name":
    public Department(String name) {
        this.name = name;
    }

    // Getters e setters:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
