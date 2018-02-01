var obj = {
        name: "홍길동",
        "age": 20,
        "tel": "1111-1111"
};

console.log(obj);

var jsonStr = '{"name":"홍길동","age":20,"tel":"1111-1111"}';

var jsonStr2 = JSON.stringify(obj);

console.log(jsonStr);
console.log(jsonStr2);