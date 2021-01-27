package com.cyber.oop.Inhertance;

import com.cyber.oop.Encapsulation.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.graalvm.compiler.lir.LIRInstruction;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Project extends BaseEntity{

    private String projectCode;
    private String projectName;
    private User assignedManger;
    private LocalDateTime startDate;
    private  LocalDateTime endDate;
    private String projectStatus;
    private  String projectDetail;

    public Project(long id, LocalDateTime insertDateTime, long insertUserId,
                   LocalDateTime LastUpdateDateTime, long lastUpdateUserId, String projectCode,
                   String projectName, User assignedManger, LocalDateTime startDate,
                   LocalDateTime endDate, String projectStatus, String projectDetail) {
        super(id, insertDateTime, insertUserId, LastUpdateDateTime, lastUpdateUserId);
        this.projectCode = projectCode;
        this.projectName = projectName;
        this.assignedManger = assignedManger;
        this.startDate = startDate;
        this.endDate = endDate;
        this.projectStatus = projectStatus;
        this.projectDetail = projectDetail;
    }
}
