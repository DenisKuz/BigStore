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

    renderPage: function (html) {
        $('body').html(html);
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
        var sendingFields = $('[required]', form);
        var button = $('[type=button]', form);
        var count = 0;

        $(sendingFields).on('focusout input', $(form), function () {
                if ($(this).val() == "") {
                    $(this).css("background-color", "red");
                    button.prop('disabled', true);
                    count++;
                }
                else {
                    $(this).css("background-color", "");
                    count--;
                }
                if (count == 0) {
                    button.prop('disabled', false);
                }
            }
        )
    }

};