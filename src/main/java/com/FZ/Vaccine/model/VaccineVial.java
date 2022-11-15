package com.FZ.Vaccine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
public class VaccineVial {
    @Id
    @GeneratedValue
    private UUID vialID;
    private VaccineMaker vaccineMakerName;
    private int vaccineDosageCount;
    private Date vaccineExpiryDate;
    private Date addedDate;
    private Date updatedDate;
}
enum VaccineMaker{
    Moderna,
    Pfizer,
    AstraZenica
}