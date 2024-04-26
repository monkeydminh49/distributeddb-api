package org.e01.distributedsql.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AssignmentOutputDTO {
    private Long AID;
    private LocalDateTime date;
    private Float wage;
    private Float scoreRate;
    private Long CtID;
    private Long WID;
    private Long JID;
}
