plugins {
    kotlin("js") version "1.6.21"
}

group = "sysoev.projects"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))

    with(Dependencies.KotlinWrappers) {
        implementation(enforcedPlatform(wrappersBom))
        implementation(react)
        implementation(reactDom)
        implementation(emotion)
        implementation(styledNext)
        implementation(reactRouterDom)
        implementation(extensions)
        implementation(browser)
    }

    implementation(Dependencies.Koin.core)
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

afterEvaluate {
    rootProject.extensions.configure<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension> {
        versions.webpackCli.version="4.10.0"
    }
}

//tasks.withType<Kotlin2JsCompile>().configureEach {
//    kotlinOptions {
//        freeCompilerArgs = freeCompilerArgs + "-Xcontext-receivers"
//    }
//}