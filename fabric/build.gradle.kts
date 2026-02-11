plugins {
    id("architectury-plugin")
    id("dev.architectury.loom")
    kotlin("jvm")
}

repositories {
    maven("https://maven.fabricmc.net/")
    maven("https://maven.terraformersmc.com")
    mavenCentral()
    
}

architectury {
    platformSetupLoomIde()
    fabric()
}

dependencies {
    minecraft("com.mojang:minecraft:${property("minecraft_version")}")
    mappings("net.fabricmc:yarn:${property("yarn_mappings")}:v2")
    
    modImplementation("net.fabricmc:fabric-loader:${project.properties["fabric_loader_version"]!!}")
    modImplementation("net.fabricmc.fabric-api:fabric-api:${project.properties["fabric_api_version"]!!}")
    modImplementation("net.fabricmc:fabric-language-kotlin:${project.properties["fabric_kotlin_version"]!!}")
    modApi("me.shedaniel.cloth:cloth-config-fabric:${project.properties["cloth_config_version"]}")
    modApi("com.terraformersmc:modmenu:${project.properties["mod_menu_version"]}")

}

loom {
    java {
        toolchain.languageVersion.set(JavaLanguageVersion.of(21))
    }
}
