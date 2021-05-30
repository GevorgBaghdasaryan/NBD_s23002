// srednia waga i wzrost osób w bazie z podziałem na płeć.
printjson(
    db.people.aggregate( 
        { 
            $group: {
                _id: "$sex",
                "avg weight": { $avg: { $toDouble: "$weight" } },
                "avg height": { $avg: { $toDouble: "$height" } }
            }
        })
    .toArray()
);
