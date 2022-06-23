package sysoev.projects.visualization.components

import react.*
import sysoev.projects.visualization.base.StyledProps
import sysoev.projects.visualization.plugins.Plugin

val pluginContext = createContext<Plugin?>()
val pluginContextSetter = createContext<StateSetter<Plugin?>>()

val PluginContextProvider = FC<StyledProps> {
    val (plugin, pluginSetter) = useState<Plugin?>(null)

    pluginContext.Provider {
        value = plugin

        pluginContextSetter.Provider {
            value = pluginSetter

            +it.children
        }
    }
}