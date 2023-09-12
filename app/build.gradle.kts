plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp") version "1.8.10-1.0.9" apply false
    id ("kotlin-kapt")

}




android {
    namespace = "com.example.madd_assignment_y4"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.madd_assignment_y4"
        minSdk = 24
        targetSdk = 33
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
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //material design
    implementation("com.google.android.material:material:1.9.0")

    //circle image view
    implementation("de.hdodenhof:circleimageview:3.1.0")

    //scalable unit text sizes
    implementation("com.intuit.ssp:ssp-android:1.0.6")

    //scalable unit size
    implementation("com.intuit.sdp:sdp-android:1.0.6")

    //room database

    implementation("androidx.room:room-runtime:2.5.2")

    // To use Kotlin annotation processing tool (kapt)
    kapt("androidx.room:room-compiler:2.5.2")







}

