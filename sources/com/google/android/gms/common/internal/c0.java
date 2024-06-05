package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.g;
import androidx.core.os.f;
import f5.b;
import h5.l;
import java.util.Locale;
import m5.i;
import o5.c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    private static final g<String, String> f15348a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    private static Locale f15349b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return c.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(b.f18079g);
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 == 1) {
            return resources.getString(b.f18076d);
        }
        if (i10 == 2) {
            return resources.getString(b.f18082j);
        }
        if (i10 != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(b.f18073a);
    }

    public static String d(Context context, int i10) {
        Resources resources = context.getResources();
        String a10 = a(context);
        if (i10 == 1) {
            return resources.getString(b.f18077e, new Object[]{a10});
        } else if (i10 != 2) {
            if (i10 == 3) {
                return resources.getString(b.f18074b, new Object[]{a10});
            } else if (i10 == 5) {
                return h(context, "common_google_play_services_invalid_account_text", a10);
            } else {
                if (i10 == 7) {
                    return h(context, "common_google_play_services_network_error_text", a10);
                }
                if (i10 == 9) {
                    return resources.getString(b.f18081i, new Object[]{a10});
                } else if (i10 == 20) {
                    return h(context, "common_google_play_services_restricted_profile_text", a10);
                } else {
                    switch (i10) {
                        case 16:
                            return h(context, "common_google_play_services_api_unavailable_text", a10);
                        case 17:
                            return h(context, "common_google_play_services_sign_in_failed_text", a10);
                        case 18:
                            return resources.getString(b.f18085m, new Object[]{a10});
                        default:
                            return resources.getString(l.f18852a, new Object[]{a10});
                    }
                }
            }
        } else if (i.g(context)) {
            return resources.getString(b.f18086n);
        } else {
            return resources.getString(b.f18083k, new Object[]{a10});
        }
    }

    public static String e(Context context, int i10) {
        if (i10 == 6 || i10 == 19) {
            return h(context, "common_google_play_services_resolution_required_text", a(context));
        }
        return d(context, i10);
    }

    public static String f(Context context, int i10) {
        String str;
        if (i10 == 6) {
            str = i(context, "common_google_play_services_resolution_required_title");
        } else {
            str = g(context, i10);
        }
        return str == null ? context.getResources().getString(b.f18080h) : str;
    }

    public static String g(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(b.f18078f);
            case 2:
                return resources.getString(b.f18084l);
            case 3:
                return resources.getString(b.f18075c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Unexpected error code ");
                sb2.append(i10);
                Log.e("GoogleApiAvailability", sb2.toString());
                return null;
        }
    }

    private static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i10 = i(context, str);
        if (i10 == null) {
            i10 = resources.getString(l.f18852a);
        }
        return String.format(resources.getConfiguration().locale, i10, new Object[]{str2});
    }

    private static String i(Context context, String str) {
        String str2;
        String str3;
        g<String, String> gVar = f15348a;
        synchronized (gVar) {
            Locale d10 = f.a(context.getResources().getConfiguration()).d(0);
            if (!d10.equals(f15349b)) {
                gVar.clear();
                f15349b = d10;
            }
            String str4 = gVar.get(str);
            if (str4 != null) {
                return str4;
            }
            Resources f10 = h5.i.f(context);
            if (f10 == null) {
                return null;
            }
            int identifier = f10.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                if (str.length() != 0) {
                    str3 = "Missing resource: ".concat(str);
                } else {
                    str3 = new String("Missing resource: ");
                }
                Log.w("GoogleApiAvailability", str3);
                return null;
            }
            String string = f10.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                if (str.length() != 0) {
                    str2 = "Got empty resource: ".concat(str);
                } else {
                    str2 = new String("Got empty resource: ");
                }
                Log.w("GoogleApiAvailability", str2);
                return null;
            }
            gVar.put(str, string);
            return string;
        }
    }
}
