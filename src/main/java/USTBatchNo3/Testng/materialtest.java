package USTBatchNo3.Testng;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;
import USTBatchNo3.Testng.materialmain;

public class materialtest {
	@Test
	public void constructtest() {
		int expected=1200;
		material kochi=new material("kochin",1800,1200);
		List<material>l1=Arrays.asList(kochi);
		int actual=materialmain.city_function("kochin",1 ,1,l1 );
		assertEquals(expected,actual);
	}

}
