package org.example.dto;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TodoDtoListV2 {
    private List<TodoDto> todoDtoList;

    private TodoDtoListV2() {
        this.todoDtoList = new ArrayList<>();

        // 테스트 데이터 추가
        this.addList("스프링 정복하기");
        this.addList("코테도 정복하기");
    }

    public void addList(String todo) {
        todoDtoList.add(new TodoDto(todo));
    }

    public List<TodoDto> getList() {return todoDtoList;}
}
