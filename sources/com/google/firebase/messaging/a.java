package com.google.firebase.messaging;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.IOException;
import k7.d;
import k7.e;

/* compiled from: AutoProtoEncoderDoNotUseEncoder */
public final class a implements l7.a {

    /* renamed from: a  reason: collision with root package name */
    public static final l7.a f26726a = new a();

    /* renamed from: com.google.firebase.messaging.a$a  reason: collision with other inner class name */
    /* compiled from: AutoProtoEncoderDoNotUseEncoder */
    private static final class C0281a implements d<j8.a> {

        /* renamed from: a  reason: collision with root package name */
        static final C0281a f26727a = new C0281a();

        /* renamed from: b  reason: collision with root package name */
        private static final k7.c f26728b = k7.c.a("projectNumber").b(n7.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final k7.c f26729c = k7.c.a("messageId").b(n7.a.b().c(2).a()).a();

        /* renamed from: d  reason: collision with root package name */
        private static final k7.c f26730d = k7.c.a("instanceId").b(n7.a.b().c(3).a()).a();

        /* renamed from: e  reason: collision with root package name */
        private static final k7.c f26731e = k7.c.a("messageType").b(n7.a.b().c(4).a()).a();

        /* renamed from: f  reason: collision with root package name */
        private static final k7.c f26732f = k7.c.a("sdkPlatform").b(n7.a.b().c(5).a()).a();

        /* renamed from: g  reason: collision with root package name */
        private static final k7.c f26733g = k7.c.a(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME).b(n7.a.b().c(6).a()).a();

        /* renamed from: h  reason: collision with root package name */
        private static final k7.c f26734h = k7.c.a("collapseKey").b(n7.a.b().c(7).a()).a();

        /* renamed from: i  reason: collision with root package name */
        private static final k7.c f26735i = k7.c.a(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY).b(n7.a.b().c(8).a()).a();

        /* renamed from: j  reason: collision with root package name */
        private static final k7.c f26736j = k7.c.a("ttl").b(n7.a.b().c(9).a()).a();

        /* renamed from: k  reason: collision with root package name */
        private static final k7.c f26737k = k7.c.a("topic").b(n7.a.b().c(10).a()).a();

        /* renamed from: l  reason: collision with root package name */
        private static final k7.c f26738l = k7.c.a("bulkId").b(n7.a.b().c(11).a()).a();

        /* renamed from: m  reason: collision with root package name */
        private static final k7.c f26739m = k7.c.a("event").b(n7.a.b().c(12).a()).a();

        /* renamed from: n  reason: collision with root package name */
        private static final k7.c f26740n = k7.c.a("analyticsLabel").b(n7.a.b().c(13).a()).a();

        /* renamed from: o  reason: collision with root package name */
        private static final k7.c f26741o = k7.c.a("campaignId").b(n7.a.b().c(14).a()).a();

        /* renamed from: p  reason: collision with root package name */
        private static final k7.c f26742p = k7.c.a("composerLabel").b(n7.a.b().c(15).a()).a();

        private C0281a() {
        }

        /* renamed from: b */
        public void a(j8.a aVar, e eVar) throws IOException {
            eVar.b(f26728b, aVar.l());
            eVar.e(f26729c, aVar.h());
            eVar.e(f26730d, aVar.g());
            eVar.e(f26731e, aVar.i());
            eVar.e(f26732f, aVar.m());
            eVar.e(f26733g, aVar.j());
            eVar.e(f26734h, aVar.d());
            eVar.a(f26735i, aVar.k());
            eVar.a(f26736j, aVar.o());
            eVar.e(f26737k, aVar.n());
            eVar.b(f26738l, aVar.b());
            eVar.e(f26739m, aVar.f());
            eVar.e(f26740n, aVar.a());
            eVar.b(f26741o, aVar.c());
            eVar.e(f26742p, aVar.e());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder */
    private static final class b implements d<j8.b> {

        /* renamed from: a  reason: collision with root package name */
        static final b f26743a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final k7.c f26744b = k7.c.a("messagingClientEvent").b(n7.a.b().c(1).a()).a();

        private b() {
        }

        /* renamed from: b */
        public void a(j8.b bVar, e eVar) throws IOException {
            eVar.e(f26744b, bVar.a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder */
    private static final class c implements d<l0> {

        /* renamed from: a  reason: collision with root package name */
        static final c f26745a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final k7.c f26746b = k7.c.d("messagingClientEventExtension");

        private c() {
        }

        /* renamed from: b */
        public void a(l0 l0Var, e eVar) throws IOException {
            eVar.e(f26746b, l0Var.b());
        }
    }

    private a() {
    }

    public void a(l7.b<?> bVar) {
        bVar.a(l0.class, c.f26745a);
        bVar.a(j8.b.class, b.f26743a);
        bVar.a(j8.a.class, C0281a.f26727a);
    }
}
