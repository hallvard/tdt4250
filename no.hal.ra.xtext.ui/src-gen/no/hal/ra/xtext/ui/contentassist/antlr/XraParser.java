/*
 * generated by Xtext
 */
package no.hal.ra.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import no.hal.ra.xtext.services.XraGrammarAccess;

public class XraParser extends AbstractContentAssistParser {
	
	@Inject
	private XraGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected no.hal.ra.xtext.ui.contentassist.antlr.internal.InternalXraParser createParser() {
		no.hal.ra.xtext.ui.contentassist.antlr.internal.InternalXraParser result = new no.hal.ra.xtext.ui.contentassist.antlr.internal.InternalXraParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCourseCodeAccess().getAlternatives_0(), "rule__CourseCode__Alternatives_0");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getSemesterKindAccess().getAlternatives(), "rule__SemesterKind__Alternatives");
					put(grammarAccess.getDepartmentAccess().getGroup(), "rule__Department__Group__0");
					put(grammarAccess.getPersonAccess().getGroup(), "rule__Person__Group__0");
					put(grammarAccess.getPersonAccess().getGroup_2(), "rule__Person__Group_2__0");
					put(grammarAccess.getPersonAccess().getGroup_2_1(), "rule__Person__Group_2_1__0");
					put(grammarAccess.getPersonAccess().getGroup_2_2(), "rule__Person__Group_2_2__0");
					put(grammarAccess.getPersonAccess().getGroup_2_3(), "rule__Person__Group_2_3__0");
					put(grammarAccess.getCourseAccess().getGroup(), "rule__Course__Group__0");
					put(grammarAccess.getCourseAccess().getGroup_5(), "rule__Course__Group_5__0");
					put(grammarAccess.getCourseCodeAccess().getGroup(), "rule__CourseCode__Group__0");
					put(grammarAccess.getSemesterAccess().getGroup(), "rule__Semester__Group__0");
					put(grammarAccess.getFactorAccess().getGroup(), "rule__Factor__Group__0");
					put(grammarAccess.getFactorAccess().getGroup_1(), "rule__Factor__Group_1__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getCourseInstanceAccess().getGroup(), "rule__CourseInstance__Group__0");
					put(grammarAccess.getCourseAllocationAccess().getGroup(), "rule__CourseAllocation__Group__0");
					put(grammarAccess.getCourseAllocationAccess().getGroup_2(), "rule__CourseAllocation__Group_2__0");
					put(grammarAccess.getCourseAllocationAccess().getGroup_3(), "rule__CourseAllocation__Group_3__0");
					put(grammarAccess.getRoleAccess().getGroup(), "rule__Role__Group__0");
					put(grammarAccess.getDepartmentAccess().getNameAssignment_2(), "rule__Department__NameAssignment_2");
					put(grammarAccess.getDepartmentAccess().getEmployeesAssignment_5(), "rule__Department__EmployeesAssignment_5");
					put(grammarAccess.getDepartmentAccess().getRolesAssignment_9(), "rule__Department__RolesAssignment_9");
					put(grammarAccess.getDepartmentAccess().getCoursesAssignment_13(), "rule__Department__CoursesAssignment_13");
					put(grammarAccess.getDepartmentAccess().getSemestersAssignment_15(), "rule__Department__SemestersAssignment_15");
					put(grammarAccess.getPersonAccess().getNameAssignment_1(), "rule__Person__NameAssignment_1");
					put(grammarAccess.getPersonAccess().getUserNameAssignment_2_1_1(), "rule__Person__UserNameAssignment_2_1_1");
					put(grammarAccess.getPersonAccess().getEmailAssignment_2_2_1(), "rule__Person__EmailAssignment_2_2_1");
					put(grammarAccess.getPersonAccess().getFaceUrlAssignment_2_3_1(), "rule__Person__FaceUrlAssignment_2_3_1");
					put(grammarAccess.getPersonAccess().getEmploymentFactorAssignment_4(), "rule__Person__EmploymentFactorAssignment_4");
					put(grammarAccess.getCourseAccess().getNameAssignment_1(), "rule__Course__NameAssignment_1");
					put(grammarAccess.getCourseAccess().getFullNameAssignment_2(), "rule__Course__FullNameAssignment_2");
					put(grammarAccess.getCourseAccess().getRequiredRolesAssignment_4(), "rule__Course__RequiredRolesAssignment_4");
					put(grammarAccess.getCourseAccess().getRequiredRolesAssignment_5_1(), "rule__Course__RequiredRolesAssignment_5_1");
					put(grammarAccess.getSemesterAccess().getKindAssignment_1(), "rule__Semester__KindAssignment_1");
					put(grammarAccess.getSemesterAccess().getYearAssignment_2(), "rule__Semester__YearAssignment_2");
					put(grammarAccess.getSemesterAccess().getCoursesAssignment_4(), "rule__Semester__CoursesAssignment_4");
					put(grammarAccess.getCourseInstanceAccess().getCourseAssignment_1(), "rule__CourseInstance__CourseAssignment_1");
					put(grammarAccess.getCourseInstanceAccess().getAllocationsAssignment_3(), "rule__CourseInstance__AllocationsAssignment_3");
					put(grammarAccess.getCourseAllocationAccess().getPersonAssignment_1(), "rule__CourseAllocation__PersonAssignment_1");
					put(grammarAccess.getCourseAllocationAccess().getExplicitFactorAssignment_2_1(), "rule__CourseAllocation__ExplicitFactorAssignment_2_1");
					put(grammarAccess.getCourseAllocationAccess().getRoleAssignment_3_1(), "rule__CourseAllocation__RoleAssignment_3_1");
					put(grammarAccess.getRoleAccess().getNameAssignment_1(), "rule__Role__NameAssignment_1");
					put(grammarAccess.getRoleAccess().getFactorAssignment_2(), "rule__Role__FactorAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			no.hal.ra.xtext.ui.contentassist.antlr.internal.InternalXraParser typedParser = (no.hal.ra.xtext.ui.contentassist.antlr.internal.InternalXraParser) parser;
			typedParser.entryRuleDepartment();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public XraGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(XraGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}