// 객체 II - 복잡한 객체 생성 단축 문법 

function Calculator() {
    this.result = 0;
}

Calculator.prototype.plus = function(value) {
    this.reuslt += value;
};
Calculator.prototype.minus = function(value) {
    this.reuslt += value;
};

//Calculator.plus(10);

var c1 = new Calculaotr();
c1.plus(10);

Calculator.abs = function(value){
    return (value < 0) ? value * -1 : value;
};

console.log(Calculator.abs(-100))
console.log(Calculator.abs(100))