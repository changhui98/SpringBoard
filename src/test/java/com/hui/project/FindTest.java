package com.hui.project;

import com.hui.project.question.Question;
import com.hui.project.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FindTest {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJpa(){
        List<Question> all = this.questionRepository.findAll();
        assertEquals(2,all.size());

        Question q = all.get(0);
        assertEquals("sbb가 무엇인가요?", q.getSubject());
    }
}
