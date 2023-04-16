buildscript {
    repositories {
        maven {
            url = uri("https://repo.devops.projectronin.io/repository/maven-public/")
            mavenContent {
                releasesOnly()
            }
        }
    }

    dependencies {
        classpath("net.pwall.json:json-kotlin-gradle:0.88")
    }
}

plugins {
    id("com.projectronin.interop.gradle.version")
    id("com.projectronin.interop.gradle.publish")
}

apply<net.pwall.json.kotlin.codegen.gradle.JSONSchemaCodegenPlugin>()

sourceSets.main {
    java.srcDirs("build/generated-sources/kotlin")
}

configure<net.pwall.json.kotlin.codegen.gradle.JSONSchemaCodegen> {
    packageName.set("com.projectronin.event.prodeng.questionnaire.response.publish")
    inputs {
        inputFile {
            file.set(file("v1/questionnaire-response-v1.schema.json"))
            subPackage.set("v1")
        }
    }
}
