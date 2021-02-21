@file:Suppress("unused")
package com.mrousavy.nearby

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.JavaScriptModule
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager

class GoogleNearbyMessagesPackage : ReactPackage {
    override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
        return listOf<NativeModule>(GoogleNearbyMessagesModule(reactContext))
    }

    override fun createJSModules(): List<Class<out JavaScriptModule?>>? {
        // deprecated in react native 0.47
        return null
    }

    override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
        return emptyList()
    }
}