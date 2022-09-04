package com.cascade_save.web;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cascade_save.domain.User;
import com.cascade_save.service.UserService;

@RestController
@RequestMapping("/api")
public class UserResource {

    private final UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(this.userService.getAllUsers(), HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) throws URISyntaxException {

        System.out.println("User data" + user);

        User theUser = this.userService.createUser(user);

        return ResponseEntity.created(new URI("/api/users" + theUser.getId())).body(theUser);
    }

}
