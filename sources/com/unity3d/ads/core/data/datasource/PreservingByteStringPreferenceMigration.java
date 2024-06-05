package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.google.protobuf.z;
import com.unity3d.ads.metadata.MediationMetaData;
import h0.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.m;
import sd.w;

/* compiled from: PreservingByteStringPreferenceMigration.kt */
public final class PreservingByteStringPreferenceMigration implements d<c> {
    private final Context context;
    private final GetByteStringData getByteStringData;
    private final String key;
    private final String name;

    public PreservingByteStringPreferenceMigration(Context context2, String str, String str2, GetByteStringData getByteStringData2) {
        m.e(context2, "context");
        m.e(str, MediationMetaData.KEY_NAME);
        m.e(str2, "key");
        m.e(getByteStringData2, "getByteStringData");
        this.context = context2;
        this.name = str;
        this.key = str2;
        this.getByteStringData = getByteStringData2;
    }

    public Object cleanUp(xd.d<? super w> dVar) {
        return w.f38141a;
    }

    public Object migrate(c cVar, xd.d<? super c> dVar) {
        if (!cVar.g0().isEmpty()) {
            return cVar;
        }
        boolean z10 = false;
        String string = this.context.getSharedPreferences(this.name, 0).getString(this.key, (String) null);
        if (string == null || string.length() == 0) {
            z10 = true;
        }
        if (z10) {
            return cVar;
        }
        z s10 = c.i0().F(this.getByteStringData.invoke(string)).build();
        m.d(s10, "newBuilder()\n           …                 .build()");
        return s10;
    }

    public Object shouldMigrate(c cVar, xd.d<? super Boolean> dVar) {
        return b.a(cVar.g0().isEmpty());
    }
}
