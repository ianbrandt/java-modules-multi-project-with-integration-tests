plugins {
    id("myproject.java-conventions")
    `java-library`
}

dependencies {
    api(project(":list"))
}

tasks {
    named<Jar>("jar").configure {
        manifest {
            attributes("Automatic-Module-Name" to "org.gradle.sample.utilities")
        }
    }

    named<Jar>("integrationTestJar").configure {
        manifest {
            attributes("Automatic-Module-Name" to "org.gradle.sample.utilities.integrationTests")
        }
    }
}
