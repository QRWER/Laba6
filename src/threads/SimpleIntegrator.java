package threads;

import functions.basic.Log;

public class SimpleIntegrator implements Runnable {
    private Task task;

    public SimpleIntegrator(Task task){
        this.task = task;
    }

    public void run() {
        System.out.println("Result");
        for(int i = 0; i<task.getCountOfTask(); i++){
            double result = task.getResult();
            System.out.println("Result: " + task.getLeftBorder()+ ' ' + task.getRightBorder()+ ' ' + task.getStep() + ' ' + result);
        }
    }
}
