package studentdata;

import com.sun.tools.javac.util.StringUtils;

public class VerifyDate {
		static Scanner scan = new Scanner(System.in);

		public static String validateDate() {

			String date = "";
			int day, month;
			System.out.println("in the format (dd-mm-yyyy)");
			boolean isValid = true;
			do {
				int flag = 0;
				date = StringUtils.trimString(scan.nextLine());
				if (date.length() == 10 && (date.charAt(0) >= '0' && date.charAt(0) <= '3')
						&& (date.charAt(1) >= '0' && date.charAt(1) <= '9')
						&& (date.charAt(3) == '0' || date.charAt(3) == '1')
						&& (date.charAt(4) >= '1' && date.charAt(4) <= '9')
						&& (date.charAt(6) == '1' || date.charAt(6) == '2')
						&& (date.charAt(7) >= '0' && date.charAt(7) <= '9')
						&& (date.charAt(8) >= '0' && date.charAt(8) <= '9')
						&& (date.charAt(9) >= '0' && date.charAt(9) <= '9') && date.charAt(2) == '-'
						&& date.charAt(5) == '-') {
					day = convertToInt(StringUtils.substring(0, 2, date));
					month = convertToInt(StringUtils.substring(3, 5, date));
					if (!(month >= 1 && month <= 12)) {
						System.out.println("month should be bw in between 1 to 12");
						flag = 1;
					}
					if (!(day >= 1 && day <= 31)) {
						System.out.println("date should be in betweem 1 to 31");
						flag = 1;
					} else {
						if (month == 2 || month == 4 || month == 6 || month == 9 || month == 11) {
							if (!(day >= 1 && day <= 30)) {
								System.out.println("feb,april,june,sep and nov should not have 31 days");
								flag = 1;
							}
						}
					}

					if (flag == 0)
						isValid = false;
				} else {
					System.out.println(
							"date should contain only numbers and should be in the following format(dd-mm-yyyy)");
				}
			} while (isValid);

			return date;
		}

		public static int getAge(String dob, String presentDate) {
			int dobDay, dobMonth, dobYear, presentDay, presentMonth, presentYear;
			dobDay = convertToInt(StringUtils.substring(0, 2, dob));
			dobMonth = convertToInt(StringUtils.substring(3, 5, dob));
			dobYear = convertToInt(StringUtils.substring(6, 10, dob));
			presentDay = convertToInt(StringUtils.substring(0, 2, presentDate));
			presentMonth = convertToInt(StringUtils.substring(3, 5, presentDate));
			presentYear = convertToInt(StringUtils.substring(6, 10, presentDate));
			int age;
			if (presentMonth > dobMonth) {
				age = presentYear - dobYear;
			} else if (presentMonth == dobMonth) {
				if (presentDay >= dobDay)
					age = presentYear - dobYear;
				else
					age = presentYear - dobYear - 1;
			} else
				age = presentYear - dobYear - 1;
			return age;
		}

		public static int verify(String Dob, String presentDate) {
			int day, month, year, presentDay, presentMonth, presentYear;
			day = convertToInt(StringUtils.substring(0, 2, Dob));
			month = convertToInt(StringUtils.substring(3, 5, Dob));
			year = convertToInt(StringUtils.substring(6, 10, Dob));
			presentDay = convertToInt(StringUtils.substring(0, 2, presentDate));
			presentMonth = convertToInt(StringUtils.substring(3, 5, presentDate));
			presentYear = convertToInt(StringUtils.substring(6, 10, presentDate));
			int flag = 0;
			if (presentMonth != 12) {
				if (year == presentYear) {
					if (month == presentMonth + 1) {
						if (day <= presentDay) {
							flag = 1;
						}
					} else if (month == presentMonth) {
						if (day > presentDay) {
							flag = 1;
						}
					}
				}
			} else if (presentMonth == 12) {
				if (year == presentYear || year == presentYear + 1) {
					if (month == 1) {
						if (day <= presentDay) {
							flag = 1;
						}
					} else if (month == 12) {
						if (day > presentDay) {
							flag = 1;
						}
					}
				}
			}
			return flag;
		}

		public static int convertToInt(String str) {
			int num=0;
			for(int i=0;i<str.length();i++) {
				num=num*10+(str.charAt(i)-48);
			}
			return num;
		}
	}