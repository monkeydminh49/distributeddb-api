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
@Table(name = "BRANCHES")
public class Branch {
    @Id
    private Long BID;
    private String address;
}
//CREATE TABLE Branches (
//        BID INT PRIMARY KEY,
//        address VARCHAR(255)
//)