/**
 * Created by SantoshKompally on 3/11/17.
 */
'use strict';

eventsApp.controller('EventController',function EventController($scope,chatservice){


    var input = {
        "type":"customer",
        "userId":"teja"
    }

    var config = {
        headers : {
            'Content-Type': 'application/json;charset=utf-8;'
        }
    }

    chatservice.getChatData(function(data){

        $scope.totalData = data;

    },input,config);


    $scope.showDisplayPreferences = {

        'apartmentDetails' : false,
        'internetDetails' : false,
        'electricityDetails' : false,
        'mobileDetails' : false

    }
    $scope.data = {

        'apartmentDetails' : null,
        'internetDetails' : null,
        'electricityDetails' : null,
        'mobileDetails' : null

    };

    var types = ['apartments','internet','mobile','electricity'];

    $scope.currentlySelected = null;
    $scope.currentIndex = 0;
    $scope.chat = null;
    $scope.displaySelectedChatType = function(index,name){


        if(!$scope.showDisplayPreferences[name]){
            $scope.showDisplayPreferences[name] = true;
        }else{
            $scope.showDisplayPreferences[name] = false;
        }

        $scope.data[name] = $scope.totalData[index][name];
        console.log($scope.totalData[index]);
        $scope.currentIndex = index;
    }


    $scope.displayedChatItem = function(item){

        $scope.chat = item;


    }

    $scope.submitChat = function(event){

        if (event.which === 13) {
            alert($scope.chatMessage);

            if ($scope.chat != null) {

                var input = {

                    'from' : 'teja',
                    'to': $scope.chat['name'],
                    'message': $scope.chatMessage,
                    'type': types[$scope.currentIndex]
                }


                chatservice.addChat(function(data){

                    console.log("The output is: " + data);

                },input,config);

            }
        }

    }


});
