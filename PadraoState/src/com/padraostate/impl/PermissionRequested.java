package com.padraostate.impl;

import com.padraostate.SystemAdmin;
import com.padraostate.SystemPermission;

public class PermissionRequested extends PermissionState {

	public PermissionRequested(String name) {
		super(name);
	}

	public void claimedBy(SystemAdmin admin, SystemPermission permission) {
		permission.willBeHandledBy(admin);
		permission.setState(PermissionState.CLAIMED);
	}
}
