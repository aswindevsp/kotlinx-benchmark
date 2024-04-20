plugins {
    kotlin("jvm") version "1.9.23"

    id("org.jetbrains.kotlinx.benchmark") version "0.4.10"
    kotlin("plugin.allopen") version "1.9.20"

}

group = "org.jetbrains.kotlinx.benchmark.examples"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-benchmark-runtime:0.4.10")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(11)
}
allOpen {
    annotation("org.openjdk.jmh.annotations.State")
}


benchmark {
    targets {
        register("main")
    }
}