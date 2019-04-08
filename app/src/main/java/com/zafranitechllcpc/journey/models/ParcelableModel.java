package com.zafranitechllcpc.journey.models;

import android.os.Parcelable;

public abstract class ParcelableModel implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }
}
