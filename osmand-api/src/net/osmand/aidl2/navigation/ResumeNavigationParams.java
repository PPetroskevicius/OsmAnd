package net.osmand.aidl2.navigation;

import android.os.Parcel;

import net.osmand.aidl2.AidlParams;

public class ResumeNavigationParams extends AidlParams {

	public ResumeNavigationParams() {

	}

	public ResumeNavigationParams(Parcel in) {
		readFromParcel(in);
	}

	public static final Creator<ResumeNavigationParams> CREATOR = new Creator<ResumeNavigationParams>() {
		@Override
		public ResumeNavigationParams createFromParcel(Parcel in) {
			return new ResumeNavigationParams(in);
		}

		@Override
		public ResumeNavigationParams[] newArray(int size) {
			return new ResumeNavigationParams[size];
		}
	};
}