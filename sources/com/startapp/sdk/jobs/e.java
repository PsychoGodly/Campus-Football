package com.startapp.sdk.jobs;

import com.startapp.l7;
import com.startapp.sdk.jobs.JobRequest;

/* compiled from: Sta */
public final class e extends JobRequest {

    /* renamed from: e  reason: collision with root package name */
    public final Long f17254e;

    /* compiled from: Sta */
    public static final class a extends JobRequest.a<a> {

        /* renamed from: d  reason: collision with root package name */
        public Long f17255d;

        public a(Class<? extends b> cls) {
            super(cls);
        }
    }

    public e(a aVar) {
        super(aVar);
        this.f17254e = aVar.f17255d;
    }

    public boolean a(l7 l7Var) {
        return l7Var.a(this, this.f17254e.longValue());
    }
}
