package com.google.android.gms.net;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamite.DynamiteModule;
import h5.g;
import h5.h;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

@Keep
/* compiled from: com.google.android.gms:play-services-cronet@@17.0.1 */
public class PlayServicesCronetProvider extends CronetProvider {
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";

    @UsedByReflection("CronetAPI")
    public PlayServicesCronetProvider(Context context) {
        super(context);
    }

    private void tryToInstallCronetProvider() {
        try {
            a.e(this.mContext);
        } catch (h unused) {
            if (Log.isLoggable(TAG, 4)) {
                Log.i(TAG, "Google-Play-Services-Cronet-Provider is not installed yet.");
            }
        } catch (g unused2) {
            if (Log.isLoggable(TAG, 4)) {
                Log.i(TAG, "Google-Play-Services-Cronet-Provider is unavailable.");
            }
        }
    }

    @Keep
    public CronetEngine.Builder createBuilder() {
        ExperimentalCronetEngine.Builder builder;
        try {
            a.e(this.mContext);
            Throwable th = null;
            try {
                builder = new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) ((ClassLoader) q.k(((DynamiteModule) q.k(a.c())).b().getClassLoader())).loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(ICronetEngineBuilder.class).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{this.mContext}));
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
                builder = null;
                th = e10;
            }
            if (th == null) {
                q.l(builder, "The value of the constructed builder should never be null");
                return builder;
            }
            throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", th);
        } catch (h e11) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e11);
        } catch (g e12) {
            throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e12);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this || ((obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext))) {
            return true;
        }
        return false;
    }

    @Keep
    public String getName() {
        return a.f25330a;
    }

    @Keep
    public String getVersion() {
        tryToInstallCronetProvider();
        return a.d();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    @Keep
    public boolean isEnabled() {
        tryToInstallCronetProvider();
        return a.b();
    }
}
