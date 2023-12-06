import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


class ToyStore {
    private List<Toy> toys;
    private List<Toy> prizeToys;

    public ToyStore() {
        toys = new ArrayList<>();
        prizeToys = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }


    public void toys() {
        for (Toy toy : toys) {
            int numPrizes = (int) ((toy.getPercent() / 100) * toy.getQuantity());
            for (int i = 0; i < numPrizes; i++) {
                prizeToys.add(toy);
            }
        }


        Random random = new Random();
        Toy prizeToy = prizeToys.remove(random.nextInt(prizeToys.size()));
        prizeToy.decreaseQuantity();
                try {
            FileWriter writer = new FileWriter("prizeToys.txt", true);
            writer.write(prizeToy.toString() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Полученная игрушка: " + prizeToy.toString());
    }

    public void availableToys() {

        for (Toy toy : toys) {
            System.out.println(toy.toString());
        }
    }
}