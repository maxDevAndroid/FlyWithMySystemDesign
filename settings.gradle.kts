pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

rootProject.name = "FlyWithMySystemDesign"
include(":app")
include(":app:designsystem")
include(":app:designsystem:theme")
include(":app:designsystem:typography")
include(":app:designsystem:card")
include(":app:designsystem:checkbox")
include(":app:designsystem:button")
include(":app:designsystem:icons")
include(":app:designsystem:chips")
include(":app:designsystem:dialogs")
include(":app:designsystem:text")
include(":app:designsystem:indicator")
include(":app:designsystem:snackbar")
include(":app:designsystem:tooltip")
include(":app:designsystem:stepper")
include(":app:designsystem:sheets")
include(":app:designsystem:animation")
include(":app:designsystem:states")
include(":app:designsystem:layout")
include(":app:designsystem:pagination")
