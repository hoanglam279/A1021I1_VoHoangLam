package com.example.furama.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer positionId;

    @NotEmpty
    @Size(max = 45)
    private String positionName;

    public Position() {
    }

    public Position(@NotEmpty int position_id, @NotEmpty @Size(max = 45) String position_name, List<Employee> employees) {
        this.positionId = position_id;
        this.positionName = position_name;

    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}
