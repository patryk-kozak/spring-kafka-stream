# Spring Cloud with Kafka Streams

Sample code of running Spring Cloud along with Kafka Streams and processing them.

Included tips and workarounds to make workable solutions.

## Installation

You need Kafka and Schema registry.
There is included Dockerfile inside the project in the `docker` directory.
```shell script
cd docker && docker-compose up
```
If you struggle to run Docker Compose please make sure you don't have any Kafka containers running:
```shell script
docker rm -f $(docker ps -a -q)
```

Run Maven Wrapper included to compile, test and build source code.

```shell script
./mvnw clean install
```

## Usage

To see output of running sample stream please download [Kafka distribution](https://kafka.apache.org/downloads) as we will need Kafka Console Consumer.

In the terminal open 2 tabs / 2 windows and go to Kafka /bin folder:
`~/kafka_2.12-2.3.0/bin` and launch in first:
```shell script
./kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic orders
```
And in the other tab / window launch consumer for output topic:
```shell script
./kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic orders-transformed
```

Then just run simple curl and send some values to `input` for the stream:
```shell script
curl localhost:8080/api/send/{value}
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.