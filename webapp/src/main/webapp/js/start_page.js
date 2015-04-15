/**
 * Created by Denis on 4/7/2015.
 */

Main.startPage = {

    getConsumerDataByLogin: function (login, element) {
        $.ajax({
            dataType: "json",
            type: "GET",
            url: "/elka/store/req/GetConsumerData",
            data: "login=" + login,
            success: function (data) {
                Main.startPage.printConsumerData(data, element);
            }
        })
    },

    printConsumerData: function (data, element) {
        element.val(data.firstName + ' ' + data.lastName);
    }

};

