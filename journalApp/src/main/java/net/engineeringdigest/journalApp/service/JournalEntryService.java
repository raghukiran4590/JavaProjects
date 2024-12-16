package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JournalEntryService {

@Autowired
private JournalEntryRepository journalEntryRepository;

public void saveEntry(JournalEntry journalEntry) {
    journalEntryRepository.save(journalEntry);
}

}
