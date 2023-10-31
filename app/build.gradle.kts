plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
}

android{
    namespace = "com.example.moneyframe"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.moneyframe"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

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
    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation(Dependencies.Kotlin.core)
    implementation(Dependencies.Kotlin.coroutines)

    implementation(Dependencies.Androidx.legacySupport)
    implementation(Dependencies.Androidx.appcompat)
    implementation(Dependencies.Androidx.constraint)
    implementation(Dependencies.Androidx.fragment)
    implementation(Dependencies.Androidx.recycler)
    implementation(Dependencies.Androidx.lifecycleLivedata)
    implementation(Dependencies.Androidx.lifecycleViewmodel)
    implementation(Dependencies.Androidx.navigationFragment)
    implementation(Dependencies.Androidx.navigationUi)
    implementation(Dependencies.Androidx.navigationDynamicFeatures)
    implementation(Dependencies.Androidx.roomRuntime)
    kapt(Dependencies.Androidx.roomCompiler)

    implementation(Dependencies.Material.material)

    implementation(Dependencies.Retrofit2.retrofit)
    implementation(Dependencies.Retrofit2.retrofitConverterGson)

    implementation(Dependencies.Gson.gson)

    implementation(Dependencies.OkHttp3.okhttp3)
    implementation(Dependencies.OkHttp3.okhttp3LogingInterceptor)

    implementation(Dependencies.Dagger2.daggerAndroid)
    implementation(Dependencies.Dagger2.daggerAndroidSupport)
    kapt(Dependencies.Dagger2.daggerCompiler)
    kapt(Dependencies.Dagger2.daggerAndroidProcessor)

    testImplementation(Dependencies.Tests.junit)
    androidTestImplementation(Dependencies.Tests.androidxJunit)
    androidTestImplementation(Dependencies.Tests.androidxEspresso)
}