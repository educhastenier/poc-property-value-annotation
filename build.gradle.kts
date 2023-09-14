plugins {
    java
    id("org.springframework.boot") version "2.7.15"
    id("io.spring.dependency-management") version "1.0.15.RELEASE"
}

group = "com.bonitasoft.property-value"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_11
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    annotationProcessor("org.projectlombok:lombok:1.18.24")
    compileOnly("org.projectlombok:lombok:1.18.24")
}

tasks.withType<Test> {
    useJUnitPlatform()
    // so that SysProps are passed to the forked test jvm:
    System.getProperties().forEach { systemProperty(it.key as String, it.value) }
}
