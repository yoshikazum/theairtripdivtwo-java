public class TheAirTripDivTwo {
  /*
   * I got 245.30 points.
   */
	public int find(int[] flights, int fuel) {
	  int result = 0;
	  int totalFuel = 0;
	  for (int i = 0; i < flights.length; i++) {
      int j = flights[i];
      totalFuel += j;
      if(totalFuel <= fuel){
        result++;
      }
    }
	  return result;
	}

}
