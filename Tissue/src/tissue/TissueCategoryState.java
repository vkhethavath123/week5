package tissue;

public class TissueCategoryState implements State
{

	@Override
	public void tissueAction(TissueContext context) {
		System.out.println("Tissue Categories: Tissue Napkin, Toilet Roll Paper,PaperNapkin,Facial Tissues etc..");
		context.setTissueState(this);
	}
	
	public String toString()
	{
		return "Category State \n";
	}
}
