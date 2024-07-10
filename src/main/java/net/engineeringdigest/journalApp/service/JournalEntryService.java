package net.engineeringdigest.journalApp.service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.repository.JournalEntryRepository;

// solution obj = new solution()
//create entry in database
//controller ---> service ---> repository
@Service
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository; //dependency injection

    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepository.save(journalEntry);
    }
}
