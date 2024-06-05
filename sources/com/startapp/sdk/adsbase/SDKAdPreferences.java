package com.startapp.sdk.adsbase;

import com.startapp.p0;
import java.io.Serializable;

/* compiled from: Sta */
public class SDKAdPreferences implements Serializable {
    private static final long serialVersionUID = 1;
    private String age = null;
    private Gender gender = null;

    /* compiled from: Sta */
    public enum Gender {
        MALE("m"),
        FEMALE("f");
        
        private String gender;

        private Gender(String str) {
            this.gender = str;
        }

        public static Gender parseString(String str) {
            for (Gender gender2 : values()) {
                if (gender2.getGender().equals(str)) {
                    return gender2;
                }
            }
            return null;
        }

        public String getGender() {
            return this.gender;
        }

        public String toString() {
            return getGender();
        }
    }

    public String getAge() {
        return this.age;
    }

    public Gender getGender() {
        return this.gender;
    }

    public SDKAdPreferences setAge(int i10) {
        this.age = Integer.toString(i10);
        return this;
    }

    public SDKAdPreferences setGender(Gender gender2) {
        this.gender = gender2;
        return this;
    }

    public String toString() {
        StringBuilder a10 = p0.a("SDKAdPreferences [gender=");
        a10.append(this.gender);
        a10.append(", age=");
        a10.append(this.age);
        a10.append("]");
        return a10.toString();
    }

    public SDKAdPreferences setAge(String str) {
        this.age = str;
        return this;
    }
}
