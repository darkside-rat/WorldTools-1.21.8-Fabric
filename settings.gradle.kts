rootProject.name = "WorldTools-1.21.8-Fabric"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.fabricmc.net/")
        maven("https://maven.architectury.dev/")
        maven("https://maven.minecraftforge.net/")
    }
}

include("fabric")
include("kotlin-lib")