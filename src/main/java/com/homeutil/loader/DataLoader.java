package com.homeutil.loader;

import com.homeutil.domain.BestPractice;
import com.homeutil.repository.BestPracticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private BestPracticeRepository bestPracticeRepository;

    @Override
    public void run(String... args) throws Exception {
        bestPracticeRepository.save(new BestPractice("REST Best Practices","Use Proper HTTP Methods", ""));
        bestPracticeRepository.save(new BestPractice("REST Best Practices","Use meaningful and Consistent Resource Names", ""));
    }
}
