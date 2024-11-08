# drools-example

just run it and send the example.curl

```
curl --location 'http://localhost:8089/evaluate' \
--header 'Content-Type: application/json' \
--data-raw '{

    "MONGOURI": {
        "value": "mongodb://username:password@host1.cariprpcpar:27017,host2:27017,host3:27017/databaseName?replicaSet=replicaSetName&authSource=authDbName&ssl=true&connectTimeoutMS=30000&socketTimeoutMS=60000&maxPoolSize=50&w=majority&readPreference=secondaryPreferred",
        "metadata": []
    },
    "KAFKA_BROKERS": {
        "value": "PLAINTEXT://broker1.kafka.example.com:9092,broker2.kafka.example.com:9092,broker3.kafka.example.com:9092?security.protocol=SASL_SSL&sasl.mechanism=SCRAM-SHA-512&ssl.truststore.location=/path/to/truststore.jks&ssl.truststore.password=truststorePassword&ssl.keystore.location=/path/to/keystore.jks&ssl.keystore.password=keystorePassword&request.timeout.ms=60000&retries=5",
        "metadata": []
    },
    "MY_ENV_INFO": {
        "value": "ciao",
        "metadata": []
    }
}'

```