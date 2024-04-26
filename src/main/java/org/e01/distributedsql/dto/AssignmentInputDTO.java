package org.e01.distributedsql.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssignmentInputDTO {
    private LocalDateTime date;
    private Float wage;
    private Long JID;
    private Long WID;
}
