package thread;

class thread implements Runnable {
    public void run()
    {
        
        try {
            Thread.sleep(1500);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
 
        System.out.println(
            "State of thread1 while it called join() method on thread2 -"
            + ((Thread) Test.thread1).getState());
        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


