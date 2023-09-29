FROM openjdk:17
EXPOSE 8080
WORKDIR /app
COPY . /app
RUN javac MovieCatalogServiceApplication.java
CMD ["java","movie-catalog-service"]