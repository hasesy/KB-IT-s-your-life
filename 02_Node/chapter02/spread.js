const fruits = ['사과', '바나나', '수박'];

console.log(fruits);
console.log(...fruits);

function conlog(a, b, c) {
  console.log(a, b, c);
}

conlog(fruits[0], fruits[1], fruits[2]);
conlog(...fruits);
