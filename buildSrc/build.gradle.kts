plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

tasks.compileKotlin {
    sourceCompatibility = "11"
    targetCompatibility = "11"
}