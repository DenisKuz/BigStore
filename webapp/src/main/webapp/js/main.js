/**
 * Created by Denis on 4/15/2015.
 */

var Main = {

    consumer: {},

    startPage: {},

    registrationPage: {},

    welcomePage: {},

    getPage: function (page) {
        if (page.template) {
            return $.Deferred().resolve();
        } else {
            return $.ajax({
                dataType: "html",
                type: "GET",
                url: page.urlPage,
                success: function (source) {
                    page.template = source;
                }
            });
        }
    },
    getAllPage: function () {
        debugger;
        var arr = [];
        for (var page in Main) {
            if (Main[page].urlPage) {
                arr.push(Main.getPage(Main[page]));
            }
        }
        return $.when.apply($, arr);
    },

    renderPage: function (html) {
        $('body').html(html);
    }

};