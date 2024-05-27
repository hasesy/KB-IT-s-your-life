fs = require('fs');

const data = fs.readFileSync('./example.txt', 'utf8');

//existsSync 파일 존재여부 확인
if (fs.existsSync('text-1.txt')) {
  console.log('file already exist');
} else {
  fs.writeFileSync('./text-1.txt', data);
}
