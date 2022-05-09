plugins {
    kotlin("js") version "1.6.20"
}

group = "sysoev.projects"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    with(Dependencies.KotlinWrappers) {
        implementation(enforcedPlatform(wrappersBom))
        implementation(react)
        implementation(reactDom)
        implementation(emotion)
        implementation(reactRouterDom)
        implementation(extensions)
        implementation(browser)
    }
}

kotlin {
    js(IR) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
}