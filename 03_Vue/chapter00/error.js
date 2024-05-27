setInterval(() => {
  try {
    const rand = parseInt(Math.random() * 10);
    console.log(`생성된 수는 ${rand}`);

    // 빠른 리턴
    if (rand > 5) return console.log('아싸 로또 사자!');
    throw new Error('망했어요...');
  } catch (error) {
    console.log(error);
  }
}, 2000);
