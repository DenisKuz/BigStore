/**
 * Created by Denis on 4/21/2015.
 */
Main.welcomePage = {
    template: null,

    render: function (temp, source) {
        var template = Handlebars.compile(temp);
        var html = template(source);
        $('body').html(html);
    },

    get: function () {
        $(document).ready(function () {
            $.ajax({
                dataType: "html",
                type: "GET",
                url: "../app/piece/welcome_piece.html",
                success: function (source) {
                    Main.welcomePage.template = source;
                }
            })

        });

    }

};
