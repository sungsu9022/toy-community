tasks {
    bootJar {
        enabled = false
    }

    jar {
        enabled = true
    }
}

dependencies {
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
