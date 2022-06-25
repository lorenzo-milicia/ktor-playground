import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.0"
    application
    id("com.github.johnrengelman.shadow") version "7.1.2" // To build a Fat JAR
}

group = "org.lorenzo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm:2.0.2")
    implementation("io.ktor:ktor-server-netty-jvm:2.0.2")
    implementation ("io.ktor:ktor-server-status-pages:2.0.2")
    implementation ("io.ktor:ktor-server-default-headers:2.0.2")
    implementation("ch.qos.logback:logback-classic:1.2.11")   // Ktor's logging dependency
    testImplementation(kotlin("test"))
    implementation(kotlin("stdlib-jdk8"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}