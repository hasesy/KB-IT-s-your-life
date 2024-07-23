use test;

db.users.find()

db.users.insertMany([{name: "이태웅", age: 27}, {name:"김이수", age: 25}]);

db.users.insertOne({name: "뽀로로", age: 9})
db.users.insertOne({name: "루피", age: 8})

db.users.insertMany([{name: "정지희", age: 25}, {name: "공연정", age: 25}, {name: "최민준", age: 26}, {name: "권오현", age: 32}, {name: "임준수", age: 29}, {name: "최규찬", age: 29}, {name: "김동준", age: 29}])

db.users.updateOne(
    {name : "박혜원"},
    {$set: {age: 28}}
)
db.users.updateOne(
    {name : "na"},
    {$set: {name: "나건우"}}
)

// $ne 해당 조건이 아닌 모든 사람 선택
db.users.updateMany({name: {$ne : "나건우"}}, {$set: {position: "RM 아님"}});

db.users.updateMany(
    {age: {$lte: 30}},
    {$set: {status: "파릇파릇함"}}
);

db.users.deleteOne({name: "뽀로로"})

// $lte 이하
db.users.deleteMany({age: {$lte: 10}})

db.users.findOne({name: "이효석"})

// $le 미만
db.users.find({age: {$lt : 30}})

// $gt 이상
db.users.find({
    $and: [
        {position: "RM"},
        {age: {$gt: 20}}
    ]
})