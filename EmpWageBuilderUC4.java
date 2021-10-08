public class EmpWageBuilderUC4 {

	public static void main(String[] args) {

		System.out.println( "Welcome to Employee Wage Computation Program" );

		int isFullTime= 1;
		int isPartTime= 2;
		int empHour= 0;
		int empWagePerHour=20;

			//computations
		int empCheck = (int)Math.round((Math.random() *10) % 3);
			// checking the condition
		switch (empCheck)
		{
			case 1:

				empHour=8;

				System.out.println( "Employee is Present as Full-Time" );
				break;
			case 2:

				empHour=4;
				System.out.println( "Employee is Present as Part-Time");

			break;
			default:
				empHour=0;
				System.out.println( "Employee is Absent" );

		}
				int empWage=(empWagePerHour*empHour);
				System.out.println("Employee wage:" +empWage);

		}

	}

