plugins {
    kotlin("js")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    with(Dependencies.KotlinWrappers) {
        implementation(enforcedPlatform(wrappersBom))
        implementation(extensions)
        implementation(browser)
    }

    implementation(npm("p5", "1.4.1"))
}

kotlin {
    js(IR) {
        binaries.executable()
        browser()
        useCommonJs()
    }
}
