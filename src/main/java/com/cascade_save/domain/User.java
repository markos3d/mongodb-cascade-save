package com.cascade_save.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.cascade_save.anotation.CascadeSave;

@Document(collection = "user")
public class User {

    @Id
    private String id;

    @Field(name = "first_name")
    private String firstName;

    @Field(name = "last_name")
    private String lastName;

    @DBRef
    @CascadeSave
    @Field("user_details")
    private UserDetails userDetails;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        return id != null && id.equals(((User) o).id);
    }

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", id=" + id + ", lastName=" + lastName + ", userDetails=" + userDetails
                + "]";
    }
}
