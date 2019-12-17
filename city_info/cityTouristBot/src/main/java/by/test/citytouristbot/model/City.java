package by.dorozhuk.citytouristbot.model;

public class City {

    private Integer id;

    private String name;

    public City() {
    }

    public City(String name) {
        this.id = null;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
