pluginManagement {
    plugins {
        id("com.diffplug.spotless") version "6.13.0"
        id("com.github.ben-manes.versions") version "0.49.0"
        id("com.github.johnrengelman.shadow") version "8.1.1"
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        mavenLocal()
    }
}

rootProject.name = "aws-otel-lambda-java"
