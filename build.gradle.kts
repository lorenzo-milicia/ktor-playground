import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val ktorVersion: String = "2.0.2"

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
    implementation("io.ktor:ktor-server-core-jvm:$ktorVersion")
    implementation("io.ktor:ktor-server-netty-jvm:$ktorVersion")
    implementation ("io.ktor:ktor-server-status-pages:$ktorVersion")
    implementation ("io.ktor:ktor-server-default-headers:$ktorVersion")
    implementation("ch.qos.logback:logback-classic:1.2.11")   // Ktor's logging dependency
    testImplementation(kotlin("test"))
    testImplementation("io.ktor:ktor-server-test-host:$ktorVersion") {
        exclude(group = "junit", module = "junit")
    }
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