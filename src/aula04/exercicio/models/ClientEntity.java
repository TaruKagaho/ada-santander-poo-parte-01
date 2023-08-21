package aula04.exercicio.models;

public class ClientEntity {
    private static long countClient = 0;
    private long id;
    private String name;
    private String address;

    public ClientEntity(String name, String address) {
        this.id = ++countClient;
        this.name = name;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
