# Flowing Retail / Apache Kafka / Java

This folder contains services written in Java that connect to Apache Kafka as means of communication between the services.

Tech stack:

 * Java 8
 * Spring Boot 1.5.x
 * Spring Cloud Streams
 * Apache Kafka

Following you can see a diagram with all the services we'll to use.

![Microservices](./docs/kafka-services.png)

## Fast run

To execute all the services with all the configuration by default, just execute the following command.

```
 $ make run
```

Once all the services are up and running, you can access to the following URL's:

 * If you want to simulate a new order `Order` [http://localhost:8090](http://localhost:8090)
 * Camunda webapp for the service `Order` [http://localhost:8091](http://localhost:8091)
 * Camunda webapp for the service `Payment` [http://localhost:8092](http://localhost:8092)
 * You can monitor all the system events in  [http://localhost:8095](http://localhost:8095)

To access to the Camunda webapp in the `Order` and `Payment` services, you can user the following credentials:

 * user: `demo`
 * password: `demo`

## More help

If you need more help, you just have to execute the following command:

```
 $ make
```

## Referencias

 * https://blog.bernd-ruecker.com/flowing-retail-demonstrating-aspects-of-microservices-events-and-their-flow-with-concrete-source-7f3abdd40e53
 * https://blog.couchbase.com/saga-pattern-implement-business-transactions-using-microservices-part/
 * https://blog.couchbase.com/saga-pattern-implement-business-transactions-using-microservices-part-2/
