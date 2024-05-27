// promise 방식
const lottoPromise = new Promise((resolve, reject) => {
  console.log('나 로또 사도 될까!?');
  setTimeout(() => {
    const rand = parseInt(Math.random() * 10);
    console.log(`나온 숫자는 ${rand}`);

    if (rand >= 5) {
      resolve('아싸! 로또 사자!');
    } else {
      reject('아... 망했어요...');
    }
  }, 3000);
});

// lottoPromise
//   .then((data) => {
//     showResult(data);
//   })
//   .catch((err) => {
//     console.log(err);
//   });

// function showResult(msg) {
//   console.log(msg);
// }

// async/await 방식
async function lottoAsyncAwait() {
  const data = await lottoPromise;
  console.log(data);
}

lottoAsyncAwait();
