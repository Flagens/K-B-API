package com.gbw.kbapi.model;

import com.gbw.kbapi.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Orders {
    private int id;
    private LocalDateTime timestamp;
    private int userID;
    private BigDecimal price;
    private Status status;
    private String specialRequirements;
}
