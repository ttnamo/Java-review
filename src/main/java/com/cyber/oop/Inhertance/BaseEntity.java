package com.cyber.oop.Inhertance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BaseEntity {

    private long id;
    private LocalDateTime insertDateTime;
    private long insertUserId;
    private LocalDateTime LastUpdateDateTime;
    private long lastUpdateUserId;

}
