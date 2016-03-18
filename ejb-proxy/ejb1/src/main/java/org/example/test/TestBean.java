package org.example.test;

public class TestBean {
	public void m() {
		m0(new Inner());
	}

	private void m0(Inner inner) {}

	private static class Inner {}
}
