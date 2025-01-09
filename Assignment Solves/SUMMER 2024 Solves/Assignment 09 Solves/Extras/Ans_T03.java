public class Ans_T03 {
    public static void main(String[] args) {

        String[] email_list = {"abc@gmail.com", "!@cv.bd", "123cse@bracu.ac.bd"};
        int valid_email = email_checker_list(email_list);
        System.out.println(valid_email);
        String[] email_list2 = {"cse110@gmail.com", "government@cv.", "eee@bracu.ac.bd"};
        int valid_email2 = email_checker_list(email_list2);
        System.out.println(valid_email2);
    }
    public static boolean email_checker(String a) {
        boolean valid = true;
        int index = 0;
        int count = 0;
        if ((int) a.charAt(0) >= 48 && (int) a.charAt(0) <= 57) {
            return false;
        }
        else if (a.charAt(0) == '@' || a.charAt(0) == '.') {
            return false;
        }
        else {
            index += 1 ;
        }
        while (index < a.length()) {
            if (a.charAt(index) == '@') {
                count = index ;
                break;
            }
            index += 1 ;
        }
        if (count == 0){
            return false;
        }
        if (((int)a.charAt(count+1) >= 97 && (int)a.charAt(count+1) <= 122) ) {

        }
        else {
            return false;
        }
        if (((int)a.charAt(count-1) >= 97 && (int)a.charAt(count-1) <= 122) || ((int) a.charAt(count-1) >= 48 && (int) a.charAt(count-1) <= 57) ) {
        }
        else {
            return false;
        }
        int dot = 0;
        while (count < a.length()) {
            if (a.charAt(count) == '.') {
                dot = count;
                break;
            }
            count += 1 ;
        }
        if (dot == 0 || dot == a.length()-1) {
            return false;
        }
        return true;

    }
    public static int email_checker_list(String[] email_list) {
        int count = 0;
        for (int i = 0; i < email_list.length; i++) {
            if (email_checker(email_list[i])) {
                count += 1 ;
            }
        }
        return count;
    }
}
