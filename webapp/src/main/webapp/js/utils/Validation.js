/**
 * Created by Denis on 6/1/2015.
 */
var ValidationForm = function (form) {

    var _this = this;
    _this.validatingOfFields = $('[data-validation]', form);
    var SubmitButton = $('[type=button]', form);
    var mapFieldsOnValidation = {};

    var mappingFieldsOnValidation = (function () {
        _this.validatingOfFields.each(function (index, field) {
            var fieldName = $(field).attr("id");
            if ($(field).data("validation")) {
                mapFieldsOnValidation[fieldName] = $(field).data("validation");
            }
        })
    })();


    var isFormFilled = function () {
        var count = 0;
        _this.validatingOfFields.each(function (index, element) {
            if ($(element).val() != "") {
                count++
            }
        });
        return (count == _this.validatingOfFields.length);
    };

    var checkFillingOfForm = function (element) {
        if ($(element).val() == "") {
            $(element).css("background-color", "red");
            $(SubmitButton).prop('disabled', true);
        }

        else {
            $(element).css("background-color", "");
        }

        if (isFormFilled(form)) {
            $(SubmitButton).prop('disabled', false);
        }
    };

    _this.checkForm = function (checkingElement) {
        var fieldValidation = getValidationForField(checkingElement).split(" ");
        for (var index in fieldValidation) {
            ValidationFunctions[fieldValidation[index]](checkingElement);
        }
    };

    var getValidationForField = function (checkingElement) {
        var fieldName = $(checkingElement).attr("id");
        var fieldValidation = [];
        for (var key in mapFieldsOnValidation) {
            if (key == fieldName) {
                fieldValidation = mapFieldsOnValidation[key];
                break;
            }
        }
        return fieldValidation;
    };

    var ValidationFunctions = {

        notEmpty: function (field) {
            checkFillingOfForm(field)
        },
        onlyLetters: function (field) {

        }
    };
};