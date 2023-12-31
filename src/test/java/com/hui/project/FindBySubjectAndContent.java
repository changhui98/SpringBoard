package com.hui.project;

import com.hui.project.question.Question;
import com.hui.project.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FindBySubjectAndContent {

    @Autowired
    QuestionRepository questionRepository;

    @Test
    void testJpa(){
        Question q
            = this.questionRepository.findBySubjectAndContent(
                    "sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
        assertEquals(1,q.getId());
    }


}
