var employee = (function () {
    function employee(name, age) {
        this.name = name;
        this.age = age;
    }
    employee.prototype.print = function () {
        return this.name + " " + this.age;
    };
    return employee;
}());
var circle = (function () {
    function circle(radius) {
        this.radius = radius;
    }
    circle.prototype.print = function () {
        return this.radius * 3.14;
    };
    return circle;
}());
function printAll(employee1, circle1) {
    document.write(employee1.print() + "<br>");
    document.write(circle1.print());
}
var employee1 = new employee("Avi", 22);
var circle1 = new circle(2);
printAll(employee1, circle1);
