/**
 * Created by Denis on 4/7/2015.
 */
function getConsumerDataByLogin(login) {
    $.ajax({
        dataType: "json",
        type: "GET",
        url: "/elka/store/req/GetConsumerData",
        data: "login=" + login,
        success: function (data) {
            callBackForGetConsumerDataByLogin(data);
        },
        error: function(){
            //don't work!
            $('#consumerData').val('data do not found');
        }
    })
}

function callBackForGetConsumerDataByLogin(data) {
    $('#consumerData').val(data.firstName + ' ' + data.lastName);
}


