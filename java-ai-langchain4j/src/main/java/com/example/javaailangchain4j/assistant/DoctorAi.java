package com.example.javaailangchain4j.assistant;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.spring.AiServiceWiringMode;

@AiService(
        wiringMode = AiServiceWiringMode.EXPLICIT,
        chatModel="deepseek-chat",
        chatMemoryProvider ="chatMemoryProviderdoctorai",
        tools = "appointmentTools" ,//tools配置
        contentRetriever = "contentRetrieverXiaozhi" //配置向量存储
)
public interface DoctorAi {
    @SystemMessage(fromResource = "D:\\code\\javacode\\java-ai-langchain4j\\src\\main\\resources\\doctorai-prompt-template.txt")
    String chat(@MemoryId Long memoryId, @UserMessage String userMessage);
}
