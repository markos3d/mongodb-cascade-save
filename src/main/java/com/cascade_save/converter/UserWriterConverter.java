package com.cascade_save.converter;

import com.cascade_save.domain.User;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserWriterConverter implements Converter<User, DBObject> {

    @Override
    public DBObject convert(final User user) {
        final DBObject dbObject = new BasicDBObject();
        dbObject.put("name", user.getFirstName());
        dbObject.put("age", user.getLastName());
        if (user.getUserDetails() != null) {
            final DBObject detailsDbObject = new BasicDBObject();
            detailsDbObject.put("userHobby", user.getUserDetails().getUserHobby());
            detailsDbObject.put("youtTubeChannel", user.getUserDetails().getYouTubeChannel());
            dbObject.put("userDetails", detailsDbObject);
        }
        dbObject.removeField("_class");
        return dbObject;
    }

}