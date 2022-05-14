package sysoev.projects.visualization.base

import org.koin.core.qualifier.StringQualifier
import org.koin.dsl.module
import sysoev.projects.visualization.plugins.SamplePlugin

val pluginsQualifier = StringQualifier("plugins")

val pluginsModule = module {
    single(pluginsQualifier) {
        listOf(
            SamplePlugin(),
        )
    }
}