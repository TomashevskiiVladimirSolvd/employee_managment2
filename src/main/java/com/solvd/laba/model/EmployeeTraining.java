package com.solvd.laba.model;

import java.util.Objects;

public class EmployeeTraining {
    private long id;
    private String status;
    private TrainingPrograms trainingPrograms;

    public EmployeeTraining() {
    }

    ;

    public EmployeeTraining(long id, String status) {
        this.id = id;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TrainingPrograms getTrainingPrograms() {
        return trainingPrograms;
    }

    public void setTrainingPrograms(TrainingPrograms trainingPrograms) {
        this.trainingPrograms = trainingPrograms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeTraining that = (EmployeeTraining) o;
        return id == that.id && Objects.equals(status, that.status) && Objects.equals(trainingPrograms, that.trainingPrograms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, trainingPrograms);
    }

    @Override
    public String toString() {
        return "EmployeeTraining{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", trainingPrograms=" + trainingPrograms +
                '}';
    }
}
