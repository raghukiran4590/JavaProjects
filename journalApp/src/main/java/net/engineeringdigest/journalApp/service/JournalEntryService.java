package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {

@Autowired
private JournalEntryRepository journalEntryRepository;

@Autowired
private UserService userService;

public List<JournalEntry> getAllEntries() {
    return journalEntryRepository.findAll();
}

public Optional<JournalEntry> getEntryById(ObjectId myId) {
    return journalEntryRepository.findById(String.valueOf(myId));
}

public void saveEntry(JournalEntry journalEntry, String userName) {
    User user = userService.findByUserName(userName);
    journalEntry.setDate(LocalDateTime.now());
    JournalEntry saved = journalEntryRepository.save(journalEntry);
    user.getJournalEntries().add(saved);
    userService.saveEntry(user);
}

public void saveEntry(JournalEntry journalEntry) {
    journalEntryRepository.save(journalEntry);
}

public boolean deleteEntryById(ObjectId myId, String userName) {
    User user = userService.findByUserName(userName);
    user.getJournalEntries().removeIf(x -> x.getId().equals(myId));
    userService.saveEntry(user);
    journalEntryRepository.deleteById(myId);
    return true;
}

}
