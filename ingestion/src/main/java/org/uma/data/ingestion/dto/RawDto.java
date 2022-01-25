package org.uma.data.ingestion.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class RawDto implements Serializable {
    String id;
    Integer datasetId;
    String client;
    String vendor;
    String invoiceCode;
    String description;
    String fiscalYear;
    String currency;
    Double spend;
    String timestamp;
    String userName;
    String defaultCategory;
}
