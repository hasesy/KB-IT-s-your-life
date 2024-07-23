use test2;

db.users.insertOne({name: "이예지", age: 26})

db.users.insertMany([
    {name: "최현수", age: 27},
    {name: "문준일", age: 30},
    {name: "박혜원", age: 28},
    {name: "김연비", age: 33}
])

db.users.insertOne({name: "이효석", age: 40})

db.users.updateMany({age: {$gt: 37}},
    {$set: {status: "늙음"}})
    
db.users.remove({
    $and: [
        {age: {$gt : 37}},
        {name: "이효석"}]
})

db.users.find({age: {$gt: 25}})

db.users.find()