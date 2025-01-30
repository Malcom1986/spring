plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.aspectj:aspectjweaver:1.9.22.1")
    implementation("jakarta.annotation:jakarta.annotation-api:3.0.0")
    implementation("org.springframework:spring-core:6.2.2")
    implementation("org.springframework:spring-context:6.2.2")
    implementation("org.springframework:spring-beans:6.2.2")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}