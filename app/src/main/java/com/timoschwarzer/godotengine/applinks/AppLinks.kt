package com.timoschwarzer.godotengine.applinks

import org.godotengine.godot.Godot
import org.godotengine.godot.plugin.GodotPlugin

@Suppress("unused")
class AppLinks(godot: Godot?) : GodotPlugin(godot) {
    override fun getPluginName(): String {
        return "AppLinks"
    }

    fun getUrl(): String? = activity?.intent?.run {
        val url = dataString
        data = null
        return url
    }

    @Suppress("OVERRIDE_DEPRECATION")
    override fun getPluginMethods(): MutableList<String> {
        return mutableListOf("getUrl")
    }
}