plugins {
    id("com.android.library")
    id("maven-publish")


}

android {
    publishing {
        singleVariant("release") {
            withSourcesJar()
            withJavadocJar()
        }
    }
    namespace = "com.example.mylibrarygit"
    compileSdk = 33

    defaultConfig {
        minSdk = 30

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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

}
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}


// Other configurations for your library module

publishing {

    publications {
        create<MavenPublication>("maven") {

            groupId = "com.github.karuppasamykblack"
            artifactId = "test"
            version = "1.0.2"

            pom {
                description.set("Release")
            }

        }
    }

    repositories {
        mavenLocal()
    }
}

//publishing {
//    publications {
//        mav
//        maven(MavenPublication) {
//            groupId = 'com.github.GIT_USER_NAME'
//            artifactId = 'REPO_NAME'
//            version = "VERSION"
//            pom {
//                description = 'DESCRIPTION'
//            }
//        }
//    }
//    repositories {               // << --- ADD This
//        mavenLocal()
//    }
//}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
//    implementation("com.google.android.material:material:1.11.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}

//publishing {
//    repositories{
//        maven()
//    }
//    publications {
//        maven{
//            groupId = 'com.github.GIT_USER_NAME'
//            artifactId = 'REPO_NAME'
//            version = "VERSION"
//            pom {
//                description = 'DESCRIPTION'
//            }
//        }
//    }
//    repositories {               // << --- ADD This
//        mavenLocal()
//    }
//}