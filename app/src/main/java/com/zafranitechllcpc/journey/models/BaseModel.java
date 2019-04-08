package com.zafranitechllcpc.journey.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;
import com.workday.postman.Postman;
import com.workday.postman.annotations.Parceled;

import java.time.ZonedDateTime;

@Parceled
public class BaseModel extends ParcelableModel {

    @SerializedName(value = "id", alternate = "_id")
    public String id;

    @SerializedName("updated")
    ZonedDateTime updated;

    @SerializedName("created")
    ZonedDateTime created;

    public String getId() {
        return id;
    }

    public ZonedDateTime getUpdated() {
        return updated;
    }

    public ZonedDateTime getCreated() {
        return created;
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        Postman.writeToParcel(this, dest);
    }

    public static final Parcelable.Creator<BaseModel> CREATOR = Postman.getCreator(BaseModel.class);

    @Override
    public int hashCode() {
        return (id != null && !id.isEmpty()) ? 0 : id.hashCode();
    }
}
