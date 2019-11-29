import com.sun.javafx.tools.ant.DeployFXTask;

public class MayBeBaby <T> {

    private T data;
    private int status;

    public MayBeBaby(T data, int status) {
        this.data = data;
        this.status = status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void print() {

        switch (status) {
            case 1:
                System.out.println("erlaubt" + data);
                break;
            case 2:
                System.out.println("nono");
                break;
            case 3:
                System.out.println("gibt nüsch");

            default:
                System.out.println("ungültig");
        }
    }
}
  /*

        if(status == 1) {
            System.out.println("Zugriff erlaubt: "+ data);
        }
        else
        {
            if(status == 2) {
                System.out.println("Zugriff nicht erlaubt!");
            }
                else
                {
                    if(status == 3)
                    {
                        System.out.println("Wert nicht gesetzt");
                    }
                    else
                    {
                        System.out.println("ungültiger Status");
                    }
                }
            }
        }
    }
*/