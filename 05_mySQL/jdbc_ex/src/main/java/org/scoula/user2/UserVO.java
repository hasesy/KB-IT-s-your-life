package org.scoula.user2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

@Data // Getter, Setter, equals, hashcode 메서드를 생성해줌
@AllArgsConstructor // .생성자 만들어줌
public class UserVO {
    private final int id;
    private final String userId;
    private final String name;
    private final String password;
    private final int age;
    private final boolean membership;
    private final Timestamp signupDate;


}
