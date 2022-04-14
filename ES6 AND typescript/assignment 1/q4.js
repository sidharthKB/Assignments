var names = ["Tom", "Ivan", "Jerry"];
var objects = [];
var object = function (name) {
    this.name = name,
        this.length = name.length;
};
for (var _i = 0, names_1 = names; _i < names_1.length; _i++) {
    var i = names_1[_i];
    var object1 = new object(i);
    objects.push(JSON.stringify(object1));
}
document.write(objects);
