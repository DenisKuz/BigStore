/**
 * Created by Denis on 4/21/2015.
 */
Main.welcomePage = {
    template: null,
    urlPage: "../app/piece/welcome_page.html",

    render: function (temp, source) {
        var template = Handlebars.compile(temp);
        var html = template(source);
        $('body').html(html);
    }

};
