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
@Table(name = "CONTRACTS")
public class Contract {
    @Id
    private Long CtID;
    private String signDate;
    private Long MID;
    private Long CID;

}
//CREATE TABLE Contracts (
//        CtID INT PRIMARY KEY,
//        signDate DATETIME,
//        MID INT REFERENCES Managers(MID),
//CID INT REFERENCES Clients(CID)
//)
