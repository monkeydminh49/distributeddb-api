package org.e01.distributedsql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CLIENTS")
public class Client {
    @Id
    private Long CID;
    private String name;
    private String address;
    private String phoneNo;
}
//CREATE TABLE Clients (
//        CID INT PRIMARY KEY,
//        name VARCHAR(255),
//address VARCHAR(255),
//phoneNo CHAR(10)
//)