package com.padraostate.impl;

import com.padraostate.SystemAdmin;
import com.padraostate.SystemPermission;

public abstract class PermissionState {
	private String name;

	public PermissionState(String name) {
		this.name = name;
	}

	// public static final PermissionState REQUESTED = new PermissionState(
	// "REQUESTED");
	// public static final PermissionState CLAIMED = new
	// PermissionState("CLAIMED");
	// public static final PermissionState GRANTED = new
	// PermissionState("GRANTED");
	// public static final PermissionState DENIED = new
	// PermissionState("DENIED");
	// public static final PermissionState UNIX_REQUESTED = new PermissionState(
	// "UNIX_REQUESTED");
	// public static final PermissionState UNIX_CLAIMED = new PermissionState(
	// "UNIX_CLAIMED");
	
	public static final PermissionState REQUESTED = new PermissionRequested(
			"REQUESTED");
	public static final PermissionState CLAIMED = new PermissionClaimed(
			"CLAIMED");
	public static final PermissionState GRANTED = new PermissionGranted(
			"GRANTED");
	public static final PermissionState DENIED = new PermissionDenied("DENIED");
	public static final PermissionState UNIX_REQUESTED = new PermissionUnixRequested(
			"UNIX_REQUESTED");
	public static final PermissionState UNIX_CLAIMED = new PermissionClaimed(
			"UNIX_CLAIMED");

	@Override
	public String toString() {
		return name;
	}

	public void claimedBy(SystemAdmin admin, SystemPermission permission) {
		// if (!permission.getState().equals(PermissionState.REQUESTED)
		// && !permission.getState()
		// .equals(PermissionState.UNIX_REQUESTED)) {
		// return;
		// }
		// permission.willBeHandledBy(admin);
		// if (permission.getState().equals(PermissionState.REQUESTED)) {
		// permission.setState(PermissionState.CLAIMED);
		// } else if
		// (permission.getState().equals(PermissionState.UNIX_REQUESTED)) {
		// permission.setState(PermissionState.UNIX_CLAIMED);
		// }
	}

	public void deniedBy(SystemAdmin admin, SystemPermission permission) {
		// if (!permission.getState().equals(PermissionState.CLAIMED)
		// && !permission.getState().equals(PermissionState.UNIX_CLAIMED)) {
		// return;
		// }
		// if (!permission.getAdmin().equals(admin)) {
		// return;
		// }
		// permission.setGranded(false);
		// permission.setUnixPermissionGranted(false);
		// permission.setState(PermissionState.DENIED);
		// permission.notifyUserOfPermissionRequestResult();
	}

	public void grentedBy(SystemAdmin admin, SystemPermission permission) {
		// if (!permission.getState().equals(PermissionState.CLAIMED)
		// && !permission.getState().equals(PermissionState.UNIX_CLAIMED)) {
		// return;
		// }
		// if (!permission.getAdmin().equals(admin)) {
		// return;
		// }
		// if (permission.getProfile().isUnixPermissionRequired()
		// && permission.getState().equals(PermissionState.UNIX_CLAIMED)) {
		// permission.setUnixPermissionGranted(true);
		// } else if (permission.getProfile().isUnixPermissionRequired()
		// && !permission.isUnixPermissionGranted()) {
		// permission.setState(PermissionState.UNIX_REQUESTED);
		// permission.notifyUnixAdminsOfPermissionRequest();
		// return;
		// }
		// permission.setState(PermissionState.GRANTED);
		// permission.setGranded(true);
		// permission.notifyUserOfPermissionRequestResult();

	}
}
