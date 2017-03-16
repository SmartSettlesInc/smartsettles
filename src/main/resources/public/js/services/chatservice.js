/**
 * Created by SantoshKompally on 3/11/17.
 */
eventsApp.factory('chatservice',function($http){


    return{

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