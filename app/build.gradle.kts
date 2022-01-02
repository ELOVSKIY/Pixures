plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdk = ConfigData.compileSdkVersion
    buildToolsVersion = ConfigData.buildToolsVersion

    defaultConfig {
        applicationId = ConfigData.applicationId

        minSdk = ConfigData.minSdkVersion
        targetSdk = ConfigData.targetSdkVersion
        versionCode = ConfigData.appVersionCode
        versionName = ConfigData.appVersionName


        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
}
dependencies {
    implementation(Dependency.COROUTINES)

    implementation(Dependency.APPCOMPAT)
    implementation(Dependency.MATERIAL)
    implementation(Dependency.CONSTRAINT)

    implementation(Dependency.NAVIGATION_FRAGMENT)
    implementation(Dependency.NAVIGATION_UI)

    implementation(Dependency.ROOM_RUNTIME)
    implementation(Dependency.ROOM_KTX)
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.4.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0")
    kapt(Dependency.ROOM_COMPILER)

    implementation(Dependency.PAGING)

    implementation(Dependency.JUNIT)
}