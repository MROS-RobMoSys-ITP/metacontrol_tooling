/*
 * generated by Xtext 2.21.0
 */
package org.xtext.mros.mros;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class MROSStandaloneSetup extends MROSStandaloneSetupGenerated {

	public static void doSetup() {
		new MROSStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}