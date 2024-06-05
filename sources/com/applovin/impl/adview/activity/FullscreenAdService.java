package com.applovin.impl.adview.activity;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.bc;
import com.applovin.impl.ob;
import com.applovin.impl.sdk.t;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinAd;

public class FullscreenAdService extends Service {
    public static final String DATA_KEY_RAW_FULL_AD_RESPONSE = "raw_full_ad_response";
    private static final String TAG = "FullscreenAdService";

    private static class b extends Handler {
        private b() {
        }

        public void handleMessage(Message message) {
            try {
                ob obVar = AppLovinFullscreenActivity.parentInterstitialWrapper;
                if (obVar != null) {
                    com.applovin.impl.sdk.ad.b f10 = obVar.f();
                    int i10 = message.what;
                    c cVar = c.AD;
                    if (i10 == cVar.b()) {
                        Bundle bundle = new Bundle();
                        bundle.putString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE, f10.getRawFullResponse());
                        Message obtain = Message.obtain((Handler) null, cVar.b());
                        obtain.setData(bundle);
                        message.replyTo.send(obtain);
                    } else if (message.what == c.AD_DISPLAYED.b()) {
                        bc.a(obVar.c(), (AppLovinAd) f10);
                    } else if (message.what == c.AD_CLICKED.b()) {
                        bc.a(obVar.b(), (AppLovinAd) f10);
                    } else if (message.what == c.AD_VIDEO_STARTED.b()) {
                        bc.a(obVar.d(), (AppLovinAd) f10);
                    } else if (message.what == c.AD_VIDEO_ENDED.b()) {
                        Bundle data = message.getData();
                        bc.a(obVar.d(), (AppLovinAd) f10, data.getDouble("percent_viewed"), data.getBoolean("fully_watched"));
                    } else if (message.what == c.AD_HIDDEN.b()) {
                        bc.b(obVar.c(), (AppLovinAd) f10);
                    } else {
                        super.handleMessage(message);
                    }
                } else if (!zp.a((Integer) 1)) {
                    super.handleMessage(message);
                } else {
                    throw new RuntimeException("parentWrapper is null for " + message.what);
                }
            } catch (RemoteException e10) {
                t.c(FullscreenAdService.TAG, "Failed to respond to Fullscreen Activity in another process with ad", e10);
            } catch (Throwable unused) {
            }
        }
    }

    public enum c {
        AD(0),
        AD_DISPLAYED(1),
        AD_CLICKED(2),
        AD_VIDEO_STARTED(3),
        AD_VIDEO_ENDED(4),
        AD_HIDDEN(5);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f6424a;

        private c(int i10) {
            this.f6424a = i10;
        }

        public int b() {
            return this.f6424a;
        }
    }

    public IBinder onBind(Intent intent) {
        return new Messenger(new b()).getBinder();
    }
}
