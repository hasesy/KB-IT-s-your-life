const obj = {
  name: '김서연',
  age: '25',
  condition: 'Good',
};

function getKeyValue(obj, str) {
  if (str in obj) {
    console.log(obj[str]);
  }
}

getKeyValue(obj, 'name');

for (let key in obj) {
  console.log(`key 값은 ${key} 이고, value ${obj[key]} 입니다.`);
}

let student = {};
student.name = '김서연';
student.age = '25';
student.dream = 'Programing';

student.toString = function () {
  for (let key in this) {
    if (key !== 'toString') {
      console.log(key + '\t' + this[key]);
    }
  }
};

student.toString();
