package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAllEntries() {
        return null;
    }

    @GetMapping("/id/{myId}")
    public JournalEntry getEntryById(@PathVariable Long myId) {
        return null;
    }

    @PutMapping("/id/{myId}")
    public JournalEntry putEntryById(@PathVariable Long myId, @RequestBody JournalEntry updateEntry) {
        return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry) {
        journalEntryService.saveEntry(myEntry);
        return true;
    }

    @PostMapping("/postAll")
    public boolean createEntries(@RequestBody List<JournalEntry> journals) {
        return true;
    }

    @DeleteMapping("/id/{myId}")
    public JournalEntry deleteEntryById(@PathVariable Long myId) {
        return null;
    }

}
