package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

public class w {

    /* renamed from: a  reason: collision with root package name */
    private final k f12889a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12890b;

    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f12895a;

        private a(String str) {
            this.f12895a = str;
        }

        public String toString() {
            return this.f12895a;
        }
    }

    public w(String str, k kVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        } else if (kVar != null) {
            this.f12890b = str;
            this.f12889a = kVar;
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    public JSONObject a() {
        if (c() != a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f12890b.substring(d().length()), 0), "UTF-8"));
                this.f12889a.L();
                if (t.a()) {
                    t L = this.f12889a.L();
                    L.a("AdToken", "Decoded token into ad response: " + jSONObject);
                }
                return jSONObject;
            } catch (JSONException e10) {
                this.f12889a.L();
                if (t.a()) {
                    t L2 = this.f12889a.L();
                    L2.a("AdToken", "Unable to decode token '" + this.f12890b + "' into JSON", e10);
                }
                this.f12889a.B().a("AdToken", "decodeFullAdResponseStr", (Throwable) e10);
                return null;
            }
        } catch (UnsupportedEncodingException e11) {
            this.f12889a.L();
            if (t.a()) {
                t L3 = this.f12889a.L();
                L3.a("AdToken", "Unable to process ad response from token '" + this.f12890b + "'", e11);
            }
            this.f12889a.B().a("AdToken", "decodeFullAdResponse", (Throwable) e11);
            return null;
        }
    }

    public String b() {
        return this.f12890b;
    }

    public a c() {
        if (a(oj.O0) != null) {
            return a.REGULAR;
        }
        if (a(oj.P0) != null) {
            return a.AD_RESPONSE_JSON;
        }
        return a.UNSPECIFIED;
    }

    public String d() {
        String a10 = a(oj.O0);
        if (!TextUtils.isEmpty(a10)) {
            return a10;
        }
        String a11 = a(oj.P0);
        if (!TextUtils.isEmpty(a11)) {
            return a11;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        String str = this.f12890b;
        String str2 = ((w) obj).f12890b;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f12890b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String prefixToIndex = StringUtils.prefixToIndex(32, this.f12890b);
        return "AdToken{id=" + prefixToIndex + ", type=" + c() + '}';
    }

    private String a(oj ojVar) {
        for (String str : this.f12889a.c(ojVar)) {
            if (this.f12890b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }
}
