package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import h5.l;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f15483a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15484b;

    public t(Context context) {
        q.k(context);
        Resources resources = context.getResources();
        this.f15483a = resources;
        this.f15484b = resources.getResourcePackageName(l.f18852a);
    }

    public String a(String str) {
        int identifier = this.f15483a.getIdentifier(str, "string", this.f15484b);
        if (identifier == 0) {
            return null;
        }
        return this.f15483a.getString(identifier);
    }
}
