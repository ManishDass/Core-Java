class Q3B {
    public static void main(String[] args) {
        

        for(int i=1;i<100;i++)
        {
            if(i==20) //when i value become 20 break current execution 
            {
                break;
            }
            else if(i%2!=0) //if i value is odd then it will skip the current iteration
            {
                continue;
            }
            System.out.println(i);
        }
    }
}