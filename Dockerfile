FROM openjdk:8
COPY ./target/CalculatorDevops-1.0-SNAPSHOT-jar-with-dependencies.jar /home/akshay
WORKDIR /home/akshay
CMD ["java", "-cp","CalculatorDevops-1.0-SNAPSHOT-jar-with-dependencies.jar","App"]
