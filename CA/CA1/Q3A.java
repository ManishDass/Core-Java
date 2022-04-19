class Q3A {
    public static void main(String[] args) {

        // example of logical && and logical or operator
        boolean isActive = true;
        boolean activePartition = false;

        if(isActive && activePartition) //if student is both active and participating then first if block will run 
        {
            System.out.println("Very Good");       
        } else if(isActive || activePartition) //if student is either active or participating then second if block will run
        {
            System.out.print("Keep it up");
        } else //if student is neither active nor participating then else block will run
        {
            System.out.println("Sorry You have been removed from the class By Kumar Vishal "); 
        }        
    }
}