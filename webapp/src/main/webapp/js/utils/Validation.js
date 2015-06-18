/**
 * Created by Denis on 6/1/2015.
 */
var ValidationForm = function (form) {

    var _this = this;
    _this.form = form;
    _this.sendingFields = $('[required]', form);
    _this.SubmitButton = $('[type=button]', form);

    var isFormFilled = function () {
        var count = 0;
        _this.sendingFields.each(function (index, element) {
            if ($(element).val() != "") {
                count++
            }
        });
        return (count == _this.sendingFields.length);
    };

    _this.checkFillingOfForm = function(element){
        if ($(element).val() == "") {
            $(element).css("background-color", "red");
            $(_this.SubmitButton).prop('disabled', true);
        }

        else {
            $(element).css("background-color", "");
        }

        if (isFormFilled(form)) {
            $(_this.SubmitButton).prop('disabled', false);
        }
    };
};