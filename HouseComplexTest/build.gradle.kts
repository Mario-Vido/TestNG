plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.testng:testng:7.8.0")
    testImplementation("org.apache.logging.log4j:log4j-slf4j-impl:2.1")

}

tasks.test {
    useTestNG()
}