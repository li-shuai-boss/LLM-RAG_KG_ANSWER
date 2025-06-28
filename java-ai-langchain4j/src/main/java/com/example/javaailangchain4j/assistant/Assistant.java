package com.example.javaailangchain4j.assistant;

import dev.langchain4j.service.spring.AiService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;


//因为我们在配置文件中同时配置了多个大语言模型，所以需要在这里明确指定（EXPLICIT）模型的beanName
@AiService(wiringMode = EXPLICIT, chatModel = "deepseek-chat")
public interface Assistant {
    String chat(String userMessage);
}