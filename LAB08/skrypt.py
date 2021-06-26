import riak
riakClient = riak.RiakClient(pb_port=8087)
bucket = riakClient.bucket('s23002')

person = {"name": "Gevorg", "surname": "Baghdasaryan", "age": 22, "hasPet":FALSE, "livesinWarsaw": TRUE}
key = bucket.new('person', data = person)
key.store()
print('Dodany nowy record')

retrieved = bucket.get('person')
print('Dane: ' + str(retrieved.data))


retrieved.data['hasPet'] = TRUE
retrieved.store()

retrieved_modified = bucket.get('person')
print('Zmodyfikowano pole hasPet: ' + str(retrieved_modified.data))


retrieved_modified.delete()
print('Usunieto record')
deleted = bucket.get('person')
print('Pobieranie danych usunietych: ' + str(deleted.data))


