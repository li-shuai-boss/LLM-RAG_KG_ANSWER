package com.example.javaailangchain4j;

import com.example.javaailangchain4j.assistant.MemoryChatAssistant;
import com.example.javaailangchain4j.assistant.SeparateChatAssistant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PromptTest {

    @Autowired
    private SeparateChatAssistant separateChatAssistant;

    @Autowired
    private MemoryChatAssistant memoryChatAssistant;
    @Test
    public void testSystemMessage() {
        String answer = separateChatAssistant.chat(3,"今天几号");
        System.out.println(answer);
    }

    @Test
    public void testUserMessage() {
        String answer = memoryChatAssistant.chat("我是环环");
        System.out.println(answer);
    }


}
