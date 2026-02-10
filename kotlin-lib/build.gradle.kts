plugins {
    kotlin("jvm")
}

group = "org.waste.of.time"
version = "1.2.8"

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation(kotlin("stdlib"))

    api(project(":kotlin-lib"))
}