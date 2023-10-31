object Dependencies {
    object Kotlin {
        const val kotlinVersion = "1.9.0"
        const val coroutinesVersion = "1.6.4"

        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
        const val core = "androidx.core:core-ktx:$kotlinVersion"
    }

    object Androidx {
        const val appCompatVersion = "1.6.1"
        const val constraintVersion = "2.1.4"
        const val lifecycleVersion = "2.5.1"
        const val navigationVersion = "2.5.3"
        const val roomVersion = "2.4.3"
        const val recyclerVersion = "1.2.1"
        const val fragmentVersion = "1.5.4"
        const val legasyVersion = "1.0.0"

        const val legacySupport = "androidx.legacy:legacy-support-v4:$legasyVersion"
        const val appcompat = "androidx.appcompat:appcompat:$appCompatVersion"
        const val constraint = "androidx.constraintlayout:constraintlayout:$constraintVersion"
        const val fragment = "androidx.fragment:fragment-ktx:$fragmentVersion"
        const val recycler = "androidx.recyclerview:recyclerview:$recyclerVersion"
        const val lifecycleLivedata = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion"
        const val lifecycleViewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx$lifecycleVersion"
        const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:$navigationVersion"
        const val navigationUi = "androidx.navigation:navigation-ui-ktx:$navigationVersion"
        const val navigationDynamicFeatures = "androidx.navigation:navigation-dynamic-features-fragment:$navigationVersion"
        const val roomRuntime = "androidx.room:room-runtime:$roomVersion"
        const val roomCompiler = "androidx.room:room-compiler:$roomVersion"
    }

    object Material {
        const val materialVersion = "1.10.0"

        const val material = "com.google.android.material:material:$materialVersion"
    }

    object Retrofit2 {
        const val retrofitVersion = "2.9.0"

        const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
        const val retrofitConverterGson = "com.squareup.retrofit2:converter-gson:$retrofitVersion"
    }

    object Gson {
        const val gsonVersion = "2.10.1"

        const val gson = "com.google.code.gson:gson:$gsonVersion"
    }

    object OkHttp3 {
        const val okhttpVersion = "4.11.0"

        const val okhttp3 = "com.squareup.okhttp3:okhttp:$okhttpVersion"
        const val okhttp3LogingInterceptor = "com.squareup.okhttp3:logging-interceptor:$okhttpVersion"
    }

    object Dagger2 {
        const val daggerVersion = "2.48"

        const val daggerAndroid = "com.google.dagger:dagger-android:$daggerVersion"
        const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:$daggerVersion"
        const val daggerCompiler = "com.google.dagger:dagger-compiler:$daggerVersion"
        const val daggerAndroidProcessor = "com.google.dagger:dagger-android-processor:$daggerVersion"
    }

    object Tests {
        const val junitVersion = "4.13.2"
        const val androidxJunitVersion = "1.1.5"
        const val androidxEspressoVersion = "3.5.1"

        const val junit = "junit:junit:$junitVersion"
        const val androidxJunit ="androidx.test.ext:junit:$androidxJunitVersion"
        const val androidxEspresso = "androidx.test.espresso:espresso-core:$androidxEspressoVersion"
    }
}