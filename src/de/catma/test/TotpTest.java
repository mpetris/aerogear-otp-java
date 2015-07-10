package de.catma.test;

import org.jboss.aerogear.security.otp.Totp;
import org.jboss.aerogear.security.otp.api.Clock;

public class TotpTest {
	
	public static void main(String[] args) {
		try {
			Clock clock = new Clock(2);
			System.out.println(clock.getCurrentInterval());
			Totp t1 = new Totp("nase", clock);
			
			String bla = t1.now();
			System.out.println(bla);
			
			Thread.sleep(1000);
			
			boolean res =  t1.verify(bla);
			System.out.println(res);
			Totp t2 = new Totp("nase", clock);
			System.out.println(t2.verify(bla));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
