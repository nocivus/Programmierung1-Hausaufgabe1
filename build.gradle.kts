plugins {
    id("java")
    id("com.adarshr.test-logger") version "4.0.0"

}

group = "de.htw"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

apply {
    plugin("com.adarshr.test-logger")
}

sourceSets {
    create("aufgabe1Test") {
        java {
            setSrcDirs(listOf("src/test/java", "src/main/java"))
            setExcludes(listOf(""))
            setIncludes(listOf("Programmieraufgabe1.java", "Programmieraufgabe1Test.java"))
        }
    }
    create("aufgabe2Test") {
        java {
            setSrcDirs(listOf("src/test/java", "src/main/java"))
            setExcludes(listOf(""))
            setIncludes(listOf("Programmieraufgabe2.java", "Programmieraufgabe2Test.java"))
        }
    }
    create("aufgabe3Test") {
        java {
            setSrcDirs(listOf("src/test/java", "src/main/java"))
            setExcludes(listOf(""))
            setIncludes(listOf("Programmieraufgabe3.java", "Programmieraufgabe3Test.java"))
        }
    }
    create("aufgabe4Test") {
        java {
            setSrcDirs(listOf("src/test/java", "src/main/java"))
            setExcludes(listOf(""))
            setIncludes(listOf("Programmieraufgabe4.java", "Programmieraufgabe4Test.java"))
        }
    }
    create("aufgabe5Test") {
        java {
            setSrcDirs(listOf("src/test/java", "src/main/java"))
            setExcludes(listOf(""))
            setIncludes(listOf("Programmieraufgabe5.java", "Programmieraufgabe5Test.java"))
        }
    }
    create("aufgabe6Test") {
        java {
            setSrcDirs(listOf("src/test/java", "src/main/java"))
            setExcludes(listOf(""))
            setIncludes(listOf("Programmieraufgabe6.java", "Programmieraufgabe6Test.java"))
        }
    }
    create("aufgabe7Test") {
        java {
            setSrcDirs(listOf("src/test/java", "src/main/java"))
            setExcludes(listOf(""))
            setIncludes(listOf("Programmieraufgabe7.java", "Programmieraufgabe7Test.java"))
        }
    }
    create("aufgabe8Test") {
        java {
            setSrcDirs(listOf("src/test/java", "src/main/java"))
            setExcludes(listOf(""))
            setIncludes(listOf("Programmieraufgabe8.java", "Programmieraufgabe8Test.java"))
        }
    }
}

/***** Implementation: Test1 *****/

val aufgabe1TestImplementation by configurations.getting {
    extendsFrom(configurations.implementation.get())
}
val aufgabe1TestRuntimeOnly by configurations.getting

configurations["aufgabe1TestRuntimeOnly"].extendsFrom(configurations.runtimeOnly.get())

dependencies {
    aufgabe1TestImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    aufgabe1TestRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

val test1 = task<Test>("aufgabe1Test") {
    testClassesDirs = sourceSets["aufgabe1Test"].output.classesDirs
    classpath = sourceSets["aufgabe1Test"].runtimeClasspath
    useJUnitPlatform()
}


/***** Implementation: Test2 *****/

val aufgabe2TestImplementation by configurations.getting {
    extendsFrom(configurations.implementation.get())
}
val aufgabe2TestRuntimeOnly by configurations.getting

configurations["aufgabe2TestRuntimeOnly"].extendsFrom(configurations.runtimeOnly.get())

dependencies {
    aufgabe2TestImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    aufgabe2TestRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

val test2 = task<Test>("aufgabe2Test") {
    testClassesDirs = sourceSets["aufgabe2Test"].output.classesDirs
    classpath = sourceSets["aufgabe2Test"].runtimeClasspath
    useJUnitPlatform()
}

/***** Implementation: Test3 *****/

val aufgabe3TestImplementation by configurations.getting {
    extendsFrom(configurations.implementation.get())
}
val aufgabe3TestRuntimeOnly by configurations.getting

configurations["aufgabe3TestRuntimeOnly"].extendsFrom(configurations.runtimeOnly.get())

dependencies {
    aufgabe3TestImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    aufgabe3TestRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

val test3 = task<Test>("aufgabe3Test") {
    testClassesDirs = sourceSets["aufgabe3Test"].output.classesDirs
    classpath = sourceSets["aufgabe3Test"].runtimeClasspath
    useJUnitPlatform()
}

/***** Implementation: Test4 *****/

val aufgabe4TestImplementation by configurations.getting {
    extendsFrom(configurations.implementation.get())
}
val aufgabe4TestRuntimeOnly by configurations.getting

configurations["aufgabe4TestRuntimeOnly"].extendsFrom(configurations.runtimeOnly.get())

dependencies {
    aufgabe4TestImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    aufgabe4TestRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

val test4 = task<Test>("aufgabe4Test") {
    testClassesDirs = sourceSets["aufgabe4Test"].output.classesDirs
    classpath = sourceSets["aufgabe4Test"].runtimeClasspath
    useJUnitPlatform()
}

/***** Implementation: Test5 *****/

val aufgabe5TestImplementation by configurations.getting {
    extendsFrom(configurations.implementation.get())
}
val aufgabe5TestRuntimeOnly by configurations.getting

configurations["aufgabe5TestRuntimeOnly"].extendsFrom(configurations.runtimeOnly.get())

dependencies {
    aufgabe5TestImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    aufgabe5TestRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

val test5 = task<Test>("aufgabe5Test") {
    testClassesDirs = sourceSets["aufgabe5Test"].output.classesDirs
    classpath = sourceSets["aufgabe5Test"].runtimeClasspath
    useJUnitPlatform()
}


/***** Implementation: Test6 *****/

val aufgabe6TestImplementation by configurations.getting {
    extendsFrom(configurations.implementation.get())
}
val aufgabe6TestRuntimeOnly by configurations.getting

configurations["aufgabe6TestRuntimeOnly"].extendsFrom(configurations.runtimeOnly.get())

dependencies {
    aufgabe6TestImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    aufgabe6TestRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

val test6 = task<Test>("aufgabe6Test") {
    testClassesDirs = sourceSets["aufgabe6Test"].output.classesDirs
    classpath = sourceSets["aufgabe6Test"].runtimeClasspath
    useJUnitPlatform()
}


/***** Implementation: Test7 *****/

val aufgabe7TestImplementation by configurations.getting {
    extendsFrom(configurations.implementation.get())
}
val aufgabe7TestRuntimeOnly by configurations.getting

configurations["aufgabe7TestRuntimeOnly"].extendsFrom(configurations.runtimeOnly.get())

dependencies {
    aufgabe7TestImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    aufgabe7TestRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

val test7 = task<Test>("aufgabe7Test") {
    testClassesDirs = sourceSets["aufgabe7Test"].output.classesDirs
    classpath = sourceSets["aufgabe7Test"].runtimeClasspath
    useJUnitPlatform()
}


/***** Implementation: Test8 *****/

val aufgabe8TestImplementation by configurations.getting {
    extendsFrom(configurations.implementation.get())
}
val aufgabe8TestRuntimeOnly by configurations.getting

configurations["aufgabe8TestRuntimeOnly"].extendsFrom(configurations.runtimeOnly.get())

dependencies {
    aufgabe8TestImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    aufgabe8TestRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

val test8 = task<Test>("aufgabe8Test") {
    testClassesDirs = sourceSets["aufgabe8Test"].output.classesDirs
    classpath = sourceSets["aufgabe8Test"].runtimeClasspath
    useJUnitPlatform()
}