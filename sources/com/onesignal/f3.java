package com.onesignal;

import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSTrigger */
class f3 {

    /* renamed from: a  reason: collision with root package name */
    String f27740a;

    /* renamed from: b  reason: collision with root package name */
    public a f27741b;

    /* renamed from: c  reason: collision with root package name */
    public String f27742c;

    /* renamed from: d  reason: collision with root package name */
    public b f27743d;

    /* renamed from: e  reason: collision with root package name */
    public Object f27744e;

    /* compiled from: OSTrigger */
    public enum a {
        TIME_SINCE_LAST_IN_APP("min_time_since"),
        SESSION_TIME("session_time"),
        CUSTOM("custom"),
        UNKNOWN("unknown");
        

        /* renamed from: a  reason: collision with root package name */
        private String f27750a;

        private a(String str) {
            this.f27750a = str;
        }

        public static a a(String str) {
            for (a aVar : values()) {
                if (aVar.f27750a.equalsIgnoreCase(str)) {
                    return aVar;
                }
            }
            return UNKNOWN;
        }

        public String toString() {
            return this.f27750a;
        }
    }

    /* compiled from: OSTrigger */
    public enum b {
        GREATER_THAN("greater"),
        LESS_THAN("less"),
        EQUAL_TO("equal"),
        NOT_EQUAL_TO("not_equal"),
        LESS_THAN_OR_EQUAL_TO("less_or_equal"),
        GREATER_THAN_OR_EQUAL_TO("greater_or_equal"),
        EXISTS("exists"),
        NOT_EXISTS("not_exists"),
        CONTAINS(ScarConstants.IN_SIGNAL_KEY);
        

        /* renamed from: a  reason: collision with root package name */
        private String f27761a;

        private b(String str) {
            this.f27761a = str;
        }

        public static b c(String str) {
            for (b bVar : values()) {
                if (bVar.f27761a.equalsIgnoreCase(str)) {
                    return bVar;
                }
            }
            return EQUAL_TO;
        }

        public boolean a() {
            return this == EQUAL_TO || this == NOT_EQUAL_TO;
        }

        public String toString() {
            return this.f27761a;
        }
    }

    f3(JSONObject jSONObject) throws JSONException {
        this.f27740a = jSONObject.getString("id");
        this.f27741b = a.a(jSONObject.getString("kind"));
        this.f27742c = jSONObject.optString("property", (String) null);
        this.f27743d = b.c(jSONObject.getString("operator"));
        this.f27744e = jSONObject.opt("value");
    }

    public String toString() {
        return "OSTrigger{triggerId='" + this.f27740a + '\'' + ", kind=" + this.f27741b + ", property='" + this.f27742c + '\'' + ", operatorType=" + this.f27743d + ", value=" + this.f27744e + '}';
    }
}
