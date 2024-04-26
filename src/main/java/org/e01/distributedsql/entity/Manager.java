package org.e01.distributedsql.entity;

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
@Table(name = "MANAGERS")
public class Manager {
    @Id
    private Long MID;
    private String name;
    private String address;
    private String phoneNo;
    private Long BID;
}
//CREATE TABLE Managers (
//        MID INT PRIMARY KEY,
//        name VARCHAR(255),
//address VARCHAR(255),
//phoneNo CHAR(10),
//BID INT REFERENCES Branches(BID)
//)