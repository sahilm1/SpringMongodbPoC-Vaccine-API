package com.FZ.Vaccine.model;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class Vaccine {
    @Id
    @GeneratedValue
    private UUID vaccineId;
    @ManyToOne
    @JoinColumn(name = "vaccine_vial_vial_id")
    private VaccineVial vaccineVial;
    private String NurseID;
    private String PatientId;
    @GeneratedValue
    private Date vaccineAdministeredDate;
    private long vaccineAppointmentId;


    public VaccineVial getVaccineVial() {
        return vaccineVial;
    }

    public void setVaccineVial(VaccineVial vaccineVial) {
        this.vaccineVial = vaccineVial;
    }

}
