package com.hui.project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FindBySubject {

    @Autowired
    private QuestionRepository repository;

    @Test
    void testJpa(){
        Question q = this.repository.findBySubject("sbb가 무엇인가요?");
        assertEquals(1, q.getId());
    }

}
