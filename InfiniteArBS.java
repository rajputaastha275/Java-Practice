// public class InfiniteArBS 
// {
//      public static void main(String[] args) 
//     {
//         int[] arr = {2, 3, 4, 6, 7, 9, 11, 14, 17, 18, 19, 22, 24, 25, 27, 29, 31, 35, 37, 39, 43, 56};
//         int target = 24;
//         System.out.println(ans(arr, target));
//     }
//     static int ans(int[] arr, int target)
//     {
//         int start = 0;
//         int end = 1;
//         while(target > arr[end])
//         {
//             int temp = end + 1;
//             // end = end + ((end - start) + 1) * 2;
//             int size = end - start + 1;
//             end = end + size * 2;
//             start = temp;
//         }
//         return search(arr, target, start, end);
//     }
//     static int search(int[] arr, int target, int start, int end)
//     {
//         while(start <= end)
//         {
//             int mid = start + (end - start) / 2;
//             if(target < arr[mid])
//             {
//                 end = mid - 1;
//             }
//             else if(target > arr[mid])
//             {
               
//                  start = mid + 1;
//             }
//             else
//             {
//                 return mid;
//             }
//         }
//         return -1;
//     }
// }
