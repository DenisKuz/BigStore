/**
 * Created by Denis on 4/21/2015.
 */
Main.welcomePage = {
    template: null,
    urlPage: "../app/piece/welcome_page.html",

    elementsActions: function () {
        $(function () {
            $("input[type=button][value=back]").on("click", function () {
                Main.renderPage(Main.startPage)
            });
        });
    }
};
