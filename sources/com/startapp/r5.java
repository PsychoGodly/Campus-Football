package com.startapp;

import android.text.TextUtils;
import com.startapp.sdk.common.SDKException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Sta */
public class r5 extends r6 {

    /* renamed from: a  reason: collision with root package name */
    public final Set<s5> f16351a = new HashSet();

    public void a(String str, Object obj, boolean z10, boolean z11) throws SDKException {
        if (z10 && obj == null) {
            throw new SDKException(str, (Throwable) null);
        } else if (obj != null && !TextUtils.isEmpty(obj.toString())) {
            try {
                s5 s5Var = new s5();
                s5Var.f16391a = str;
                String obj2 = obj.toString();
                if (z11) {
                    obj2 = URLEncoder.encode(obj2, "UTF-8");
                }
                s5Var.f16392b = obj2;
                if (!this.f16351a.add(s5Var)) {
                    this.f16351a.remove(s5Var);
                    this.f16351a.add(s5Var);
                }
            } catch (UnsupportedEncodingException e10) {
                if (z10) {
                    throw new SDKException(str, e10);
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('?');
        for (s5 next : this.f16351a) {
            if (next.f16392b != null) {
                sb2.append(next.f16391a);
                sb2.append('=');
                sb2.append(next.f16392b);
                sb2.append('&');
            } else {
                Set<String> set = next.f16393c;
                if (set != null) {
                    for (String append : set) {
                        sb2.append(next.f16391a);
                        sb2.append('=');
                        sb2.append(append);
                        sb2.append('&');
                    }
                }
            }
        }
        if (sb2.length() != 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString().replace("+", "%20");
    }

    public void a(String str, Set<String> set, boolean z10, boolean z11) throws SDKException {
        if (z10 && set == null) {
            throw new SDKException(str, (Throwable) null);
        } else if (set != null) {
            s5 s5Var = new s5();
            s5Var.f16391a = str;
            HashSet hashSet = new HashSet();
            for (String next : set) {
                if (z11) {
                    try {
                        next = URLEncoder.encode(next, "UTF-8");
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                hashSet.add(next);
            }
            if (!z10 || hashSet.size() != 0) {
                s5Var.f16393c = hashSet;
                if (!this.f16351a.add(s5Var)) {
                    this.f16351a.remove(s5Var);
                    this.f16351a.add(s5Var);
                    return;
                }
                return;
            }
            throw new SDKException(str, (Throwable) null);
        }
    }
}
