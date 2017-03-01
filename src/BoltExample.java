/**
 * Created by Askew on 2/27/2017.
 */
public class BoltExample {
    public static void main(String[] args) {
        Bolt bolt = new Bolt();

        /*
        BoltExample example = new BoltExample();
        example.loop(bolt);
        */

        //bolt.atsukti();
        loop(bolt);
    }

    private static void loop(Bolt bolt){
        for (int i = 0; i < 6; i++){
            bolt.prisukti();
        }
    }
}
