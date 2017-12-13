package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object JavaScript_Template : Template({
    uuid = "5f339fbc-1afb-4d94-abab-ce1df5455a26"
    id = "JavaScript_Template"
    name = "Template"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComZebasxxTeamcityCourseCards)

    }

    steps {
        script {
            name = "npm install"
            id = "RUNNER_1"
            scriptContent = "npm install"
        }
        script {
            name = "Browser Integrated Tests"
            id = "RUNNER_4"
            scriptContent = "npm test -- --single-run --browsers %Browser% --colors false --reporters teamcity"
        }
        stepsOrder = arrayListOf("RUNNER_1", "RUNNER_4")
    }

    triggers {
        vcs {
            id = "vcsTrigger"
        }
    }
})
