// 1번
use test;

for (let i = 0; i < 20000; i++) {
    db.product.insertOne({num: i, name: '스마트폰' + i})
};

// 2번
db.product.countDocuments();

// 3번
db.product.find().sort({num: -1});

// 4번
db.product.find().sort({num: -1}).limit(10);

// 5번
db.product.find().sort({num: -1}).skip(10 * 5).limit(10);

// 6번
db.product.find({ $or: [{ num: { $lt: 15 } }, { num: { $gt: 19995 } }] });

// 7번
db.product.find({ $or: [{ name: '스마트폰10' }, { name: '스마트폰100' }, { name: '스마트폰1000' } ]} );

// 8번
db.product.find({num: {$lt: 5}}, {_id: 0, name: 1});
