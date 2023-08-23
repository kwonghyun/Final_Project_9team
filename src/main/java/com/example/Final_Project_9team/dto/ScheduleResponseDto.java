package com.example.Final_Project_9team.dto;

import com.example.Final_Project_9team.entity.Schedule;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Data
public class ScheduleResponseDto {
    private Long id;
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer sumDistance;
    private Integer sumDuration;
    private Boolean display;
    private Integer period;
    private List<MatesResponseDto> matesResponses;

    public static ScheduleResponseDto fromEntity(Schedule schedule) {
        ScheduleResponseDto dto = new ScheduleResponseDto();
        dto.setId(schedule.getId());
        dto.setTitle(schedule.getTitle());
        dto.setDescription(schedule.getDescription());
        dto.setStartDate(schedule.getStartDate());
        dto.setEndDate(schedule.getEndDate());
        dto.setSumDistance(schedule.getSumDistance());
        dto.setSumDuration(schedule.getSumDuration());
        dto.setDisplay(schedule.getDisplay());

        return dto;
    }

    public static ScheduleResponseDto fromEntity(Schedule schedule, List<MatesResponseDto> matesResponses) {
        ScheduleResponseDto dto = new ScheduleResponseDto();
        dto.setId(schedule.getId());
        dto.setTitle(schedule.getTitle());
        dto.setDescription(schedule.getDescription());
        dto.setStartDate(schedule.getStartDate());
        dto.setEndDate(schedule.getEndDate());
        dto.setSumDistance(schedule.getSumDistance());
        dto.setSumDuration(schedule.getSumDuration());
        dto.setDisplay(schedule.getDisplay());
        dto.setPeriod(Period.between(schedule.getStartDate(), schedule.getEndDate()).getDays() + 1);
        dto.setMatesResponses(matesResponses);

        return dto;
    }
}
