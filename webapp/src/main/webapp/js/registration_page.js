/**
 * Created by Denis on 4/24/2015.
 */

Main.registrationPage = {
    template: null,
    urlPage: "../app/piece/registration_page.html",
    registration: function () {
        $.ajax({
            dataType: "text",
            contentType: 'application/json; charset=utf-8',
            type: "POST",
            url: "/elka/store/req/Registration",
            data: $("#registrationForm").serializeForm(),
            success: function (data) {
            }
        })
    }
};