package interfacePractise;

public class AustralianTraffic implements International_Traffic_Rules,ContinentTraffic{
//Multiple interface can be called in a single class
	public static void main(String[] args) {
		
		International_Traffic_Rules s=new AustralianTraffic();
		s.greenGo();
		s.RedStop();
		s.FlushYellow();
		
		AustralianTraffic w=new AustralianTraffic();
		w.walkon();
		
		ContinentTraffic c=new AustralianTraffic();
		c.TrainTrackSymbol();
		
	}

	@Override
	
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo Implementations");
	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("RedStop Implementations");
	}


	public void walkon()
	{
		System.out.println("Walk on ZebraCrossing");
	}
	
	
	@Override
	public void FlushYellow() {
		// TODO Auto-generated method stub
		System.out.println("FlushYellow Implementations");
		
	
	}

	@Override
	public void TrainTrackSymbol() {
		// TODO Auto-generated method stub
		
		System.out.println("TrainTrackSymbol Implemented");
		
		
	}

}
