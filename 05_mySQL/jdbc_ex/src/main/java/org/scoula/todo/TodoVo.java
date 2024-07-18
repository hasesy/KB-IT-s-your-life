package org.scoula.todo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
public class TodoVo {
    private int id;
    private String userId;
    private String todo;
    private boolean isCompleted;
    private Timestamp created_at;
}
