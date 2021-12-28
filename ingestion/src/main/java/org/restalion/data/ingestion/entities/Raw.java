package org.restalion.data.ingestion.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Raw {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    Integer datasetId;
    String client;
    String vendor;
    String invoiceCode;
    String description;
    String fiscalYear;
    String currency;
    Double spend;
    Timestamp timestamp;
    String userName;
    String defaultCategory;
}
