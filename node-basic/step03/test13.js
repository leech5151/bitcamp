// 객체 - 객체와 함수

// 함수도 객체다!
// 함수 = 객체 + 함수코드
//
// 자바코드로 비유하자면,
// Map<String,Object> obj = new HashMap<>();
// obj.put("name", "aaa");
// obj.put("age", 20);
// => 여기까지가 일반 객체라면
//    함수 객체는 여기에 코드까지 들어간다.
// obj.put("code", "{console.log('okok'); var a = 20; a++;}");
//
// => 자바스크립트에서 함수는 위와 같다고 생각하면 된다.
// 

function Calculator(){
    this.result = 0;
    this.plus = function(value) {
        this.result += value;
    };
    this.minus = function(value) {
        this.result -= value;
    };
}


var c1 = new Calculator();

c1.plus(10);
c1.plus(20);
c1.minus(7);
console.log(c1.result);


















