package tissue;

public class TissueCostState implements State
{

	@Override
	public void tissueAction(TissueContext context) {
		System.out.println("Cost varies from $5 to $20");
		context.setTissueState(this);
	}
	
	public String toString()
	{
		return "Cost State \n";
	}
}

