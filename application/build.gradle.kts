plugins {
    id("myproject.java-conventions")
    application
}

dependencies {
    implementation(project(":utilities"))
}

application {
    mainModule.set("org.gradle.sample.app")
    mainClass.set("org.gradle.sample.app.Main")
}

tasks {
    named<Jar>("jar").configure {
        manifest {
            attributes("Automatic-Module-Name" to "org.gradle.sample.app")
        }
    }
}
