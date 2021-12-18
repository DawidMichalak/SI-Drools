package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolsTest {
    public static final void main(String[] args) {
        try {
        	GUI gui = new GUIwindow();
        	
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	kSession.setGlobal("gui", gui);
        	kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
