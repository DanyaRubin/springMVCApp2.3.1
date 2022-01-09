package web.models;

import javax.persistence.*;

@Entity
@Table(name = "User", schema = "data-base")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    String name;
    int flat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User(String name, int flat) {
        this.name = name;
        this.flat = flat;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", flat=" + flat +
                '}';
    }


}
