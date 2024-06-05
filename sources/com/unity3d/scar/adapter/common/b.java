package com.unity3d.scar.adapter.common;

import bb.c;

/* compiled from: GMAAdsError */
public class b extends m {
    public b(c cVar, Object... objArr) {
        super(cVar, (String) null, objArr);
    }

    public static b a(c cVar) {
        String format = String.format("Cannot show ad that is not loaded for placement %s", new Object[]{cVar.c()});
        return new b(c.AD_NOT_LOADED_ERROR, format, cVar.c(), cVar.d(), format);
    }

    public static b b(String str) {
        return new b(c.SCAR_UNSUPPORTED, str, new Object[0]);
    }

    public static b c(c cVar, String str) {
        return new b(c.INTERNAL_LOAD_ERROR, str, cVar.c(), cVar.d(), str);
    }

    public static b d(c cVar, String str) {
        return new b(c.INTERNAL_SHOW_ERROR, str, cVar.c(), cVar.d(), str);
    }

    public static b e(String str) {
        return new b(c.INTERNAL_SIGNALS_ERROR, str, str);
    }

    public static b f(String str, String str2, String str3) {
        return new b(c.NO_AD_ERROR, str3, str, str2, str3);
    }

    public static b g(c cVar) {
        String format = String.format("Missing queryInfoMetadata for ad %s", new Object[]{cVar.c()});
        return new b(c.QUERY_NOT_FOUND_ERROR, format, cVar.c(), cVar.d(), format);
    }

    public String getDomain() {
        return "GMA";
    }

    public b(c cVar, String str, Object... objArr) {
        super(cVar, str, objArr);
    }
}
