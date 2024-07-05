package com.github.olivernybroe.gutterbreakpointclickerintellij


import com.intellij.openapi.actionSystem.ActionManager
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity

class NoBreakpointActivity: ProjectActivity, DumbAware {
    override suspend fun execute(project: Project) {
        ActionManager.getInstance().unregisterAction("ToggleLineBreakpoint")
        ActionManager.getInstance().registerAction("ToggleLineBreakpoint", NoAction())

    }
}