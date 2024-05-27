// 자바스크립트로 웹 서버와 통신하는 함수 fetch

fetch('http://jsonplaceholder.typicode.com/users')
  .then((response) => response.json())
  .then((data) => console.log(data))
  .catch((err) => console.log(err));
