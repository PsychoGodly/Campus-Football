package com.applovin.impl;

public final class s2 {

    /* renamed from: a  reason: collision with root package name */
    private long f11278a;

    /* renamed from: b  reason: collision with root package name */
    private long f11279b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11280c;

    /* renamed from: d  reason: collision with root package name */
    private long f11281d;

    /* renamed from: e  reason: collision with root package name */
    private long f11282e;

    /* renamed from: f  reason: collision with root package name */
    private int f11283f;

    /* renamed from: g  reason: collision with root package name */
    private Throwable f11284g;

    public void a() {
        this.f11282e++;
    }

    public void b() {
        this.f11281d++;
    }

    public void c() {
        this.f11280c = true;
    }

    public String toString() {
        return "CacheStatsTracker{totalDownloadedBytes=" + this.f11278a + ", totalCachedBytes=" + this.f11279b + ", isHTMLCachingCancelled=" + this.f11280c + ", htmlResourceCacheSuccessCount=" + this.f11281d + ", htmlResourceCacheFailureCount=" + this.f11282e + '}';
    }

    public void a(Throwable th) {
        this.f11284g = th;
    }

    public void a(int i10) {
        this.f11283f = i10;
    }

    public void a(long j10) {
        this.f11279b += j10;
    }
}
