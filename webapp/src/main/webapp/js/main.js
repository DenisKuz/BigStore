/**
 * Created by Denis on 4/15/2015.
 */

var Main = {

    consumer: null,

    startPage: {},

    registrationPage: {},

    welcomePage: {},

    getPage: function (page, url) {
        if (page.template) {
            return $.Deferred().resolve();
        } else {
            return $.ajax({
                dataType: "html",
                type: "GET",
                url: url,
                success: function (source) {
                    page.template = source;
                }
            });
        }
    },
    getAllPage: function () {
        return $.when(Main.getPage(Main.welcomePage, Main.welcomePage.urlPage), Main.getPage(Main.registrationPage,
            Main.registrationPage.urlPge), Main.getPage(Main.startPage, Main.startPage.urlPage));
    },

    renderPage: function(html){
        $('body').html(html);
    }

};