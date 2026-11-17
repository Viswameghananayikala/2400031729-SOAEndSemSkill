# app-service (Spring Boot + Docker)

Requirements: JDK 17, Maven, Docker Desktop (running).

## Steps (run inside this folder, where pom.xml is)

1. Run locally (optional check)
   mvn spring-boot:run
   Open http://localhost:8080/hello  -> Microservice running successfully in Docker!
   Stop with Ctrl + C

2. Build the JAR
   mvn clean package
   (creates target/app-service-1.0.jar)

3. Build the Docker image
   docker build -t app-service .
   docker images

4. Run the container
   docker run -d -p 8080:8080 --name app-container app-service

5. Verify
   docker ps
   docker logs app-container
   curl http://localhost:8080/hello

6. Or use Docker Compose (after step 3)
   docker compose up -d
   docker compose ps
   docker compose down

## Stop / clean up
   docker stop app-container
   docker rm app-container
