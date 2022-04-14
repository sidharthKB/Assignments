var Fibo = /** @class */ (function () {
    function Fibo() {
        this.previousNo = Symbol();
        this.currentNo = Symbol();
        this.previousNo = 0;
        this.currentNo = 1;
    }
    Fibo.prototype.next = function () {
        var nxt = Symbol();
        nxt = this.previousNo + this.currentNo;
        this.previousNo = this.currentNo;
        this.currentNo = nxt;
        return nxt;
    };
    return Fibo;
}());
var obj = new Fibo();
document.write(obj.next() + "<br>");
document.write(obj.next() + "<br>");
document.write(obj.next() + "<br>");
document.write(obj.next() + "<br>");
document.write(obj.next() + "<br>");
