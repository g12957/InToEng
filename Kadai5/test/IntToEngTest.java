import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

public class IntToEngTest {

	@Test
	public void translateEngƒeƒXƒg() {
		String exp="zero";
		String exp2="eleven";
		String exp3="twenty ";
		String exp4="thirty five";
		String exp5="one hundred  ";
		String exp6="three hundred  eight";
		String exp7="eight hundred sixty three";
		String exp8="one thousand   ";
		String exp9="two thousand   one";
		String exp10="three thousand  twenty four";
		String exp11="seven thousand five hundred twenty one";
		String act = IntToEng.translateEng(0);
		String act2 = IntToEng.translateEng(11);
		String act3 = IntToEng.translateEng(20);
		String act4 = IntToEng.translateEng(35);
		String act5 = IntToEng.translateEng(100);
		String act6 = IntToEng.translateEng(308);
		String act7 = IntToEng.translateEng(863);
		String act8 = IntToEng.translateEng(1000);
		String act9 = IntToEng.translateEng(2001);
		String act10 = IntToEng.translateEng(3024);
		String act11 = IntToEng.translateEng(7521);
		assertThat(act, is(exp));
		assertThat(act2, is(exp2));
		assertThat(act3, is(exp3));
		assertThat(act4, is(exp4));
		assertThat(act5, is(exp5));
		assertThat(act6, is(exp6));
		assertThat(act7, is(exp7));
		assertThat(act8, is(exp8));
		assertThat(act9, is(exp9));
		assertThat(act10, is(exp10));
		assertThat(act11, is(exp11));
		
		
	}
	

}
