package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.q;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class a<O extends d> {

    /* renamed from: a  reason: collision with root package name */
    private final C0154a<?, O> f15021a;

    /* renamed from: b  reason: collision with root package name */
    private final g<?> f15022b;

    /* renamed from: c  reason: collision with root package name */
    private final String f15023c;

    /* renamed from: com.google.android.gms.common.api.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static abstract class C0154a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T buildClient(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, O o10, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
            return buildClient(context, looper, dVar, o10, (com.google.android.gms.common.api.internal.e) bVar, (m) cVar);
        }

        public T buildClient(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, O o10, com.google.android.gms.common.api.internal.e eVar, m mVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface b {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class c<C extends b> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface d {

        /* renamed from: a  reason: collision with root package name */
        public static final c f15024a = new c((o) null);

        /* renamed from: com.google.android.gms.common.api.a$d$a  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public interface C0155a extends d {
            Account b();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public interface b extends d {
            GoogleSignInAccount a();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public static final class c implements d {
            private c() {
            }

            /* synthetic */ c(o oVar) {
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static abstract class e<T extends b, O> {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        public List<Scope> getImpliedScopes(O o10) {
            return Collections.emptyList();
        }

        public int getPriority() {
            return API_PRIORITY_OTHER;
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface f extends b {
        void connect(c.C0157c cVar);

        void disconnect();

        void disconnect(String str);

        void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        h5.d[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(j jVar, Set<Scope> set);

        Set<Scope> getScopesForConnectionlessNonSignIn();

        Intent getSignInIntent();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(c.e eVar);

        boolean providesSignIn();

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(String str, C0154a<C, O> aVar, g<C> gVar) {
        q.l(aVar, "Cannot construct an Api with a null ClientBuilder");
        q.l(gVar, "Cannot construct an Api with a null ClientKey");
        this.f15023c = str;
        this.f15021a = aVar;
        this.f15022b = gVar;
    }

    public final C0154a<?, O> a() {
        return this.f15021a;
    }

    public final c<?> b() {
        return this.f15022b;
    }

    public final e<?, O> c() {
        return this.f15021a;
    }

    public final String d() {
        return this.f15023c;
    }
}
