package com.hui.project.answer;

import com.hui.project.question.Question;
import com.hui.project.question.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/answer")
@RequiredArgsConstructor
@Controller
public class AnswerController {

    private final QuestionService questionService;

    @PostMapping("/create/{id}")
    public String createAnswer(Model model, @PathVariable("id") Integer id,
                               @RequestParam(value = "content") String content){

        Question question = this.questionService.getQuestion(id);
        // TODO : 답변을 저장한다 (답변을 저장하는 코드는 아직 작성 전이므로 주석 처리)
        return String.format("redirect:/question/detail/%s", id);
    }


}
