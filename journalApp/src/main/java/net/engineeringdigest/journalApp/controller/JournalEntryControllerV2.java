package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public ResponseEntity<?> getAllEntries() {
        List<JournalEntry> allEntries = journalEntryService.getAllEntries();
        if (allEntries != null && !allEntries.isEmpty()) {
            return new ResponseEntity<>(allEntries, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/id/{myId}")
//    ResponseEntity<?>
    public ResponseEntity<JournalEntry> getEntryById(@PathVariable ObjectId myId) {
        Optional<JournalEntry> journalEntry = journalEntryService.getEntryById(myId);
        if (journalEntry.isPresent()) {
            return new ResponseEntity<>(journalEntry.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/id/{myId}")
    public ResponseEntity<?> saveEntryById(@PathVariable ObjectId myId, @RequestBody JournalEntry updateEntry) {
        JournalEntry old = journalEntryService.getEntryById(myId).orElse(null);
       if(old != null) {
           old.setTitle(updateEntry.getTitle() != null && !updateEntry.getTitle().equals("") ? updateEntry.getTitle() : old.getTitle());
           old.setContent(updateEntry.getContent() != null && !updateEntry.getContent().equals("") ? updateEntry.getContent() : old.getContent());
           journalEntryService.saveEntry(old);
           return new ResponseEntity<>(old, HttpStatus.CREATED);
       }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<JournalEntry> createEntry(@RequestBody JournalEntry myEntry) {
        try {
            myEntry.setDate(LocalDateTime.now());
            journalEntryService.saveEntry(myEntry);
            return new ResponseEntity<>(myEntry, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @PostMapping("/postAll")
    public ResponseEntity<?> createEntries(@RequestBody List<JournalEntry> journals) {
        try {
            for(JournalEntry j : journals) {
                j.setDate(LocalDateTime.now());
                journalEntryService.saveEntry(j);
            }
            return new ResponseEntity<>(journals, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/id/{myId}")
    public ResponseEntity<?> deleteEntryById(@PathVariable ObjectId myId) {
         journalEntryService.deleteEntryById(myId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
