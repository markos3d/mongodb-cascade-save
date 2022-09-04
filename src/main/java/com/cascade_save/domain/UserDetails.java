package com.cascade_save.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "user_details")
public class UserDetails {

    @Id
    private String id;

    @Field(name = "user_hobby")
    private String userHobby;

    @Field(name = "you_tube_channel")
    private String youTubeChannel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserHobby() {
        return userHobby;
    }

    public void setUserHobby(String userHobby) {
        this.userHobby = userHobby;
    }

    public String getYouTubeChannel() {
        return youTubeChannel;
    }

    public void setYouTubeChannel(String youTubeChannel) {
        this.youTubeChannel = youTubeChannel;
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
        if (!(o instanceof UserDetails)) {
            return false;
        }
        return id != null && id.equals(((UserDetails) o).id);
    }

    @Override
    public String toString() {
        return "UserDetails [id=" + id + ", userHobby=" + userHobby + ", youTubeChannel=" + youTubeChannel + "]";
    }

}
