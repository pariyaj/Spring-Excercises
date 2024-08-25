package ir.freeland.spring.profile.datasource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("testphase")
public class TestPhaseDatasourceConfig implements DatasourceConfig {
	
	@Value("${spring.datasource.driver-class-name}")
	private String driver;
	
    @Override
    public void setup() {
        System.out.println("Setting up datasource for TESTPHASE environment. Driver is: " + driver );
    }

}
