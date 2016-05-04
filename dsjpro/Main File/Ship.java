class Hull
{
	int co; /*stores the coordinates of that part of the hull 
				which is a number from 1 to 49 */

	Hull next; //points to the next part of the hull

	public Hull(int co)
	{
		this.co=co;
		next=null;
	}
}

public class Ship
{
	private Hull bow, stern; //bow - front; stern - rear

	public Ship()
	{
		bow=stern=null;
	}

	public Ship(int co1, int co2,int co3,int co4,int co5) //emperor
	{
		build(co1);
		build(co2);
      
		build(co3);
		build(co4);
      build(co5);

	}

	public Ship(int co1, int co2, int co3) //minion
	{
		build(co1);
		build(co2);
		build(co3);
	}

	public Ship(int co1, int co2, int co3, int co4) //general
	{
		build(co1);
		build(co2);
		build(co3);
		build(co4);
	}

	boolean isAHit(int co) //are shots fired on target?
	{
		Hull temp=bow;
		while(temp!=null)
		{
			if(temp.co==co)return true;
			temp=temp.next;
		}
		return false;
	}

	void build(int co) //build a ship
	{
		if(bow==null)
		{
			bow=stern=new Hull(co);
		}
		else
		{
			stern.next=new Hull(co);
			stern=stern.next;
		}
	}

	int destroy(int co) //fires and destroys a ship, one part at a time
	{
		/*if(bow==null) //ship hasn't been built/has been sunk 
		{
			System.out.println("Ship hasn't been built or has been sunk.");
		}*/

		if(!isAHit(co)) //it isn't a hit
		{ 
			// -----do something here------
		}

		else //it's a hit
		{
			Hull prev=null, pres=bow;
			while(pres!=stern && pres.co!=co)
			{
				prev=pres;
				pres=pres.next;
			}

			if(prev==null)
			{
				bow=bow.next;
			}

			else if(pres==stern)
			{
				prev.next=null;
				stern=prev;
			}

			else
			{
				prev.next=pres.next;
			}
		}

		if(bow==null)return 1; //ship has been sunk

		return 0;
	}
}