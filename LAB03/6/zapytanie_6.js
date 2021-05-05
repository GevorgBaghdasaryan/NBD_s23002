//Dodaj siebie do bazy, zgodnie z formatem danych użytych dla innych osób 

printjson(db.people.insertOne({
    "sex": "Male",
    "first_name": "Gevorg",
    "last_name": "Baghdasaryan",
    "job": "Assistant to the Regional Manager",
    "email": "s23002@pjwstk.edu.pl",
    "location": {
        "city": "Warsaw",
        "address": {
            "streetname": "Zlota",
            "streetnumber": "22"
        }
    },
    "description": "MongoDB jest fajne",
    "height": "172",
    "weight": "80",
    "birth_date": "1997-09-25",
    "nationality": ":Armenia",
    "credit": [{
        "type": "Mastercard",
        "number": "123456789101112",
        "currency": "PLN",
        "balance": "0"
    }]
}));

printjson(db.people.find({
    last_name: "Baghdasaryan"
}).toArray());

