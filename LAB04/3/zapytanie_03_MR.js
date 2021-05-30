// lista unikalnych zawodow
printjson(
    db.people.mapReduce(
        function() {
            emit(this.job, this.job);
        },
        function(keys, vals) {
            return "";
        }, {
            out: {
                inline: 1
            }
        }
    )
);
