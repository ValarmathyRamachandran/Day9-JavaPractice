public class EmpWageBuilderUC5 {

	public static void main(String[] args) {

		System.out.println( "Welcome to Employee Wage Computation Program" );

		int isFullTime= 1;
		int isPartTime= 2;
		int fullDayHour= 0;
		int partTimeHour= 0;
		int empWagePerHour=20;
		int empWorkingDayPerMonth=20;
			//computations
		int empCheck = (int)Math.round((Math.random() *10) % 3);
			// checking the condition
		switch (empCheck)
		{
			case 1:

				fullDayHour=8;
			int fullTimeEmpDailyWage=(empWagePerHour*fullDayHour);
			int fullTimeEmpMonthlyWage=(empWagePerHour*fullDayHour*empWorkingDayPerMonth);
				System.out.println( "Employee is Present as Full-Time" );
				System.out.println( "Full-Time Employee Daily Wage: " +fullTimeEmpDailyWage);
				System.out.println( "Full-Time Employee Monthly Wage: " +fullTimeEmpMonthlyWage);
			break;
			case 2:

					partTimeHour=8;
			int partTimeDailyEmpWage=(empWagePerHour*partTimeHour);
			int partTimeMonthlyEmpWage=(empWagePerHour*partTimeHour*empWorkingDayPerMonth);
				System.out.println( "Employee is Present as Part-Time");
				System.out.println( "Part-Time Daily Employee Wage: " +partTimeDailyEmpWage);
				System.out.println( "Part-Time Monthly Wage: " +partTimeMonthlyEmpWage);
			break;
			default:
			System.out.println( "Employee is Absent" );

		}

		}

	}

