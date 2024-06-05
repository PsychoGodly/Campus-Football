package com.google.firebase.installations;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.a;

@AutoValue
/* compiled from: InstallationTokenResult */
public abstract class g {

    @AutoValue.Builder
    /* compiled from: InstallationTokenResult */
    public static abstract class a {
        public abstract g a();

        public abstract a b(String str);

        public abstract a c(long j10);

        public abstract a d(long j10);
    }

    public static a a() {
        return new a.b();
    }

    public abstract String b();

    public abstract long c();

    public abstract long d();
}
