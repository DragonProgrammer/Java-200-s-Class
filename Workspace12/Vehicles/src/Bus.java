	public class Bus extends Vehicles{
		public int Seats = 0;
		@Override
		public void setS(int s) {Seats = s;}
		@Override
		public int getS() {return Seats;}
		@Override
		public String getType() {return "Bus";}
		}

