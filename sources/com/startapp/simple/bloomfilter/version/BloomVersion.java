package com.startapp.simple.bloomfilter.version;

/* compiled from: Sta */
public enum BloomVersion {
    ZERO("0", 1, 720),
    THREE("3.0", 1, 720) {
    },
    FOUR("4", 3, 3500),
    FIVE("5", 3, 1000000);
    
    private final int numberOfHashes;
    private final int sizeOfBucket;
    private final String version;

    public int a() {
        return this.numberOfHashes;
    }

    public int b() {
        return this.sizeOfBucket;
    }

    public String c() {
        return this.version;
    }

    /* access modifiers changed from: public */
    BloomVersion(String str, int i10, int i11) {
        this.version = str;
        this.numberOfHashes = i10;
        this.sizeOfBucket = i11;
    }
}
