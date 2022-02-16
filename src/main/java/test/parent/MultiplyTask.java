package test.parent;


import test.service.HttpService;

public class MultiplyTask {
    public static int multiply(int x, int y) {
        HttpService httpService = new HttpService();
//         boolean flag = true;
//         while(flag){
//             System.out.println("pet");

// //         if(y==-67){
// //             x=67;
//         }
//         try {
//             Thread.sleep(10000);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         } }
        return x * y;
    }
}
