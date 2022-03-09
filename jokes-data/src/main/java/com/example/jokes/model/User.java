package com.example.jokes.model;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    private String firstName;
    private String lastName;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,firstName,lastName,email);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if( obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return Objects.equals(id, user.id) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(email, user.email);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
