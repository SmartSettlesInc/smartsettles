package com.smartsettles.Utilitites;

import com.smartsettles.repository.ChatMessages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by SantoshKompally on 3/14/17.
 */
public class ChatUtilities<T> {

    public static HashMap<String, List<ChatMessages>> groupByChat(List<ChatMessages> chatMessages, String userId){

        HashMap<String,List<ChatMessages>> chatMessageMap = new HashMap<>();

        for(ChatMessages chatMessage: chatMessages){

            // from user to others.
            if(chatMessage.getFrom().equals(userId)){

                // already chat exists
                if(chatMessageMap.get(chatMessage.getTo()) != null){

                    chatMessageMap.get(chatMessage.getTo()).add(chatMessage);

                }else{

                    List<ChatMessages> chatMessagesList = new ArrayList<>();
                    chatMessagesList.add(chatMessage);
                    chatMessageMap.put(chatMessage.getTo(),chatMessagesList);

                }

                // received from others.
            }else{

                // already chat exists
                if(chatMessageMap.get(chatMessage.getFrom()) != null){

                    chatMessageMap.get(chatMessage.getFrom()).add(chatMessage);

                }else{

                    List<ChatMessages> chatMessagesList = new ArrayList<>();
                    chatMessagesList.add(chatMessage);
                    chatMessageMap.put(chatMessage.getFrom(),chatMessagesList);

                }

            }

        }

        return chatMessageMap;

    }




}
