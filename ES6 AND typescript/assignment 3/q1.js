var p1 = new Promise(function (resolve, reject) {
    var x = 22;
    resolve(x);
    reject("No");
});
p1.then(function (m) {
    console.log(m);
}).catch(function (m) {
    console.log("Error" + m);
});
var p2 = new Promise(function (resolve, reject) {
    var y = 12;
    resolve(y);
    reject("No");
});
p2.then(function (l) {
    console.log(l);
}).catch(function (l) {
    console.log("Error" + l);
});
Promise.all([p1, p2]).then(function (values) {
    var sum = 0;
    for (var i in values) {
        sum += values[i];
    }
    document.write(sum);
});
