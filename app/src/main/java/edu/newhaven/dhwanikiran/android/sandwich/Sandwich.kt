package dhwanikiran.android.sandwich

import android.os.Parcel
import android.os.Parcelable
import dhwanikiran.android.sandwich.Sandwich as Sandwich1

data class sandwich(val name: String?) : Parcelable {
    constructor(parcel: Parcel) : this(parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Sandwich1> {
        override fun createFromParcel(parcel: Parcel): Sandwich1 {
            return Sandwich1(parcel)
        }

        override fun newArray(size: Int): Array<Sandwich1?> {
            return arrayOfNulls(size)
        }
    }

}

