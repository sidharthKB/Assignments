var listArmStrong = [9, 12, 34, 71, 87, 93];
var iterator = listArmStrong[Symbol.iterator]();
function getNextArmstrong() {
    return iterator.next().value;
}
document.write(getNextArmstrong() + "<br>");
document.write(getNextArmstrong() + "<br>");
document.write(getNextArmstrong() + "<br>");
document.write(getNextArmstrong() + "<br>");
