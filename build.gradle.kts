plugins {
    kotlin("jvm") version "1.9.0"
    application
    id("io.ktor.plugin") version "2.3.4"
}

group = "com.biblioteca"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Kotlin
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    
    // Ktor
    implementation("io.ktor:ktor-server-core:2.3.4")
    implementation("io.ktor:ktor-server-netty:2.3.4")
    implementation("io.ktor:ktor-server-content-negotiation:2.3.4")
    implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.4")
    
    // SQLite
    implementation("org.xerial:sqlite-jdbc:3.41.2.2")
    implementation("org.jetbrains.exposed:exposed-core:0.41.1")
    implementation("org.jetbrains.exposed:exposed-dao:0.41.1")
    implementation("org.jetbrains.exposed:exposed-jdbc:0.41.1")
    implementation("org.jetbrains.exposed:exposed-java-time:0.41.1")
    
    // Logging
    implementation("ch.qos.logback:logback-classic:1.4.7")
    
    // Test
    testImplementation("io.ktor:ktor-server-test-host:2.3.4")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.9.0")
}

application {
    mainClass.set("com.biblioteca.ApplicationKt")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
