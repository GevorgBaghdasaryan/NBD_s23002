// Łączna ilość środków pozostałych na kartach kredytowych osób w bazie, w podziale na waluty; 
printjson(
    db.people.aggregate([
        {
            $unwind: "$credit"
        },
        {
            $group: {
                _id: "$credit.currency",
                "Srodki na kartach": { $sum: { $toDouble: "$credit.balance" } }
            }
        },
        {
            $project: {
                waluta: "$_id",
                "Srodki na kartach": 1
            }
        }
    ])
    .toArray()
);
