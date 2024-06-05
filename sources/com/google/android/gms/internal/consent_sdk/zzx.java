package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
final class zzx {
    private final Application zza;
    private final zzae zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zzas zze;
    private final zzbq zzf;
    private final zzn zzg;
    private final zzaa zzh;
    private final zzg zzi;

    zzx(Application application, zzae zzae, Handler handler, Executor executor, zzas zzas, zzbq zzbq, zzn zzn, zzaa zzaa, zzg zzg2) {
        this.zza = application;
        this.zzb = zzae;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzas;
        this.zzf = zzbq;
        this.zzg = zzn;
        this.zzh = zzaa;
        this.zzi = zzg2;
    }

    private final zzcm zzd(zzck zzck) throws zzi {
        String str;
        JsonWriter jsonWriter;
        JsonReader jsonReader;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            Application application = this.zza;
            if (Build.VERSION.SDK_INT >= 17) {
                str = WebSettings.getDefaultUserAgent(application);
            } else {
                str = new WebView(application).getSettings().getUserAgentString();
            }
            httpURLConnection.setRequestProperty("User-Agent", str);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                jsonWriter = new JsonWriter(outputStreamWriter);
                jsonWriter.beginObject();
                String str2 = zzck.zza;
                if (str2 != null) {
                    jsonWriter.name("admob_app_id");
                    jsonWriter.value(str2);
                }
                String str3 = zzck.zzb;
                if (str3 != null) {
                    jsonWriter.name("adid");
                    jsonWriter.value(str3);
                }
                zzcg zzcg = zzck.zzc;
                if (zzcg != null) {
                    jsonWriter.name("device_info");
                    jsonWriter.beginObject();
                    int i10 = zzcg.zzc;
                    if (i10 != 1) {
                        jsonWriter.name("os_type");
                        int i11 = i10 - 1;
                        if (i11 == 0) {
                            jsonWriter.value("UNKNOWN");
                        } else if (i11 == 1) {
                            jsonWriter.value("ANDROID");
                        }
                    }
                    String str4 = zzcg.zza;
                    if (str4 != null) {
                        jsonWriter.name("model");
                        jsonWriter.value(str4);
                    }
                    Integer num = zzcg.zzb;
                    if (num != null) {
                        jsonWriter.name("android_api_level");
                        jsonWriter.value(num);
                    }
                    jsonWriter.endObject();
                }
                String str5 = zzck.zzd;
                if (str5 != null) {
                    jsonWriter.name("language_code");
                    jsonWriter.value(str5);
                }
                Boolean bool = zzck.zze;
                if (bool != null) {
                    jsonWriter.name("tag_for_under_age_of_consent");
                    jsonWriter.value(bool.booleanValue());
                }
                Map map = zzck.zzf;
                if (!map.isEmpty()) {
                    jsonWriter.name("stored_infos_map");
                    jsonWriter.beginObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jsonWriter.name((String) entry.getKey());
                        jsonWriter.value((String) entry.getValue());
                    }
                    jsonWriter.endObject();
                }
                zzci zzci = zzck.zzg;
                if (zzci != null) {
                    jsonWriter.name("screen_info");
                    jsonWriter.beginObject();
                    Integer num2 = zzci.zza;
                    if (num2 != null) {
                        jsonWriter.name("width");
                        jsonWriter.value(num2);
                    }
                    Integer num3 = zzci.zzb;
                    if (num3 != null) {
                        jsonWriter.name("height");
                        jsonWriter.value(num3);
                    }
                    Double d10 = zzci.zzc;
                    if (d10 != null) {
                        jsonWriter.name("density");
                        jsonWriter.value(d10);
                    }
                    List<zzch> list = zzci.zzd;
                    if (!list.isEmpty()) {
                        jsonWriter.name("screen_insets");
                        jsonWriter.beginArray();
                        for (zzch zzch : list) {
                            jsonWriter.beginObject();
                            Integer num4 = zzch.zza;
                            if (num4 != null) {
                                jsonWriter.name("top");
                                jsonWriter.value(num4);
                            }
                            Integer num5 = zzch.zzb;
                            if (num5 != null) {
                                jsonWriter.name("left");
                                jsonWriter.value(num5);
                            }
                            Integer num6 = zzch.zzc;
                            if (num6 != null) {
                                jsonWriter.name("right");
                                jsonWriter.value(num6);
                            }
                            Integer num7 = zzch.zzd;
                            if (num7 != null) {
                                jsonWriter.name("bottom");
                                jsonWriter.value(num7);
                            }
                            jsonWriter.endObject();
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                }
                zzce zzce = zzck.zzh;
                if (zzce != null) {
                    jsonWriter.name("app_info");
                    jsonWriter.beginObject();
                    String str6 = zzce.zza;
                    if (str6 != null) {
                        jsonWriter.name("package_name");
                        jsonWriter.value(str6);
                    }
                    String str7 = zzce.zzb;
                    if (str7 != null) {
                        jsonWriter.name("publisher_display_name");
                        jsonWriter.value(str7);
                    }
                    String str8 = zzce.zzc;
                    if (str8 != null) {
                        jsonWriter.name("version");
                        jsonWriter.value(str8);
                    }
                    jsonWriter.endObject();
                }
                zzcj zzcj = zzck.zzi;
                if (zzcj != null) {
                    jsonWriter.name("sdk_info");
                    jsonWriter.beginObject();
                    String str9 = zzcj.zza;
                    if (str9 != null) {
                        jsonWriter.name("version");
                        jsonWriter.value(str9);
                    }
                    jsonWriter.endObject();
                }
                List<zzcf> list2 = zzck.zzj;
                if (!list2.isEmpty()) {
                    jsonWriter.name("debug_params");
                    jsonWriter.beginArray();
                    for (zzcf ordinal : list2) {
                        int ordinal2 = ordinal.ordinal();
                        if (ordinal2 == 0) {
                            jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                        } else if (ordinal2 == 1) {
                            jsonWriter.value("ALWAYS_SHOW");
                        } else if (ordinal2 == 2) {
                            jsonWriter.value("GEO_OVERRIDE_EEA");
                        } else if (ordinal2 == 3) {
                            jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                        } else if (ordinal2 == 4) {
                            jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                        }
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
                jsonWriter.close();
                outputStreamWriter.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        zzcm zza2 = zzcm.zza(new JsonReader(new StringReader(headerField)));
                        zza2.zza = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return zza2;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        jsonReader = new JsonReader(bufferedReader);
                        zzcm zza3 = zzcm.zza(jsonReader);
                        jsonReader.close();
                        bufferedReader.close();
                        return zza3;
                    } catch (Throwable th) {
                        bufferedReader.close();
                        throw th;
                    }
                } else {
                    throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                }
                throw th;
                throw th;
            } catch (Throwable th2) {
                outputStreamWriter.close();
                throw th2;
            }
        } catch (SocketTimeoutException e10) {
            throw new zzi(4, "The server timed out.", e10);
        } catch (IOException e11) {
            throw new zzi(2, "Error making request.", e11);
        } catch (Throwable th3) {
            zzr.zza(th, th3);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, zzac zzac) {
        Handler handler = this.zzc;
        onConsentInfoUpdateSuccessListener.getClass();
        handler.post(new zzt(onConsentInfoUpdateSuccessListener));
        if (zzac.zzb != ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            this.zzf.zzc();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Activity activity, ConsentRequestParameters consentRequestParameters, ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        try {
            ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
            if (consentDebugSettings == null || !consentDebugSettings.isTestDevice()) {
                String zza2 = zzcn.zza(this.zza);
                Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + zza2 + "\") to set this as a debug device.");
            }
            zzac zza3 = new zzz(this.zzh, zzd(this.zzg.zzd(activity, consentRequestParameters))).zza();
            this.zze.zzg(zza3.zza);
            this.zze.zzh(zza3.zzb);
            this.zzf.zzd(zza3.zzc);
            this.zzi.zza().execute(new zzs(this, onConsentInfoUpdateSuccessListener, zza3));
        } catch (zzi e10) {
            this.zzc.post(new zzu(onConsentInfoUpdateFailureListener, e10));
        } catch (RuntimeException e11) {
            this.zzc.post(new zzv(onConsentInfoUpdateFailureListener, new zzi(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e11))))));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Activity activity, ConsentRequestParameters consentRequestParameters, ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        this.zzd.execute(new zzw(this, activity, consentRequestParameters, onConsentInfoUpdateSuccessListener, onConsentInfoUpdateFailureListener));
    }
}
