package com.uncia.unciacivilaccumulate.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uncia.unciacivilaccumulate.model.Cibil;
import com.uncia.unciacivilaccumulate.model.Response;

@Service
public class UnciaCibilService {

	@Autowired
	private KieContainer kieContainer;

//	public Rate getRate(Participant applicantRequest) {
//		Rate rate = new Rate();
//		KieSession kieSession = kieContainer.newKieSession();
//		kieSession.setGlobal("rate", rate);
//		kieSession.insert(applicantRequest);
//		kieSession.fireAllRules();
//		kieSession.dispose();
//		return rate;
//	}

	public Response getResponse(Cibil cibil) {
		Response response = new Response();
//		Cibil cibil1 = new Cibil();
		KieSession kieSession = kieContainer.newKieSession();
//		kieSession.setGlobal("cibil", cibil1);
		kieSession.setGlobal("response", response);
		kieSession.insert(cibil);
		kieSession.fireAllRules();
		kieSession.dispose();
		return response;
	}
	
//	public Response getResponse(List<Deviation> guarantorList) {
//		Response response = new Response();
//		KieSession kieSession = kieContainer.newKieSession();
//		kieSession.setGlobal("response", response);
//		kieSession.insert(guarantorList);
//		kieSession.fireAllRules();
//		kieSession.dispose();
//		return response;
//	}
//	
	
}
