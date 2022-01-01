package org.uma.data.ingestion.dto;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class CleanDto {
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
