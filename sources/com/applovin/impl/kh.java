package com.applovin.impl;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.m2;
import com.facebook.ads.AdError;

public class kh extends Exception implements m2 {

    /* renamed from: c  reason: collision with root package name */
    public static final m2.a f9013c = wy.f13190a;

    /* renamed from: a  reason: collision with root package name */
    public final int f9014a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9015b;

    protected kh(Bundle bundle) {
        this(bundle.getString(b(2)), a(bundle), bundle.getInt(b(0), 1000), bundle.getLong(b(1), SystemClock.elapsedRealtime()));
    }

    public static String a(int i10) {
        if (i10 == 5001) {
            return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
        }
        if (i10 == 5002) {
            return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
        }
        switch (i10) {
            case 1000:
                return "ERROR_CODE_UNSPECIFIED";
            case AdError.NO_FILL_ERROR_CODE /*1001*/:
                return "ERROR_CODE_REMOTE_ERROR";
            case AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE /*1002*/:
                return "ERROR_CODE_BEHIND_LIVE_WINDOW";
            case 1003:
                return "ERROR_CODE_TIMEOUT";
            case 1004:
                return "ERROR_CODE_FAILED_RUNTIME_CHECK";
            default:
                switch (i10) {
                    case AdError.SERVER_ERROR_CODE /*2000*/:
                        return "ERROR_CODE_IO_UNSPECIFIED";
                    case AdError.INTERNAL_ERROR_CODE /*2001*/:
                        return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                    case AdError.CACHE_ERROR_CODE /*2002*/:
                        return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                    case AdError.INTERNAL_ERROR_2003 /*2003*/:
                        return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                    case AdError.INTERNAL_ERROR_2004 /*2004*/:
                        return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                    case 2005:
                        return "ERROR_CODE_IO_FILE_NOT_FOUND";
                    case AdError.INTERNAL_ERROR_2006 /*2006*/:
                        return "ERROR_CODE_IO_NO_PERMISSION";
                    case 2007:
                        return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                    case AdError.REMOTE_ADS_SERVICE_ERROR /*2008*/:
                        return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                    default:
                        switch (i10) {
                            case AdError.MEDIATION_ERROR_CODE /*3001*/:
                                return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                            case 3002:
                                return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                            case 3003:
                                return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                            case 3004:
                                return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                            default:
                                switch (i10) {
                                    case 4001:
                                        return "ERROR_CODE_DECODER_INIT_FAILED";
                                    case 4002:
                                        return "ERROR_CODE_DECODER_QUERY_FAILED";
                                    case 4003:
                                        return "ERROR_CODE_DECODING_FAILED";
                                    case 4004:
                                        return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                    case 4005:
                                        return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                    default:
                                        switch (i10) {
                                            case 6000:
                                                return "ERROR_CODE_DRM_UNSPECIFIED";
                                            case AdError.MEDIAVIEW_MISSING_ERROR_CODE /*6001*/:
                                                return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                            case AdError.ICONVIEW_MISSING_ERROR_CODE /*6002*/:
                                                return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /*6003*/:
                                                return "ERROR_CODE_DRM_CONTENT_ERROR";
                                            case 6004:
                                                return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                            case 6005:
                                                return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                            case 6006:
                                                return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                            case 6007:
                                                return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                            case 6008:
                                                return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                            default:
                                                return i10 >= 1000000 ? "custom error code" : "invalid error code";
                                        }
                                }
                        }
                }
        }
    }

    private static Throwable a(Class cls, String str) {
        return (Throwable) cls.getConstructor(new Class[]{String.class}).newInstance(new Object[]{str});
    }

    protected static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    private static Throwable a(Bundle bundle) {
        String string = bundle.getString(b(3));
        String string2 = bundle.getString(b(4));
        Throwable th = null;
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, kh.class.getClassLoader());
            if (Throwable.class.isAssignableFrom(cls)) {
                th = a(cls, string2);
            }
            if (th != null) {
                return th;
            }
        } catch (Throwable unused) {
        }
        return a(string2);
    }

    protected kh(String str, Throwable th, int i10, long j10) {
        super(str, th);
        this.f9014a = i10;
        this.f9015b = j10;
    }

    public final String a() {
        return a(this.f9014a);
    }

    private static RemoteException a(String str) {
        return new RemoteException(str);
    }
}
