rootProject.name = "kover-repro"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

include(":library-jvm")
include(":library-multiplatform")
