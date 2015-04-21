/**
 * Created by Denis on 4/7/2015.
 */

Main.startPage = {

    entry: function (login, password) {

        $.ajax({
            dataType: "text",
            contentType: 'application/json; charset=utf-8',
            type: "POST",
            url: "/elka/store/req/Entry",
            data: JSON.stringify({login: login, password: password}),
            success: function (data) {
                Main.startPage.printError(data, $('#messageError'));
            }
        })
    },

    printError: function (data, element) {
        element.text(data);
    },

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
    },

    getStartPiece: function () {

        $(document).ready(function () {
            $.ajax({
                dataType: "html",
                type: "GET",
                url: "../app/piece/start_piece.html",
                success: function (source) {
                    Main.startPage.renderStartPiece(source);
                }
            })

        });

    },

    renderStartPiece: function (source) {
        //var template = Handlebars.compile(source);
        //var html = template();
        $('body').html(source);
    }

};

