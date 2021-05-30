printjson(
        db.people.mapReduce(
            var mapFunc = function() {
                var bmi = function(weight, height) {
                    return (weight / Math.pow(height / 100, 2));
                }

                var weight = parseFloat(this.weight);
                var height = parseFloat(this.height);

                emit(this.nationality, {
                    count: 1,
                    sum: bmi(weight, height),
                    min: bmi(weight, height),
                    max: bmi(weight, height),
                });
            };


            var reduceFunc = function(key, values) {
                    var reducedValue = {
                            count: 0,
                            sum: 0,
                            min: values[0].min,
                            max: values[0].max,
                        },

                        values.forEach(function(value) {
                            reducedValue.count += value.count;
                            reducedValue.sum += value.sum;
                            reducedValue.min = Math.min(reducedValue.min, value.min);
                            reducedValue.max = Math.max(reducedValue.max, value.max);
                        });

                    return reducedValue;
                },

                var finalizeFunc = function(key, reducedValue) {
                    reducedValue.avg = reducedValue.sum / reducedValue.count;
                    return reducedValue;
                }

        );
