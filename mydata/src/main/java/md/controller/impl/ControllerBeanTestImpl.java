package md.controller.impl;

import org.springframework.stereotype.Controller;

import md.controller.ControllerBeanTest;

@Controller("serviceBeanName")
public class ControllerBeanTestImpl implements ControllerBeanTest {
	@Override
	public boolean isTrue() {
		return true;
	}
}