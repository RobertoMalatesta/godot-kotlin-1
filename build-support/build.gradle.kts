plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    api(kotlin("gradle-plugin", version = "1.3.61"))
    implementation("com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.4")
    implementation("com.squareup:kotlinpoet:1.5.0")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.10.1")
    implementation("org.ajoberstar.reckon:reckon-gradle:0.12.0")
    implementation("gradle.plugin.org.jetbrains.intellij.plugins:gradle-intellij-plugin:0.4.16")
    implementation("de.undercouch:gradle-download-task:4.0.4")
}