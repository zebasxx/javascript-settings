package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_02IE : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "naming_convention_unique_for_project"
    id = "JavaScript_02IE"
    name = "02. Internet Explorer"

    params {
        param("Browser", "IE")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})
