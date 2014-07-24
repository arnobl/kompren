package fr.inria.diverse.kompren.explen.view;

import org.kermeta.kompren.diagram.view.impl.RelationView;

/**
 * Defines a inheritance relation established between two classes.
 * @author Arnaud Blouin
 */
public class InheritanceView extends RelationView<ClassView,ClassView> {
	/**
	 * @see RelationView
	 */
	public InheritanceView(final ClassView src, final ClassView target) {
		super(src, target);
		setTargetDecoration(new InheritanceDecorationView(this, getLastSegment(), false));
	}
}
