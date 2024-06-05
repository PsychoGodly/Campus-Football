package com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js;

import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScriptInjectionTime;
import java.util.Set;

public class OnLoadResourceJS {
    public static final String FLAG_VARIABLE_FOR_ON_LOAD_RESOURCE_JS_SOURCE = "flutter_inappwebview._useOnLoadResource";
    public static final PluginScript ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT = new PluginScript(ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT_GROUP_NAME, ON_LOAD_RESOURCE_JS_SOURCE, UserScriptInjectionTime.AT_DOCUMENT_START, (ContentWorld) null, false, (Set<String>) null);
    public static final String ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT_GROUP_NAME = "IN_APP_WEBVIEW_ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT";
    public static final String ON_LOAD_RESOURCE_JS_SOURCE = "window.flutter_inappwebview._useOnLoadResource = true;(function() {   var observer = new PerformanceObserver(function(list) {       list.getEntries().forEach(function(entry) {         if (flutter_inappwebview._useOnLoadResource == null || flutter_inappwebview._useOnLoadResource == true) {           var resource = {             'url': entry.name,             'initiatorType': entry.initiatorType,             'startTime': entry.startTime,             'duration': entry.duration           };           window.flutter_inappwebview.callHandler('onLoadResource', resource);         }       });   });   observer.observe({entryTypes: ['resource']});})();";
}
