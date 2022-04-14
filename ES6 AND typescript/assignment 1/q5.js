var add = function (num1, num2) {
    if (num1 === void 0) { num1 = 54; }
    if (num2 === void 0) { num2 = 91; }
    return num1 + num2;
};
function userFriends(username) {
    var array = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        array[_i - 1] = arguments[_i];
    }
    document.write("<br>" + username + "<br>");
    for (var _a = 0, array_1 = array; _a < array_1.length; _a++) {
        var i = array_1[_a];
        document.write(i + "<br>");
    }
}
function printCapitalNames(name1, name2, name3, name4, name5) {
    document.write(name1.toUpperCase() + "<br>");
    document.write(name2.toUpperCase() + "<br>");
    document.write(name3.toUpperCase() + "<br>");
    document.write(name4.toUpperCase() + "<br>");
    document.write(name5.toUpperCase() + "<br>");
}
var array = ["Mike", "Ted", "Barney", "Lucifer", "Dimitri"];
document.write(add());
userFriends("Medmedev", array);
printCapitalNames.apply(void 0, array);
