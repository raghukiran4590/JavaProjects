package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {

@Autowired
private JournalEntryRepository journalEntryRepository;

public List<JournalEntry> getAllEntries() {
    return journalEntryRepository.findAll();
}

public Optional<JournalEntry> getEntryById(ObjectId myId) {
    return journalEntryRepository.findById(String.valueOf(myId));
}

public void saveEntry(JournalEntry journalEntry) {
    journalEntryRepository.save(journalEntry);
}

public boolean deleteEntryById(ObjectId myId) {
    journalEntryRepository.deleteById(myId);
    return true;
}

}
