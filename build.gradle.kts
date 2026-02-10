import org.gradle.api.plugins.JavaPluginExtension

plugins {
    id("architectury-plugin") version "3.4.162" apply false
    id("dev.architectury.loom") version "1.10.455" apply false
    kotlin("jvm") version "2.0.21" apply false
}

subprojects {
    apply(plugin = "java")

    extensions.configure<JavaPluginExtension> {
        toolchain.languageVersion.set(JavaLanguageVersion.of(21))
    }

    repositories {
        maven("https://maven.minecraftforge.net")
        maven("https://maven.architectury.dev")
        maven("https://maven.fabricmc.net")
        mavenCentral()
    }
}
