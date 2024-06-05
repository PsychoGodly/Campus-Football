package kc;

import java.util.HashMap;
import java.util.Map;
import lc.f;

/* compiled from: SettingsChannel */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public final lc.a<Object> f35937a;

    /* compiled from: SettingsChannel */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final lc.a<Object> f35938a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, Object> f35939b = new HashMap();

        a(lc.a<Object> aVar) {
            this.f35938a = aVar;
        }

        public void a() {
            xb.b.f("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f35939b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f35939b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f35939b.get("platformBrightness"));
            this.f35938a.c(this.f35939b);
        }

        public a b(boolean z10) {
            this.f35939b.put("brieflyShowPassword", Boolean.valueOf(z10));
            return this;
        }

        public a c(boolean z10) {
            this.f35939b.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z10));
            return this;
        }

        public a d(b bVar) {
            this.f35939b.put("platformBrightness", bVar.f35943a);
            return this;
        }

        public a e(float f10) {
            this.f35939b.put("textScaleFactor", Float.valueOf(f10));
            return this;
        }

        public a f(boolean z10) {
            this.f35939b.put("alwaysUse24HourFormat", Boolean.valueOf(z10));
            return this;
        }
    }

    /* compiled from: SettingsChannel */
    public enum b {
        light("light"),
        dark("dark");
        

        /* renamed from: a  reason: collision with root package name */
        public String f35943a;

        private b(String str) {
            this.f35943a = str;
        }
    }

    public n(zb.a aVar) {
        this.f35937a = new lc.a<>(aVar, "flutter/settings", f.f36114a);
    }

    public a a() {
        return new a(this.f35937a);
    }
}
