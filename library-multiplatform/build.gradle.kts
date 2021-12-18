plugins {
    kotlin("multiplatform") version "1.6.10"
}

kotlin {
    jvm()

    mingwX64()

    sourceSets {
        commonTest {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-test")
            }
        }
    }
}
