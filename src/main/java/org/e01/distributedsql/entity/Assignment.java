package org.e01.distributedsql.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ASSIGNMENTS")
public class Assignment {
    @Id
    private Long AID;
    private LocalDateTime date;
    private Float wage;
    private Float scoreRate;
    private Long CtID;
    private Long WID;
    private Long JID;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "CtID", referencedColumnName = "CtID", nullable = false)
//    private Contract contract;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "WID", referencedColumnName = "WID", nullable = false)
//    private Worker worker;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "JID", referencedColumnName = "JID", nullable = false)
//    private Job job;


}
//CREATE TABLE Assignments (
//        AID INT PRIMARY KEY,
//        date DATETIME,
//        wage FLOAT,
//        scoreRate FLOAT,
//        CtID INT REFERENCES Contracts(CtID),
//WID INT REFERENCES Workers(WID),
//JID INT REFERENCES Jobs(JID)
//)
