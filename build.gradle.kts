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

//java {
//    sourceCompatibility = JavaVersion.toVersion("11")
//}

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
    listOf(
//            files("../kash/build/libs/kash-1.15.jar")
            "com.beust.kash:kash:1.14"
    )
        .forEach { compile(it) }

    listOf("stdlib")
        .forEach { compile(kotlin(it, kotlinVer)) }

}
