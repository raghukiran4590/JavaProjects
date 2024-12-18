package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.JournalEntryRepository;
import net.engineeringdigest.journalApp.repository.UserEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

    @Component
    public class UserService {

        @Autowired
        private UserEntryRepository userEntryRepository;

        public List<User> getAll() {
            return userEntryRepository.findAll();
        }

        public Optional<User> findById(ObjectId myId) {
            return userEntryRepository.findById(String.valueOf(myId));
        }

        public User findByUserName(String userName) {
            return userEntryRepository.findByUserName(userName);
        }

        public void saveEntry(User user) {
            userEntryRepository.save(user);
        }

        public boolean deleteUser(User user) {
            userEntryRepository.delete(user);
            return true;
        }

    }
