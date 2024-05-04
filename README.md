# Get Started

### Bring up the Kafka Cluster and Stop it

1. Navigate to `docker` directory.
2. You will find multiple docker compose yml files which define the services that make up our Kafka Deployment so that they can be run together in an isolated environment.
3. Use the following command to launch the Kafka Cluster.
  
    
    ` docker-compose -f <file name> up -d`
    
For example:
    
    `docker-compose -f zk-single-kafka-single.yml up -d`
4. You can stop the services by stopping the respective containers:


    `docker-compose -f zk-single-kafka-single.yml stop`

5. To remove all the resources including the containers altogether use `down` instead of `stop`


    `docker-compose -f zk-single-kafka-single.yml down`