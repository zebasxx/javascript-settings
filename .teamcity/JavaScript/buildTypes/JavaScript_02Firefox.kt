package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_02Firefox : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "e4b71b97-da4e-4941-bea5-801e6360af03"
    id = "JavaScript_02Firefox"
    name = "02. Firefox"

    params {
        param("Browser", "Firefox")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})
