package com.metacoding.exerciseappserver.plan;

import com.metacoding.exerciseappserver.fitness.Fitness;
import com.metacoding.exerciseappserver.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class PlanRequest {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UpdateWeekDTO {
        boolean status;
        String dayOfWeekName;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PlanAddDTO {
        private Integer fitnessId;
        private String dayOfWeek;
        private Integer exerciseSet;
        private Integer repeat;
        private Integer weight;


        Plan toEntity(Integer id){
            return Plan.builder().
                    user(User.builder().id(id).build()).
                    fitness(Fitness.builder().id(fitnessId).build()).
                    dayOfWeek(dayOfWeek).
                    exerciseSet(exerciseSet).
                    repeat(repeat).
                    weight(weight).
                    build();
        }
    }
    @Data
    public static class UpdatePlanDTO {
        private Integer id; // planId
        private Integer exerciseSet;
        private Integer repeat;
        private Integer weight;
    }
}
