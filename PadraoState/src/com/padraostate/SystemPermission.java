package com.padraostate;

import com.padraostate.impl.PermissionState;

public class SystemPermission {
	public static final String REQUESTED = "REQUESTED";
	public static final String CLAIMED = "CLAIMED";
	public static final String GRANTED = "GRANTED";
	public static final String DENIED = "DENIED";
	public static final String UNIX_REQUESTED = "UNIX_REQUESTED";
	public static final String UNIX_CLAIMED = "UNIX_CLAIMED";

	private SystemProfile profile;
	private SystemUser requestor;
	private SystemAdmin admin;
	private boolean isGranded;
	// private String state;
	private PermissionState permissionState;
	private boolean isUnixPermissionGranted;

	public SystemPermission(SystemUser requestor, SystemProfile profile) {
		this.requestor = requestor;
		this.profile = profile;
		// this.state = REQUESTED;
		setState(PermissionState.REQUESTED);
		this.isGranded = false;
		notifyAdminOfPermissionRequest();
	}

	private void notifyAdminOfPermissionRequest() {

	}

	// public void claimedBy(SystemAdmin admin) {
	// if (!this.getState().equals(PermissionState.REQUESTED)
	// && !this.getState().equals(PermissionState.UNIX_REQUESTED)) {
	// return;
	// }
	// willBeHandledBy(admin);
	// if (this.getState().equals(PermissionState.REQUESTED)) {
	// this.setState(PermissionState.CLAIMED);
	// } else if (this.getState().equals(PermissionState.UNIX_REQUESTED)) {
	// this.setState(PermissionState.UNIX_CLAIMED);
	// }
	// }

	public void claimedBy(SystemAdmin admin) {
		this.permissionState.claimedBy(admin, this);
	}

	public void willBeHandledBy(SystemAdmin admin) {
		this.admin = admin;
	}

	// public void deniedBy(SystemAdmin admin) {
	// if (!this.getState().equals(PermissionState.CLAIMED)
	// && !this.getState().equals(PermissionState.UNIX_CLAIMED)) {
	// return;
	// }
	// if (!this.admin.equals(admin)) {
	// return;
	// }
	// this.isGranded = false;
	// this.isUnixPermissionGranted = false;
	// this.setState(PermissionState.DENIED);
	// notifyUserOfPermissionRequestResult();
	// }

	public void deniedBy(SystemAdmin admin) {
		this.permissionState.deniedBy(admin, this);
	}

	public void notifyUserOfPermissionRequestResult() {

	}

	// public void grentedBy(SystemAdmin admin) {
	// if (!this.getState().equals(PermissionState.CLAIMED)
	// && !this.getState().equals(PermissionState.UNIX_CLAIMED)) {
	// return;
	// }
	// if (!this.admin.equals(admin)) {
	// return;
	// }
	// if (this.profile.isUnixPermissionRequired()
	// && this.getState().equals(PermissionState.UNIX_CLAIMED)) {
	// this.isUnixPermissionGranted = true;
	// } else if (this.profile.isUnixPermissionRequired()
	// && !isUnixPermissionGranted()) {
	// this.setState(PermissionState.UNIX_REQUESTED);
	// notifyUnixAdminsOfPermissionRequest();
	// return;
	// }
	// this.setState(PermissionState.GRANTED);
	// this.isGranded = true;
	// notifyUserOfPermissionRequestResult();
	//
	// }
	public void grentedBy(SystemAdmin admin) {
		this.permissionState.grentedBy(admin, this);
	}

	public void notifyUnixAdminsOfPermissionRequest() {

	}

	public boolean isUnixPermissionGranted() {
		return false;
	}

	public PermissionState getState() {
		return permissionState;
	}

	public void setState(PermissionState state) {
		this.permissionState = state;
	}

	public SystemAdmin getAdmin() {
		return admin;
	}

	public void setAdmin(SystemAdmin admin) {
		this.admin = admin;
	}

	public SystemProfile getProfile() {
		return profile;
	}

	public void setProfile(SystemProfile profile) {
		this.profile = profile;
	}

	public SystemUser getRequestor() {
		return requestor;
	}

	public void setRequestor(SystemUser requestor) {
		this.requestor = requestor;
	}

	public boolean isGranded() {
		return isGranded;
	}

	public void setGranded(boolean isGranded) {
		this.isGranded = isGranded;
	}

	public void setUnixPermissionGranted(boolean isUnixPermissionGranted) {
		this.isUnixPermissionGranted = isUnixPermissionGranted;
	}

}
