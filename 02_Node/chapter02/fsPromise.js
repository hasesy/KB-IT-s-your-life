const fs = require('fs').promises;

fs.readFile('readme1.txt', 'utf-8')
  .then((data) => {
    console.log(data);
    return fs.readFile('readme2.txt', 'utf-8');
  })
  .then((data) => {
    console.log(data);
    return fs.readFile('readme3.txt', 'utf-8');
  })
  .then((data) => {
    console.log(data);
    return fs.readFile('readme4.txt', 'utf-8');
  })
  .then((data) => {
    console.log(data);
  })
  .catch((err) => {
    console.log(err);
  });
