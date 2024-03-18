plugins {
    java
    id("org.springframework.boot") version "3.2.3"
    id("io.spring.dependency-management") version "1.1.4"
}

group = "com.luciorim"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.cloud:spring-cloud-config-client:4.1.0")

    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client:4.1.0")

    compileOnly("org.projectlombok:lombok")
    runtimeOnly("org.postgresql:postgresql")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("jakarta.validation:jakarta.validation-api:3.1.0-M1")
    implementation("org.mapstruct:mapstruct:1.5.5.Final")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
