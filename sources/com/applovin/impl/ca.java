package com.applovin.impl;

import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;

public class ca {

    /* renamed from: a  reason: collision with root package name */
    private final Map f6951a;

    /* renamed from: b  reason: collision with root package name */
    private final k f6952b;

    public ca(Map map, k kVar) {
        this.f6951a = map;
        this.f6952b = kVar;
    }

    public Drawable a() {
        Object obj = this.f6951a.get("google_watermark");
        if (!a(obj)) {
            this.f6952b.L();
            if (t.a()) {
                t L = this.f6952b.L();
                L.b("GoogleWatermarkGenerator", "Unable to render invalid watermark: " + obj);
            }
            return null;
        }
        try {
            byte[] decode = Base64.decode((String) obj, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(k.k().getResources(), BitmapFactory.decodeByteArray(decode, 0, decode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            return bitmapDrawable;
        } catch (Throwable th) {
            this.f6952b.L();
            if (t.a()) {
                this.f6952b.L().a("GoogleWatermarkGenerator", "Failed to render watermark", th);
            }
            return null;
        }
    }

    public String b() {
        return "google watermark";
    }

    public boolean c() {
        return a(this.f6951a.get("google_watermark"));
    }

    private boolean a(Object obj) {
        return (obj instanceof String) && StringUtils.isValidString((String) obj);
    }
}
