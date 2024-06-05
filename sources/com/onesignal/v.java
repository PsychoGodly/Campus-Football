package com.onesignal;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.widget.RemoteViews;
import androidx.core.app.l;
import androidx.core.app.o;
import com.applovin.mediation.MaxReward;
import com.onesignal.k3;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GenerateNotification */
class v {

    /* renamed from: a  reason: collision with root package name */
    private static Class<?> f28258a = NotificationOpenedReceiver.class;

    /* renamed from: b  reason: collision with root package name */
    private static Class<?> f28259b = NotificationDismissReceiver.class;

    /* renamed from: c  reason: collision with root package name */
    private static Resources f28260c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Context f28261d = null;

    /* renamed from: e  reason: collision with root package name */
    private static String f28262e = null;

    /* renamed from: f  reason: collision with root package name */
    private static Integer f28263f = null;

    /* compiled from: GenerateNotification */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        l.e f28264a;

        /* renamed from: b  reason: collision with root package name */
        boolean f28265b;

        private b() {
        }
    }

    private static int A(String str) {
        if (str == null) {
            return 0;
        }
        String trim = str.trim();
        if (!OSUtils.K(trim)) {
            return 0;
        }
        int w10 = w(trim);
        if (w10 != 0) {
            return w10;
        }
        try {
            return R.drawable.class.getField(str).getInt((Object) null);
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static int B(JSONObject jSONObject) {
        int A = A(jSONObject.optString("sicon", (String) null));
        if (A != 0) {
            return A;
        }
        return v();
    }

    private static CharSequence C(JSONObject jSONObject) {
        String optString = jSONObject.optString("title", (String) null);
        if (optString != null) {
            return optString;
        }
        return p();
    }

    private static void D() {
        if (Build.VERSION.SDK_INT >= 24) {
            f28263f = 2;
        } else {
            f28263f = 1;
        }
    }

    static void E() {
        if (OSUtils.H()) {
            throw new b3("Process for showing a notification should never been done on Main Thread!");
        }
    }

    private static boolean F(JSONObject jSONObject) {
        String optString = jSONObject.optString("sound", (String) null);
        return !"null".equals(optString) && !"nil".equals(optString);
    }

    private static void G(l.e eVar) {
        eVar.C(true).r(0).H((Uri) null).L((long[]) null).K((CharSequence) null);
    }

    private static Bitmap H(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int dimension = (int) f28260c.getDimension(17104902);
            int dimension2 = (int) f28260c.getDimension(17104901);
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            if (width <= dimension2 && height <= dimension) {
                return bitmap;
            }
            if (height > width) {
                dimension2 = (int) (((float) dimension) * (((float) width) / ((float) height)));
            } else if (width > height) {
                dimension = (int) (((float) dimension2) * (((float) height) / ((float) width)));
            }
            return Bitmap.createScaledBitmap(bitmap, dimension2, dimension, true);
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    private static Integer I(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has(str)) {
                return Integer.valueOf(new BigInteger(jSONObject.optString(str), 16).intValue());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void J(org.json.JSONObject r6, androidx.core.app.l.e r7) {
        /*
            java.lang.String r0 = "pri"
            r1 = 6
            int r0 = r6.optInt(r0, r1)
            int r0 = e(r0)
            r7.D(r0)
            r1 = 0
            r2 = 1
            if (r0 >= 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0018
            return
        L_0x0018:
            java.lang.String r0 = "ledc"
            boolean r3 = r6.has(r0)
            r4 = 4
            if (r3 == 0) goto L_0x0040
            java.lang.String r3 = "led"
            int r3 = r6.optInt(r3, r2)
            if (r3 != r2) goto L_0x0040
            java.math.BigInteger r3 = new java.math.BigInteger     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = r6.optString(r0)     // Catch:{ all -> 0x0040 }
            r5 = 16
            r3.<init>(r0, r5)     // Catch:{ all -> 0x0040 }
            int r0 = r3.intValue()     // Catch:{ all -> 0x0040 }
            r3 = 2000(0x7d0, float:2.803E-42)
            r5 = 5000(0x1388, float:7.006E-42)
            r7.y(r0, r3, r5)     // Catch:{ all -> 0x0040 }
            goto L_0x0041
        L_0x0040:
            r1 = 4
        L_0x0041:
            java.lang.String r0 = "vib"
            int r0 = r6.optInt(r0, r2)
            if (r0 != r2) goto L_0x005d
            java.lang.String r0 = "vib_pt"
            boolean r0 = r6.has(r0)
            if (r0 == 0) goto L_0x005b
            long[] r0 = com.onesignal.OSUtils.R(r6)
            if (r0 == 0) goto L_0x005d
            r7.L(r0)
            goto L_0x005d
        L_0x005b:
            r1 = r1 | 2
        L_0x005d:
            boolean r0 = F(r6)
            if (r0 == 0) goto L_0x0078
            android.content.Context r0 = f28261d
            r2 = 0
            java.lang.String r3 = "sound"
            java.lang.String r6 = r6.optString(r3, r2)
            android.net.Uri r6 = com.onesignal.OSUtils.n(r0, r6)
            if (r6 == 0) goto L_0x0076
            r7.H(r6)
            goto L_0x0078
        L_0x0076:
            r1 = r1 | 1
        L_0x0078:
            r7.r(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.v.J(org.json.JSONObject, androidx.core.app.l$e):void");
    }

    private static void K(Context context) {
        f28261d = context;
        f28262e = context.getPackageName();
        f28260c = f28261d.getResources();
    }

    private static void L(RemoteViews remoteViews, JSONObject jSONObject, int i10, String str, String str2) {
        Integer I = I(jSONObject, str);
        if (I != null) {
            remoteViews.setTextColor(i10, I.intValue());
            return;
        }
        int identifier = f28260c.getIdentifier(str2, "color", f28262e);
        if (identifier != 0) {
            remoteViews.setTextColor(i10, h.b(f28261d, identifier));
        }
    }

    private static boolean M(b2 b2Var) {
        Notification notification;
        int intValue = b2Var.a().intValue();
        JSONObject e10 = b2Var.e();
        String optString = e10.optString("grp", (String) null);
        e0 e0Var = new e0(f28261d);
        ArrayList<StatusBarNotification> arrayList = new ArrayList<>();
        if (Build.VERSION.SDK_INT >= 24) {
            arrayList = s3.c(f28261d);
            if (optString == null && arrayList.size() >= 3) {
                optString = s3.g();
                s3.b(f28261d, arrayList);
            }
        }
        b q10 = q(b2Var);
        l.e eVar = q10.f28264a;
        b(e10, e0Var, eVar, intValue, (String) null);
        try {
            a(e10, eVar);
        } catch (Throwable th) {
            k3.b(k3.r0.ERROR, "Could not set background notification image!", th);
        }
        d(b2Var, eVar);
        if (b2Var.n()) {
            G(eVar);
        }
        m0.a(f28261d, optString != null ? 2 : 1);
        if (optString != null) {
            g(eVar, e0Var, e10, optString, intValue);
            notification = j(b2Var, eVar);
            if (Build.VERSION.SDK_INT < 24 || !optString.equals(s3.g())) {
                l(b2Var, q10);
            } else {
                i(b2Var, e0Var, arrayList.size() + 1);
            }
        } else {
            notification = h(eVar, e0Var, e10, intValue);
        }
        if (optString == null || Build.VERSION.SDK_INT > 17) {
            c(q10, notification);
            o.e(f28261d).g(intValue, notification);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return s3.a(f28261d, notification.getChannelId());
        }
        return true;
    }

    static void N(b2 b2Var) {
        K(b2Var.d());
        l(b2Var, (b) null);
    }

    private static void a(JSONObject jSONObject, l.e eVar) throws Throwable {
        JSONObject jSONObject2;
        Bitmap bitmap;
        String str;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 16 || i10 >= 31) {
            k3.a(k3.r0.VERBOSE, "Cannot use background images in notifications for device on version: " + i10);
            return;
        }
        String optString = jSONObject.optString("bg_img", (String) null);
        if (optString != null) {
            jSONObject2 = new JSONObject(optString);
            bitmap = r(jSONObject2.optString("img", (String) null));
        } else {
            bitmap = null;
            jSONObject2 = null;
        }
        if (bitmap == null) {
            bitmap = s("onesignal_bgimage_default_image");
        }
        if (bitmap != null) {
            RemoteViews remoteViews = new RemoteViews(f28261d.getPackageName(), h4.onesignal_bgimage_notif_layout);
            int i11 = g4.os_bgimage_notif_title;
            remoteViews.setTextViewText(i11, C(jSONObject));
            int i12 = g4.os_bgimage_notif_body;
            remoteViews.setTextViewText(i12, jSONObject.optString("alert"));
            L(remoteViews, jSONObject2, i11, "tc", "onesignal_bgimage_notif_title_color");
            L(remoteViews, jSONObject2, i12, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject2 == null || !jSONObject2.has("img_align")) {
                int identifier = f28260c.getIdentifier("onesignal_bgimage_notif_image_align", "string", f28262e);
                str = identifier != 0 ? f28260c.getString(identifier) : null;
            } else {
                str = jSONObject2.getString("img_align");
            }
            if ("right".equals(str)) {
                remoteViews.setViewPadding(g4.os_bgimage_notif_bgimage_align_layout, -5000, 0, 0, 0);
                int i13 = g4.os_bgimage_notif_bgimage_right_aligned;
                remoteViews.setImageViewBitmap(i13, bitmap);
                remoteViews.setViewVisibility(i13, 0);
                remoteViews.setViewVisibility(g4.os_bgimage_notif_bgimage, 2);
            } else {
                remoteViews.setImageViewBitmap(g4.os_bgimage_notif_bgimage, bitmap);
            }
            eVar.n(remoteViews);
            eVar.I((l.h) null);
        }
    }

    private static void b(JSONObject jSONObject, e0 e0Var, l.e eVar, int i10, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
            if (jSONObject2.has("a")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("a");
                if (jSONObject3.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("actionButtons");
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                        JSONObject jSONObject4 = new JSONObject(jSONObject.toString());
                        Intent b10 = e0Var.b(i10);
                        b10.setAction(MaxReward.DEFAULT_LABEL + i11);
                        b10.putExtra("action_button", true);
                        jSONObject4.put("actionId", optJSONObject.optString("id"));
                        b10.putExtra("onesignalData", jSONObject4.toString());
                        if (str != null) {
                            b10.putExtra("summary", str);
                        } else if (jSONObject.has("grp")) {
                            b10.putExtra("grp", jSONObject.optString("grp"));
                        }
                        eVar.a(optJSONObject.has("icon") ? A(optJSONObject.optString("icon")) : 0, optJSONObject.optString("text"), e0Var.a(i10, b10));
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void c(b bVar, Notification notification) {
        if (bVar.f28265b) {
            try {
                Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
                Field declaredField = newInstance.getClass().getDeclaredField("customizedIcon");
                declaredField.setAccessible(true);
                declaredField.set(newInstance, Boolean.TRUE);
                Field field = notification.getClass().getField("extraNotification");
                field.setAccessible(true);
                field.set(notification, newInstance);
            } catch (Throwable unused) {
            }
        }
    }

    private static void d(b2 b2Var, l.e eVar) {
        Class<l.e> cls = l.e.class;
        if (b2Var.l()) {
            try {
                Field declaredField = cls.getDeclaredField("T");
                declaredField.setAccessible(true);
                Notification notification = (Notification) declaredField.get(eVar);
                b2Var.s(Integer.valueOf(notification.flags));
                b2Var.t(notification.sound);
                eVar.d(b2Var.f().s());
                Notification notification2 = (Notification) declaredField.get(eVar);
                Field declaredField2 = cls.getDeclaredField("f");
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("e");
                declaredField3.setAccessible(true);
                b2Var.u((CharSequence) declaredField2.get(eVar));
                b2Var.x((CharSequence) declaredField3.get(eVar));
                if (!b2Var.n()) {
                    b2Var.v(Integer.valueOf(notification2.flags));
                    b2Var.w(notification2.sound);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static int e(int i10) {
        if (i10 > 9) {
            return 2;
        }
        if (i10 > 7) {
            return 1;
        }
        if (i10 > 4) {
            return 0;
        }
        return i10 > 2 ? -1 : -2;
    }

    private static Intent f(int i10, e0 e0Var, JSONObject jSONObject, String str) {
        return e0Var.b(i10).putExtra("onesignalData", jSONObject.toString()).putExtra("summary", str);
    }

    private static void g(l.e eVar, e0 e0Var, JSONObject jSONObject, String str, int i10) {
        SecureRandom secureRandom = new SecureRandom();
        eVar.o(e0Var.a(secureRandom.nextInt(), e0Var.b(i10).putExtra("onesignalData", jSONObject.toString()).putExtra("grp", str)));
        eVar.s(z(secureRandom.nextInt(), y(i10).putExtra("grp", str)));
        eVar.u(str);
        try {
            eVar.v(f28263f.intValue());
        } catch (Throwable unused) {
        }
    }

    private static Notification h(l.e eVar, e0 e0Var, JSONObject jSONObject, int i10) {
        SecureRandom secureRandom = new SecureRandom();
        eVar.o(e0Var.a(secureRandom.nextInt(), e0Var.b(i10).putExtra("onesignalData", jSONObject.toString())));
        eVar.s(z(secureRandom.nextInt(), y(i10)));
        return eVar.c();
    }

    private static void i(b2 b2Var, e0 e0Var, int i10) {
        JSONObject e10 = b2Var.e();
        SecureRandom secureRandom = new SecureRandom();
        String g10 = s3.g();
        String str = i10 + " new messages";
        int f10 = s3.f();
        k(r3.A(f28261d), g10, f10);
        PendingIntent a10 = e0Var.a(secureRandom.nextInt(), f(f10, e0Var, e10, g10));
        PendingIntent z10 = z(secureRandom.nextInt(), y(0).putExtra("summary", g10));
        l.e eVar = q(b2Var).f28264a;
        if (b2Var.i() != null) {
            eVar.H(b2Var.i());
        }
        if (b2Var.h() != null) {
            eVar.r(b2Var.h().intValue());
        }
        eVar.o(a10).s(z10).q(p()).p(str).A(i10).G(v()).x(u()).C(true).k(false).u(g10).w(true);
        try {
            eVar.v(f28263f.intValue());
        } catch (Throwable unused) {
        }
        l.g gVar = new l.g();
        gVar.n(str);
        eVar.I(gVar);
        o.e(f28261d).g(f10, eVar.c());
    }

    private static Notification j(b2 b2Var, l.e eVar) {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = i10 > 17 && i10 < 24 && !b2Var.n();
        if (z10 && b2Var.i() != null && !b2Var.i().equals(b2Var.g())) {
            eVar.H((Uri) null);
        }
        Notification c10 = eVar.c();
        if (z10) {
            eVar.H(b2Var.i());
        }
        return c10;
    }

    private static void k(r3 r3Var, String str, int i10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("android_notification_id", Integer.valueOf(i10));
        contentValues.put("group_id", str);
        contentValues.put("is_summary", 1);
        r3Var.L("notification", (String) null, contentValues);
    }

    private static void l(b2 b2Var, b bVar) {
        String str;
        String str2;
        Integer num;
        ArrayList<SpannableString> arrayList;
        JSONObject jSONObject;
        Notification notification;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        b bVar2 = bVar;
        String str8 = "message";
        String str9 = "title";
        String str10 = "is_summary";
        boolean n10 = b2Var.n();
        JSONObject e10 = b2Var.e();
        e0 e0Var = new e0(f28261d);
        Cursor cursor = null;
        String optString = e10.optString("grp", (String) null);
        SecureRandom secureRandom = new SecureRandom();
        PendingIntent z10 = z(secureRandom.nextInt(), y(0).putExtra("summary", optString));
        r3 A = r3.A(f28261d);
        try {
            String[] strArr = {"android_notification_id", "full_data", str10, str9, str8};
            JSONObject jSONObject2 = e10;
            try {
                String[] strArr2 = {optString};
                if (!n10) {
                    try {
                        str = "group_id = ? AND dismissed = 0 AND opened = 0" + " AND android_notification_id <> " + b2Var.a();
                    } catch (Throwable th) {
                        th = th;
                        cursor = null;
                        cursor.close();
                        throw th;
                    }
                } else {
                    str = "group_id = ? AND dismissed = 0 AND opened = 0";
                }
                Cursor j10 = A.j("notification", strArr, str, strArr2, (String) null, (String) null, "_id DESC");
                try {
                    boolean moveToFirst = j10.moveToFirst();
                    str2 = MaxReward.DEFAULT_LABEL;
                    if (moveToFirst) {
                        arrayList = new ArrayList<>();
                        String str11 = null;
                        num = null;
                        while (true) {
                            String str12 = str10;
                            if (j10.getInt(j10.getColumnIndex(str10)) == 1) {
                                num = Integer.valueOf(j10.getInt(j10.getColumnIndex("android_notification_id")));
                                str5 = str8;
                                str6 = str9;
                            } else {
                                String string = j10.getString(j10.getColumnIndex(str9));
                                if (string == null) {
                                    str4 = str2;
                                } else {
                                    str4 = string + " ";
                                }
                                str5 = str8;
                                str6 = str9;
                                SpannableString spannableString = new SpannableString(str4 + j10.getString(j10.getColumnIndex(str8)));
                                if (str4.length() > 0) {
                                    spannableString.setSpan(new StyleSpan(1), 0, str4.length(), 0);
                                }
                                arrayList.add(spannableString);
                                if (str11 == null) {
                                    str11 = j10.getString(j10.getColumnIndex("full_data"));
                                }
                            }
                            str7 = str11;
                            if (!j10.moveToNext()) {
                                break;
                            }
                            b bVar3 = bVar;
                            str11 = str7;
                            str10 = str12;
                            str8 = str5;
                            str9 = str6;
                        }
                        if (n10 && str7 != null) {
                            jSONObject = new JSONObject(str7);
                        }
                        jSONObject = jSONObject2;
                    } else {
                        jSONObject = jSONObject2;
                        arrayList = null;
                        num = null;
                    }
                } catch (JSONException e11) {
                    e11.printStackTrace();
                } catch (Throwable th2) {
                    th = th2;
                    cursor = j10;
                    cursor.close();
                    throw th;
                }
                if (!j10.isClosed()) {
                    j10.close();
                }
                if (num == null) {
                    num = Integer.valueOf(secureRandom.nextInt());
                    k(A, optString, num.intValue());
                }
                PendingIntent a10 = e0Var.a(secureRandom.nextInt(), f(num.intValue(), e0Var, jSONObject, optString));
                if (arrayList == null || ((!n10 || arrayList.size() <= 1) && (n10 || arrayList.size() <= 0))) {
                    b bVar4 = bVar;
                    l.e eVar = bVar4.f28264a;
                    eVar.f2751b.clear();
                    b(jSONObject, e0Var, eVar, num.intValue(), optString);
                    eVar.o(a10).s(z10).C(n10).k(false).u(optString).w(true);
                    try {
                        eVar.v(f28263f.intValue());
                    } catch (Throwable unused) {
                    }
                    notification = eVar.c();
                    c(bVar4, notification);
                } else {
                    int size = arrayList.size() + (n10 ^ true ? 1 : 0);
                    String optString2 = jSONObject.optString("grp_msg", (String) null);
                    if (optString2 == null) {
                        str3 = size + " new messages";
                    } else {
                        str3 = optString2.replace("$[notif_count]", str2 + size);
                    }
                    l.e eVar2 = q(b2Var).f28264a;
                    if (n10) {
                        G(eVar2);
                    } else {
                        if (b2Var.i() != null) {
                            eVar2.H(b2Var.i());
                        }
                        if (b2Var.h() != null) {
                            eVar2.r(b2Var.h().intValue());
                        }
                    }
                    eVar2.o(a10).s(z10).q(p()).p(str3).A(size).G(v()).x(u()).C(n10).k(false).u(optString).w(true);
                    try {
                        eVar2.v(f28263f.intValue());
                    } catch (Throwable unused2) {
                    }
                    if (!n10) {
                        eVar2.K(str3);
                    }
                    l.g gVar = new l.g();
                    if (!n10) {
                        String charSequence = b2Var.k() != null ? b2Var.k().toString() : null;
                        if (charSequence != null) {
                            str2 = charSequence + " ";
                        }
                        SpannableString spannableString2 = new SpannableString(str2 + b2Var.c().toString());
                        if (str2.length() > 0) {
                            spannableString2.setSpan(new StyleSpan(1), 0, str2.length(), 0);
                        }
                        gVar.m(spannableString2);
                    }
                    for (SpannableString m10 : arrayList) {
                        gVar.m(m10);
                    }
                    gVar.n(str3);
                    eVar2.I(gVar);
                    notification = eVar2.c();
                }
                o.e(f28261d).g(num.intValue(), notification);
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            cursor.close();
            throw th;
        }
    }

    static boolean m(b2 b2Var) {
        K(b2Var.d());
        return M(b2Var);
    }

    static boolean n(b2 b2Var) {
        K(b2Var.d());
        E();
        D();
        return M(b2Var);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(2:4|5)|6|7|(2:9|10)|11|12|(2:14|15)|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0015 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[Catch:{ all -> 0x0025 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.math.BigInteger o(org.json.JSONObject r4) {
        /*
            java.lang.String r0 = "bgac"
            r1 = 16
            r2 = 0
            boolean r3 = r4.has(r0)     // Catch:{ all -> 0x0015 }
            if (r3 == 0) goto L_0x0015
            java.math.BigInteger r3 = new java.math.BigInteger     // Catch:{ all -> 0x0015 }
            java.lang.String r4 = r4.optString(r0, r2)     // Catch:{ all -> 0x0015 }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x0015 }
            return r3
        L_0x0015:
            android.content.Context r4 = com.onesignal.k3.f27912f     // Catch:{ all -> 0x0025 }
            java.lang.String r0 = "onesignal_notification_accent_color"
            java.lang.String r4 = com.onesignal.OSUtils.k(r4, r0, r2)     // Catch:{ all -> 0x0025 }
            if (r4 == 0) goto L_0x0025
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ all -> 0x0025 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0025 }
            return r0
        L_0x0025:
            android.content.Context r4 = com.onesignal.k3.f27912f     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "com.onesignal.NotificationAccentColor.DEFAULT"
            java.lang.String r4 = com.onesignal.OSUtils.f(r4, r0)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x0035
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ all -> 0x0035 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0035 }
            return r0
        L_0x0035:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.v.o(org.json.JSONObject):java.math.BigInteger");
    }

    private static CharSequence p() {
        ApplicationInfo a10 = j.f27861a.a(f28261d);
        if (a10 == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        return f28261d.getPackageManager().getApplicationLabel(a10);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|5|(1:9)|10|11|(1:13)|14|15|(1:17)(1:18)|19|21|(1:23)|24|(1:26)|27|(2:29|30)|31|33) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x006e */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0074 A[Catch:{ all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007d A[Catch:{ all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b0 A[SYNTHETIC, Splitter:B:29:0x00b0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.onesignal.v.b q(com.onesignal.b2 r9) {
        /*
            java.lang.String r0 = "vis"
            org.json.JSONObject r1 = r9.e()
            com.onesignal.v$b r2 = new com.onesignal.v$b
            r3 = 0
            r2.<init>()
            java.lang.String r4 = com.onesignal.l0.c(r9)     // Catch:{ all -> 0x0018 }
            androidx.core.app.l$e r5 = new androidx.core.app.l$e     // Catch:{ all -> 0x0018 }
            android.content.Context r6 = f28261d     // Catch:{ all -> 0x0018 }
            r5.<init>(r6, r4)     // Catch:{ all -> 0x0018 }
            goto L_0x001f
        L_0x0018:
            androidx.core.app.l$e r5 = new androidx.core.app.l$e
            android.content.Context r4 = f28261d
            r5.<init>(r4)
        L_0x001f:
            java.lang.String r4 = "alert"
            java.lang.String r4 = r1.optString(r4, r3)
            r6 = 1
            androidx.core.app.l$e r7 = r5.k(r6)
            int r8 = B(r1)
            androidx.core.app.l$e r7 = r7.G(r8)
            androidx.core.app.l$c r8 = new androidx.core.app.l$c
            r8.<init>()
            androidx.core.app.l$c r8 = r8.m(r4)
            androidx.core.app.l$e r7 = r7.I(r8)
            androidx.core.app.l$e r7 = r7.p(r4)
            r7.K(r4)
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 24
            if (r7 < r8) goto L_0x005a
            java.lang.String r7 = "title"
            java.lang.String r7 = r1.optString(r7)
            java.lang.String r8 = ""
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0061
        L_0x005a:
            java.lang.CharSequence r7 = C(r1)
            r5.q(r7)
        L_0x0061:
            java.math.BigInteger r7 = o(r1)     // Catch:{ all -> 0x006e }
            if (r7 == 0) goto L_0x006e
            int r7 = r7.intValue()     // Catch:{ all -> 0x006e }
            r5.m(r7)     // Catch:{ all -> 0x006e }
        L_0x006e:
            boolean r7 = r1.has(r0)     // Catch:{ all -> 0x0082 }
            if (r7 == 0) goto L_0x007d
            java.lang.String r0 = r1.optString(r0)     // Catch:{ all -> 0x0082 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0082 }
            goto L_0x007e
        L_0x007d:
            r0 = 1
        L_0x007e:
            r5.M(r0)     // Catch:{ all -> 0x0082 }
            goto L_0x0083
        L_0x0082:
        L_0x0083:
            android.graphics.Bitmap r0 = x(r1)
            if (r0 == 0) goto L_0x008e
            r2.f28265b = r6
            r5.x(r0)
        L_0x008e:
            java.lang.String r0 = "bicon"
            java.lang.String r0 = r1.optString(r0, r3)
            android.graphics.Bitmap r0 = r(r0)
            if (r0 == 0) goto L_0x00aa
            androidx.core.app.l$b r3 = new androidx.core.app.l$b
            r3.<init>()
            androidx.core.app.l$b r0 = r3.n(r0)
            androidx.core.app.l$b r0 = r0.o(r4)
            r5.I(r0)
        L_0x00aa:
            java.lang.Long r0 = r9.j()
            if (r0 == 0) goto L_0x00bf
            java.lang.Long r9 = r9.j()     // Catch:{ all -> 0x00bf }
            long r3 = r9.longValue()     // Catch:{ all -> 0x00bf }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r6
            r5.N(r3)     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            J(r1, r5)
            r2.f28264a = r5
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.v.q(com.onesignal.b2):com.onesignal.v$b");
    }

    private static Bitmap r(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("http://") || trim.startsWith("https://")) {
            return t(trim);
        }
        return s(str);
    }

    private static Bitmap s(String str) {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeStream(f28261d.getAssets().open(str));
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            return bitmap;
        }
        try {
            for (String str2 : Arrays.asList(new String[]{".png", ".webp", ".jpg", ".gif", ".bmp"})) {
                try {
                    bitmap = BitmapFactory.decodeStream(f28261d.getAssets().open(str + str2));
                    continue;
                } catch (Throwable unused2) {
                }
                if (bitmap != null) {
                    return bitmap;
                }
            }
            int A = A(str);
            if (A != 0) {
                return BitmapFactory.decodeResource(f28260c, A);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    private static Bitmap t(String str) {
        try {
            return BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        } catch (Throwable th) {
            k3.b(k3.r0.WARN, "Could not download image!", th);
            return null;
        }
    }

    private static Bitmap u() {
        return H(s("ic_onesignal_large_icon_default"));
    }

    private static int v() {
        int w10 = w("ic_stat_onesignal_default");
        if (w10 != 0) {
            return w10;
        }
        int w11 = w("corona_statusbar_icon_default");
        if (w11 != 0) {
            return w11;
        }
        int w12 = w("ic_os_notification_fallback_white_24dp");
        if (w12 != 0) {
            return w12;
        }
        return 17301598;
    }

    private static int w(String str) {
        return f28260c.getIdentifier(str, "drawable", f28262e);
    }

    private static Bitmap x(JSONObject jSONObject) {
        Bitmap r10 = r(jSONObject.optString("licon"));
        if (r10 == null) {
            r10 = s("ic_onesignal_large_icon_default");
        }
        if (r10 == null) {
            return null;
        }
        return H(r10);
    }

    private static Intent y(int i10) {
        return new Intent(f28261d, f28259b).putExtra("androidNotificationId", i10).putExtra("dismissed", true);
    }

    private static PendingIntent z(int i10, Intent intent) {
        return PendingIntent.getBroadcast(f28261d, i10, intent, 201326592);
    }
}
