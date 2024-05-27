fs = require('fs');

// write 할 때 파일이 없으면 새로 만들어 줌
// 존재하고, 다른 내용이 들어있으면? 기존 거 다 버리고 새로 씀
const data = fs.readFileSync('./example.txt', 'utf8');
fs.writeFileSync('./text-1.txt', data);
