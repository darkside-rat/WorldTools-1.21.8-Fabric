plugins {
    id("dev.architectury.loom")
    kotlin("jvm")
}

repositories {
    maven("https://maven.fabricmc.net/")
    mavenCentral()
}

dependencies {
    minecraft("com.mojang:minecraft:1.21.8")
    mappings("net.fabricmc:yarn:1.21.4+build.1:v2")
    modImplementation("net.fabricmc:fabric-loader:0.16.9")
    modImplementation("net.fabricmc:fabric-language-kotlin:1.13.9+kotlin.2.3.10")
    implementation(project(":kotlin-lib"))
}

loom {
    java {
        toolchain.languageVersion.set(JavaLanguageVersion.of(21))
    }
}
