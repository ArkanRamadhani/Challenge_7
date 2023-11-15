package com.CH7.Transactional7.Scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    @Scheduled(fixedRate = 28000)
    public void runTask() {
        System.out.println("Menjalankan tugas...");
        try {
            Thread.sleep(7000); // Menjalankan tugas selama 7 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Selesai menjalankan tugas.");
    }
}
