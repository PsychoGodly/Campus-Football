package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserScript {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Set<String> allowedOriginRules = new HashSet();
    private ContentWorld contentWorld;
    private String groupName;
    private UserScriptInjectionTime injectionTime;
    private String source;

    public UserScript(String str, String str2, UserScriptInjectionTime userScriptInjectionTime, ContentWorld contentWorld2, Set<String> set) {
        this.groupName = str;
        this.source = str2;
        this.injectionTime = userScriptInjectionTime;
        this.contentWorld = contentWorld2 == null ? ContentWorld.PAGE : contentWorld2;
        this.allowedOriginRules = set == null ? new HashSet<String>() {
            {
                add("*");
            }
        } : set;
    }

    public static UserScript fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new UserScript((String) map.get("groupName"), (String) map.get("source"), UserScriptInjectionTime.fromValue(((Integer) map.get("injectionTime")).intValue()), ContentWorld.fromMap((Map) map.get("contentWorld")), new HashSet((List) map.get("allowedOriginRules")));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserScript userScript = (UserScript) obj;
        String str = this.groupName;
        if (str == null ? userScript.groupName != null : !str.equals(userScript.groupName)) {
            return false;
        }
        if (this.source.equals(userScript.source) && this.injectionTime == userScript.injectionTime && this.contentWorld.equals(userScript.contentWorld)) {
            return this.allowedOriginRules.equals(userScript.allowedOriginRules);
        }
        return false;
    }

    public Set<String> getAllowedOriginRules() {
        return this.allowedOriginRules;
    }

    public ContentWorld getContentWorld() {
        return this.contentWorld;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public UserScriptInjectionTime getInjectionTime() {
        return this.injectionTime;
    }

    public String getSource() {
        return this.source;
    }

    public int hashCode() {
        String str = this.groupName;
        return ((((((((str != null ? str.hashCode() : 0) * 31) + this.source.hashCode()) * 31) + this.injectionTime.hashCode()) * 31) + this.contentWorld.hashCode()) * 31) + this.allowedOriginRules.hashCode();
    }

    public void setAllowedOriginRules(Set<String> set) {
        this.allowedOriginRules = set;
    }

    public void setContentWorld(ContentWorld contentWorld2) {
        if (contentWorld2 == null) {
            contentWorld2 = ContentWorld.PAGE;
        }
        this.contentWorld = contentWorld2;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setInjectionTime(UserScriptInjectionTime userScriptInjectionTime) {
        this.injectionTime = userScriptInjectionTime;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public String toString() {
        return "UserScript{groupName='" + this.groupName + '\'' + ", source='" + this.source + '\'' + ", injectionTime=" + this.injectionTime + ", contentWorld=" + this.contentWorld + ", allowedOriginRules=" + this.allowedOriginRules + '}';
    }
}
