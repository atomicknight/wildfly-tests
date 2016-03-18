package org.example.test;

import javax.enterprise.context.ApplicationScoped;
import javax.interceptor.ExcludeClassInterceptors;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class TestBean {
	public void m() {
		m0();
	}

	@ExcludeClassInterceptors
	private final void m0() {}
}
