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

        $(sendingFields).on('focusout input', $(form), function () {
                debugger;
                if ($(this).val() == "") {
                    $(this).css("background-color", "red");
                    button.prop('disabled', true);
                }

                else {
                    $(this).css("background-color", "");
                }

                if (isFormFilled(sendingFields)) {
                    button.prop('disabled', false);
                }
            }
        );
        var isFormFilled = function (sendingFields) {
            debugger;
            var count = 0;
            sendingFields.each(function (index, element) {
                if ($(element).val() != "") {
                    count++
                }
            });
            return (count == sendingFields.length);
        }
    }

};