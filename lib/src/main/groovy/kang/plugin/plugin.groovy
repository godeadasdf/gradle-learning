package kang.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class plugin implements Plugin<Project> {

    @Override
    void apply(Project target) {
        target.task('printInTask3') << {
            println "这是一个通过自定义插件方式创建的任务"
        }
    }

}