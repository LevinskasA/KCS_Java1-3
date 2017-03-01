/**
 * Created by Askew on 2/27/2017.
 */
public class Bolt {
    private int sriegis = 0;

    private boolean isSafe() {
        boolean response = true;
        if (sriegis >= 5) {
            response = false;
            //System.out.println("Jau gana");
        }
        return response;
    }

    public void prisukti() {
        if (isSafe()) {
            sriegis++;
        } else {
            System.out.println("Jau gana!");
        }
    }

    public void atsukti() {
        if (sriegis > 0) {
            sriegis--;
        } else {
            System.out.println("Neisuktas");
        }
    }

}
