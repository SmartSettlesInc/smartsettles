package com.smartsettles.controller;

import com.smartsettles.Service.ChatService;
import com.smartsettles.repository.Chat;
import com.smartsettles.repository.ChatInput;
import com.smartsettles.repository.ChatMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by SantoshKompally on 3/5/17.
 */
@RestController
public class ChatController {

    @Autowired
    ChatService chatService;

    @RequestMapping(value = "/chat" , method = RequestMethod.POST)
    public List<Chat> getChatDetails(@RequestBody ChatInput chatInput){

        System.out.println(chatInput);
        List<Chat> chat =  chatService.getLeasingChats(chatInput.getUserId());

        return chat;
    }

    @RequestMapping(value = "/addChat" , method = RequestMethod.POST)
    public boolean addChat(@RequestBody ChatMessages chatMesssages){

       return  chatService.addChat(chatMesssages);


    }


}
