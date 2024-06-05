package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.mediation.MaxReward;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PluginScriptsUtil;
import j1.f;
import j1.r;
import j1.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class UserContentController implements Disposable {
    private static final String CONTENT_WORLDS_GENERATOR_JS_SOURCE = "(function() {  var interval = setInterval(function() {    if (document.body == null) {return;}    var contentWorldNames = [$IN_APP_WEBVIEW_CONTENT_WORLD_NAME_ARRAY];    for (var contentWorldName of contentWorldNames) {      var iframeId = 'flutter_inappwebview_' + contentWorldName;      var iframe = document.getElementById(iframeId);      if (iframe == null) {        iframe = document.createElement('iframe');        iframe.id = iframeId;        iframe.style = 'display: none; z-index: 0; position: absolute; width: 0px; height: 0px';        document.body.append(iframe);      }      if (iframe.contentWindow.document.getElementById('flutter_inappwebview_plugin_scripts') == null) {        var script = iframe.contentWindow.document.createElement('script');        script.id = 'flutter_inappwebview_plugin_scripts';        script.innerHTML = $IN_APP_WEBVIEW_JSON_SOURCE_ENCODED;        iframe.contentWindow.document.body.append(script);      }    }    clearInterval(interval);  });})();";
    private static final String CONTENT_WORLD_WRAPPER_JS_SOURCE = "(function() {  var interval = setInterval(function() {    if (document.body == null) {return;}    var iframeId = 'flutter_inappwebview_$IN_APP_WEBVIEW_CONTENT_WORLD_NAME';    var iframe = document.getElementById(iframeId);    if (iframe == null) {      iframe = document.createElement('iframe');      iframe.id = iframeId;      iframe.style = 'display: none; z-index: 0; position: absolute; width: 0px; height: 0px';      document.body.append(iframe);    }    if (iframe.contentWindow.document.querySelector('#flutter_inappwebview_plugin_scripts') == null) {      return;    }    var script = iframe.contentWindow.document.createElement('script');    script.innerHTML = $IN_APP_WEBVIEW_JSON_SOURCE_ENCODED;    iframe.contentWindow.document.body.append(script);    clearInterval(interval);  });})();";
    private static final String DOCUMENT_READY_WRAPPER_JS_SOURCE = "if (document.readyState === 'interactive' || document.readyState === 'complete') {   $IN_APP_WEBVIEW_PLACEHOLDER_VALUE}";
    protected static final String LOG_TAG = "UserContentController";
    private static final String USER_SCRIPTS_AT_DOCUMENT_END_WRAPPER_JS_SOURCE = "if (window.flutter_inappwebview != null && (window.flutter_inappwebview._userScriptsAtDocumentEndLoaded == null || !window.flutter_inappwebview._userScriptsAtDocumentEndLoaded)) {  window.flutter_inappwebview._userScriptsAtDocumentEndLoaded = true;  $IN_APP_WEBVIEW_PLACEHOLDER_VALUE}";
    private static final String USER_SCRIPTS_AT_DOCUMENT_START_WRAPPER_JS_SOURCE = "if (window.flutter_inappwebview != null && (window.flutter_inappwebview._userScriptsAtDocumentStartLoaded == null || !window.flutter_inappwebview._userScriptsAtDocumentStartLoaded)) {  window.flutter_inappwebview._userScriptsAtDocumentStartLoaded = true;  $IN_APP_WEBVIEW_PLACEHOLDER_VALUE}";
    private final Set<ContentWorld> contentWorlds = new HashSet<ContentWorld>() {
        {
            add(ContentWorld.PAGE);
        }
    };
    private f contentWorldsCreatorScript;
    private final Map<UserScriptInjectionTime, LinkedHashSet<PluginScript>> pluginScripts = new HashMap<UserScriptInjectionTime, LinkedHashSet<PluginScript>>() {
        {
            put(UserScriptInjectionTime.AT_DOCUMENT_START, new LinkedHashSet());
            put(UserScriptInjectionTime.AT_DOCUMENT_END, new LinkedHashSet());
        }
    };
    private final Map<UserScript, f> scriptHandlerMap = new HashMap();
    private final Map<UserScriptInjectionTime, LinkedHashSet<UserScript>> userOnlyScripts = new HashMap<UserScriptInjectionTime, LinkedHashSet<UserScript>>() {
        {
            put(UserScriptInjectionTime.AT_DOCUMENT_START, new LinkedHashSet());
            put(UserScriptInjectionTime.AT_DOCUMENT_END, new LinkedHashSet());
        }
    };
    public WebView webView;

    public UserContentController(WebView webView2) {
        this.webView = webView2;
    }

    public static String escapeCode(String str) {
        return JSONObject.quote(str);
    }

    public static String escapeContentWorldName(String str) {
        return str.replaceAll("'", "\\\\'");
    }

    private void updateContentWorldsCreatorScript() {
        WebView webView2;
        String generateContentWorldsCreatorCode = generateContentWorldsCreatorCode();
        if (s.a("DOCUMENT_START_SCRIPT")) {
            f fVar = this.contentWorldsCreatorScript;
            if (fVar != null) {
                fVar.a();
            }
            if (!generateContentWorldsCreatorCode.isEmpty() && (webView2 = this.webView) != null) {
                this.contentWorldsCreatorScript = r.a(webView2, generateContentWorldsCreatorCode, new HashSet<String>() {
                    {
                        add("*");
                    }
                });
            }
        }
    }

    public boolean addPluginScript(PluginScript pluginScript) {
        ContentWorld contentWorld = pluginScript.getContentWorld();
        if (contentWorld != null) {
            this.contentWorlds.add(contentWorld);
        }
        updateContentWorldsCreatorScript();
        if (this.webView != null && pluginScript.getInjectionTime() == UserScriptInjectionTime.AT_DOCUMENT_START && s.a("DOCUMENT_START_SCRIPT")) {
            this.scriptHandlerMap.put(pluginScript, r.a(this.webView, wrapSourceCodeInContentWorld(pluginScript.getContentWorld(), pluginScript.getSource()), pluginScript.getAllowedOriginRules()));
        }
        return this.pluginScripts.get(pluginScript.getInjectionTime()).add(pluginScript);
    }

    public void addPluginScripts(List<PluginScript> list) {
        for (PluginScript addPluginScript : list) {
            addPluginScript(addPluginScript);
        }
    }

    public boolean addUserOnlyScript(UserScript userScript) {
        ContentWorld contentWorld = userScript.getContentWorld();
        if (contentWorld != null) {
            this.contentWorlds.add(contentWorld);
        }
        updateContentWorldsCreatorScript();
        if (this.webView != null && userScript.getInjectionTime() == UserScriptInjectionTime.AT_DOCUMENT_START && s.a("DOCUMENT_START_SCRIPT")) {
            this.scriptHandlerMap.put(userScript, r.a(this.webView, wrapSourceCodeInContentWorld(userScript.getContentWorld(), userScript.getSource()), userScript.getAllowedOriginRules()));
        }
        return this.userOnlyScripts.get(userScript.getInjectionTime()).add(userScript);
    }

    public void addUserOnlyScripts(List<UserScript> list) {
        for (UserScript addUserOnlyScript : list) {
            addUserOnlyScript(addUserOnlyScript);
        }
    }

    public boolean containsPluginScript(PluginScript pluginScript) {
        return getPluginScriptAsList().contains(pluginScript);
    }

    public boolean containsPluginScriptByGroupName(String str) {
        Iterator it = getPluginScriptAsList().iterator();
        while (it.hasNext()) {
            if (Util.objEquals(str, ((PluginScript) it.next()).getGroupName())) {
                return true;
            }
        }
        return false;
    }

    public boolean containsUserOnlyScript(UserScript userScript) {
        return getUserOnlyScriptAsList().contains(userScript);
    }

    public boolean containsUserOnlyScriptByGroupName(String str) {
        Iterator it = getUserOnlyScriptAsList().iterator();
        while (it.hasNext()) {
            if (Util.objEquals(str, ((UserScript) it.next()).getGroupName())) {
                return true;
            }
        }
        return false;
    }

    public void dispose() {
        f fVar;
        if (s.a("DOCUMENT_START_SCRIPT") && (fVar = this.contentWorldsCreatorScript) != null) {
            fVar.a();
        }
        removeAllUserOnlyScripts();
        removeAllPluginScripts();
        this.webView = null;
    }

    public String generateCodeForDocumentStart() {
        UserScriptInjectionTime userScriptInjectionTime = UserScriptInjectionTime.AT_DOCUMENT_START;
        return USER_SCRIPTS_AT_DOCUMENT_START_WRAPPER_JS_SOURCE.replace(PluginScriptsUtil.VAR_PLACEHOLDER_VALUE, ((MaxReward.DEFAULT_LABEL + generatePluginScriptsCodeAt(userScriptInjectionTime)) + generateContentWorldsCreatorCode()) + generateUserOnlyScriptsCodeAt(userScriptInjectionTime));
    }

    public String generateCodeForScriptEvaluation(String str, ContentWorld contentWorld) {
        if (contentWorld == null || contentWorld.equals(ContentWorld.PAGE)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (!this.contentWorlds.contains(contentWorld)) {
            this.contentWorlds.add(contentWorld);
            StringBuilder sb3 = new StringBuilder();
            Iterator it = getPluginScriptsRequiredInAllContentWorlds().iterator();
            while (it.hasNext()) {
                sb3.append(((PluginScript) it.next()).getSource());
            }
            sb2.append(CONTENT_WORLDS_GENERATOR_JS_SOURCE.replace(PluginScriptsUtil.VAR_CONTENT_WORLD_NAME_ARRAY, "'" + escapeContentWorldName(contentWorld.getName()) + "'").replace(PluginScriptsUtil.VAR_JSON_SOURCE_ENCODED, escapeCode(sb3.toString())));
            sb2.append(";");
        }
        sb2.append(wrapSourceCodeInContentWorld(contentWorld, str));
        return sb2.toString();
    }

    public String generateContentWorldsCreatorCode() {
        if (this.contentWorlds.size() == 1) {
            return MaxReward.DEFAULT_LABEL;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = getPluginScriptsRequiredInAllContentWorlds().iterator();
        while (it.hasNext()) {
            sb2.append(((PluginScript) it.next()).getSource());
        }
        ArrayList arrayList = new ArrayList();
        for (ContentWorld next : this.contentWorlds) {
            if (!next.equals(ContentWorld.PAGE)) {
                arrayList.add("'" + escapeContentWorldName(next.getName()) + "'");
            }
        }
        return CONTENT_WORLDS_GENERATOR_JS_SOURCE.replace(PluginScriptsUtil.VAR_CONTENT_WORLD_NAME_ARRAY, TextUtils.join(", ", arrayList)).replace(PluginScriptsUtil.VAR_JSON_SOURCE_ENCODED, escapeCode(sb2.toString()));
    }

    public String generatePluginScriptsCodeAt(UserScriptInjectionTime userScriptInjectionTime) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = getPluginScriptsAt(userScriptInjectionTime).iterator();
        while (it.hasNext()) {
            PluginScript pluginScript = (PluginScript) it.next();
            sb2.append(wrapSourceCodeInContentWorld(pluginScript.getContentWorld(), ";" + pluginScript.getSource()));
        }
        return sb2.toString();
    }

    public String generateUserOnlyScriptsCodeAt(UserScriptInjectionTime userScriptInjectionTime) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = getUserOnlyScriptsAt(userScriptInjectionTime).iterator();
        while (it.hasNext()) {
            UserScript userScript = (UserScript) it.next();
            sb2.append(wrapSourceCodeInContentWorld(userScript.getContentWorld(), ";" + userScript.getSource()));
        }
        return sb2.toString();
    }

    public String generateWrappedCodeForDocumentEnd() {
        UserScriptInjectionTime userScriptInjectionTime = UserScriptInjectionTime.AT_DOCUMENT_END;
        boolean a10 = s.a("DOCUMENT_START_SCRIPT");
        String str = MaxReward.DEFAULT_LABEL;
        if (!a10) {
            str = str + generateCodeForDocumentStart();
        }
        return USER_SCRIPTS_AT_DOCUMENT_END_WRAPPER_JS_SOURCE.replace(PluginScriptsUtil.VAR_PLACEHOLDER_VALUE, (str + generatePluginScriptsCodeAt(userScriptInjectionTime)) + generateUserOnlyScriptsCodeAt(userScriptInjectionTime));
    }

    public String generateWrappedCodeForDocumentStart() {
        return Util.replaceAll(DOCUMENT_READY_WRAPPER_JS_SOURCE, PluginScriptsUtil.VAR_PLACEHOLDER_VALUE, generateCodeForDocumentStart());
    }

    public LinkedHashSet<ContentWorld> getContentWorlds() {
        return new LinkedHashSet<>(this.contentWorlds);
    }

    public LinkedHashSet<PluginScript> getPluginScriptAsList() {
        LinkedHashSet<PluginScript> linkedHashSet = new LinkedHashSet<>();
        for (LinkedHashSet<PluginScript> addAll : this.pluginScripts.values()) {
            linkedHashSet.addAll(addAll);
        }
        return linkedHashSet;
    }

    public LinkedHashSet<PluginScript> getPluginScriptsAt(UserScriptInjectionTime userScriptInjectionTime) {
        return new LinkedHashSet<>(this.pluginScripts.get(userScriptInjectionTime));
    }

    public LinkedHashSet<PluginScript> getPluginScriptsRequiredInAllContentWorlds() {
        LinkedHashSet<PluginScript> linkedHashSet = new LinkedHashSet<>();
        Iterator it = getPluginScriptsAt(UserScriptInjectionTime.AT_DOCUMENT_START).iterator();
        while (it.hasNext()) {
            PluginScript pluginScript = (PluginScript) it.next();
            if (pluginScript.isRequiredInAllContentWorlds()) {
                linkedHashSet.add(pluginScript);
            }
        }
        return linkedHashSet;
    }

    public LinkedHashSet<UserScript> getUserOnlyScriptAsList() {
        LinkedHashSet<UserScript> linkedHashSet = new LinkedHashSet<>();
        for (LinkedHashSet<UserScript> addAll : this.userOnlyScripts.values()) {
            linkedHashSet.addAll(addAll);
        }
        return linkedHashSet;
    }

    public LinkedHashSet<UserScript> getUserOnlyScriptsAt(UserScriptInjectionTime userScriptInjectionTime) {
        return new LinkedHashSet<>(this.userOnlyScripts.get(userScriptInjectionTime));
    }

    public void removeAllPluginScripts() {
        if (s.a("DOCUMENT_START_SCRIPT")) {
            Iterator it = this.pluginScripts.get(UserScriptInjectionTime.AT_DOCUMENT_START).iterator();
            while (it.hasNext()) {
                PluginScript pluginScript = (PluginScript) it.next();
                f fVar = this.scriptHandlerMap.get(pluginScript);
                if (fVar != null) {
                    fVar.a();
                    this.scriptHandlerMap.remove(pluginScript);
                }
            }
        }
        this.pluginScripts.get(UserScriptInjectionTime.AT_DOCUMENT_START).clear();
        this.pluginScripts.get(UserScriptInjectionTime.AT_DOCUMENT_END).clear();
    }

    public void removeAllUserOnlyScripts() {
        if (s.a("DOCUMENT_START_SCRIPT")) {
            Iterator it = this.userOnlyScripts.get(UserScriptInjectionTime.AT_DOCUMENT_START).iterator();
            while (it.hasNext()) {
                UserScript userScript = (UserScript) it.next();
                f fVar = this.scriptHandlerMap.get(userScript);
                if (fVar != null) {
                    fVar.a();
                    this.scriptHandlerMap.remove(userScript);
                }
            }
        }
        this.userOnlyScripts.get(UserScriptInjectionTime.AT_DOCUMENT_START).clear();
        this.userOnlyScripts.get(UserScriptInjectionTime.AT_DOCUMENT_END).clear();
    }

    public boolean removePluginScript(PluginScript pluginScript) {
        if (s.a("DOCUMENT_START_SCRIPT")) {
            f fVar = this.scriptHandlerMap.get(pluginScript);
            if (fVar != null) {
                fVar.a();
                this.scriptHandlerMap.remove(pluginScript);
            }
            updateContentWorldsCreatorScript();
        }
        return this.pluginScripts.get(pluginScript.getInjectionTime()).remove(pluginScript);
    }

    public void removePluginScriptsByGroupName(String str) {
        Iterator it = getPluginScriptAsList().iterator();
        while (it.hasNext()) {
            PluginScript pluginScript = (PluginScript) it.next();
            if (Util.objEquals(str, pluginScript.getGroupName())) {
                removePluginScript(pluginScript);
            }
        }
    }

    public boolean removeUserOnlyScript(UserScript userScript) {
        if (s.a("DOCUMENT_START_SCRIPT")) {
            f fVar = this.scriptHandlerMap.get(userScript);
            if (fVar != null) {
                fVar.a();
                this.scriptHandlerMap.remove(userScript);
            }
            updateContentWorldsCreatorScript();
        }
        return this.userOnlyScripts.get(userScript.getInjectionTime()).remove(userScript);
    }

    public boolean removeUserOnlyScriptAt(int i10, UserScriptInjectionTime userScriptInjectionTime) {
        return removeUserOnlyScript((UserScript) new ArrayList(this.userOnlyScripts.get(userScriptInjectionTime)).get(i10));
    }

    public void removeUserOnlyScriptsByGroupName(String str) {
        Iterator it = getUserOnlyScriptAsList().iterator();
        while (it.hasNext()) {
            UserScript userScript = (UserScript) it.next();
            if (Util.objEquals(str, userScript.getGroupName())) {
                removeUserOnlyScript(userScript);
            }
        }
    }

    public void resetContentWorlds() {
        this.contentWorlds.clear();
        this.contentWorlds.add(ContentWorld.PAGE);
        Iterator it = getPluginScriptAsList().iterator();
        while (it.hasNext()) {
            this.contentWorlds.add(((PluginScript) it.next()).getContentWorld());
        }
        Iterator it2 = getUserOnlyScriptAsList().iterator();
        while (it2.hasNext()) {
            this.contentWorlds.add(((UserScript) it2.next()).getContentWorld());
        }
    }

    public String wrapSourceCodeInContentWorld(ContentWorld contentWorld, String str) {
        return (contentWorld == null || contentWorld.equals(ContentWorld.PAGE)) ? str : CONTENT_WORLD_WRAPPER_JS_SOURCE.replace(PluginScriptsUtil.VAR_CONTENT_WORLD_NAME, escapeContentWorldName(contentWorld.getName())).replace(PluginScriptsUtil.VAR_JSON_SOURCE_ENCODED, escapeCode(str));
    }
}
