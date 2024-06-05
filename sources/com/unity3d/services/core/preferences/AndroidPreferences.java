package com.unity3d.services.core.preferences;

import android.content.SharedPreferences;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;

public class AndroidPreferences {
    public static Boolean getBoolean(String str, String str2) {
        SharedPreferences sharedPreferences = ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return Boolean.valueOf(sharedPreferences.getBoolean(str2, false));
            } catch (ClassCastException e10) {
                DeviceLog.warning("Unity Ads failed to cast " + str2 + ": " + e10.getMessage());
            }
        }
        return null;
    }

    public static Float getFloat(String str, String str2) {
        SharedPreferences sharedPreferences = ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return Float.valueOf(sharedPreferences.getFloat(str2, Float.NaN));
            } catch (ClassCastException e10) {
                DeviceLog.warning("Unity Ads failed to cast " + str2 + ": " + e10.getMessage());
            }
        }
        return null;
    }

    public static Integer getInteger(String str, String str2) {
        SharedPreferences sharedPreferences = ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return Integer.valueOf(sharedPreferences.getInt(str2, -1));
            } catch (ClassCastException e10) {
                DeviceLog.warning("Unity Ads failed to cast " + str2 + ": " + e10.getMessage());
            }
        }
        return null;
    }

    public static Long getLong(String str, String str2) {
        SharedPreferences sharedPreferences = ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return Long.valueOf(sharedPreferences.getLong(str2, -1));
            } catch (ClassCastException e10) {
                DeviceLog.warning("Unity Ads failed to cast " + str2 + ": " + e10.getMessage());
            }
        }
        return null;
    }

    public static String getString(String str, String str2) {
        SharedPreferences sharedPreferences = ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return sharedPreferences.getString(str2, MaxReward.DEFAULT_LABEL);
            } catch (ClassCastException e10) {
                DeviceLog.warning("Unity Ads failed to cast " + str2 + ": " + e10.getMessage());
            }
        }
        return null;
    }

    public static boolean hasKey(String str, String str2) {
        SharedPreferences sharedPreferences = ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences == null || !sharedPreferences.contains(str2)) {
            return false;
        }
        return true;
    }

    public static void removeKey(String str, String str2) {
        SharedPreferences sharedPreferences = ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove(str2);
            edit.commit();
        }
    }

    public static void setBoolean(String str, String str2, Boolean bool) {
        SharedPreferences sharedPreferences = ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(str2, bool.booleanValue());
            edit.commit();
        }
    }

    public static void setFloat(String str, String str2, Double d10) {
        SharedPreferences sharedPreferences = ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putFloat(str2, d10.floatValue());
            edit.commit();
        }
    }

    public static void setInteger(String str, String str2, Integer num) {
        SharedPreferences sharedPreferences = ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(str2, num.intValue());
            edit.commit();
        }
    }

    public static void setLong(String str, String str2, Long l10) {
        SharedPreferences sharedPreferences = ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong(str2, l10.longValue());
            edit.commit();
        }
    }

    public static void setString(String str, String str2, String str3) {
        SharedPreferences sharedPreferences = ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(str2, str3);
            edit.commit();
        }
    }
}
