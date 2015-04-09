/**
 * Created by Denis on 4/7/2015.
 */
function query(login) {
    $.ajax({
        dataType: "json",
        type: "GET",
        url: "/elka/store/req/first",
        data: "login=" + login,
        success: function (data) {
            callBack(data);
        }
    });
}


function callBack(data) {
    alert("Прибыли данные: " + data);
}