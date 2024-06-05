package io.flutter.plugins;

import ad.t;
import androidx.annotation.Keep;
import com.applovin.applovin_max.AppLovinMAX;
import com.onesignal.flutter.OneSignalPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import io.flutter.embedding.engine.a;
import io.flutter.plugins.firebase.core.i;
import io.flutter.plugins.firebase.messaging.e;
import io.flutter.plugins.googlemobileads.h0;
import io.flutter.plugins.webviewflutter.s6;
import nd.d;
import nf.g;
import oc.n;
import pc.u;
import pf.m;
import qc.w;
import sa.c;
import tb.f;
import va.c0;
import wc.j;
import xb.b;
import yc.l;

@Keep
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(a aVar) {
        try {
            aVar.q().f(new ga.a());
        } catch (Exception e10) {
            b.c(TAG, "Error registering plugin android_path_provider, com.mix1009.android_path_provider.AndroidPathProviderPlugin", e10);
        }
        try {
            aVar.q().f(new AppLovinMAX());
        } catch (Exception e11) {
            b.c(TAG, "Error registering plugin applovin_max, com.applovin.applovin_max.AppLovinMAX", e11);
        }
        try {
            aVar.q().f(new com.ryanheise.audioservice.a());
        } catch (Exception e12) {
            b.c(TAG, "Error registering plugin audio_service, com.ryanheise.audioservice.AudioServicePlugin", e12);
        }
        try {
            aVar.q().f(new c());
        } catch (Exception e13) {
            b.c(TAG, "Error registering plugin audio_session, com.ryanheise.audio_session.AudioSessionPlugin", e13);
        }
        try {
            aVar.q().f(new m());
        } catch (Exception e14) {
            b.c(TAG, "Error registering plugin audioplayers_android, xyz.luan.audioplayers.AudioplayersPlugin", e14);
        }
        try {
            aVar.q().f(new rb.b());
        } catch (Exception e15) {
            b.c(TAG, "Error registering plugin barcode_scan2, de.mintware.barcode_scan.BarcodeScanPlugin", e15);
        }
        try {
            aVar.q().f(new w());
        } catch (Exception e16) {
            b.c(TAG, "Error registering plugin cloud_firestore, io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin", e16);
        }
        try {
            aVar.q().f(new f());
        } catch (Exception e17) {
            b.c(TAG, "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin", e17);
        }
        try {
            aVar.q().f(new ub.a());
        } catch (Exception e18) {
            b.c(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e18);
        }
        try {
            aVar.q().f(new x1.a());
        } catch (Exception e19) {
            b.c(TAG, "Error registering plugin facebook_audience_network, com.dsi.facebook_audience_network.FacebookAudienceNetworkPlugin", e19);
        }
        try {
            aVar.q().f(new n());
        } catch (Exception e20) {
            b.c(TAG, "Error registering plugin firebase_analytics, io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin", e20);
        }
        try {
            aVar.q().f(new u());
        } catch (Exception e21) {
            b.c(TAG, "Error registering plugin firebase_auth, io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin", e21);
        }
        try {
            aVar.q().f(new i());
        } catch (Exception e22) {
            b.c(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e22);
        }
        try {
            aVar.q().f(new e());
        } catch (Exception e23) {
            b.c(TAG, "Error registering plugin firebase_messaging, io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin", e23);
        }
        try {
            aVar.q().f(new g());
        } catch (Exception e24) {
            b.c(TAG, "Error registering plugin flutter_downloader, vn.hunghd.flutterdownloader.FlutterDownloaderPlugin", e24);
        }
        try {
            aVar.q().f(new InAppWebViewFlutterPlugin());
        } catch (Exception e25) {
            b.c(TAG, "Error registering plugin flutter_inappwebview_android, com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin", e25);
        }
        try {
            aVar.q().f(new cd.a());
        } catch (Exception e26) {
            b.c(TAG, "Error registering plugin fluttertoast, io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin", e26);
        }
        try {
            aVar.q().f(new h0());
        } catch (Exception e27) {
            b.c(TAG, "Error registering plugin google_mobile_ads, io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin", e27);
        }
        try {
            aVar.q().f(new ua.f());
        } catch (Exception e28) {
            b.c(TAG, "Error registering plugin just_audio, com.ryanheise.just_audio.JustAudioPlugin", e28);
        }
        try {
            aVar.q().f(new OneSignalPlugin());
        } catch (Exception e29) {
            b.c(TAG, "Error registering plugin onesignal_flutter, com.onesignal.flutter.OneSignalPlugin", e29);
        }
        try {
            aVar.q().f(new j());
        } catch (Exception e30) {
            b.c(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e30);
        }
        try {
            aVar.q().f(new d());
        } catch (Exception e31) {
            b.c(TAG, "Error registering plugin pdfx, io.scer.pdfx.PdfxPlugin", e31);
        }
        try {
            aVar.q().f(new w1.m());
        } catch (Exception e32) {
            b.c(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e32);
        }
        try {
            aVar.q().f(new b.a());
        } catch (Exception e33) {
            b.c(TAG, "Error registering plugin ringtone_set, acr.rt.ringtone_set.RingtoneSetPlugin", e33);
        }
        try {
            aVar.q().f(new xc.c());
        } catch (Exception e34) {
            b.c(TAG, "Error registering plugin share, io.flutter.plugins.share.SharePlugin", e34);
        }
        try {
            aVar.q().f(new l());
        } catch (Exception e35) {
            b.c(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e35);
        }
        try {
            aVar.q().f(new c0());
        } catch (Exception e36) {
            b.c(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e36);
        }
        try {
            aVar.q().f(new of.f());
        } catch (Exception e37) {
            b.c(TAG, "Error registering plugin startapp, vn.momo.plugin.startapp.StartAppBannerPlugin", e37);
        }
        try {
            aVar.q().f(new pa.d());
        } catch (Exception e38) {
            b.c(TAG, "Error registering plugin unity_ads_plugin, com.rebeloid.unity_ads.UnityAdsPlugin", e38);
        }
        try {
            aVar.q().f(new zc.j());
        } catch (Exception e39) {
            b.c(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e39);
        }
        try {
            aVar.q().f(new ya.f());
        } catch (Exception e40) {
            b.c(TAG, "Error registering plugin user_messaging_platform, com.terwesten.gabriel.user_messaging_platform.UserMessagingPlatformPlugin", e40);
        }
        try {
            aVar.q().f(new t());
        } catch (Exception e41) {
            b.c(TAG, "Error registering plugin video_player_android, io.flutter.plugins.videoplayer.VideoPlayerPlugin", e41);
        }
        try {
            aVar.q().f(new qb.g());
        } catch (Exception e42) {
            b.c(TAG, "Error registering plugin wakelock, creativemaybeno.wakelock.WakelockPlugin", e42);
        }
        try {
            aVar.q().f(new s6());
        } catch (Exception e43) {
            b.c(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e43);
        }
    }
}
