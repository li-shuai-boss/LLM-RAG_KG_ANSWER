package com.example.javaailangchain4j;


import com.example.javaailangchain4j.assistant.Assistant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class LLMTest{
    @Autowired
    private Assistant assistant;

@Test
    public void testSpringBoot() {
//向模型提问
        String answer = assistant.chat("你是deepseek吗");
//输出结果
        System.out.println(answer);
    }
}
