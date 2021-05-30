//Średnie, minimalne i maksymalne BMI (waga/wzrost^2) dla osób w bazie, w podziale na narodowości.

printjson(
    db.people.aggregate([{
            $group: {
                _id: "$nationality",
                "Min_BMI": {
                    "$min": {
                        $divide: [{
                                $toDouble: "$weight"
                            },
                            {
                                $pow: [{
                                    $divide: [{
                                        $toDouble: "$height"
                                    }, 100]
                                }, 2]
                            }
                        ]
                    }
                },
                "Max_BMI": {
                    "$max": {
                        $divide: [{
                                $toDouble: "$weight"
                            },
                            {
                                $pow: [{
                                    $divide: [{
                                        $toDouble: "$height"
                                    }, 100]
                                }, 2]
                            }
                        ]
                    }
                },
                "Avg_BMI": {
                    "$avg": {
                        $divide: [{
                                $toDouble: "$weight"
                            },
                            {
                                $pow: [{
                                    $divide: [{
                                        $toDouble: "$height"
                                    }, 100]
                                }, 2]
                            }
                        ]
                    }
                }
            }
        },
        {
            $sort: {
                _id: 1
            }
        }
    ])
    .toArray()
);
