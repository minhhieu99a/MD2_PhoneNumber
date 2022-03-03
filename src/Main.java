public class Main {
    public static  PhoneNumber phoneNumber;
    public static final String[] validPhoneNumber = new String[] {"(84)-(0978489648)"};
    public static final String[] invalidPhoneNumber = new String[] {"(a8)-(22222222)"};
    public static void main(String args[]) {
         phoneNumber =new PhoneNumber();
        for (String phone  : validPhoneNumber) {
            boolean isvalid = phoneNumber.validate(phone);
            System.out.println("phone Number is " + phone +" is valid: "+ isvalid);
        }
        for (String phone : invalidPhoneNumber) {
            boolean isinvalid = phoneNumber.validate(phone);
            System.out.println("Phone Number is " + phone +" is valid: "+ isinvalid);
        }
    }
}
