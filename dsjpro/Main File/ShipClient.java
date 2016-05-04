public class ShipClient
{
	final static String hit="hit.";
	final static String hitAndSink="hit and destroyed.";
  
  
   
	static Ship minion, general, emperor, hits;
   static Ship minion2, general2, emperor2, hits2;
static NewJFrame nana = new NewJFrame();
//static NewJFrame2 fana = new NewJFrame2();
	public static void main(String[] args)
   
	{
    int Mhits=0,Mguesses=0,Msunk=0;
   int Nguesses=0,Nhits=0,Nsunk=0;
		minion=new Ship(0,0,0); //co=(n mod 7))!=0
      minion2=new Ship();
		general=new Ship();
      general2=new Ship();
		emperor=new Ship();
     emperor2 = new Ship();
		hits=new Ship();
      hits2=new Ship();
     nana.maitri();
     //fana.maitri();

		/*System.out.println(fire(4+7));
		System.out.println(fire(3));
		System.out.println(fire(3+7+7));
		System.out.println(fire(3+7));
		System.out.println(fire(2));
		System.out.println(fire(1));*/
	}

	static String fire(int co)
	{
		if(!hits.isAHit(co))
		{
			hits.build(co);

			if(minion.isAHit(co))
			{
				if(minion.destroy(co)==1){
           
					return "\nMinion ship has been "+hitAndSink;}
				else {
           
					return "\nMinion ship has been "+hit;}
			}

			else if(general.isAHit(co))
			{
				if(general.destroy(co)==1){
            
					return "\nGeneral ship has been "+hitAndSink;}
				else {
					return "\nGeneral ship has been "+hit;}
			}

			else if(emperor.isAHit(co))
			{
				if(emperor.destroy(co)==1){
            
					return "\nEmperor ship has been "+hitAndSink;}
				else {
            
					return "\nEmperor ship has been "+hit;}
			}

			return "\nMissed.";
		}
		else if(hits.isAHit(co));
		{
			return "\nAlready fired on these coordinates.";
         
       
		}

	}
   
   
   
   
   
   
   
   
   
   
   
   
   
   static String fire2(int co)
	{
		if(!hits2.isAHit(co))
		{
			hits2.build(co);

			if(minion2.isAHit(co))
			{
				if(minion.destroy(co)==1)
            {
					return "\nMinion ship has been "+hitAndSink;}
				else {
					return "\nMinion ship has been "+hit;}
			}

			else if(general2.isAHit(co))
			{
				if(general2.destroy(co)==1)
            {
					return "\nGeneral ship has been "+hitAndSink;}
				else {
            
					return "\nGeneral ship has been "+hit;}
			}

			else if(emperor2.isAHit(co))
			{
				if(emperor2.destroy(co)==1){
           
					return "\nEmperor ship has been "+hitAndSink;}
				else {
            
					return "\nEmperor ship has been "+hit;}
			}

			return "\nMissed.";
		}
		else if(hits2.isAHit(co));
		{
			return "\nAlready fired on these coordinates.";
         
       
		}

	}

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}