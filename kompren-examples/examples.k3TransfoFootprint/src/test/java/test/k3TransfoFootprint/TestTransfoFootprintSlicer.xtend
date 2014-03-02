package test.k3TransfoFootprint

import java.util.ArrayList
import java.util.Collections
import java.util.List
import k3transfofootprint.K3TransfoFootprint
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.impl.XbaseFactoryImpl
import org.junit.Test

class TestTransfoFootprintSlicer {
	@Test def testSlicer() {
		val literal = XbaseFactoryImpl.eINSTANCE.createXTypeLiteral
//		val typeParam = TypesFactoryImpl.eINSTANCE.createJvmTypeParameter
//		literal.type = typeParam
//		typeParam.setName("Foo")
		val List<XExpression> requiredXExp = new ArrayList
		requiredXExp.add(literal)
		val slicer = new K3TransfoFootprint(Collections.emptyList, Collections.emptyList, requiredXExp)
		slicer.slice
//		assertEquals("Slicing starting c3 c4 c5 c1 c2 c4 c5 c3 c4 c2 c3 c1 c2 Slicing ended", slicer.buf.toString)
	}
}
