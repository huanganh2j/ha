package com.huangan;

import com.alibaba.druid.filter.config.ConfigTools;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootmybitesApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Test
	public void decodePassword() {
		String publicKey ="MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKDVNddidPb1g5/2Cv2NbObsBbsx6WnI2yBMRhzJp0OaGMx+jzu+flakQf6kamGLfudnSRNJEFRln/D46+BFdfsCAwEAAQ==";
		String password="P+2VJJO4SeTy0+O8/NHkFfSvwATaYr+jReB6hFWKOhkdduKcHTFBdx2I/HB98OtUS09baqEE5HQ/5XE2O0mRIQ==";
		try {
			String result =ConfigTools.decrypt(publicKey,password);
			System.out.println(result);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
