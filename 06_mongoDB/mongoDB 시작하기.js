// 데이터베이스 사용
use tutorial;

// 값 넣기
db.users.insert({username: "smith"})
db.users.insert({username:"jones"})

// 해당 데이터 개수
db.users.count()

// 값 찾기
db.users.find()
db.users.find({username: "jones"})
db.users.find({_id : ObjectId("669efa7e2959b75bb3072f8a"), username: "smith"});

// and 사용
db.users.find({$and: [
    {_id: ObjectId("669efa7e2959b75bb3072f8a")},
    {username: "smith"}
    ]})

// or 사용    
db.users.find({ $or: [
    {username: "smith"},
    {username: "jones"}
    ]})
    
// 데이터 수정, 키가 없으면 추가
db.users.update({username: "smith"}, {$set: {country: "Canada"}})
db.user.update({username: "smith"}, {country: "Canada"})
db.users.find({country: "Canada"})
db.users.update({country: "Canada"}, {username: "smith", country: "Canada"})

// 데이터 수정, 해당 키 삭제
db.users.update({username: "smith"}, {$unset: {country: 1}})

// 복잡한 데이터 업데이트
db.users.update({username: "smith"},
{
    $set: {
    favorites: {
        cities: ["Chicago", "Cheyenne"],
        movies: ["Caseblanca", "For a Few Dollars More", "The Sting"]
    }
}})

db.users.update({username: "jones"},
{
    $set: {
    favorites: {
        movies: ["Caseblanca", "Rocky"]
    }
}})

db.users.find().pretty()

// 내부 문서 검색
db.users.find({"favorites.movies": "Caseblanca"}).pretty()

// 더 발전된 업데이트
// push 배열에 무조건 추가, 중복 가능
// addToSet 중복없이 배열에 추가
db.users.update({"favorites.movies": "Caseblanca"},
    {$addToSet: {"favorite.movies": "The Maltese Falcon"}},
        false, // insert if not found?)
        true) // update all found? (if false, updates just first it finds)
        
// 데이터 삭제
db.users.remove({"favorites.cities": "Cheyenne"})
db.users.remove({})

// 컬렉션 삭제
db.users.drop()

// 대용량 컬렉션 생성
for (let i = 0; i < 200000; i++) {
    db.numbers.insert({num: i});
}

db.numbers.count()

show dbs