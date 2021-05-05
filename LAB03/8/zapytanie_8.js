//Zastąp nazwę miasta „Moscow” przez „Moskwa” u wszystkich osób w bazie; 

printjson(db.people.updateMany({
    "location.city": "Moscow"
}, {
    $set: {
        location: {
            city: "Moskwa"
        }
    }
}));

printjson(db.people.find({
    "location.city": "Moskwa"
}).toArray());
