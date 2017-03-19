/**
 * Created by SantoshKompally on 3/11/17.
 */
eventsApp.factory('chatservice',function($http){


    return{

        totalData:[
            {
                "type": null,
                "apartmentDetails": [
                    {
                        "name": "Ashwood Park Apartments",
                        "apartmentAddress": null,
                        "chatMessages": [
                            {
                                "from": "Ashwood Park Apartments",
                                "message": "We have a super plan which exactly meets your needs. The plan id is SAINT129",
                                "to": "teja",
                                "date": 1489682684933,
                                "type": "apartments"
                            }
                        ]
                    }
                ]
            },
            {
                "type": null,
                "internetDetails": [
                    {
                        "name": "TWC",
                        "chatMessages": [
                            {
                                "from": "teja",
                                "message": "What all internet plans do u have.",
                                "to": "TWC",
                                "date": 1489532144586,
                                "type": "internet"
                            },
                            {
                                "from": "TWC",
                                "message": "We currently have plans A,B,C.",
                                "to": "teja",
                                "date": 1489532170156,
                                "type": "internet"
                            },
                            {
                                "from": "teja",
                                "message": "What are the charges for Plan A",
                                "to": "TWC",
                                "date": null,
                                "type": "internet"
                            }
                        ]
                    }
                ]
            },
            {
                "type": null,
                "mobileDetails": [
                    {
                        "name": "T-Mobile",
                        "chatMessages": [
                            {
                                "from": "teja",
                                "message": "What are some of the better plans u have.",
                                "to": "T-Mobile",
                                "date": 1489524674164,
                                "type": "mobile"
                            },
                            {
                                "from": "T-Mobile",
                                "message": "We have 2 plans abc,xyz.",
                                "to": "teja",
                                "date": 1489524718565,
                                "type": "mobile"
                            },
                            {
                                "from": "teja",
                                "message": "What is the cost for both the plans.",
                                "to": "T-Mobile",
                                "date": 1489524766294,
                                "type": "mobile"
                            },
                            {
                                "from": "T-Mobile",
                                "message": "Cost of abc is $5 per month and def is $10 per month.",
                                "to": "teja",
                                "date": 1489524823860,
                                "type": "mobile"
                            },
                            {
                                "from": "teja",
                                "message": "Do you have any other plans.",
                                "to": "T-Mobile",
                                "date": null,
                                "type": "mobile"
                            }
                        ]
                    },
                    {
                        "name": "TWC",
                        "chatMessages": [
                            {
                                "from": "teja",
                                "message": "What are the charges for Plan A",
                                "to": "TWC",
                                "date": null,
                                "type": "mobile"
                            },
                            {
                                "from": "teja",
                                "message": "Also could you tell me the charges for plan B which I just looked up on the Internet.",
                                "to": "TWC",
                                "date": null,
                                "type": "mobile"
                            }
                        ]
                    },
                    {
                        "name": "Sprint",
                        "chatMessages": [
                            {
                                "from": "teja",
                                "message": "What are some of the better plans u have.",
                                "to": "Sprint",
                                "date": 1489532268911,
                                "type": "mobile"
                            },
                            {
                                "from": "Sprint",
                                "message": "Could you tell us what kind of plans are you looking for.",
                                "to": "teja",
                                "date": 1489532313261,
                                "type": "mobile"
                            },
                            {
                                "from": "teja",
                                "message": "I am looking for a plan with International calling and 2GB 4G internet.",
                                "to": "Sprint",
                                "date": 1489532371526,
                                "type": "mobile"
                            },
                            {
                                "from": "Sprint",
                                "message": "We have a super plan which exactly meets your needs. The plan id is SAINT129",
                                "to": "teja",
                                "date": 1489532413393,
                                "type": "mobile"
                            },
                            {
                                "from": "teja",
                                "message": "I am Interseted in the plan. Could u tell me about the price of the SAINT129 Plan",
                                "to": "Sprint",
                                "date": null,
                                "type": "mobile"
                            }
                        ]
                    }
                ]
            },
            {
                "type": null,
                "electricityDetails": []
            }
        ],

        getChatData : function(callback,data,config){

            $http.post("/chat", data, config)
                .success(function (data, status, headers, config) {

                    callback(data);

                })
                .error(function (data, status, header, config) {

                    console.log("Error occured while fetching data.")

                });




        },

        addChat : function(callback,data,config){

            $http.post("/addChat", data, config)
                .success(function (data, status, headers, config) {

                    callback(data);

                })
                .error(function (data, status, header, config) {

                    console.log("Error occured while fetching data.")

                });

        }
    };

});