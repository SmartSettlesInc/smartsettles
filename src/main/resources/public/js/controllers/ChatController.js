/**
 * Created by SantoshKompally on 3/11/17.
 */
'use strict';

eventsApp.controller('EventController',function EventController($scope,chatservice){

    var self = $scope;

    $scope.input = {
        "type":"customer",
        "userId":"teja"
    }

    var config = {
        headers : {
            'Content-Type': 'application/json;charset=utf-8;'
        }
    }

    // chatservice.getChatData(function(data){
    //
    //     $scope.totalData = data;
    //
    // },self.input,config);

    $scope.totalData = chatservice.totalData;
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

    $scope.convertToDate = function(date){

        console.log(new Date(date));


    }

    $scope.currentlySelected = null;
    $scope.currentIndex = 0;
    $scope.chat = null;
    $scope.currentName = null;
    $scope.displaySelectedChatType = function(index,name){


        if(!$scope.showDisplayPreferences[name]){
            $scope.showDisplayPreferences[name] = true;
        }else{
            $scope.showDisplayPreferences[name] = false;
        }

        $scope.data[name] = $scope.totalData[index][name];
        console.log($scope.totalData[index]);
        $scope.currentName = name;
        $scope.currentIndex = index;
    }


    $scope.displayedChatItem = function(item){

        $scope.chat = item;


    }

    $scope.submitChat = function(event){

        if (event.which === 13) {

            if ($scope.chat != null) {

                var input = {

                    'from' : self.input['userId'],
                    'to': $scope.chat['name'],
                    'message': $scope.chatMessage,
                    'type': types[$scope.currentIndex]
                }


                console.log($scope.data[self.currentName]);
                console.log($scope.chat);

                chatservice.addChat(function(data){

                    console.log("The output is: " + data);

                    if(data == true){

                        $scope.chatMessage = "";
                        for (var i =0; i <  self.data[self.currentName].length ; i++){

                            if(self.data[$scope.currentName][i]['name'] == self.chat['name']){

                                self.data[$scope.currentName][i]['chatMessages'].push(input);

                            }

                        }


                    }


                },input,config);

            }
        }

    }


});
