/**
 * Created by Denis on 5/21/2015.
 */
$.fn.serializeForm = function () {
    var o = {};
    debugger;
    var a = this.serializeArray();
    $.each(a, function () {
        debugger;
        o[this.name] = this.value || '';
    });
    return JSON.stringify(o);
};