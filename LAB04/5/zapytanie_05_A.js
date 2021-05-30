//Średnia i łączna ilość środków na kartach kredytowych kobiet narodowości polskiej w podziale na waluty

printjson(
    db.people.aggregate([
        {
            $match: { sex: "Female", nationality: "Poland" }
        },
        {
            $unwind: "$credit"
        },
        {
            $group: {
                _id: "$credit.currency",
                "Avg credit balance": { $avg: { $toDouble: "$credit.balance" } },
                "Total credit balance": { $sum: { $toDouble: "$credit.balance" } }
            }
        },
        {
            $project: {
                currency: "$_id",
                "Avg credit balance": 1,
                "Total credit balance": 1,
                _id: 0
            }
        }
    ])
    .toArray()
);
