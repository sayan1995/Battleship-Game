public class ShipClient
{
	final static String hit="hit.";
	final static String hitAndSink="hit and destroyed.";

	static Ship minion, general, emperor, hits;
static NewJFrame nana = new NewJFrame();
	public static void main(String[] args)
   
	{
		minion=new Ship(1, 1+7); //co=(n mod 7))!=0

		general=new Ship(2, 2+7, 2+7+7);

		emperor=new Ship(3, 3+7, 3+7+7, 3+7+7+7);
      
		hits=new Ship();
     nana.maitri();

		System.out.println(fire(4+7));
		System.out.println(fire(3));
		System.out.println(fire(3+7+7));
		System.out.println(fire(3+7));
		System.out.println(fire(2));
		System.out.println(fire(1));
	}

	static String fire(int co)
	{
		if(!hits.isAHit(co))
		{
			hits.build(co);

			if(minion.isAHit(co))
			{
				if(minion.destroy(co)==1)
					return "\nMinion ship has been "+hitAndSink;
				else 
					return "\nMinion ship has been "+hit;
			}

			else if(general.isAHit(co))
			{
				if(general.destroy(co)==1)
					return "\nGeneral ship has been "+hitAndSink;
				else 
					return "\nGeneral ship has been "+hit;
			}

			else if(emperor.isAHit(co))
			{
				if(emperor.destroy(co)==1)
					return "\nEmperor ship has been "+hitAndSink;
				else 
					return "\nEmperor ship has been "+hit;
			}

			return "\nMissed.";
		}
		else if(hits.isAHit(co));
		{
			return "\nAlready fired on these coordinates.";
		}

	}
}