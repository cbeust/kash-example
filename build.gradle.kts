val kotlinVer by extra { "1.3.41" }

buildscript {
    val kotlinVer by extra { "1.3.41" }

    repositories {
        jcenter()
        mavenCentral()
        maven { setUrl("https://plugins.gradle.org/m2") }
    }

    dependencies {
        classpath(kotlin("gradle-plugin", kotlinVer))
    }
}

repositories {
    jcenter()
    mavenCentral()
    maven { setUrl("https://plugins.gradle.org/m2") }
}

plugins {
    java
    kotlin("jvm") version "1.3.41"
}

dependencies {
    listOf("com.beust.kash:kash:1.16",
            kotlin("stdlib", kotlinVer))
        .forEach {
            compile(it)
        }
}
