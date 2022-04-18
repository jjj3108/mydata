package mdata.md.main.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MAIN0010Service {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	public boolean isTrue() {
		logger.info("MAIN0010Service isTrue");
		return true;
	}
}