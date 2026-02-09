rootProject.name = "WorldTools"
pluginManagement {
    repositories {
        maven("https://maven.minecraftforge.net")
        maven("https://maven.architectury.dev")
        maven("https://maven.fabricmc.net")
        gradlePluginPortal()
        mavenCentral()
    }
    plugins {
        id("dev.architectury.loom") version "1.10.455"
        id("architectury-plugin") version "3.4.162"
    }
}

include("kotlin-lib")
include("fabric")
