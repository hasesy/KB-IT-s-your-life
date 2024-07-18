package org.scoula.todo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
public class UserVo {
    private final String userId;
    private final String name;
    private final String password;
    private final Timestamp created_at;
}
