package pjv.hodina10;

/**
 * Created by ladislav on 12.5.17.
 */
public class Controller implements Runnable{
    private Model model;
    private View view;
    public Controller (Model model, View view)
    {
        this.model = model;
        this.view  = view;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int x = model.getxPosition();
            int y = model.getyPosition();
            model.setxPosition(x +model.xVelocity);
            model.setyPosition(y + model.yVelocity);
            model.notifyObservers();


            if (model.getxPosition() <= 0 || model.getxPosition() + model.getRadius() >= view.getWidth()){
                model.xVelocity = -model.xVelocity;
            }
            if (model.getyPosition() <= 0 || model.getyPosition() + model.getRadius() >= view.getHeight()){
                model.yVelocity = -model.yVelocity;
            }
        }


    }
}

