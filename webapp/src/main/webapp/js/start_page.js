/**
 * Created by Denis on 4/7/2015.
 */
Main.startPage = {
    template: null,
    hello: "hello",
    urlPage: "../app/piece/start_page.html",

    entry: function (login, password) {
        $.ajax({
            dataType: "json",
            contentType: 'application/json; charset=utf-8',
            type: "POST",
            url: "/elka/store/req/Entry",
            data: JSON.stringify({login: login, password: password}),
            success: function (data) {
                if (data.messageCode == 0) {
                    Main.startPage.getConsumerDataByLogin($('#login').val()).done(function () {
                        Main.renderPage(Main.welcomePage, Main.consumer);
                    });
                    return;
                }
                Main.printMessage(data, $('#message'));
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
    },
    elementsActions: function () {
        $(function () {
            $("input[type=button][value=entry]").on("click", function () {
                Main.startPage.entry($('#login').val(), $('#password').val());
            });
            $('a:contains("registration")').on("click", function(){
                Main.renderPage(Main.registrationPage);
            });
        });
    }
};

