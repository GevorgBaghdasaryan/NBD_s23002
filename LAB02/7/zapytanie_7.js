//Usuń z bazy osoby o wzroście przekraczającym 190; 

printjson(db.people.deleteMany({
    height: {
        $gt: "190"
    }
}));

printjson(db.people.find({
    height: {
        $gt: "190"
    }
}).toArray())
