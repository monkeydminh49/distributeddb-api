package org.e01.distributedsql.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "JOBS")
public class Job {
    @Id
    private Long JID;
    private String name;
    private String description;
}
