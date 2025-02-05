plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.ejemplo.mobyhook"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.ejemplo.mobyhook"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    viewBinding{
        enable = true
    }
}

dependencies {
    //implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation(libs.glide)
    //implementation("androidx.fragment:fragment:1.5.4")
    implementation(libs.androidx.fragment)
    //implementation("androidx.recyclerview:recyclerview:1.1.0")
    implementation(libs.androidx.recyclerview)
    //implementation("androidx.recyclerview:recyclerview:1.1.0")

    //val nav_version = "2.8.6"
    //implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation(libs.androidx.navigation.fragment.ktx)
    //implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
    //implementation("androidx.navigation:navigation-testing:$nav_version")
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.navigation.testing)


    implementation(libs.androidx.core.splashscreen)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.navigation.fragment)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}