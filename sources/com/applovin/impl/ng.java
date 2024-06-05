package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public abstract class ng {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReference f9978a = new AtomicReference();

    public static String a() {
        return "iabtechlab-Applovin";
    }

    public static String a(k kVar) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        String str = (String) f9978a.get();
        if (StringUtils.isValidString(str)) {
            return str;
        }
        URL b10 = b();
        BufferedReader bufferedReader2 = null;
        if (b10 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (((Boolean) kVar.a(oj.M)).booleanValue()) {
            try {
                InputStream a10 = kVar.D().a(b10.toString(), (List) null, false, new s2());
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(a10));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb2.append(readLine);
                        sb2.append("\n");
                    }
                    bufferedReader.close();
                    if (a10 != null) {
                        a10.close();
                    }
                } catch (Throwable th) {
                    if (a10 != null) {
                        a10.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                kVar.L().a("OpenMeasurementTestParameters", th2);
                kVar.B().a("OpenMeasurementTestParameters", "getTestValidationJavaScriptContent", th2);
            }
        } else {
            try {
                inputStream = kVar.D().a(b10.toString(), (List) null, false, new s2());
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(inputStream));
                    while (true) {
                        try {
                            String readLine2 = bufferedReader3.readLine();
                            if (readLine2 == null) {
                                break;
                            }
                            sb2.append(readLine2);
                            sb2.append("\n");
                        } catch (Throwable unused) {
                            bufferedReader2 = bufferedReader3;
                            zp.a((Closeable) inputStream, kVar);
                            zp.a((Closeable) bufferedReader2, kVar);
                            String sb3 = sb2.toString();
                            f9978a.set(sb3);
                            return sb3;
                        }
                    }
                    zp.a((Closeable) inputStream, kVar);
                    zp.a((Closeable) bufferedReader3, kVar);
                } catch (Throwable unused2) {
                    zp.a((Closeable) inputStream, kVar);
                    zp.a((Closeable) bufferedReader2, kVar);
                    String sb32 = sb2.toString();
                    f9978a.set(sb32);
                    return sb32;
                }
            } catch (Throwable unused3) {
                inputStream = null;
                zp.a((Closeable) inputStream, kVar);
                zp.a((Closeable) bufferedReader2, kVar);
                String sb322 = sb2.toString();
                f9978a.set(sb322);
                return sb322;
            }
        }
        String sb3222 = sb2.toString();
        f9978a.set(sb3222);
        return sb3222;
        throw th;
    }

    public static URL b() {
        try {
            return new URL("https://compliance.iabtechnologylab.com/compliance-js/omid-validation-verification-script-v1-APPLOVIN-01102024.js");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String c() {
        return "iabtechlab.com-omid";
    }
}
