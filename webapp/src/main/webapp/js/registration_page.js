/**
 * Created by Denis on 4/24/2015.
 */

Main.registrationPage = {
    template: null,
    urlPage: "../app/piece/registration_page.html",
    good_registration: "You are registered",
    registration: function () {
        $.ajax({
            dataType: "text",
            contentType: 'application/json; charset=utf-8',
            type: "POST",
            url: "/elka/store/req/Registration",
            data: $("#registrationForm").serializeForm()
        })
    },

    checkLogin: function (login) {

        $.ajax({
            dataType: "json",
            type: "GET",
            url: "/elka/store/req/CheckLogin",
            data: "login=" + login,
            success: function (data) {
                if (data.messageCode == 0) {
                    Main.registrationPage.registration();
                }
                Main.printMessage(data, $('#message'));
            }

        })
    }
};