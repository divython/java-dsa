/**
 * first
 */
class first {
    public void first_print(){
        System.out.println("hello divyanshu");
        
    }
    
    public void arrayfun(){
        int[] myarray=new int[10];
        myarray[0]=1;
        myarray[1]=2;
        myarray[2]=3;
        printArray(myarray);


    }
    public void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i <n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
    first first=new first();
    first.arrayfun();

        
    }

    
}
