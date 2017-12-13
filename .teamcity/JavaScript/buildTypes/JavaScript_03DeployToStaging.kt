package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_03DeployToStaging : BuildType({
    uuid = "2bbb24ee-84a4-4ba8-8fa4-1370f29d73a0"
    id = "JavaScript_03DeployToStaging"
    name = "03. Deploy to Staging"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComZebasxxTeamcityCourseCards)

    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_02Chrome) {
            snapshot {
            }
        }
        dependency(JavaScript.buildTypes.JavaScript_02Firefox) {
            snapshot {
            }
        }
        dependency(JavaScript.buildTypes.JavaScript_02IE) {
            snapshot {
            }
        }
        
    }
})
