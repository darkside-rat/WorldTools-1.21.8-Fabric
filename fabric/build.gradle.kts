plugins {
    id("architectury-plugin")
    id("dev.architectury.loom")
    kotlin("jvm")
}

repositories {
    maven("https://maven.fabricmc.net/")
    mavenCentral()
}

architectury {
    platformSetupLoomIde()
    fabric()
}

dependencies {
    minecraft("com.mojang:minecraft:${property("minecraft_version")}")
    mappings("net.fabricmc:yarn:${property("yarn_mappings")}:v2")
    modImplementation("net.fabricmc:fabric-loader:0.16.9")
    modImplementation("net.fabricmc:fabric-language-kotlin:1.13.9+kotlin.2.3.10")
    implementation(project(":kotlin-lib"))
}

loom {
    java {
        toolchain.languageVersion.set(JavaLanguageVersion.of(21))
    }
}
