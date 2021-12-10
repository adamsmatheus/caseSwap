import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.6.1"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	id("org.jetbrains.kotlin.jvm") version "1.6.0"
	id("org.jetbrains.kotlin.kapt") version "1.6.0"
	id("org.jetbrains.kotlin.plugin.spring") version "1.6.0"
	kotlin("plugin.serialization") version "1.5.31"
}

group = "swap.teste"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-jdbc")
	implementation ("org.springframework.boot:spring-boot-starter-web")
	implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation ("org.springframework.boot:spring-boot-starter")
	implementation ("org.jetbrains.kotlin:kotlin-reflect")
	implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation ("org.springframework.boot:spring-boot-devtools")
	implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android")
	implementation ("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation ("com.google.code.gson:gson:2.8.9")
	implementation ("com.squareup.okhttp3:okhttp:4.9.3")
	implementation ("com.google.code.gson:gson:2.8.9")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation(kotlin("test-junit"))

	runtimeOnly("com.h2database:h2")
	runtimeOnly("com.h2database:h2")




}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
