package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

    @Component
    public class UserService {

        @Autowired
        private UserEntryRepository userEntryRepository;

        private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        public List<User> getAll() {
            return userEntryRepository.findAll();
        }

        public Optional<User> findById(ObjectId myId) {
            return userEntryRepository.findById(myId);
        }

        public User findByUserName(String userName) {
            return userEntryRepository.findByUserName(userName);
        }

        public void saveUser(User user) {
            userEntryRepository.save(user);
        }

        public void saveNewUser(User user) {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            user.setRoles(Arrays.asList("USER"));
            userEntryRepository.save(user);
        }

    }
