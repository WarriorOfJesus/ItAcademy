package itacademy.interface1;

public class Chicken implements Postponanble {
    private String name;
    private String kindOfShark;

    public Chicken(String name, String kindOfShark) {
        this.name = name;
        this.kindOfShark = kindOfShark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKindOfShark() {
        return kindOfShark;
    }

    public void setKindOfShark(String kindOfShark) {
        this.kindOfShark = kindOfShark;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "name='" + name + '\'' +
                ", kindOfShark='" + kindOfShark + '\'' +
                '}';
    }

    @Override
    public void postponeEgg() {
        System.out.println("the Chicken lays eggs ");
    }
}
