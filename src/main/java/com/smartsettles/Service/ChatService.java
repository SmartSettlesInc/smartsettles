package com.smartsettles.Service;

import com.smartsettles.repository.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SantoshKompally on 3/6/17.
 */

@Service
public class ChatService {



    public List<Chat> getLeasingChats(String userId){

        List<Chat> chatList = new ArrayList<>();

        LeasingChat leasingChat = new LeasingChat();
        InternetChat internetChat = new InternetChat();

        ApartmentDetails details = new ApartmentDetails();
        InternetDetails idetails = new InternetDetails();
        List<ApartmentDetails> apartmentDetails = new ArrayList<>();
        List<InternetDetails> internetDetails = new ArrayList<>();

        List<ChatMessages> chatMessagesForInternet = new ArrayList<>();
        List<ChatMessages> chatMessagesForLeasing = new ArrayList<>();


        ChatMessages chatMessages1 = new ChatMessages();
        chatMessages1.setMessage("Hi This is Santosh. Are there any leases available.");
        chatMessages1.setFrom("Santosh");
        chatMessagesForLeasing.add(chatMessages1);

        ChatMessages chatMessages2 = new ChatMessages();
        chatMessages2.setMessage("Hello Santosh we have a one bed room flat with charge $750");
        chatMessages2.setFrom("Ashwood Park Apartments");
        chatMessagesForLeasing.add(chatMessages2);


        details.setApartmentName("Ashwood Park Apartments");
        details.setApartmentAddress(null);
        details.setChatMessages(chatMessagesForLeasing);

        ChatMessages chatMessages3 = new ChatMessages();
        chatMessages3.setMessage("Hi This is Santosh. What plans do you guys have!.");
        chatMessages3.setFrom("Santosh");
        chatMessagesForInternet.add(chatMessages3);

        ChatMessages chatMessages4 = new ChatMessages();
        chatMessages4.setMessage("What is the cost for plan C.");
        chatMessages4.setFrom("T-Mobile ");
        chatMessagesForInternet.add(chatMessages4);

        idetails.setChatMessages(chatMessagesForInternet);
        idetails.setInternetProvider("T-Mobile");
        internetDetails.add(idetails);

        // adding the messages to the internet chat.
        internetChat.setInternetDetails(internetDetails);

        apartmentDetails.add(details);
        leasingChat.setApartmentDetails(apartmentDetails);
        chatList.add(leasingChat);
        chatList.add(internetChat);

    return chatList;

    }

    public void addChat(){}



}
