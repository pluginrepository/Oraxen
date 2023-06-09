pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()

        maven("https://repo.papermc.io/repository/maven-public/")
        maven("https://repo.crazycrew.us/first-party")
    }
}

rootProject.name = "Oraxen"

include("workspace")