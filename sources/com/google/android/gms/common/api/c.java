package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.collection.a;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.internal.q;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class c extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final a<b<?>, h5.b> f15025a;

    public c(a<b<?>, h5.b> aVar) {
        this.f15025a = aVar;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (b next : this.f15025a.keySet()) {
            h5.b bVar = (h5.b) q.k(this.f15025a.get(next));
            z10 &= !bVar.z();
            String b10 = next.b();
            String valueOf = String.valueOf(bVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(b10).length() + 2 + valueOf.length());
            sb2.append(b10);
            sb2.append(": ");
            sb2.append(valueOf);
            arrayList.add(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        if (z10) {
            sb3.append("None of the queried APIs are available. ");
        } else {
            sb3.append("Some of the queried APIs are unavailable. ");
        }
        sb3.append(TextUtils.join("; ", arrayList));
        return sb3.toString();
    }
}
