plugins {
//    alias(libs.plugins.android.application)
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
//    alias(libs.plugins.maven.publish)
    id("maven-publish")
}

android {
    namespace = "com.raja.calculator"
    compileSdk = 34

    defaultConfig {
//        applicationId = "com.raja.calculator"
        minSdk = 24
        targetSdk = 34
//        versionCode = 1
//        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }


//    publishLibraryVariants("release")
    defaultPublishConfig("release")
}


publishing {
    publications {
        create<MavenPublication>("mavenJava") {
//            components["release"]
//            from(components["CalculatorFunctions"])
            groupId = "com.github.rajaappdeveloper"
            artifactId = "CalculatorFunctions"
            version = "v1.1.1"

//            artifact(tasks.getByName("jar"))
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation(project(":CalculatorFunctions"))
}