/* Hairdresser.java
M McCreary
02.03.2023
*/

 public class Hairdresser {

     private String service;
     private String length;
     private String day;

     public Hairdresser() {
         service = "";
         length = "";
         day = "";
     }

     public void setService(String service) {
         this.service = service;
     }

     public void setLength(String length) {
         this.length = length;
     }

     public void compute() {
         if (service.equalsIgnoreCase("cut")) {
             if (length.equalsIgnoreCase("short")) {
                 day = "Monday";
             }
             else {
                 day = "Tuesday";
             }
         }
         else if (service.equalsIgnoreCase("colour")) {
             if (length.equalsIgnoreCase("short")) {
                 day = "Wednesday";
             }
             else {
                 day = "Thursday";
             }
         }
         else if (service.equalsIgnoreCase("blowdry")) {
             if (length.equalsIgnoreCase("short")) {
                 day = "Friday";
             }
             else {
                 day = "Saturday";
             }
         }
     }


     public String getDay(){
		 return day;
	 }
}