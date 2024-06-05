package com.startapp.sdk.adsbase.crashreport;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import com.startapp.f2;
import com.startapp.i3;
import com.startapp.j3;
import com.startapp.j9;
import com.startapp.sdk.adsbase.crashreport.ThreadsState;
import com.startapp.sdk.adsbase.crashreport.b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* compiled from: Sta */
public class a implements b.d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16998a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f16999b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f17000c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f17001d;

    public a(Context context, String str, boolean z10, boolean z11, boolean z12) {
        this.f16998a = context;
        this.f16999b = z10;
        this.f17000c = z11;
        this.f17001d = z12;
    }

    public boolean a(long j10, String str) {
        HashSet hashSet;
        ThreadsState.b bVar = new ThreadsState.b();
        bVar.f16992a = "com.startapp.";
        bVar.f16996e = this.f16999b;
        bVar.f16997f = this.f17000c;
        bVar.f16995d = j10;
        bVar.f16993b = str;
        if (this.f17001d) {
            hashSet = new HashSet();
            hashSet.add("android.webkit.WebView.loadDataWithBaseURL");
            hashSet.add("android.webkit.WebView.<init>");
            hashSet.add("android.webkit.WebView.stopLoading");
            hashSet.add("android.webkit.WebView.loadUrl");
            hashSet.add("libcore.icu.LocaleData.initLocaleData");
            hashSet.add("android.os.BinderProxy.transact");
            hashSet.add("android.hardware.SystemSensorManager.registerListenerImpl");
            hashSet.add("android.hardware.SystemSensorManager.<init>");
            hashSet.add("java.lang.Thread.<init>");
            hashSet.add("android.content.ContextWrapper.checkSelfPermission");
        } else {
            hashSet = null;
        }
        bVar.f16994c = hashSet;
        ThreadsState threadsState = new ThreadsState(bVar);
        if (threadsState.d() == null) {
            return false;
        }
        f2.a(this.f16998a, "StartappAnrTrace", (Serializable) threadsState);
        return true;
    }

    public void remove() {
        if (new File(f2.c(this.f16998a, "StartappAnrTrace")).exists()) {
            f2.a(this.f16998a, "StartappAnrTrace");
        }
    }

    public void a() {
        ThreadsState threadsState;
        ThreadsState.ShrunkStackTraceElement[] shrunkStackTraceElementArr;
        if (new File(f2.c(this.f16998a, "StartappAnrTrace")).exists() && (threadsState = (ThreadsState) f2.a(this.f16998a, "StartappAnrTrace", ThreadsState.class)) != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Map<Activity, Integer> map = j9.f15982a;
            PrintWriter printWriter = new PrintWriter(new DeflaterOutputStream(new Base64OutputStream(byteArrayOutputStream, 10), new Deflater(9, true)));
            printWriter.print("\"delay: ");
            printWriter.print(threadsState.b());
            printWriter.println('\"');
            if (!TextUtils.isEmpty(threadsState.c())) {
                printWriter.print("\"handler: ");
                printWriter.print(threadsState.c());
                printWriter.println('\"');
            }
            Map<String, ThreadsState.ShrunkStackTraceElement[]> d10 = threadsState.d();
            int i10 = 0;
            StackTraceElement stackTraceElement = null;
            if (d10 == null) {
                shrunkStackTraceElementArr = null;
            } else {
                shrunkStackTraceElementArr = null;
                for (Map.Entry next : d10.entrySet()) {
                    if (shrunkStackTraceElementArr == null) {
                        shrunkStackTraceElementArr = (ThreadsState.ShrunkStackTraceElement[]) next.getValue();
                    }
                    ThreadsState.ShrunkStackTraceElement[] shrunkStackTraceElementArr2 = (ThreadsState.ShrunkStackTraceElement[]) next.getValue();
                    printWriter.print('\"');
                    printWriter.print((String) next.getKey());
                    printWriter.println('\"');
                    for (ThreadsState.ShrunkStackTraceElement shrunkStackTraceElement : shrunkStackTraceElementArr2) {
                        if (shrunkStackTraceElement.a() != 0) {
                            printWriter.print(9);
                            printWriter.println(shrunkStackTraceElement.a());
                        }
                        StackTraceElement b10 = shrunkStackTraceElement.b();
                        if (b10 != null) {
                            printWriter.print(9);
                            printWriter.print("at ");
                            printWriter.print(b10.getClassName());
                            printWriter.print('.');
                            printWriter.print(b10.getMethodName());
                            printWriter.print('(');
                            printWriter.print(b10.getFileName());
                            printWriter.print(':');
                            printWriter.print(b10.getLineNumber());
                            printWriter.println(')');
                        }
                    }
                }
            }
            printWriter.close();
            if (shrunkStackTraceElementArr != null) {
                int length = shrunkStackTraceElementArr.length;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    StackTraceElement b11 = shrunkStackTraceElementArr[i10].b();
                    if (b11 != null && b11.getClassName().startsWith("com.startapp.")) {
                        stackTraceElement = b11;
                        break;
                    }
                    i10++;
                }
                if (stackTraceElement != null) {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                    i3 i3Var = new i3(j3.f15955h);
                    i3Var.f15914d = stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName();
                    i3Var.f15915e = byteArrayOutputStream2;
                    i3Var.a();
                }
            }
        }
    }
}
