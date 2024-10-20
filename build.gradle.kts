// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
//    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false
//    alias(libs.plugins.android.tools) apply false
}

apply(plugin = "maven-publish")

buildscript{
    dependencies{

        classpath("com.android.tools.build:gradle:8.1.1")
    }
}