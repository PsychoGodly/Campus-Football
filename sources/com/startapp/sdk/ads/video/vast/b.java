package com.startapp.sdk.ads.video.vast;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.startapp.a3;
import com.startapp.g2;
import com.startapp.i3;
import com.startapp.j9;
import com.startapp.sdk.ads.video.vast.c;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.w0;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
public class b implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16741a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16742b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONArray f16743c = new JSONArray();

    /* renamed from: d  reason: collision with root package name */
    public final String f16744d;

    /* renamed from: e  reason: collision with root package name */
    public final String f16745e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16746f;

    public b(Context context, String str, String str2, String str3, boolean z10) {
        this.f16741a = context;
        this.f16742b = str;
        this.f16744d = str2;
        this.f16745e = str3;
        this.f16746f = z10;
    }

    public void a(VASTErrorCodes vASTErrorCodes) {
        a3 m10;
        if (this.f16743c.length() != 0) {
            if (!this.f16746f || vASTErrorCodes == VASTErrorCodes.ErrorNone) {
                try {
                    String b10 = b(vASTErrorCodes);
                    if (!TextUtils.isEmpty(b10)) {
                        m10 = ComponentLocator.a(this.f16741a).m();
                        String str = this.f16742b;
                        byte[] bytes = b10.getBytes();
                        Map<Activity, Integer> map = j9.f15982a;
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.flush();
                        gZIPOutputStream.close();
                        m10.a(str, (w0) null, byteArrayOutputStream.toByteArray(), true, (g2<Throwable, Void>) null);
                    }
                } catch (Throwable th) {
                    i3.a(th);
                }
            }
        }
    }

    public final String b(VASTErrorCodes vASTErrorCodes) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("vastDocs", this.f16743c);
        String str = this.f16744d;
        String str2 = MaxReward.DEFAULT_LABEL;
        if (str == null) {
            str = str2;
        }
        jSONObject.put("partnerResponse", str);
        String str3 = this.f16745e;
        if (str3 != null) {
            str2 = str3;
        }
        jSONObject.put(HandleInvocationsFromAdViewer.KEY_OM_PARTNER, str2);
        jSONObject.put("error", vASTErrorCodes.a());
        return jSONObject.toString();
    }
}
