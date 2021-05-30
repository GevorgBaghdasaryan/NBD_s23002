// Łączna ilość środków pozostałych na kartach kredytowych osób w bazie, w podziale na waluty; 
printjson(
    db.people.mapReduce(
        function() {
            this.credit.forEach(c => emit(c.currency, parseFloat(c.balance)));
        },
        function(keys, vals) {
            return vals.reduce((a, b) => a + b);
        }, {
            out: {
                inline: 1
            }
        }
    )
);
