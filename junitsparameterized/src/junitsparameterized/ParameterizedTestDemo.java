package junitsparameterized;

public class ParameterizedTestDemo {
  @ParametezirdTest
  @valueSource (String = {"1","2","three","4","five"})
  void withValueSource(String number)
  {
	  assertNotNull(number);
  }

private void assertNotNull(String number) {
	// TODO Auto-generated method stub
	
}
}
