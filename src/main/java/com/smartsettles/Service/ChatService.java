package com.smartsettles.Service;

import com.smartsettles.Utilitites.ChatUtilities;
import com.smartsettles.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by SantoshKompally on 3/6/17.
 *
 *
 */

@Service
public class ChatService {

    @Autowired
    private IChatRepository repository;

    @Autowired
    private ChatRepository chatRepository;


    public List<Chat> getLeasingChats(String userId){

        List<Chat> chatList = new ArrayList<>();

        LeasingChat leasingChat = new LeasingChat();
        InternetChat internetChat = new InternetChat();
        MobileChat  mobileChat = new MobileChat();
        ElectricityChat electricityChat = new ElectricityChat();

        List<ApartmentDetails> apartmentDetails = new ArrayList<>();
        List<InternetDetails> internetDetails = new ArrayList<>();
        List<MobileDetails> mobileDetails = new ArrayList<>();
        List<ElectricityDetails> electricityDetails = new ArrayList<>();

        List<ChatMessages> chatMessagesForInternet = new ArrayList<>();
        List<ChatMessages> chatMessagesForLeasing = new ArrayList<>();
        List<ChatMessages> chatMessagesForMobile = new ArrayList<>();
        List<ChatMessages> chatMessagesForElectricity = new ArrayList<>();

       // get all the chat Messages.
        List<ChatMessages> messages = chatRepository.getMessagesForId(userId);

        // Iterator to iterate all the objects.
        Iterator it;


        chatMessagesForLeasing.addAll(messages.stream().filter(p -> p.getType() .equalsIgnoreCase("apartments")).collect(Collectors.toList()));
        HashMap<String,List<ChatMessages>> leasingChatList = ChatUtilities.groupByChat(chatMessagesForLeasing,userId);

        // create all the leasing details objects.
        it = leasingChatList.entrySet().iterator();

        while(it.hasNext()){

            Map.Entry<String,List<ChatMessages>> pair = (Map.Entry)it.next();
            // To do get the apartment address.
            apartmentDetails.add(new ApartmentDetails(pair.getKey(),null,pair.getValue()));

        }
        leasingChat.setApartmentDetails(apartmentDetails);


        // internet chat.
        chatMessagesForInternet.addAll(messages.stream().filter(p -> p.getType().equalsIgnoreCase("internet") ).collect(Collectors.toList()));
        HashMap<String,List<ChatMessages>> internetChatList = ChatUtilities.groupByChat(chatMessagesForInternet,userId);

        // create all the internet details objects.
        it = internetChatList.entrySet().iterator();
        while(it.hasNext()){

            Map.Entry<String,List<ChatMessages>> pair = (Map.Entry)it.next();
            // To do get the apartment address.
            internetDetails.add(new InternetDetails(pair.getKey(),pair.getValue()));

        }

        internetChat.setInternetDetails(internetDetails);

        //eclecricity chat.
        // get chat messages for electricity.
        chatMessagesForElectricity.addAll(messages.stream().filter(p -> p.getType().equalsIgnoreCase("electricity") ).collect(Collectors.toList()));
        // iterate through them and group by all the users.
        HashMap<String,List<ChatMessages>> electChat = ChatUtilities.groupByChat(chatMessagesForElectricity,userId);

        // create all the electricity details objects.
        it = electChat.entrySet().iterator();

        while(it.hasNext()){

            Map.Entry<String,List<ChatMessages>> pair = (Map.Entry)it.next();
            electricityDetails.add(new ElectricityDetails(pair.getKey(),pair.getValue()));

        }

        electricityChat.setElectricityDetails(electricityDetails);


        // mobile chat.
        chatMessagesForMobile.addAll(messages.stream().filter(p -> p.getType().equalsIgnoreCase("mobile") ).collect(Collectors.toList()));
        HashMap<String,List<ChatMessages>> mobileChatList = ChatUtilities.groupByChat(chatMessagesForMobile,userId);

        // create all the mobile details objects.
        it = mobileChatList.entrySet().iterator();

        while(it.hasNext()){

            Map.Entry<String,List<ChatMessages>> pair = (Map.Entry)it.next();
            mobileDetails.add(new MobileDetails(pair.getKey(),pair.getValue()));

        }

        mobileChat.setMobileDetails(mobileDetails);

        chatList.add(leasingChat);
        chatList.add(internetChat);
        chatList.add(mobileChat);
        chatList.add(electricityChat);

        return chatList;

    }

    public boolean addChat(ChatMessages message){


        try {
            repository.save(message);
            return true;
        }catch(Exception e){

            e.printStackTrace();


        }


        return false;
    }



}
