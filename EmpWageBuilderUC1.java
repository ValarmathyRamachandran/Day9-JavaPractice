public class EmpWageBuilderUC1 {

	public static void main(String[] args) {

		System.out.println( "Welcome to Employee Wage Computation Program" );

		int isFullTime= 1;
			//computations
		double empCheck = Math.floor(Math.random() * 10) % 2;
			// checking the condition
		if (empCheck == isFullTime )
			System.out.println( "Employee is Present" );
		else
			System.out.println( "Employee is Absent" );

			}
}
