package ru.yandex.zhmyd.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    @OneToMany(mappedBy = "boss",fetch = FetchType.LAZY)
    private List<User> users;

    @ManyToOne
    private User boss;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getBoss() {
        return boss;
    }

    public void setBoss(User boss) {
        boss.getUsers().add(this);
        this.boss = boss;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + "\'}";
    }
}
