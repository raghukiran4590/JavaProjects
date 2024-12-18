package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

    @RestController
    @RequestMapping("/user")
    public class UserController {

        @Autowired
        private UserService userService;

        @GetMapping
        public ResponseEntity<?> getAllUsers() {
            List<User> allUsers = userService.getAll();
//            if (allUsers != null && !allUsers.isEmpty()) {
//                return new ResponseEntity<>(allUsers, HttpStatus.OK);
//            }
            return new ResponseEntity<>(allUsers, HttpStatus.OK);
        }

        @GetMapping("/name/{username}")
        public ResponseEntity<User> getUser(@PathVariable String userName) {
            User user = userService.findByUserName(userName);
            if (user != null) {
                return new ResponseEntity<>(user, HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        @PutMapping
        public ResponseEntity<?> updateUser(@RequestBody User user, @PathVariable String userName) {
            User userInDb = userService.findByUserName(userName);
            if (userInDb != null) {
                userInDb.setUserName(user.getUserName());
                userInDb.setPassword(user.getPassword());
                userService.saveEntry(userInDb);
            }
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        @PostMapping
        public ResponseEntity<User> createUser(@RequestBody User user) {
            try {
                userService.saveEntry(user);
                return new ResponseEntity<>(user, HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        }

        @PostMapping("/postAll")
        public ResponseEntity<?> createUsers(@RequestBody List<User> users) {
            try {
                for (User u : users) {
                    userService.saveEntry(u);
                }
                return new ResponseEntity<>(users, HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        }

        @DeleteMapping
        public ResponseEntity<?> deleteUserByUsername(@RequestBody User user) {
            userService.deleteUser(user);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
