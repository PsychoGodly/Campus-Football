package com.unity3d.services.core.di;

import android.content.Context;
import bf.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.CronetClient;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.OkHttp3Client;
import kotlin.jvm.internal.m;
import org.chromium.net.CronetEngine;
import pe.o;
import sd.o;

/* compiled from: UnityAdsModule.kt */
final class UnityAdsModule$buildNetworkClient$2$1<TResult> implements OnCompleteListener {
    final /* synthetic */ Context $context;
    final /* synthetic */ o<HttpClient> $continuation;
    final /* synthetic */ ISDKDispatchers $dispatchers;

    UnityAdsModule$buildNetworkClient$2$1(Context context, o<? super HttpClient> oVar, ISDKDispatchers iSDKDispatchers) {
        this.$context = context;
        this.$continuation = oVar;
        this.$dispatchers = iSDKDispatchers;
    }

    public final void onComplete(Task<Void> task) {
        m.e(task, "it");
        if (task.isSuccessful()) {
            CronetEngine build = new CronetEngine.Builder(this.$context).setStoragePath(this.$context.getFilesDir().getAbsolutePath()).enableHttpCache(3, ServiceProvider.HTTP_CACHE_DISK_SIZE).enableQuic(true).addQuicHint(ServiceProvider.GATEWAY_HOST, 443, 443).addQuicHint("cdn-creatives-cf-prd.acquire.unity3dusercontent.com", 443, 443).build();
            o<HttpClient> oVar = this.$continuation;
            o.a aVar = sd.o.f38128b;
            m.d(build, "cronetEngine");
            oVar.resumeWith(sd.o.b(new CronetClient(build, this.$dispatchers)));
            return;
        }
        pe.o<HttpClient> oVar2 = this.$continuation;
        o.a aVar2 = sd.o.f38128b;
        oVar2.resumeWith(sd.o.b(new OkHttp3Client(this.$dispatchers, new u())));
    }
}
