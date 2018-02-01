
var jsonStr = '{"name":"홍길동","age":20,"tel":"1111-1111"}';

var obj = JSON.parse(jsonStr);

console.log(obj.name);
console.log(obj.age);
console.log(obj.tel);