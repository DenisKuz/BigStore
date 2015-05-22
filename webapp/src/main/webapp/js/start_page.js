/**
 * Created by Denis on 4/7/2015.
 */
Main.startPage = {
    template: null,
    hello: "hello",
    urlPage: "../app/piece/start_page.html",

    entry: function (login, password) {
        $.ajax({
            dataType: "text",
            contentType: 'application/json; charset=utf-8',
            type: "POST",
            url: "/elka/store/req/Entry",
            data: JSON.stringify({login: login, password: password}),
            success: function (data) {

                if (data == Main.startPage.hello) {
                    Main.startPage.getConsumerDataByLogin($('#login').val()).done(function () {
                        Main.welcomePage.render(Main.welcomePage.template, Main.consumer);
                    });
                    return;
                }
                Main.printMessage(data, $('#messageError'));
            }
        })
    },

    getConsumerDataByLogin: function (login) {
        if (!$.isEmptyObject(Main.consumer)) {
            return $.Deferred().resolve();
        }
        else {
            return $.ajax({
                dataType: "json",
                type: "GET",
                url: "/elka/store/req/GetConsumerData",
                data: "login=" + login,
                success: function (data) {
                    Main.consumer = data;
                }
            })
        }
    }

};

