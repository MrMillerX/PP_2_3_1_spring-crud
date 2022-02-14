package CrudApplication.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    @Column
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column
    private byte age;

    public User() {

    }

    public User(String name, String lastName, byte age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{ ");
        sb.append("ID = ").append(ID);
        sb.append(", name = '").append(name).append('\'');
        sb.append(", lastName = '").append(lastName).append('\'');
        sb.append(", age = ").append(age);
        sb.append(" }");
        return sb.toString();
    }
}
