package com.github.iyoulllovegithub.pluginastemplate.services

import com.intellij.openapi.project.Project
import com.github.iyoulllovegithub.pluginastemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
