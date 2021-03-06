package arrays_problems.min_max_average_of_an_array_p63;

public class Min_Max_Average_Of_A_Array_p63 {
    public static void main(String[] args) {
        int sum= 0;
        int max = 0;
        int min = 0;

        int[] values = {90, -1, 2, 75, 30, 40,10,28,58,25,83};
        for (int i=0;i< values.length;i++)
        {
            //Summing for every element
            sum = sum+values[i];
            //if values[i] element is lesser than the minimum element then make min=value[i]
            if(min>values[i])
            {
                min=values[i];
            }
            //if values[i] element is greater than the minimum element then make max=value[i]
            if(max<values[i])
            {
                max=values[i];
            }
        }
        //Calculate the double value of an array
        double average = (double) sum/values.length;
        System.out.println("Minimum value of an array "+min);
        System.out.println("Maximum value of an array "+max);
        System.out.println("Average value of an array "+average);

    }
}
