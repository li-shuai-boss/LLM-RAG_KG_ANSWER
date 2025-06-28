package com.example.javaailangchain4j.config;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "deepseek-chat")
    public ChatLanguageModel deepSeekChatModel() {
        // 示例：使用 LangChain4j 创建 DeepSeek 模型
        return OpenAiChatModel.builder()
                .baseUrl("https://api.deepseek.com")
                .apiKey("sk-ff8fd3c49a8d4f30889e3d84fd083583")
                .modelName("deepseek-chat")
                .build();
    }
}