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
        var arr = [];
        for (var page in Main) {
            if (Main[page].urlPage) {
                arr.push(Main.getPage(Main[page]));
            }
        }
        return $.when.apply($, arr);
    },

    renderPage: function (page, source) {
        var html = page.template;
        if (source) {
            var template = Handlebars.compile(page.template);
            html = template(source);
        }
        $('body').html(html);
        page.elementsActions();
    },

    printMessage: function (data, element) {

        if (data.messageCode == 0) {
            element.attr("style", "color: green")
        }
        else if (data.messageCode == 1) {
            element.attr("style", "color: red")
        }

        element.text(data.messageText);
    },

    checkSendingForm: function (form) {
        var validation = new ValidationForm(form);
        $(validation.validatingOfFields).on('focusout input', function () {
                validation.checkForm(this);
            }
        );
    }

};
$(function () {
    Main.getAllPage().done(function () {
        Main.renderPage(Main.startPage);
    });
});