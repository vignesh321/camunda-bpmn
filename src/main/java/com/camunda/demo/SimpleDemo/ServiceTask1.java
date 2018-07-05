package com.camunda.demo.SimpleDemo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ServiceTask1 implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		
		execution.setVariable("name",  "Niall" );
		execution.setVariable("status", true);
		
	}

}
