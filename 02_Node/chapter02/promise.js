const promise = new Promise((resolve, reject) => {
  console.log('프로미스 시작!');
  setTimeout(() => {
    console.log('setTimeout 끝!');
    resolve('프로미스로 비동기 구현 성공!');
  }, 2000);
});

console.log(promise);

// async/await 방식
async function asyncFunc() {
  const result = await promise;
  console.log(result);
}

asyncFunc();

// promise 방식
// promise.then((data) => {
//   console.log(data);
// });
