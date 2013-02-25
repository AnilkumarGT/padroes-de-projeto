package com.padraostate.impl;

import com.padraostate.SystemAdmin;
import com.padraostate.SystemPermission;

public class PermissionClaimed extends PermissionState {

	public PermissionClaimed(String name) {
		super(name);
	}

	public void deniedBy(SystemAdmin admin, SystemPermission permission) {
		if (!permission.getAdmin().equals(admin)) {
			return;
		}
		permission.setGranded(false);
		permission.setUnixPermissionGranted(false);
		permission.setState(PermissionState.DENIED);
		permission.notifyUserOfPermissionRequestResult();
	}

	public void grentedBy(SystemAdmin admin, SystemPermission permission) {
		if (!permission.getAdmin().equals(admin)) {
			return;
		}
		if (permission.getProfile().isUnixPermissionRequired()
				&& !permission.isUnixPermissionGranted()) {
			permission.setState(PermissionState.UNIX_REQUESTED);
			permission.notifyUnixAdminsOfPermissionRequest();
			return;
		}
		permission.setState(PermissionState.GRANTED);
		permission.setGranded(true);
		permission.notifyUserOfPermissionRequestResult();

	}
}
