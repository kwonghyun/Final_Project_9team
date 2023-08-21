package com.example.Final_Project_9team.repository;

import com.example.Final_Project_9team.entity.Schedule;
import com.example.Final_Project_9team.entity.ScheduleItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleItemRepository extends JpaRepository<ScheduleItem, Long> {
    List<ScheduleItem> findAllBySchedule(Schedule schedule);
}
