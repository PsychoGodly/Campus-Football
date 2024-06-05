package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.Set;

public class PluginScript extends UserScript {
    private boolean requiredInAllContentWorlds;

    public PluginScript(String str, String str2, UserScriptInjectionTime userScriptInjectionTime, ContentWorld contentWorld, boolean z10, Set<String> set) {
        super(str, str2, userScriptInjectionTime, contentWorld, set);
        this.requiredInAllContentWorlds = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj) || this.requiredInAllContentWorlds != ((PluginScript) obj).requiredInAllContentWorlds) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (super.hashCode() * 31) + (this.requiredInAllContentWorlds ? 1 : 0);
    }

    public boolean isRequiredInAllContentWorlds() {
        return this.requiredInAllContentWorlds;
    }

    public void setRequiredInAllContentWorlds(boolean z10) {
        this.requiredInAllContentWorlds = z10;
    }

    public String toString() {
        return "PluginScript{requiredInContentWorld=" + this.requiredInAllContentWorlds + "} " + super.toString();
    }
}
