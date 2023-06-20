package com.redhat.parodos.examples.complex.rollback;

import com.redhat.parodos.workflow.exception.MissingParameterException;
import com.redhat.parodos.workflow.task.infrastructure.BaseInfrastructureWorkFlowTask;
import com.redhat.parodos.workflows.work.DefaultWorkReport;
import com.redhat.parodos.workflows.work.WorkContext;
import com.redhat.parodos.workflows.work.WorkReport;
import com.redhat.parodos.workflows.work.WorkStatus;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RollbackWorkFlowTask extends BaseInfrastructureWorkFlowTask {

	@Override
	public WorkReport execute(WorkContext workContext) {
		log.info("RollbackWorkFlowTask");
		try {
			getRequiredParameterValue("test-by-rollback-workflow1");
			getRequiredParameterValue("test-by-rollback-workflow2");
		}
		catch (MissingParameterException e) {
			return new DefaultWorkReport(WorkStatus.FAILED, workContext, e);
		}
		return new DefaultWorkReport(WorkStatus.COMPLETED, workContext);
	}

}
