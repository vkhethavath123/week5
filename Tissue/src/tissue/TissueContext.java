package tissue;

public class TissueContext 
{
	State s;
	TissueContext()
	{
		s=null;
	}
	
	public void setTissueState(State state)
	{
		s=state;
	}
	public State getTissueState()
	{
		return s;
	}
}
