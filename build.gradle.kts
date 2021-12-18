plugins {
    id("org.jetbrains.kotlinx.kover") version "0.4.4"
    id("org.sonarqube") version "3.3"
}

sonarqube {
    properties {
        property("sonar.host.url", "http://localhost:9000")
    }
}

subprojects {
    sonarqube {
        properties {
            property("sonar.sources",  file("$projectDir/src/main/kotlin/"))
            property("sonar.tests", file("$projectDir/src/test/kotlin/"))
            property(
                "sonar.coverage.jacoco.xmlReportPaths",
                file("$buildDir/reports/kover/report.xml")
            )
        }
    }
}
