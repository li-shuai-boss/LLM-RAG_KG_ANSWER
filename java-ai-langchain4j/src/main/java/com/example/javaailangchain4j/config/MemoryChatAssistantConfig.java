package com.example.javaailangchain4j.config;

import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemoryChatAssistantConfig {
    @Bean

    MessageWindowChatMemory chatMemory() {
    //设置聊天记忆记录的message数量
        return MessageWindowChatMemory.withMaxMessages(10);
    }
}