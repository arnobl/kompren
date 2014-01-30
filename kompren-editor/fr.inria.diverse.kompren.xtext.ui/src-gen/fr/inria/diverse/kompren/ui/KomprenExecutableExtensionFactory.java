/*
 * generated by Xtext
 */
package fr.inria.diverse.kompren.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import fr.inria.diverse.kompren.ui.internal.KomprenActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class KomprenExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return KomprenActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return KomprenActivator.getInstance().getInjector(KomprenActivator.FR_INRIA_DIVERSE_KOMPREN_KOMPREN);
	}
	
}