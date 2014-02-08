package fr.inria.diverse.kompren.generator

import java.util.Set
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration

class KomprenOutputConfigurationProvider implements IOutputConfigurationProvider {
	override Set<OutputConfiguration> getOutputConfigurations() {
	    val slicerOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
	    slicerOutput.setDescription("Kompren Slicer Folder")
	    slicerOutput.setOutputDirectory("kompren-gen")
	    slicerOutput.setOverrideExistingResources(true)
	    slicerOutput.setCreateOutputDirectory(true)
	    slicerOutput.setCleanUpDerivedResources(true)
	    slicerOutput.setSetDerivedProperty(true)
	    slicerOutput.setCanClearOutputDirectory(true)
	    newHashSet(slicerOutput)
	}
}