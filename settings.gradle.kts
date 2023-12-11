

pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}


dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

rootProject.name="my_project"




include("app")
include("service")
include("domain")
