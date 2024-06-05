package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: SharedPreferencesQueue */
final class w0 {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f26907a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26908b;

    /* renamed from: c  reason: collision with root package name */
    private final String f26909c;

    /* renamed from: d  reason: collision with root package name */
    final ArrayDeque<String> f26910d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    private final Executor f26911e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f26912f = false;

    private w0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f26907a = sharedPreferences;
        this.f26908b = str;
        this.f26909c = str2;
        this.f26911e = executor;
    }

    private boolean c(boolean z10) {
        if (z10 && !this.f26912f) {
            j();
        }
        return z10;
    }

    static w0 d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        w0 w0Var = new w0(sharedPreferences, str, str2, executor);
        w0Var.e();
        return w0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e() {
        /*
            r6 = this;
            java.util.ArrayDeque<java.lang.String> r0 = r6.f26910d
            monitor-enter(r0)
            java.util.ArrayDeque<java.lang.String> r1 = r6.f26910d     // Catch:{ all -> 0x004a }
            r1.clear()     // Catch:{ all -> 0x004a }
            android.content.SharedPreferences r1 = r6.f26907a     // Catch:{ all -> 0x004a }
            java.lang.String r2 = r6.f26908b     // Catch:{ all -> 0x004a }
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch:{ all -> 0x004a }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0048
            java.lang.String r2 = r6.f26909c     // Catch:{ all -> 0x004a }
            boolean r2 = r1.contains(r2)     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0021
            goto L_0x0048
        L_0x0021:
            java.lang.String r2 = r6.f26909c     // Catch:{ all -> 0x004a }
            r3 = -1
            java.lang.String[] r1 = r1.split(r2, r3)     // Catch:{ all -> 0x004a }
            int r2 = r1.length     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0032
            java.lang.String r2 = "FirebaseMessaging"
            java.lang.String r3 = "Corrupted queue. Please check the queue contents and item separator provided"
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x004a }
        L_0x0032:
            int r2 = r1.length     // Catch:{ all -> 0x004a }
            r3 = 0
        L_0x0034:
            if (r3 >= r2) goto L_0x0046
            r4 = r1[r3]     // Catch:{ all -> 0x004a }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x004a }
            if (r5 != 0) goto L_0x0043
            java.util.ArrayDeque<java.lang.String> r5 = r6.f26910d     // Catch:{ all -> 0x004a }
            r5.add(r4)     // Catch:{ all -> 0x004a }
        L_0x0043:
            int r3 = r3 + 1
            goto L_0x0034
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.w0.e():void");
    }

    /* access modifiers changed from: private */
    public void i() {
        synchronized (this.f26910d) {
            this.f26907a.edit().putString(this.f26908b, h()).commit();
        }
    }

    private void j() {
        this.f26911e.execute(new v0(this));
    }

    public boolean b(String str) {
        boolean c10;
        if (TextUtils.isEmpty(str) || str.contains(this.f26909c)) {
            return false;
        }
        synchronized (this.f26910d) {
            c10 = c(this.f26910d.add(str));
        }
        return c10;
    }

    public String f() {
        String peek;
        synchronized (this.f26910d) {
            peek = this.f26910d.peek();
        }
        return peek;
    }

    public boolean g(Object obj) {
        boolean c10;
        synchronized (this.f26910d) {
            c10 = c(this.f26910d.remove(obj));
        }
        return c10;
    }

    public String h() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f26910d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f26909c);
        }
        return sb2.toString();
    }
}
