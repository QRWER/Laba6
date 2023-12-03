package threads;

import functions.basic.Log;

import java.util.Random;

public class SimpleGenerator implements Runnable{
    private Task task;

    public SimpleGenerator(Task task){
        this.task = task;
    }

    public void run() {
        System.out.println("Generate");
        Random random = new Random();
        for(int i = 0; i<task.getCountOfTask(); i++){
            task.setFunction(new Log(random.nextDouble(1, 10)));
            task.setLeftBorder(random.nextDouble(0, 100));
            task.setRightBorder(random.nextDouble(100, 200));
            task.setStep(random.nextDouble(0, 1));
            System.out.println("Source: " + task.getLeftBorder() + ' ' + task.getRightBorder() + ' ' + task.getStep());
        }
    }

}
