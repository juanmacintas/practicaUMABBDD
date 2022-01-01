package org.uma.data.ingestion.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Clean {
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
