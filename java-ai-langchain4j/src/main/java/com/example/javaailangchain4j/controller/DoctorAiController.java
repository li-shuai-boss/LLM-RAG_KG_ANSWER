package com.example.javaailangchain4j.controller;

import com.example.javaailangchain4j.assistant.DoctorAi;
import com.example.javaailangchain4j.model.ChatForm;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name="智慧医疗")
@RestController
@RequestMapping("/doctorai")
public class DoctorAiController {
    @Autowired
    private DoctorAi doctorAi;
    @Operation(summary = "对话")
    @PostMapping("/chat")
    public String chat(@RequestBody ChatForm chatForm) {
        return doctorAi.chat(chatForm.getMemoryId(), chatForm.getMessage());
    }
}
