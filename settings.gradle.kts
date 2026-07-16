pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "TrueMail"

include(":app")
include(":core-common")
include(":core-domain")
include(":core-data")
include(":core-network")
include(":core-security")
include(":core-ui")
include(":feature-inbox")
include(":feature-composer")
include(":feature-account")
include(":feature-settings")