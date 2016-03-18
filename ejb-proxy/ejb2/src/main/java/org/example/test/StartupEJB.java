package org.example.test;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Singleton
@LocalBean
@Startup
public class StartupEJB {
	@Inject TestEJB test;
}
