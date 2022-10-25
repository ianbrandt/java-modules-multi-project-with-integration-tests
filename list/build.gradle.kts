plugins {
    id("myproject.java-conventions")
    `java-library`
}

tasks {
    named<Jar>("jar").configure {
        manifest {
            attributes("Automatic-Module-Name" to "org.gradle.sample.list")
        }
    }
}
