package ru.lanit.models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "student")
public class Student extends Model implements Serializable {

    public static Finder<Integer, Student> find = new Finder<Integer, Student>("pg", Student.class);

    @Id
    private Integer id;

    @Column(name = "last_name", length = 100, nullable = false)
    private String lastName;

    @Column(name = "first_name", length = 100, nullable = false)
    private String firstName;

    @Column(name = "second_name", length = 100, nullable = false)
    private String secondName;

    @ManyToOne(targetEntity = Group.class)
    private Group group;

    @Column(name = "birthday", nullable = false)
    private Date birthday;





    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
