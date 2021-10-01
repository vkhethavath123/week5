package tissue;

public class TissueThicknessState implements State
{
	@Override
	public void tissueAction(TissueContext context) {
		System.out.println("Tissue thicknes varies from 0.1mm to 1mm");
		context.setTissueState(this);
	}
	
	public String toString()
	{
		return "Thickness State \n";
	}
}

