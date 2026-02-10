plugins {
    id("dev.architectury.loom")
    kotlin("jvm")
}

group = "org.waste.of.time"
version = "1.2.8"

kotlin {
    jvmToolchain(21)
}

dependencies {
    minecraft("com.mojang:minecraft:${rootProject.property("minecraft_version")}")
    mappings("net.fabricmc:yarn:${rootProject.property("yarn_mappings")}:v2")

    modImplementation("net.fabricmc:fabric-loader:${rootProject.property("fabric_loader_version")}")
    
    implementation(kotlin("stdlib"))
}