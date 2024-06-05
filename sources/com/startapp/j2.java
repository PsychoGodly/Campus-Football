package com.startapp;

import com.applovin.mediation.MaxReward;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: Sta */
public class j2 implements p8 {

    /* renamed from: a  reason: collision with root package name */
    public final n8 f15949a;

    public j2(n8 n8Var) {
        this.f15949a = n8Var;
    }

    public String a(String str) {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream2.write(str.getBytes());
                e3.a(gZIPOutputStream2);
                String a10 = this.f15949a.a(q0.b(byteArrayOutputStream.toByteArray()));
                e3.a(gZIPOutputStream2);
                return a10;
            } catch (Exception unused) {
                gZIPOutputStream = gZIPOutputStream2;
                e3.a(gZIPOutputStream);
                return MaxReward.DEFAULT_LABEL;
            } catch (Throwable th) {
                e3.a(gZIPOutputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            e3.a(gZIPOutputStream);
            return MaxReward.DEFAULT_LABEL;
        }
    }
}
