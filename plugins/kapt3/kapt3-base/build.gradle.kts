plugins {
    kotlin("jvm")
    id("jps-compatible")
}

dependencies {
    compile(kotlinStdlib())
    compileOnly(toolsJar())
    testCompile(commonDep("junit:junit"))
}

sourceSets {
    "main" { projectDefault() }
    "test" { projectDefault() }
}

testsJar {}

projectTest {
    workingDir = rootDir
    dependsOn(":dist")
}