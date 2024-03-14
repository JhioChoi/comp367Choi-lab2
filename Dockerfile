FROM openjdk:21
EXPOSE 8080
ADD target/JihoChoi_COMP367_Lab2.jar JihoChoi_COMP367_Lab2.jar
ENTRYPOINT [ "java", "-jar","/JihoChoi_COMP367_Lab2.jar" ]