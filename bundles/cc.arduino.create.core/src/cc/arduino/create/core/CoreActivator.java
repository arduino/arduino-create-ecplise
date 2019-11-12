/**
 * Copyright (C) 2019 Arduino SA and others.
 *
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package cc.arduino.create.core;

import static org.eclipse.core.runtime.IStatus.ERROR;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

public class CoreActivator extends Plugin {

    public static final String PLUGIN_ID = "cc.arduino.create.core"; //$NON-NLS-1$

    private static CoreActivator plugin;

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    public static CoreActivator getDefault() {
        return plugin;
    }

    public static IStatus error(String message) {
        return new Status(ERROR, PLUGIN_ID, message);
    }

    public static IStatus error(Throwable t) {
        return new Status(ERROR, PLUGIN_ID, t.getMessage(), t);
    }

}
