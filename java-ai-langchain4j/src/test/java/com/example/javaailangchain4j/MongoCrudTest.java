package com.example.javaailangchain4j;


import com.example.javaailangchain4j.model.ChatMessages;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootTest
public class MongoCrudTest {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 插入文档
     */
    @Test
    public void testInsert2() {
        ChatMessages chatMessages = new ChatMessages();
        chatMessages.setContent("聊天记录列表");
        mongoTemplate.insert(chatMessages);
    }

    @Test
    public void testFindById() {
        ChatMessages chatMessages = mongoTemplate.findById("683ad0a6e5c96154d277bb1f",
                ChatMessages.class);
        System.out.println(chatMessages);
    }
}
