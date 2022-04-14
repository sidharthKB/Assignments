var order = {
    id: 123,
    name: "Delhi koonk",
    price: 890,
    printOrder: function () {
        console.log("Id: " + order.id);
        console.log("Name: " + order.name);
        console.log("Price: " + order.price);
    },
    getPrice: function () {
        return order.price;
    }
};
console.log(order.printOrder());
var order1 = Object.assign(order);
console.log(order1);
