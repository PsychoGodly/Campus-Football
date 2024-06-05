package com.google.firebase.installations;

import com.applovin.mediation.MaxReward;
import com.google.firebase.installations.g;
import java.util.Objects;

/* compiled from: AutoValue_InstallationTokenResult */
final class a extends g {

    /* renamed from: a  reason: collision with root package name */
    private final String f26661a;

    /* renamed from: b  reason: collision with root package name */
    private final long f26662b;

    /* renamed from: c  reason: collision with root package name */
    private final long f26663c;

    /* compiled from: AutoValue_InstallationTokenResult */
    static final class b extends g.a {

        /* renamed from: a  reason: collision with root package name */
        private String f26664a;

        /* renamed from: b  reason: collision with root package name */
        private Long f26665b;

        /* renamed from: c  reason: collision with root package name */
        private Long f26666c;

        b() {
        }

        public g a() {
            String str = this.f26664a;
            String str2 = MaxReward.DEFAULT_LABEL;
            if (str == null) {
                str2 = str2 + " token";
            }
            if (this.f26665b == null) {
                str2 = str2 + " tokenExpirationTimestamp";
            }
            if (this.f26666c == null) {
                str2 = str2 + " tokenCreationTimestamp";
            }
            if (str2.isEmpty()) {
                return new a(this.f26664a, this.f26665b.longValue(), this.f26666c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        public g.a b(String str) {
            Objects.requireNonNull(str, "Null token");
            this.f26664a = str;
            return this;
        }

        public g.a c(long j10) {
            this.f26666c = Long.valueOf(j10);
            return this;
        }

        public g.a d(long j10) {
            this.f26665b = Long.valueOf(j10);
            return this;
        }
    }

    public String b() {
        return this.f26661a;
    }

    public long c() {
        return this.f26663c;
    }

    public long d() {
        return this.f26662b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f26661a.equals(gVar.b()) && this.f26662b == gVar.d() && this.f26663c == gVar.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f26662b;
        long j11 = this.f26663c;
        return ((((this.f26661a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f26661a + ", tokenExpirationTimestamp=" + this.f26662b + ", tokenCreationTimestamp=" + this.f26663c + "}";
    }

    private a(String str, long j10, long j11) {
        this.f26661a = str;
        this.f26662b = j10;
        this.f26663c = j11;
    }
}
