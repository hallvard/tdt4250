package no.hal.quiz.junit.adapter;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.junit.JUnitCore;
import org.eclipse.jdt.junit.TestRunListener;
import org.eclipse.jdt.junit.model.ITestCaseElement;
import org.eclipse.jdt.junit.model.ITestElement.Result;
import org.eclipse.jdt.junit.model.ITestRunSession;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ProgressBar;

import no.hal.quiz.TaskProposal;
import no.hal.quiz.junit.JunitTestAnswer;
import no.hal.quiz.views.adapters.TaskProgressProposalAdapter;

public class JunitTaskProposalAdapter extends TaskProgressProposalAdapter<TaskProposal<JunitTestAnswer>> {

	public JunitTaskProposalAdapter(TaskProposal<JunitTestAnswer> proposal) {
		super(proposal);
	}

	private int successCount, failureCount, errorCount;
	
	@Override
	public ProgressBar initView(final Composite parent) {
		JUnitCore.addTestRunListener(new JunitSessionListener());
		return super.initView(parent);
	}

	//

	protected class JunitSessionListener extends TestRunListener implements Runnable {
		
		private double completion = 0.0;
		
		@Override
		public void sessionLaunched(ITestRunSession session) {
			if (! acceptTestRunSession(session)) {
				return;
			}
			this.completion = 0.0;
			successCount = failureCount = errorCount = 0;
			updateProposal();
		}

		protected boolean acceptTestRunSession(ITestRunSession session) {
			return session.getTestRunName().equals(getProposal().getAnswer().getTestRunName());
		}

		@Override
		public void testCaseFinished(ITestCaseElement testCaseElement) {
			if (! acceptTestRunSession(testCaseElement.getTestRunSession())) {
				return;
			}
			Result testResult = testCaseElement.getTestResult(true);
			EList<String> methodNames = getProposal().getAnswer().getMethodNames();
			if (methodNames.size() == 0 || methodNames.contains(testCaseElement.getTestMethodName())) {
				if (testResult == Result.OK) {
					successCount++;
				} else if (testResult == Result.FAILURE) {
					failureCount++;
				} else if (testResult == Result.ERROR) {
					errorCount++;
				}
			}
		}

		@Override
		public void sessionFinished(ITestRunSession session) {
			if (! acceptTestRunSession(session)) {
				return;
			}
			int testCount = getProposal().getAnswer().getMethodNames().size();
			if (testCount == 0) {
				testCount = successCount + failureCount + errorCount;
			}
			this.completion = ((double) successCount) / testCount;
			updateProposal();
		}
		
		private void updateProposal() {
			view.getDisplay().asyncExec(this);
		}

		@Override
		public void run() {
			getProposal().setCompletion(this.completion);
		}
	}
}
