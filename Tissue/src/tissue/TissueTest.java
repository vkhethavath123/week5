package tissue;

public class TissueTest {

	public static void main(String[] args) {
		TissueContext context = new TissueContext();
		TissueCategoryState category=new TissueCategoryState();
		category.tissueAction(context);
		System.out.println(context.getTissueState().toString());
		
		TissueThicknessState thickness=new TissueThicknessState();
		thickness.tissueAction(context);
		System.out.println(context.getTissueState().toString());
		
		TissueCostState cost=new TissueCostState();
		cost.tissueAction(context);
		System.out.println(context.getTissueState().toString());

	}

}
