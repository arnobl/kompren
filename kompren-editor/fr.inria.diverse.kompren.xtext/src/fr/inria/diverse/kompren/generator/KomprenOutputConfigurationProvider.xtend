package fr.inria.diverse.kompren.generator

import java.util.Set
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration

class KomprenOutputConfigurationProvider implements IOutputConfigurationProvider {
	public val static description = "Kompren Slicer Folder"
	
	override Set<OutputConfiguration> getOutputConfigurations() {
	    val slicerOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
	    slicerOutput.setDescription(description)
	    slicerOutput.setOutputDirectory("src/main/kompren-gen")
	    slicerOutput.setOverrideExistingResources(true)
	    slicerOutput.setCreateOutputDirectory(true)
	    slicerOutput.setCleanUpDerivedResources(true)
	    slicerOutput.setSetDerivedProperty(true)
	    slicerOutput.setCanClearOutputDirectory(true)
	    newHashSet(slicerOutput)
	}
}